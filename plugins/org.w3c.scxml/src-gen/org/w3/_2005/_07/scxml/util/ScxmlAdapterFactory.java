/**
 */
package org.w3._2005._07.scxml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.w3._2005._07.scxml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.w3._2005._07.scxml.ScxmlPackage
 * @generated
 */
public class ScxmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScxmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScxmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScxmlSwitch<Adapter> modelSwitch =
		new ScxmlSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseScxmlAssignType(ScxmlAssignType object) {
				return createScxmlAssignTypeAdapter();
			}
			@Override
			public Adapter caseScxmlCancelType(ScxmlCancelType object) {
				return createScxmlCancelTypeAdapter();
			}
			@Override
			public Adapter caseScxmlContentType(ScxmlContentType object) {
				return createScxmlContentTypeAdapter();
			}
			@Override
			public Adapter caseScxmlDatamodelType(ScxmlDatamodelType object) {
				return createScxmlDatamodelTypeAdapter();
			}
			@Override
			public Adapter caseScxmlDataType(ScxmlDataType object) {
				return createScxmlDataTypeAdapter();
			}
			@Override
			public Adapter caseScxmlDonedataType(ScxmlDonedataType object) {
				return createScxmlDonedataTypeAdapter();
			}
			@Override
			public Adapter caseScxmlElseifType(ScxmlElseifType object) {
				return createScxmlElseifTypeAdapter();
			}
			@Override
			public Adapter caseScxmlElseType(ScxmlElseType object) {
				return createScxmlElseTypeAdapter();
			}
			@Override
			public Adapter caseScxmlFinalizeType(ScxmlFinalizeType object) {
				return createScxmlFinalizeTypeAdapter();
			}
			@Override
			public Adapter caseScxmlFinalType(ScxmlFinalType object) {
				return createScxmlFinalTypeAdapter();
			}
			@Override
			public Adapter caseScxmlForeachType(ScxmlForeachType object) {
				return createScxmlForeachTypeAdapter();
			}
			@Override
			public Adapter caseScxmlHistoryType(ScxmlHistoryType object) {
				return createScxmlHistoryTypeAdapter();
			}
			@Override
			public Adapter caseScxmlIfType(ScxmlIfType object) {
				return createScxmlIfTypeAdapter();
			}
			@Override
			public Adapter caseScxmlInitialType(ScxmlInitialType object) {
				return createScxmlInitialTypeAdapter();
			}
			@Override
			public Adapter caseScxmlInvokeType(ScxmlInvokeType object) {
				return createScxmlInvokeTypeAdapter();
			}
			@Override
			public Adapter caseScxmlLogType(ScxmlLogType object) {
				return createScxmlLogTypeAdapter();
			}
			@Override
			public Adapter caseScxmlOnentryType(ScxmlOnentryType object) {
				return createScxmlOnentryTypeAdapter();
			}
			@Override
			public Adapter caseScxmlOnexitType(ScxmlOnexitType object) {
				return createScxmlOnexitTypeAdapter();
			}
			@Override
			public Adapter caseScxmlParallelType(ScxmlParallelType object) {
				return createScxmlParallelTypeAdapter();
			}
			@Override
			public Adapter caseScxmlParamType(ScxmlParamType object) {
				return createScxmlParamTypeAdapter();
			}
			@Override
			public Adapter caseScxmlRaiseType(ScxmlRaiseType object) {
				return createScxmlRaiseTypeAdapter();
			}
			@Override
			public Adapter caseScxmlScriptType(ScxmlScriptType object) {
				return createScxmlScriptTypeAdapter();
			}
			@Override
			public Adapter caseScxmlScxmlType(ScxmlScxmlType object) {
				return createScxmlScxmlTypeAdapter();
			}
			@Override
			public Adapter caseScxmlSendType(ScxmlSendType object) {
				return createScxmlSendTypeAdapter();
			}
			@Override
			public Adapter caseScxmlStateType(ScxmlStateType object) {
				return createScxmlStateTypeAdapter();
			}
			@Override
			public Adapter caseScxmlTransitionType(ScxmlTransitionType object) {
				return createScxmlTransitionTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlAssignType <em>Assign Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlAssignType
	 * @generated
	 */
	public Adapter createScxmlAssignTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlCancelType <em>Cancel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlCancelType
	 * @generated
	 */
	public Adapter createScxmlCancelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlContentType
	 * @generated
	 */
	public Adapter createScxmlContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlDatamodelType <em>Datamodel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlDatamodelType
	 * @generated
	 */
	public Adapter createScxmlDatamodelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlDataType
	 * @generated
	 */
	public Adapter createScxmlDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlDonedataType <em>Donedata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlDonedataType
	 * @generated
	 */
	public Adapter createScxmlDonedataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlElseifType <em>Elseif Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlElseifType
	 * @generated
	 */
	public Adapter createScxmlElseifTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlElseType <em>Else Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlElseType
	 * @generated
	 */
	public Adapter createScxmlElseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlFinalizeType <em>Finalize Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlFinalizeType
	 * @generated
	 */
	public Adapter createScxmlFinalizeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlFinalType <em>Final Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlFinalType
	 * @generated
	 */
	public Adapter createScxmlFinalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlForeachType <em>Foreach Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlForeachType
	 * @generated
	 */
	public Adapter createScxmlForeachTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlHistoryType <em>History Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlHistoryType
	 * @generated
	 */
	public Adapter createScxmlHistoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlIfType <em>If Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlIfType
	 * @generated
	 */
	public Adapter createScxmlIfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlInitialType <em>Initial Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlInitialType
	 * @generated
	 */
	public Adapter createScxmlInitialTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlInvokeType <em>Invoke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlInvokeType
	 * @generated
	 */
	public Adapter createScxmlInvokeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlLogType <em>Log Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlLogType
	 * @generated
	 */
	public Adapter createScxmlLogTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlOnentryType <em>Onentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlOnentryType
	 * @generated
	 */
	public Adapter createScxmlOnentryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlOnexitType <em>Onexit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlOnexitType
	 * @generated
	 */
	public Adapter createScxmlOnexitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlParallelType <em>Parallel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlParallelType
	 * @generated
	 */
	public Adapter createScxmlParallelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlParamType
	 * @generated
	 */
	public Adapter createScxmlParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlRaiseType <em>Raise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlRaiseType
	 * @generated
	 */
	public Adapter createScxmlRaiseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlScriptType
	 * @generated
	 */
	public Adapter createScxmlScriptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlScxmlType <em>Scxml Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlScxmlType
	 * @generated
	 */
	public Adapter createScxmlScxmlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlSendType <em>Send Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlSendType
	 * @generated
	 */
	public Adapter createScxmlSendTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlStateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlStateType
	 * @generated
	 */
	public Adapter createScxmlStateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2005._07.scxml.ScxmlTransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2005._07.scxml.ScxmlTransitionType
	 * @generated
	 */
	public Adapter createScxmlTransitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ScxmlAdapterFactory
