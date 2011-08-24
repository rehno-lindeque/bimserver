package org.bimserver.ifc.xml.deserializer;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.bimserver.emf.IdEObject;
import org.bimserver.ifc.IfcModel;
import org.bimserver.models.ifc2x3.Ifc2x3Factory;
import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.plugins.deserializers.DeserializeException;
import org.bimserver.plugins.deserializers.EmfDeserializer;
import org.bimserver.plugins.schema.SchemaDefinition;
import org.bimserver.plugins.serializers.IfcModelInterface;
import org.bimserver.utils.FakeClosingInputStream;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IfcXmlDeserializer extends EmfDeserializer  {

	private static final Logger LOGGER = LoggerFactory.getLogger(IfcXmlDeserializer.class);
	private final IfcModel model = new IfcModel();
	
	@Override
	public IfcModelInterface read(InputStream inputStream, String filename, boolean setOids, long fileSize) throws DeserializeException {
		if (filename != null && (filename.toUpperCase().endsWith(".ZIP") || filename.toUpperCase().endsWith(".IFCZIP"))) {
			ZipInputStream zipInputStream = new ZipInputStream(inputStream);
			ZipEntry nextEntry;
			try {
				nextEntry = zipInputStream.getNextEntry();
				if (nextEntry == null) {
					throw new DeserializeException("Zip files must contain exactly one IFC-file, this zip-file looks empty");
				}
				if (nextEntry.getName().toUpperCase().endsWith(".IFCXML")) {
					IfcModelInterface model = null;
					FakeClosingInputStream fakeClosingInputStream = new FakeClosingInputStream(zipInputStream);
					model = read(fakeClosingInputStream);
					if (model.getSize() == 0) {
						throw new DeserializeException("Uploaded file does not seem to be a correct IFC file");
					}
					if (zipInputStream.getNextEntry() != null) {
						zipInputStream.close();
						throw new DeserializeException("Zip files may only contain one IFC-file, this zip-file contains more files");
					} else {
						zipInputStream.close();
						return model;
					}
				} else {
					throw new DeserializeException("Zip files must contain exactly one IFC-file, this zip-file seems to have one or more non-IFC files");
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else {
			return read(inputStream);
		}
		return model;
	}

	private IfcModel read(InputStream inputStream) throws FactoryConfigurationError {
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		try {
			XMLStreamReader reader = inputFactory.createXMLStreamReader(inputStream, "UTF-8");
			parseDocument(reader);
			return model;
		} catch (XMLStreamException e) {
			LOGGER.error("", e);
		} catch (IfcXmlDeserializeException e) {
			LOGGER.error("", e);
		}
		return null;
	}

	private void parseDocument(XMLStreamReader reader) throws XMLStreamException, IfcXmlDeserializeException {
		while (reader.hasNext()) {
			reader.next();
			if (reader.getEventType() == XMLStreamReader.START_ELEMENT) {
				if (reader.getLocalName().equalsIgnoreCase("iso_10303_28")) {
					parseIso_10303_28(reader);
				}
			}
		}
	}

	private void parseIso_10303_28(XMLStreamReader reader) throws XMLStreamException, IfcXmlDeserializeException {
		while (reader.hasNext()) {
			reader.next();
			if (reader.getEventType() == XMLStreamReader.START_ELEMENT) {
				if (reader.getLocalName().equalsIgnoreCase("uos")) {
					parseUos(reader);
				}
			} else if (reader.getEventType() == XMLStreamReader.END_ELEMENT) {
				if (reader.getLocalName().equals("iso_10303_28")) {
					return;
				}
			}
		}
	}

	private void parseUos(XMLStreamReader reader) throws XMLStreamException, IfcXmlDeserializeException {
		while (reader.hasNext()) {
			reader.next();
			if (reader.getEventType() == XMLStreamReader.START_ELEMENT) {
				parseObject(reader);
			} else if (reader.getEventType() == XMLStreamReader.END_ELEMENT) {
				if (reader.getLocalName().equalsIgnoreCase("uos")) {
					return;
				}
			}
		}
	}

	private IdEObject parseObject(XMLStreamReader reader) throws XMLStreamException, IfcXmlDeserializeException {
		String className = reader.getLocalName();
		EClassifier eClassifier = Ifc2x3Package.eINSTANCE.getEClassifier(className);
		if (eClassifier == null || !(eClassifier instanceof EClass)) {
			throw new IfcXmlDeserializeException("No class with name " + className + " was found");
		}
		String id = reader.getAttributeValue("", "id");
		if (id == null) {
			throw new IfcXmlDeserializeException("No id attribute found on " + className);
		}
		if (!id.startsWith("i")) {
			throw new IfcXmlDeserializeException("Id " + id + " is not starting with the letter 'i'");
		}
		EClass eClass = (EClass) eClassifier;
		long oid = Long.parseLong(id.substring(1));
		IdEObject object;
		if (model.contains(oid)) {
			object = model.get(oid);
		} else {
			object = (IdEObject) Ifc2x3Factory.eINSTANCE.create(eClass);
			model.add(oid, object);
		}
		while (reader.hasNext()) {
			reader.next();
			if (reader.getEventType() == XMLStreamReader.START_ELEMENT) {
				parseField(object, reader);
			} else if (reader.getEventType() == XMLStreamReader.END_ELEMENT) {
				if (reader.getLocalName().equalsIgnoreCase(className)) {
					return object;
				}
			}
		}
		return object;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void parseField(IdEObject object, XMLStreamReader reader) throws XMLStreamException, IfcXmlDeserializeException {
		String fieldName = reader.getLocalName();
		EStructuralFeature eStructuralFeature = object.eClass().getEStructuralFeature(fieldName);
		if (eStructuralFeature == null) {
			throw new IfcXmlDeserializeException("Field " + fieldName + " not found on class " + object.eClass().getName());
		}
		EClassifier realType = null;
		while (reader.hasNext()) {
			reader.next();
			if (reader.getEventType() == XMLStreamReader.START_ELEMENT) {
				if (reader.getAttributeValue("", "id") != null) {
					IdEObject reference = parseObject(reader);
					if (eStructuralFeature.isMany()) {
						((List) object.eGet(eStructuralFeature)).add(reference);
					} else {
						object.eSet(eStructuralFeature, reference);
					}
				} else if (reader.getAttributeValue("", "ref") != null) {
					String ref = reader.getAttributeValue("", "ref");
					if (!ref.startsWith("i")) {
						throw new IfcXmlDeserializeException("Reference id " + ref + " should start with an 'i'");
					}
					Long refId = Long.parseLong(ref.substring(1));
					IdEObject reference = null;
					if (!model.contains(refId)) {
						String referenceType = reader.getLocalName();
						reference = (IdEObject) Ifc2x3Factory.eINSTANCE.create((EClass) Ifc2x3Package.eINSTANCE.getEClassifier(referenceType));
						model.add(refId, reference);
					} else {
						reference = model.get(refId);
					}
					if (eStructuralFeature.isMany()) {
						List list = (List) object.eGet(eStructuralFeature);
						String posString = reader.getAttributeValue("urn:iso.org:standard:10303:part(28):version(2):xmlschema:common", "pos");
						if (posString == null) {
							list.add(reference);
						} else {
							int pos = Integer.parseInt(posString);
							if (list.size() > pos) {
								list.set(pos, reference);
							} else {
								for (int i = list.size() - 1; i < pos - 1; i++) {
									list.add(reference.eClass().getEPackage().getEFactoryInstance().create(reference.eClass()));
								}
								list.add(reference);
							}
						}
					} else {
						object.eSet(eStructuralFeature, reference);
					}
				} else {
					String realTypeString = reader.getLocalName();
					realType = Ifc2x3Package.eINSTANCE.getEClassifier(realTypeString);
				}
			} else if (reader.getEventType() == XMLStreamReader.END_ELEMENT) {
				if (reader.getLocalName().equalsIgnoreCase(fieldName)) {
					return;
				}
				if (realType != null && reader.getLocalName().equalsIgnoreCase(realType.getName())) {
					realType = null;
				}
			} else if (reader.getEventType() == XMLStreamReader.CHARACTERS) {
				if (!reader.isWhiteSpace()) {
					String text = reader.getText();
					if (eStructuralFeature.getEType() instanceof EDataType) {
						if (eStructuralFeature.isMany()) {
							String[] split = text.split(" ");
							List list = (List) object.eGet(eStructuralFeature);
							for (String s : split) {
								list.add(parsePrimitive(eStructuralFeature.getEType(), s));
							}
						} else {
							object.eSet(eStructuralFeature, parsePrimitive(eStructuralFeature.getEType(), text));
						}
					} else {
						if (realType == null) {
							realType = eStructuralFeature.getEType();
						}
						if (realType instanceof EClass) {
							EClass eClass = (EClass) realType;
							if (Ifc2x3Package.eINSTANCE.getWrappedValue().isSuperTypeOf(eClass)) {
								IdEObject wrappedObject = (IdEObject) Ifc2x3Factory.eINSTANCE.create(eClass);
//								model.add(wrappedObject);
								EStructuralFeature wrappedValueFeature = eClass.getEStructuralFeature("wrappedValue");
								wrappedObject.eSet(wrappedValueFeature, parsePrimitive(wrappedValueFeature.getEType(), text));
								if (wrappedValueFeature.getEType() == EcorePackage.eINSTANCE.getEFloat()) {
									EStructuralFeature floatStringFeature = eClass.getEStructuralFeature("wrappedValueAsString");
									wrappedObject.eSet(floatStringFeature, text);
								}
								List list = (List) object.eGet(eStructuralFeature);
								if (eStructuralFeature.isMany()) {
									list.add(wrappedObject);
								} else {
									object.eSet(eStructuralFeature, wrappedObject);
								}
							}
						} else {
							if (eStructuralFeature.isMany()) {
								String[] split = text.split(" ");
								List list = (List) object.eGet(eStructuralFeature);
								for (String s : split) {
									list.add(parsePrimitive(realType, s));
								}
							} else {
								object.eSet(eStructuralFeature, parsePrimitive(realType, text));
							}
						}
					}
				}
			}
		}
	}

	private Object parsePrimitive(EClassifier eType, String text) throws IfcXmlDeserializeException {
		if (eType == EcorePackage.eINSTANCE.getEString()) {
			return text;
		} else if (eType == EcorePackage.eINSTANCE.getEInt()) {
			return Integer.parseInt(text);
		} else if (eType == EcorePackage.eINSTANCE.getEFloat()) {
			return Float.parseFloat(text);
		} else if (eType == EcorePackage.eINSTANCE.getEBoolean()) {
			return Boolean.parseBoolean(text);
		} else if (eType instanceof EEnum) {
			EEnumLiteral eEnumLiteral = ((EEnum) eType).getEEnumLiteral(text.toUpperCase());
			if (eEnumLiteral == null) {
				if (text.equals("unknown")) {
					return null;
				} else {
					throw new IfcXmlDeserializeException("Unknown enum literal " + text + " in enum " + ((EEnum) eType).getName());
				}
			}
			return eEnumLiteral.getInstance();
		} else {
			throw new IfcXmlDeserializeException("Unimplemented primitive type: " + eType.getName());
		}
	}

	@Override
	public void init(SchemaDefinition schema) {
		
	}
}