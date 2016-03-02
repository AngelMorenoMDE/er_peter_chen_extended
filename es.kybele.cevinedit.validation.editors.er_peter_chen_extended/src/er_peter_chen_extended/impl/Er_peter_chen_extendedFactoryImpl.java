/**
 */
package er_peter_chen_extended.impl;

import er_peter_chen_extended.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Er_peter_chen_extendedFactoryImpl extends EFactoryImpl implements Er_peter_chen_extendedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Er_peter_chen_extendedFactory init() {
		try {
			Er_peter_chen_extendedFactory theEr_peter_chen_extendedFactory = (Er_peter_chen_extendedFactory)EPackage.Registry.INSTANCE.getEFactory(Er_peter_chen_extendedPackage.eNS_URI);
			if (theEr_peter_chen_extendedFactory != null) {
				return theEr_peter_chen_extendedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Er_peter_chen_extendedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Er_peter_chen_extendedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM: return createERPCDiagram();
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK: return createERPCEntityRelationshipLink();
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK: return createERPCEntityAttributeLink();
			case Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK: return createERPCRelationshipAttributeLink();
			case Er_peter_chen_extendedPackage.ERPC_REGULAR_RELATIONSHIP: return createERPCRegularRelationship();
			case Er_peter_chen_extendedPackage.ERPC_IDENTIFYING_RELATIONSHIP: return createERPCIdentifyingRelationship();
			case Er_peter_chen_extendedPackage.ERPC_REGULAR_ATTRIBUTE: return createERPCRegularAttribute();
			case Er_peter_chen_extendedPackage.ERPC_COMPOSITE_ATTRIBUTE: return createERPCCompositeAttribute();
			case Er_peter_chen_extendedPackage.ERPC_PRIMARY_KEY_ATTRIBUTE: return createERPCPrimaryKeyAttribute();
			case Er_peter_chen_extendedPackage.ERPC_WEAK_KEY_ATTRIBUTE: return createERPCWeakKeyAttribute();
			case Er_peter_chen_extendedPackage.ERPC_DERIVED_ATTRIBUTE: return createERPCDerivedAttribute();
			case Er_peter_chen_extendedPackage.ERPC_MULTI_VALUED_ATTRIBUTE: return createERPCMultiValuedAttribute();
			case Er_peter_chen_extendedPackage.ERPC_REGULAR_ENTITY: return createERPCRegularEntity();
			case Er_peter_chen_extendedPackage.ERPC_WEAK_ENTITY: return createERPCWeakEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCDiagram createERPCDiagram() {
		ERPCDiagramImpl erpcDiagram = new ERPCDiagramImpl();
		return erpcDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCEntityRelationshipLink createERPCEntityRelationshipLink() {
		ERPCEntityRelationshipLinkImpl erpcEntityRelationshipLink = new ERPCEntityRelationshipLinkImpl();
		return erpcEntityRelationshipLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCEntityAttributeLink createERPCEntityAttributeLink() {
		ERPCEntityAttributeLinkImpl erpcEntityAttributeLink = new ERPCEntityAttributeLinkImpl();
		return erpcEntityAttributeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCRelationshipAttributeLink createERPCRelationshipAttributeLink() {
		ERPCRelationshipAttributeLinkImpl erpcRelationshipAttributeLink = new ERPCRelationshipAttributeLinkImpl();
		return erpcRelationshipAttributeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCRegularRelationship createERPCRegularRelationship() {
		ERPCRegularRelationshipImpl erpcRegularRelationship = new ERPCRegularRelationshipImpl();
		return erpcRegularRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCIdentifyingRelationship createERPCIdentifyingRelationship() {
		ERPCIdentifyingRelationshipImpl erpcIdentifyingRelationship = new ERPCIdentifyingRelationshipImpl();
		return erpcIdentifyingRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCRegularAttribute createERPCRegularAttribute() {
		ERPCRegularAttributeImpl erpcRegularAttribute = new ERPCRegularAttributeImpl();
		return erpcRegularAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCCompositeAttribute createERPCCompositeAttribute() {
		ERPCCompositeAttributeImpl erpcCompositeAttribute = new ERPCCompositeAttributeImpl();
		return erpcCompositeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCPrimaryKeyAttribute createERPCPrimaryKeyAttribute() {
		ERPCPrimaryKeyAttributeImpl erpcPrimaryKeyAttribute = new ERPCPrimaryKeyAttributeImpl();
		return erpcPrimaryKeyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCWeakKeyAttribute createERPCWeakKeyAttribute() {
		ERPCWeakKeyAttributeImpl erpcWeakKeyAttribute = new ERPCWeakKeyAttributeImpl();
		return erpcWeakKeyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCDerivedAttribute createERPCDerivedAttribute() {
		ERPCDerivedAttributeImpl erpcDerivedAttribute = new ERPCDerivedAttributeImpl();
		return erpcDerivedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCMultiValuedAttribute createERPCMultiValuedAttribute() {
		ERPCMultiValuedAttributeImpl erpcMultiValuedAttribute = new ERPCMultiValuedAttributeImpl();
		return erpcMultiValuedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCRegularEntity createERPCRegularEntity() {
		ERPCRegularEntityImpl erpcRegularEntity = new ERPCRegularEntityImpl();
		return erpcRegularEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCWeakEntity createERPCWeakEntity() {
		ERPCWeakEntityImpl erpcWeakEntity = new ERPCWeakEntityImpl();
		return erpcWeakEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Er_peter_chen_extendedPackage getEr_peter_chen_extendedPackage() {
		return (Er_peter_chen_extendedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Er_peter_chen_extendedPackage getPackage() {
		return Er_peter_chen_extendedPackage.eINSTANCE;
	}

} //Er_peter_chen_extendedFactoryImpl
