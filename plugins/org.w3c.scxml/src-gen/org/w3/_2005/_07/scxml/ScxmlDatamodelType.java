/**
 */
package org.w3._2005._07.scxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datamodel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlDatamodelType#getData <em>Data</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlDatamodelType#getScxmlExtraContent <em>Scxml Extra Content</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlDatamodelType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlDatamodelType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlDatamodelType()
 * @model extendedMetaData="name='scxml.datamodel.type' kind='elementOnly'"
 * @generated
 */
public interface ScxmlDatamodelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005._07.scxml.ScxmlDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlDatamodelType_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScxmlDataType> getData();

	/**
	 * Returns the value of the '<em><b>Scxml Extra Content</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scxml Extra Content</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scxml Extra Content</em>' attribute list.
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlDatamodelType_ScxmlExtraContent()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ScxmlExtraContent:1'"
	 * @generated
	 */
	FeatureMap getScxmlExtraContent();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlDatamodelType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax' group='#ScxmlExtraContent:1'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlDatamodelType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ScxmlDatamodelType
