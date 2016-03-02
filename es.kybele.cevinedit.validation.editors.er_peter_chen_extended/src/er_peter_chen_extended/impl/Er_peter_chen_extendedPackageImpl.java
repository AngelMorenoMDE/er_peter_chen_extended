/**
 */
package er_peter_chen_extended.impl;

import er_peter_chen_extended.ERPCAttribute;
import er_peter_chen_extended.ERPCCompositeAttribute;
import er_peter_chen_extended.ERPCDerivedAttribute;
import er_peter_chen_extended.ERPCDiagram;
import er_peter_chen_extended.ERPCEntity;
import er_peter_chen_extended.ERPCEntityAttributeLink;
import er_peter_chen_extended.ERPCEntityRelationshipLink;
import er_peter_chen_extended.ERPCIdentifyingRelationship;
import er_peter_chen_extended.ERPCLink;
import er_peter_chen_extended.ERPCMultiValuedAttribute;
import er_peter_chen_extended.ERPCPrimaryKeyAttribute;
import er_peter_chen_extended.ERPCRegularAttribute;
import er_peter_chen_extended.ERPCRegularEntity;
import er_peter_chen_extended.ERPCRegularRelationship;
import er_peter_chen_extended.ERPCRelationship;
import er_peter_chen_extended.ERPCRelationshipAttributeLink;
import er_peter_chen_extended.ERPCWeakEntity;
import er_peter_chen_extended.ERPCWeakKeyAttribute;
import er_peter_chen_extended.Er_peter_chen_extendedFactory;
import er_peter_chen_extended.Er_peter_chen_extendedPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Er_peter_chen_extendedPackageImpl extends EPackageImpl implements Er_peter_chen_extendedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcEntityRelationshipLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcEntityAttributeLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcRelationshipAttributeLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcRegularRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcIdentifyingRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcRegularAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcCompositeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcPrimaryKeyAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcWeakKeyAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcDerivedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcMultiValuedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcRegularEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpcWeakEntityEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see er_peter_chen_extended.Er_peter_chen_extendedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Er_peter_chen_extendedPackageImpl() {
		super(eNS_URI, Er_peter_chen_extendedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Er_peter_chen_extendedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Er_peter_chen_extendedPackage init() {
		if (isInited) return (Er_peter_chen_extendedPackage)EPackage.Registry.INSTANCE.getEPackage(Er_peter_chen_extendedPackage.eNS_URI);

		// Obtain or create and register package
		Er_peter_chen_extendedPackageImpl theEr_peter_chen_extendedPackage = (Er_peter_chen_extendedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Er_peter_chen_extendedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Er_peter_chen_extendedPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEr_peter_chen_extendedPackage.createPackageContents();

		// Initialize created meta-data
		theEr_peter_chen_extendedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEr_peter_chen_extendedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Er_peter_chen_extendedPackage.eNS_URI, theEr_peter_chen_extendedPackage);
		return theEr_peter_chen_extendedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCDiagram() {
		return erpcDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERPCDiagram_Links() {
		return (EReference)erpcDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERPCDiagram_Relationships() {
		return (EReference)erpcDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERPCDiagram_Attributes() {
		return (EReference)erpcDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERPCDiagram_Entities() {
		return (EReference)erpcDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCLink() {
		return erpcLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCEntityRelationshipLink() {
		return erpcEntityRelationshipLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERPCEntityRelationshipLink_Relationship() {
		return (EReference)erpcEntityRelationshipLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERPCEntityRelationshipLink_Entity() {
		return (EReference)erpcEntityRelationshipLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERPCEntityRelationshipLink_Cardinality() {
		return (EAttribute)erpcEntityRelationshipLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCEntityAttributeLink() {
		return erpcEntityAttributeLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERPCEntityAttributeLink_Entity() {
		return (EReference)erpcEntityAttributeLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERPCEntityAttributeLink_Attribute() {
		return (EReference)erpcEntityAttributeLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCRelationshipAttributeLink() {
		return erpcRelationshipAttributeLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERPCRelationshipAttributeLink_Relationship() {
		return (EReference)erpcRelationshipAttributeLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERPCRelationshipAttributeLink_Attribute() {
		return (EReference)erpcRelationshipAttributeLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCRelationship() {
		return erpcRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERPCRelationship_Name() {
		return (EAttribute)erpcRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERPCRelationship_Cardinality() {
		return (EAttribute)erpcRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCRegularRelationship() {
		return erpcRegularRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCIdentifyingRelationship() {
		return erpcIdentifyingRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCAttribute() {
		return erpcAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERPCAttribute_Name() {
		return (EAttribute)erpcAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCRegularAttribute() {
		return erpcRegularAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCCompositeAttribute() {
		return erpcCompositeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERPCCompositeAttribute_ComposedAttributes() {
		return (EReference)erpcCompositeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCPrimaryKeyAttribute() {
		return erpcPrimaryKeyAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCWeakKeyAttribute() {
		return erpcWeakKeyAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCDerivedAttribute() {
		return erpcDerivedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCMultiValuedAttribute() {
		return erpcMultiValuedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCEntity() {
		return erpcEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERPCEntity_Name() {
		return (EAttribute)erpcEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCRegularEntity() {
		return erpcRegularEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERPCWeakEntity() {
		return erpcWeakEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Er_peter_chen_extendedFactory getEr_peter_chen_extendedFactory() {
		return (Er_peter_chen_extendedFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		erpcDiagramEClass = createEClass(ERPC_DIAGRAM);
		createEReference(erpcDiagramEClass, ERPC_DIAGRAM__LINKS);
		createEReference(erpcDiagramEClass, ERPC_DIAGRAM__RELATIONSHIPS);
		createEReference(erpcDiagramEClass, ERPC_DIAGRAM__ATTRIBUTES);
		createEReference(erpcDiagramEClass, ERPC_DIAGRAM__ENTITIES);

		erpcLinkEClass = createEClass(ERPC_LINK);

		erpcEntityRelationshipLinkEClass = createEClass(ERPC_ENTITY_RELATIONSHIP_LINK);
		createEReference(erpcEntityRelationshipLinkEClass, ERPC_ENTITY_RELATIONSHIP_LINK__RELATIONSHIP);
		createEReference(erpcEntityRelationshipLinkEClass, ERPC_ENTITY_RELATIONSHIP_LINK__ENTITY);
		createEAttribute(erpcEntityRelationshipLinkEClass, ERPC_ENTITY_RELATIONSHIP_LINK__CARDINALITY);

		erpcEntityAttributeLinkEClass = createEClass(ERPC_ENTITY_ATTRIBUTE_LINK);
		createEReference(erpcEntityAttributeLinkEClass, ERPC_ENTITY_ATTRIBUTE_LINK__ENTITY);
		createEReference(erpcEntityAttributeLinkEClass, ERPC_ENTITY_ATTRIBUTE_LINK__ATTRIBUTE);

		erpcRelationshipAttributeLinkEClass = createEClass(ERPC_RELATIONSHIP_ATTRIBUTE_LINK);
		createEReference(erpcRelationshipAttributeLinkEClass, ERPC_RELATIONSHIP_ATTRIBUTE_LINK__RELATIONSHIP);
		createEReference(erpcRelationshipAttributeLinkEClass, ERPC_RELATIONSHIP_ATTRIBUTE_LINK__ATTRIBUTE);

		erpcRelationshipEClass = createEClass(ERPC_RELATIONSHIP);
		createEAttribute(erpcRelationshipEClass, ERPC_RELATIONSHIP__NAME);
		createEAttribute(erpcRelationshipEClass, ERPC_RELATIONSHIP__CARDINALITY);

		erpcRegularRelationshipEClass = createEClass(ERPC_REGULAR_RELATIONSHIP);

		erpcIdentifyingRelationshipEClass = createEClass(ERPC_IDENTIFYING_RELATIONSHIP);

		erpcAttributeEClass = createEClass(ERPC_ATTRIBUTE);
		createEAttribute(erpcAttributeEClass, ERPC_ATTRIBUTE__NAME);

		erpcRegularAttributeEClass = createEClass(ERPC_REGULAR_ATTRIBUTE);

		erpcCompositeAttributeEClass = createEClass(ERPC_COMPOSITE_ATTRIBUTE);
		createEReference(erpcCompositeAttributeEClass, ERPC_COMPOSITE_ATTRIBUTE__COMPOSED_ATTRIBUTES);

		erpcPrimaryKeyAttributeEClass = createEClass(ERPC_PRIMARY_KEY_ATTRIBUTE);

		erpcWeakKeyAttributeEClass = createEClass(ERPC_WEAK_KEY_ATTRIBUTE);

		erpcDerivedAttributeEClass = createEClass(ERPC_DERIVED_ATTRIBUTE);

		erpcMultiValuedAttributeEClass = createEClass(ERPC_MULTI_VALUED_ATTRIBUTE);

		erpcEntityEClass = createEClass(ERPC_ENTITY);
		createEAttribute(erpcEntityEClass, ERPC_ENTITY__NAME);

		erpcRegularEntityEClass = createEClass(ERPC_REGULAR_ENTITY);

		erpcWeakEntityEClass = createEClass(ERPC_WEAK_ENTITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		erpcEntityRelationshipLinkEClass.getESuperTypes().add(this.getERPCLink());
		erpcEntityAttributeLinkEClass.getESuperTypes().add(this.getERPCLink());
		erpcRelationshipAttributeLinkEClass.getESuperTypes().add(this.getERPCLink());
		erpcRegularRelationshipEClass.getESuperTypes().add(this.getERPCRelationship());
		erpcIdentifyingRelationshipEClass.getESuperTypes().add(this.getERPCRelationship());
		erpcRegularAttributeEClass.getESuperTypes().add(this.getERPCAttribute());
		erpcCompositeAttributeEClass.getESuperTypes().add(this.getERPCAttribute());
		erpcPrimaryKeyAttributeEClass.getESuperTypes().add(this.getERPCAttribute());
		erpcWeakKeyAttributeEClass.getESuperTypes().add(this.getERPCAttribute());
		erpcDerivedAttributeEClass.getESuperTypes().add(this.getERPCAttribute());
		erpcMultiValuedAttributeEClass.getESuperTypes().add(this.getERPCAttribute());
		erpcRegularEntityEClass.getESuperTypes().add(this.getERPCEntity());
		erpcWeakEntityEClass.getESuperTypes().add(this.getERPCEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(erpcDiagramEClass, ERPCDiagram.class, "ERPCDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERPCDiagram_Links(), this.getERPCLink(), null, "links", null, 0, -1, ERPCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERPCDiagram_Relationships(), this.getERPCRelationship(), null, "relationships", null, 0, -1, ERPCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERPCDiagram_Attributes(), this.getERPCAttribute(), null, "attributes", null, 0, -1, ERPCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERPCDiagram_Entities(), this.getERPCEntity(), null, "entities", null, 0, -1, ERPCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erpcLinkEClass, ERPCLink.class, "ERPCLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(erpcEntityRelationshipLinkEClass, ERPCEntityRelationshipLink.class, "ERPCEntityRelationshipLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERPCEntityRelationshipLink_Relationship(), this.getERPCRelationship(), null, "relationship", null, 1, 1, ERPCEntityRelationshipLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERPCEntityRelationshipLink_Entity(), this.getERPCEntity(), null, "entity", null, 1, 1, ERPCEntityRelationshipLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERPCEntityRelationshipLink_Cardinality(), ecorePackage.getEString(), "cardinality", null, 0, 1, ERPCEntityRelationshipLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erpcEntityAttributeLinkEClass, ERPCEntityAttributeLink.class, "ERPCEntityAttributeLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERPCEntityAttributeLink_Entity(), this.getERPCEntity(), null, "entity", null, 1, 1, ERPCEntityAttributeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERPCEntityAttributeLink_Attribute(), this.getERPCAttribute(), null, "attribute", null, 1, 1, ERPCEntityAttributeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erpcRelationshipAttributeLinkEClass, ERPCRelationshipAttributeLink.class, "ERPCRelationshipAttributeLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERPCRelationshipAttributeLink_Relationship(), this.getERPCRelationship(), null, "relationship", null, 1, 1, ERPCRelationshipAttributeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERPCRelationshipAttributeLink_Attribute(), this.getERPCAttribute(), null, "attribute", null, 1, 1, ERPCRelationshipAttributeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erpcRelationshipEClass, ERPCRelationship.class, "ERPCRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getERPCRelationship_Name(), ecorePackage.getEString(), "name", null, 0, 1, ERPCRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERPCRelationship_Cardinality(), ecorePackage.getEString(), "cardinality", null, 0, 1, ERPCRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erpcRegularRelationshipEClass, ERPCRegularRelationship.class, "ERPCRegularRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(erpcIdentifyingRelationshipEClass, ERPCIdentifyingRelationship.class, "ERPCIdentifyingRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(erpcAttributeEClass, ERPCAttribute.class, "ERPCAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getERPCAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, ERPCAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erpcRegularAttributeEClass, ERPCRegularAttribute.class, "ERPCRegularAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(erpcCompositeAttributeEClass, ERPCCompositeAttribute.class, "ERPCCompositeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERPCCompositeAttribute_ComposedAttributes(), this.getERPCRegularAttribute(), null, "composedAttributes", null, 0, -1, ERPCCompositeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erpcPrimaryKeyAttributeEClass, ERPCPrimaryKeyAttribute.class, "ERPCPrimaryKeyAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(erpcWeakKeyAttributeEClass, ERPCWeakKeyAttribute.class, "ERPCWeakKeyAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(erpcDerivedAttributeEClass, ERPCDerivedAttribute.class, "ERPCDerivedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(erpcMultiValuedAttributeEClass, ERPCMultiValuedAttribute.class, "ERPCMultiValuedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(erpcEntityEClass, ERPCEntity.class, "ERPCEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getERPCEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, ERPCEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erpcRegularEntityEClass, ERPCRegularEntity.class, "ERPCRegularEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(erpcWeakEntityEClass, ERPCWeakEntity.class, "ERPCWeakEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Er_peter_chen_extendedPackageImpl
