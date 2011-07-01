/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.log;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Access Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.log.LogPackage#getAccessMethod()
 * @model
 * @generated
 */
public enum AccessMethod implements Enumerator {
	/**
	 * The '<em><b>SOAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOAP_VALUE
	 * @generated
	 * @ordered
	 */
	SOAP(0, "SOAP", "SOAP"),

	/**
	 * The '<em><b>WEB INTERFACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_INTERFACE(1, "WEB_INTERFACE", "WEB_INTERFACE"),

	/**
	 * The '<em><b>INTERNAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL(2, "INTERNAL", "INTERNAL"),

	/**
	 * The '<em><b>REST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REST_VALUE
	 * @generated
	 * @ordered
	 */
	REST(3, "REST", "REST"),

	/**
	 * The '<em><b>SYNDICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	SYNDICATION(4, "SYNDICATION", "SYNDICATION");

	/**
	 * The '<em><b>SOAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOAP_VALUE = 0;

	/**
	 * The '<em><b>WEB INTERFACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEB INTERFACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEB_INTERFACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEB_INTERFACE_VALUE = 1;

	/**
	 * The '<em><b>INTERNAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERNAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERNAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_VALUE = 2;

	/**
	 * The '<em><b>REST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REST_VALUE = 3;

	/**
	 * The '<em><b>SYNDICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYNDICATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNDICATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYNDICATION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Access Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccessMethod[] VALUES_ARRAY =
		new AccessMethod[] {
			SOAP,
			WEB_INTERFACE,
			INTERNAL,
			REST,
			SYNDICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Access Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AccessMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Access Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessMethod get(int value) {
		switch (value) {
			case SOAP_VALUE: return SOAP;
			case WEB_INTERFACE_VALUE: return WEB_INTERFACE;
			case INTERNAL_VALUE: return INTERNAL;
			case REST_VALUE: return REST;
			case SYNDICATION_VALUE: return SYNDICATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AccessMethod(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AccessMethod
