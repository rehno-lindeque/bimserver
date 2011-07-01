package org.bimserver.plugins.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EntityDefinition extends NamedType {
	// store each supertype in both a list and a hashtable for convinience
	private ArrayList<EntityDefinition> supertypes = new ArrayList<EntityDefinition>();
	private HashMap<String, EntityDefinition> supertypesBN = new HashMap<String, EntityDefinition>();
	// store each attribute in both a list and a hashtable for convinience
	private ArrayList<Attribute> attributes = new ArrayList<Attribute>();
	private HashMap<String, Attribute> attributesBN = new HashMap<String, Attribute>();

	private HashMap<String, Attribute> attributesPlusSuperBN;
	private ArrayList<Attribute> attributesPlusSuper;

	private ArrayList<EntityDefinition> subtypes = new ArrayList<EntityDefinition>();
	private Map<String, DerivedAttribute2> derivedAttributes = new HashMap<String, DerivedAttribute2>();
	boolean complex;
	boolean instantiable;
	boolean independent;

	public EntityDefinition(String name) {
		super(name);

	}

	public boolean isDerived(String name) {
		return derivedAttributes.containsKey(name);
	}

	public String toString() {
		return this.getName();
	}

	public boolean addAttribute(Attribute a) {
		a.setParent_entity(this);
		attributes.add(a);
		attributesBN.put(a.getName(), a);
		return true;
	}

	public void addDerived(DerivedAttribute2 attribute) {
		derivedAttributes.put(attribute.getName(), attribute);
	}

	public Attribute getAttributeBN(String name) {
		return attributesBN.get(name);
	}

	public Attribute getAttributeBNWithSuper(String name) {
		if (attributesBN.containsKey(name)) {
			return attributesBN.get(name);
		}
		if (attributesPlusSuperBN == null) {
			getAttributesCached(true);
		}
		if (attributesPlusSuperBN.containsKey(name)) {
			return attributesPlusSuperBN.get(name);
		}
		return null;
	}

	public boolean addSupertype(EntityDefinition parent) {
		supertypes.add(parent);
		supertypesBN.put(parent.getName(), parent);
		return true;
	}

	public ArrayList<Attribute> getAttributes() {
		return attributes;
	}

	/**
	 * returns all Attirbutes of this ENTITY. Optionally also returns all
	 * inherited Attributes from the parents
	 * 
	 * @param returnInherited
	 *            if true also returns inherited attributs
	 * @return
	 */
	public ArrayList<Attribute> getAttributes(boolean returnInherited) {
		if (!returnInherited)
			return this.getAttributes();
		else {
			ArrayList<Attribute> tempAttribs = new ArrayList<Attribute>();
			Iterator<EntityDefinition> parentIter = this.getSupertypes().iterator();
			while (parentIter.hasNext()) {
				tempAttribs = parentIter.next().getAttributes(true);
			}
			Iterator<Attribute> attribIter = this.getAttributes().iterator();
			while (attribIter.hasNext())
				tempAttribs.add(attribIter.next());
			return tempAttribs;
		}
	}

	public ArrayList<Attribute> getAttributesCached(boolean returnInherited) {
		if (!returnInherited)
			return this.getAttributes();
		else {
			if (attributesPlusSuper == null) {
				attributesPlusSuper = getAttributes(true);
				attributesPlusSuperBN = new HashMap<String, Attribute>();
				for (Attribute attribute : attributesPlusSuper) {
					attributesPlusSuperBN.put(attribute.getName(), attribute);
				}
			}
			return attributesPlusSuper;
		}
	}

	public void setAttributes(ArrayList<Attribute> attributes) {
		this.attributes = attributes;
	}

	public HashMap<String, Attribute> getAttributesBN() {
		return attributesBN;
	}

	public void setAttributesBN(HashMap<String, Attribute> attributesBN) {
		this.attributesBN = attributesBN;
	}

	public ArrayList<EntityDefinition> getSupertypes() {
		return supertypes;
	}

	public void setSupertypes(ArrayList<EntityDefinition> supertypes) {
		this.supertypes = supertypes;
	}

	public HashMap<String, EntityDefinition> getSupertypesBN() {
		return supertypesBN;
	}

	public void setSupertypesBN(HashMap<String, EntityDefinition> supertypesBN) {
		this.supertypesBN = supertypesBN;
	}

	public ArrayList<EntityDefinition> getSubtypes() {
		if (this.subtypes == null)
			this.subtypes = new ArrayList<EntityDefinition>();
		return subtypes;
	}

	public void setSubtypes(ArrayList<EntityDefinition> subtypes) {
		this.subtypes = subtypes;
	}

	public void addSubtype(EntityDefinition subClass) {
		this.subtypes.add(subClass);
	}

	public boolean isInstantiable() {
		return instantiable;
	}

	public void setInstantiable(boolean instantiable) {
		this.instantiable = instantiable;
	}
	
	public Map<String, DerivedAttribute2> getDerivedAttributes() {
		return derivedAttributes;
	}
}