/**
 */
package er_peter_chen_extended.util;

import er_peter_chen_extended.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see er_peter_chen_extended.Er_peter_chen_extendedPackage
 * @generated
 */
public class Er_peter_chen_extendedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Er_peter_chen_extendedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Er_peter_chen_extendedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Er_peter_chen_extendedPackage.eINSTANCE;
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
	protected Er_peter_chen_extendedSwitch<Adapter> modelSwitch =
		new Er_peter_chen_extendedSwitch<Adapter>() {
			@Override
			public Adapter caseERPCDiagram(ERPCDiagram object) {
				return createERPCDiagramAdapter();
			}
			@Override
			public Adapter caseERPCLink(ERPCLink object) {
				return createERPCLinkAdapter();
			}
			@Override
			public Adapter caseERPCEntityRelationshipLink(ERPCEntityRelationshipLink object) {
				return createERPCEntityRelationshipLinkAdapter();
			}
			@Override
			public Adapter caseERPCEntityAttributeLink(ERPCEntityAttributeLink object) {
				return createERPCEntityAttributeLinkAdapter();
			}
			@Override
			public Adapter caseERPCRelationshipAttributeLink(ERPCRelationshipAttributeLink object) {
				return createERPCRelationshipAttributeLinkAdapter();
			}
			@Override
			public Adapter caseERPCRelationship(ERPCRelationship object) {
				return createERPCRelationshipAdapter();
			}
			@Override
			public Adapter caseERPCRegularRelationship(ERPCRegularRelationship object) {
				return createERPCRegularRelationshipAdapter();
			}
			@Override
			public Adapter caseERPCIdentifyingRelationship(ERPCIdentifyingRelationship object) {
				return createERPCIdentifyingRelationshipAdapter();
			}
			@Override
			public Adapter caseERPCAttribute(ERPCAttribute object) {
				return createERPCAttributeAdapter();
			}
			@Override
			public Adapter caseERPCRegularAttribute(ERPCRegularAttribute object) {
				return createERPCRegularAttributeAdapter();
			}
			@Override
			public Adapter caseERPCCompositeAttribute(ERPCCompositeAttribute object) {
				return createERPCCompositeAttributeAdapter();
			}
			@Override
			public Adapter caseERPCPrimaryKeyAttribute(ERPCPrimaryKeyAttribute object) {
				return createERPCPrimaryKeyAttributeAdapter();
			}
			@Override
			public Adapter caseERPCWeakKeyAttribute(ERPCWeakKeyAttribute object) {
				return createERPCWeakKeyAttributeAdapter();
			}
			@Override
			public Adapter caseERPCDerivedAttribute(ERPCDerivedAttribute object) {
				return createERPCDerivedAttributeAdapter();
			}
			@Override
			public Adapter caseERPCMultiValuedAttribute(ERPCMultiValuedAttribute object) {
				return createERPCMultiValuedAttributeAdapter();
			}
			@Override
			public Adapter caseERPCEntity(ERPCEntity object) {
				return createERPCEntityAdapter();
			}
			@Override
			public Adapter caseERPCRegularEntity(ERPCRegularEntity object) {
				return createERPCRegularEntityAdapter();
			}
			@Override
			public Adapter caseERPCWeakEntity(ERPCWeakEntity object) {
				return createERPCWeakEntityAdapter();
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
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCDiagram <em>ERPC Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCDiagram
	 * @generated
	 */
	public Adapter createERPCDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCLink <em>ERPC Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCLink
	 * @generated
	 */
	public Adapter createERPCLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCEntityRelationshipLink <em>ERPC Entity Relationship Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCEntityRelationshipLink
	 * @generated
	 */
	public Adapter createERPCEntityRelationshipLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCEntityAttributeLink <em>ERPC Entity Attribute Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCEntityAttributeLink
	 * @generated
	 */
	public Adapter createERPCEntityAttributeLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCRelationshipAttributeLink <em>ERPC Relationship Attribute Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCRelationshipAttributeLink
	 * @generated
	 */
	public Adapter createERPCRelationshipAttributeLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCRelationship <em>ERPC Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCRelationship
	 * @generated
	 */
	public Adapter createERPCRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCRegularRelationship <em>ERPC Regular Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCRegularRelationship
	 * @generated
	 */
	public Adapter createERPCRegularRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCIdentifyingRelationship <em>ERPC Identifying Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCIdentifyingRelationship
	 * @generated
	 */
	public Adapter createERPCIdentifyingRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCAttribute <em>ERPC Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCAttribute
	 * @generated
	 */
	public Adapter createERPCAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCRegularAttribute <em>ERPC Regular Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCRegularAttribute
	 * @generated
	 */
	public Adapter createERPCRegularAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCCompositeAttribute <em>ERPC Composite Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCCompositeAttribute
	 * @generated
	 */
	public Adapter createERPCCompositeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCPrimaryKeyAttribute <em>ERPC Primary Key Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCPrimaryKeyAttribute
	 * @generated
	 */
	public Adapter createERPCPrimaryKeyAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCWeakKeyAttribute <em>ERPC Weak Key Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCWeakKeyAttribute
	 * @generated
	 */
	public Adapter createERPCWeakKeyAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCDerivedAttribute <em>ERPC Derived Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCDerivedAttribute
	 * @generated
	 */
	public Adapter createERPCDerivedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCMultiValuedAttribute <em>ERPC Multi Valued Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCMultiValuedAttribute
	 * @generated
	 */
	public Adapter createERPCMultiValuedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCEntity <em>ERPC Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCEntity
	 * @generated
	 */
	public Adapter createERPCEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCRegularEntity <em>ERPC Regular Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCRegularEntity
	 * @generated
	 */
	public Adapter createERPCRegularEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_peter_chen_extended.ERPCWeakEntity <em>ERPC Weak Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_peter_chen_extended.ERPCWeakEntity
	 * @generated
	 */
	public Adapter createERPCWeakEntityAdapter() {
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

} //Er_peter_chen_extendedAdapterFactory
