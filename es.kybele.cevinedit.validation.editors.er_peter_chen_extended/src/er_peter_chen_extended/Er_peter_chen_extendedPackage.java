/**
 */
package er_peter_chen_extended;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see er_peter_chen_extended.Er_peter_chen_extendedFactory
 * @model kind="package"
 * @generated
 */
public interface Er_peter_chen_extendedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "er_peter_chen_extended";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kybele.es/gmf/er_peter_chen_extended";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "er_peter_chen_extended";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Er_peter_chen_extendedPackage eINSTANCE = er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl.init();

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCDiagramImpl <em>ERPC Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCDiagramImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCDiagram()
	 * @generated
	 */
	int ERPC_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_DIAGRAM__LINKS = 0;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_DIAGRAM__RELATIONSHIPS = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_DIAGRAM__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_DIAGRAM__ENTITIES = 3;

	/**
	 * The number of structural features of the '<em>ERPC Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ERPC Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCLinkImpl <em>ERPC Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCLinkImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCLink()
	 * @generated
	 */
	int ERPC_LINK = 1;

	/**
	 * The number of structural features of the '<em>ERPC Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_LINK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ERPC Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCEntityRelationshipLinkImpl <em>ERPC Entity Relationship Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCEntityRelationshipLinkImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCEntityRelationshipLink()
	 * @generated
	 */
	int ERPC_ENTITY_RELATIONSHIP_LINK = 2;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ENTITY_RELATIONSHIP_LINK__RELATIONSHIP = ERPC_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ENTITY_RELATIONSHIP_LINK__ENTITY = ERPC_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ENTITY_RELATIONSHIP_LINK__CARDINALITY = ERPC_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ERPC Entity Relationship Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ENTITY_RELATIONSHIP_LINK_FEATURE_COUNT = ERPC_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>ERPC Entity Relationship Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ENTITY_RELATIONSHIP_LINK_OPERATION_COUNT = ERPC_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCEntityAttributeLinkImpl <em>ERPC Entity Attribute Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCEntityAttributeLinkImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCEntityAttributeLink()
	 * @generated
	 */
	int ERPC_ENTITY_ATTRIBUTE_LINK = 3;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ENTITY_ATTRIBUTE_LINK__ENTITY = ERPC_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ENTITY_ATTRIBUTE_LINK__ATTRIBUTE = ERPC_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ERPC Entity Attribute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ENTITY_ATTRIBUTE_LINK_FEATURE_COUNT = ERPC_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ERPC Entity Attribute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ENTITY_ATTRIBUTE_LINK_OPERATION_COUNT = ERPC_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCRelationshipAttributeLinkImpl <em>ERPC Relationship Attribute Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCRelationshipAttributeLinkImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCRelationshipAttributeLink()
	 * @generated
	 */
	int ERPC_RELATIONSHIP_ATTRIBUTE_LINK = 4;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_RELATIONSHIP_ATTRIBUTE_LINK__RELATIONSHIP = ERPC_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_RELATIONSHIP_ATTRIBUTE_LINK__ATTRIBUTE = ERPC_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ERPC Relationship Attribute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_RELATIONSHIP_ATTRIBUTE_LINK_FEATURE_COUNT = ERPC_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ERPC Relationship Attribute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_RELATIONSHIP_ATTRIBUTE_LINK_OPERATION_COUNT = ERPC_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCRelationshipImpl <em>ERPC Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCRelationshipImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCRelationship()
	 * @generated
	 */
	int ERPC_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_RELATIONSHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_RELATIONSHIP__CARDINALITY = 1;

	/**
	 * The number of structural features of the '<em>ERPC Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_RELATIONSHIP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ERPC Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCRegularRelationshipImpl <em>ERPC Regular Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCRegularRelationshipImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCRegularRelationship()
	 * @generated
	 */
	int ERPC_REGULAR_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_REGULAR_RELATIONSHIP__NAME = ERPC_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_REGULAR_RELATIONSHIP__CARDINALITY = ERPC_RELATIONSHIP__CARDINALITY;

	/**
	 * The number of structural features of the '<em>ERPC Regular Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_REGULAR_RELATIONSHIP_FEATURE_COUNT = ERPC_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ERPC Regular Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_REGULAR_RELATIONSHIP_OPERATION_COUNT = ERPC_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCIdentifyingRelationshipImpl <em>ERPC Identifying Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCIdentifyingRelationshipImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCIdentifyingRelationship()
	 * @generated
	 */
	int ERPC_IDENTIFYING_RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_IDENTIFYING_RELATIONSHIP__NAME = ERPC_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_IDENTIFYING_RELATIONSHIP__CARDINALITY = ERPC_RELATIONSHIP__CARDINALITY;

	/**
	 * The number of structural features of the '<em>ERPC Identifying Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_IDENTIFYING_RELATIONSHIP_FEATURE_COUNT = ERPC_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ERPC Identifying Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_IDENTIFYING_RELATIONSHIP_OPERATION_COUNT = ERPC_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCAttributeImpl <em>ERPC Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCAttributeImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCAttribute()
	 * @generated
	 */
	int ERPC_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ATTRIBUTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>ERPC Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ERPC Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCRegularAttributeImpl <em>ERPC Regular Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCRegularAttributeImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCRegularAttribute()
	 * @generated
	 */
	int ERPC_REGULAR_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_REGULAR_ATTRIBUTE__NAME = ERPC_ATTRIBUTE__NAME;

	/**
	 * The number of structural features of the '<em>ERPC Regular Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_REGULAR_ATTRIBUTE_FEATURE_COUNT = ERPC_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ERPC Regular Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_REGULAR_ATTRIBUTE_OPERATION_COUNT = ERPC_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCCompositeAttributeImpl <em>ERPC Composite Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCCompositeAttributeImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCCompositeAttribute()
	 * @generated
	 */
	int ERPC_COMPOSITE_ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_COMPOSITE_ATTRIBUTE__NAME = ERPC_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Composed Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_COMPOSITE_ATTRIBUTE__COMPOSED_ATTRIBUTES = ERPC_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ERPC Composite Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_COMPOSITE_ATTRIBUTE_FEATURE_COUNT = ERPC_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ERPC Composite Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_COMPOSITE_ATTRIBUTE_OPERATION_COUNT = ERPC_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCPrimaryKeyAttributeImpl <em>ERPC Primary Key Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCPrimaryKeyAttributeImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCPrimaryKeyAttribute()
	 * @generated
	 */
	int ERPC_PRIMARY_KEY_ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_PRIMARY_KEY_ATTRIBUTE__NAME = ERPC_ATTRIBUTE__NAME;

	/**
	 * The number of structural features of the '<em>ERPC Primary Key Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_PRIMARY_KEY_ATTRIBUTE_FEATURE_COUNT = ERPC_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ERPC Primary Key Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_PRIMARY_KEY_ATTRIBUTE_OPERATION_COUNT = ERPC_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCWeakKeyAttributeImpl <em>ERPC Weak Key Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCWeakKeyAttributeImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCWeakKeyAttribute()
	 * @generated
	 */
	int ERPC_WEAK_KEY_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_WEAK_KEY_ATTRIBUTE__NAME = ERPC_ATTRIBUTE__NAME;

	/**
	 * The number of structural features of the '<em>ERPC Weak Key Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_WEAK_KEY_ATTRIBUTE_FEATURE_COUNT = ERPC_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ERPC Weak Key Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_WEAK_KEY_ATTRIBUTE_OPERATION_COUNT = ERPC_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCDerivedAttributeImpl <em>ERPC Derived Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCDerivedAttributeImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCDerivedAttribute()
	 * @generated
	 */
	int ERPC_DERIVED_ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_DERIVED_ATTRIBUTE__NAME = ERPC_ATTRIBUTE__NAME;

	/**
	 * The number of structural features of the '<em>ERPC Derived Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_DERIVED_ATTRIBUTE_FEATURE_COUNT = ERPC_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ERPC Derived Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_DERIVED_ATTRIBUTE_OPERATION_COUNT = ERPC_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCMultiValuedAttributeImpl <em>ERPC Multi Valued Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCMultiValuedAttributeImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCMultiValuedAttribute()
	 * @generated
	 */
	int ERPC_MULTI_VALUED_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_MULTI_VALUED_ATTRIBUTE__NAME = ERPC_ATTRIBUTE__NAME;

	/**
	 * The number of structural features of the '<em>ERPC Multi Valued Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_MULTI_VALUED_ATTRIBUTE_FEATURE_COUNT = ERPC_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ERPC Multi Valued Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_MULTI_VALUED_ATTRIBUTE_OPERATION_COUNT = ERPC_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCEntityImpl <em>ERPC Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCEntityImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCEntity()
	 * @generated
	 */
	int ERPC_ENTITY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>ERPC Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ERPC Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCRegularEntityImpl <em>ERPC Regular Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCRegularEntityImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCRegularEntity()
	 * @generated
	 */
	int ERPC_REGULAR_ENTITY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_REGULAR_ENTITY__NAME = ERPC_ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>ERPC Regular Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_REGULAR_ENTITY_FEATURE_COUNT = ERPC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ERPC Regular Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_REGULAR_ENTITY_OPERATION_COUNT = ERPC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er_peter_chen_extended.impl.ERPCWeakEntityImpl <em>ERPC Weak Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_peter_chen_extended.impl.ERPCWeakEntityImpl
	 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCWeakEntity()
	 * @generated
	 */
	int ERPC_WEAK_ENTITY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_WEAK_ENTITY__NAME = ERPC_ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>ERPC Weak Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_WEAK_ENTITY_FEATURE_COUNT = ERPC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ERPC Weak Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERPC_WEAK_ENTITY_OPERATION_COUNT = ERPC_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCDiagram <em>ERPC Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Diagram</em>'.
	 * @see er_peter_chen_extended.ERPCDiagram
	 * @generated
	 */
	EClass getERPCDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link er_peter_chen_extended.ERPCDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see er_peter_chen_extended.ERPCDiagram#getLinks()
	 * @see #getERPCDiagram()
	 * @generated
	 */
	EReference getERPCDiagram_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link er_peter_chen_extended.ERPCDiagram#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see er_peter_chen_extended.ERPCDiagram#getRelationships()
	 * @see #getERPCDiagram()
	 * @generated
	 */
	EReference getERPCDiagram_Relationships();

	/**
	 * Returns the meta object for the containment reference list '{@link er_peter_chen_extended.ERPCDiagram#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see er_peter_chen_extended.ERPCDiagram#getAttributes()
	 * @see #getERPCDiagram()
	 * @generated
	 */
	EReference getERPCDiagram_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link er_peter_chen_extended.ERPCDiagram#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see er_peter_chen_extended.ERPCDiagram#getEntities()
	 * @see #getERPCDiagram()
	 * @generated
	 */
	EReference getERPCDiagram_Entities();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCLink <em>ERPC Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Link</em>'.
	 * @see er_peter_chen_extended.ERPCLink
	 * @generated
	 */
	EClass getERPCLink();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCEntityRelationshipLink <em>ERPC Entity Relationship Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Entity Relationship Link</em>'.
	 * @see er_peter_chen_extended.ERPCEntityRelationshipLink
	 * @generated
	 */
	EClass getERPCEntityRelationshipLink();

	/**
	 * Returns the meta object for the reference '{@link er_peter_chen_extended.ERPCEntityRelationshipLink#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship</em>'.
	 * @see er_peter_chen_extended.ERPCEntityRelationshipLink#getRelationship()
	 * @see #getERPCEntityRelationshipLink()
	 * @generated
	 */
	EReference getERPCEntityRelationshipLink_Relationship();

	/**
	 * Returns the meta object for the reference '{@link er_peter_chen_extended.ERPCEntityRelationshipLink#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see er_peter_chen_extended.ERPCEntityRelationshipLink#getEntity()
	 * @see #getERPCEntityRelationshipLink()
	 * @generated
	 */
	EReference getERPCEntityRelationshipLink_Entity();

	/**
	 * Returns the meta object for the attribute '{@link er_peter_chen_extended.ERPCEntityRelationshipLink#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see er_peter_chen_extended.ERPCEntityRelationshipLink#getCardinality()
	 * @see #getERPCEntityRelationshipLink()
	 * @generated
	 */
	EAttribute getERPCEntityRelationshipLink_Cardinality();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCEntityAttributeLink <em>ERPC Entity Attribute Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Entity Attribute Link</em>'.
	 * @see er_peter_chen_extended.ERPCEntityAttributeLink
	 * @generated
	 */
	EClass getERPCEntityAttributeLink();

	/**
	 * Returns the meta object for the reference '{@link er_peter_chen_extended.ERPCEntityAttributeLink#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see er_peter_chen_extended.ERPCEntityAttributeLink#getEntity()
	 * @see #getERPCEntityAttributeLink()
	 * @generated
	 */
	EReference getERPCEntityAttributeLink_Entity();

	/**
	 * Returns the meta object for the reference '{@link er_peter_chen_extended.ERPCEntityAttributeLink#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see er_peter_chen_extended.ERPCEntityAttributeLink#getAttribute()
	 * @see #getERPCEntityAttributeLink()
	 * @generated
	 */
	EReference getERPCEntityAttributeLink_Attribute();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCRelationshipAttributeLink <em>ERPC Relationship Attribute Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Relationship Attribute Link</em>'.
	 * @see er_peter_chen_extended.ERPCRelationshipAttributeLink
	 * @generated
	 */
	EClass getERPCRelationshipAttributeLink();

	/**
	 * Returns the meta object for the reference '{@link er_peter_chen_extended.ERPCRelationshipAttributeLink#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship</em>'.
	 * @see er_peter_chen_extended.ERPCRelationshipAttributeLink#getRelationship()
	 * @see #getERPCRelationshipAttributeLink()
	 * @generated
	 */
	EReference getERPCRelationshipAttributeLink_Relationship();

	/**
	 * Returns the meta object for the reference '{@link er_peter_chen_extended.ERPCRelationshipAttributeLink#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see er_peter_chen_extended.ERPCRelationshipAttributeLink#getAttribute()
	 * @see #getERPCRelationshipAttributeLink()
	 * @generated
	 */
	EReference getERPCRelationshipAttributeLink_Attribute();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCRelationship <em>ERPC Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Relationship</em>'.
	 * @see er_peter_chen_extended.ERPCRelationship
	 * @generated
	 */
	EClass getERPCRelationship();

	/**
	 * Returns the meta object for the attribute '{@link er_peter_chen_extended.ERPCRelationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see er_peter_chen_extended.ERPCRelationship#getName()
	 * @see #getERPCRelationship()
	 * @generated
	 */
	EAttribute getERPCRelationship_Name();

	/**
	 * Returns the meta object for the attribute '{@link er_peter_chen_extended.ERPCRelationship#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see er_peter_chen_extended.ERPCRelationship#getCardinality()
	 * @see #getERPCRelationship()
	 * @generated
	 */
	EAttribute getERPCRelationship_Cardinality();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCRegularRelationship <em>ERPC Regular Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Regular Relationship</em>'.
	 * @see er_peter_chen_extended.ERPCRegularRelationship
	 * @generated
	 */
	EClass getERPCRegularRelationship();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCIdentifyingRelationship <em>ERPC Identifying Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Identifying Relationship</em>'.
	 * @see er_peter_chen_extended.ERPCIdentifyingRelationship
	 * @generated
	 */
	EClass getERPCIdentifyingRelationship();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCAttribute <em>ERPC Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Attribute</em>'.
	 * @see er_peter_chen_extended.ERPCAttribute
	 * @generated
	 */
	EClass getERPCAttribute();

	/**
	 * Returns the meta object for the attribute '{@link er_peter_chen_extended.ERPCAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see er_peter_chen_extended.ERPCAttribute#getName()
	 * @see #getERPCAttribute()
	 * @generated
	 */
	EAttribute getERPCAttribute_Name();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCRegularAttribute <em>ERPC Regular Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Regular Attribute</em>'.
	 * @see er_peter_chen_extended.ERPCRegularAttribute
	 * @generated
	 */
	EClass getERPCRegularAttribute();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCCompositeAttribute <em>ERPC Composite Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Composite Attribute</em>'.
	 * @see er_peter_chen_extended.ERPCCompositeAttribute
	 * @generated
	 */
	EClass getERPCCompositeAttribute();

	/**
	 * Returns the meta object for the reference list '{@link er_peter_chen_extended.ERPCCompositeAttribute#getComposedAttributes <em>Composed Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composed Attributes</em>'.
	 * @see er_peter_chen_extended.ERPCCompositeAttribute#getComposedAttributes()
	 * @see #getERPCCompositeAttribute()
	 * @generated
	 */
	EReference getERPCCompositeAttribute_ComposedAttributes();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCPrimaryKeyAttribute <em>ERPC Primary Key Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Primary Key Attribute</em>'.
	 * @see er_peter_chen_extended.ERPCPrimaryKeyAttribute
	 * @generated
	 */
	EClass getERPCPrimaryKeyAttribute();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCWeakKeyAttribute <em>ERPC Weak Key Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Weak Key Attribute</em>'.
	 * @see er_peter_chen_extended.ERPCWeakKeyAttribute
	 * @generated
	 */
	EClass getERPCWeakKeyAttribute();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCDerivedAttribute <em>ERPC Derived Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Derived Attribute</em>'.
	 * @see er_peter_chen_extended.ERPCDerivedAttribute
	 * @generated
	 */
	EClass getERPCDerivedAttribute();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCMultiValuedAttribute <em>ERPC Multi Valued Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Multi Valued Attribute</em>'.
	 * @see er_peter_chen_extended.ERPCMultiValuedAttribute
	 * @generated
	 */
	EClass getERPCMultiValuedAttribute();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCEntity <em>ERPC Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Entity</em>'.
	 * @see er_peter_chen_extended.ERPCEntity
	 * @generated
	 */
	EClass getERPCEntity();

	/**
	 * Returns the meta object for the attribute '{@link er_peter_chen_extended.ERPCEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see er_peter_chen_extended.ERPCEntity#getName()
	 * @see #getERPCEntity()
	 * @generated
	 */
	EAttribute getERPCEntity_Name();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCRegularEntity <em>ERPC Regular Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Regular Entity</em>'.
	 * @see er_peter_chen_extended.ERPCRegularEntity
	 * @generated
	 */
	EClass getERPCRegularEntity();

	/**
	 * Returns the meta object for class '{@link er_peter_chen_extended.ERPCWeakEntity <em>ERPC Weak Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERPC Weak Entity</em>'.
	 * @see er_peter_chen_extended.ERPCWeakEntity
	 * @generated
	 */
	EClass getERPCWeakEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Er_peter_chen_extendedFactory getEr_peter_chen_extendedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCDiagramImpl <em>ERPC Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCDiagramImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCDiagram()
		 * @generated
		 */
		EClass ERPC_DIAGRAM = eINSTANCE.getERPCDiagram();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERPC_DIAGRAM__LINKS = eINSTANCE.getERPCDiagram_Links();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERPC_DIAGRAM__RELATIONSHIPS = eINSTANCE.getERPCDiagram_Relationships();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERPC_DIAGRAM__ATTRIBUTES = eINSTANCE.getERPCDiagram_Attributes();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERPC_DIAGRAM__ENTITIES = eINSTANCE.getERPCDiagram_Entities();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCLinkImpl <em>ERPC Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCLinkImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCLink()
		 * @generated
		 */
		EClass ERPC_LINK = eINSTANCE.getERPCLink();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCEntityRelationshipLinkImpl <em>ERPC Entity Relationship Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCEntityRelationshipLinkImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCEntityRelationshipLink()
		 * @generated
		 */
		EClass ERPC_ENTITY_RELATIONSHIP_LINK = eINSTANCE.getERPCEntityRelationshipLink();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERPC_ENTITY_RELATIONSHIP_LINK__RELATIONSHIP = eINSTANCE.getERPCEntityRelationshipLink_Relationship();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERPC_ENTITY_RELATIONSHIP_LINK__ENTITY = eINSTANCE.getERPCEntityRelationshipLink_Entity();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERPC_ENTITY_RELATIONSHIP_LINK__CARDINALITY = eINSTANCE.getERPCEntityRelationshipLink_Cardinality();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCEntityAttributeLinkImpl <em>ERPC Entity Attribute Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCEntityAttributeLinkImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCEntityAttributeLink()
		 * @generated
		 */
		EClass ERPC_ENTITY_ATTRIBUTE_LINK = eINSTANCE.getERPCEntityAttributeLink();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERPC_ENTITY_ATTRIBUTE_LINK__ENTITY = eINSTANCE.getERPCEntityAttributeLink_Entity();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERPC_ENTITY_ATTRIBUTE_LINK__ATTRIBUTE = eINSTANCE.getERPCEntityAttributeLink_Attribute();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCRelationshipAttributeLinkImpl <em>ERPC Relationship Attribute Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCRelationshipAttributeLinkImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCRelationshipAttributeLink()
		 * @generated
		 */
		EClass ERPC_RELATIONSHIP_ATTRIBUTE_LINK = eINSTANCE.getERPCRelationshipAttributeLink();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERPC_RELATIONSHIP_ATTRIBUTE_LINK__RELATIONSHIP = eINSTANCE.getERPCRelationshipAttributeLink_Relationship();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERPC_RELATIONSHIP_ATTRIBUTE_LINK__ATTRIBUTE = eINSTANCE.getERPCRelationshipAttributeLink_Attribute();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCRelationshipImpl <em>ERPC Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCRelationshipImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCRelationship()
		 * @generated
		 */
		EClass ERPC_RELATIONSHIP = eINSTANCE.getERPCRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERPC_RELATIONSHIP__NAME = eINSTANCE.getERPCRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERPC_RELATIONSHIP__CARDINALITY = eINSTANCE.getERPCRelationship_Cardinality();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCRegularRelationshipImpl <em>ERPC Regular Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCRegularRelationshipImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCRegularRelationship()
		 * @generated
		 */
		EClass ERPC_REGULAR_RELATIONSHIP = eINSTANCE.getERPCRegularRelationship();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCIdentifyingRelationshipImpl <em>ERPC Identifying Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCIdentifyingRelationshipImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCIdentifyingRelationship()
		 * @generated
		 */
		EClass ERPC_IDENTIFYING_RELATIONSHIP = eINSTANCE.getERPCIdentifyingRelationship();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCAttributeImpl <em>ERPC Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCAttributeImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCAttribute()
		 * @generated
		 */
		EClass ERPC_ATTRIBUTE = eINSTANCE.getERPCAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERPC_ATTRIBUTE__NAME = eINSTANCE.getERPCAttribute_Name();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCRegularAttributeImpl <em>ERPC Regular Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCRegularAttributeImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCRegularAttribute()
		 * @generated
		 */
		EClass ERPC_REGULAR_ATTRIBUTE = eINSTANCE.getERPCRegularAttribute();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCCompositeAttributeImpl <em>ERPC Composite Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCCompositeAttributeImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCCompositeAttribute()
		 * @generated
		 */
		EClass ERPC_COMPOSITE_ATTRIBUTE = eINSTANCE.getERPCCompositeAttribute();

		/**
		 * The meta object literal for the '<em><b>Composed Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERPC_COMPOSITE_ATTRIBUTE__COMPOSED_ATTRIBUTES = eINSTANCE.getERPCCompositeAttribute_ComposedAttributes();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCPrimaryKeyAttributeImpl <em>ERPC Primary Key Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCPrimaryKeyAttributeImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCPrimaryKeyAttribute()
		 * @generated
		 */
		EClass ERPC_PRIMARY_KEY_ATTRIBUTE = eINSTANCE.getERPCPrimaryKeyAttribute();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCWeakKeyAttributeImpl <em>ERPC Weak Key Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCWeakKeyAttributeImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCWeakKeyAttribute()
		 * @generated
		 */
		EClass ERPC_WEAK_KEY_ATTRIBUTE = eINSTANCE.getERPCWeakKeyAttribute();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCDerivedAttributeImpl <em>ERPC Derived Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCDerivedAttributeImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCDerivedAttribute()
		 * @generated
		 */
		EClass ERPC_DERIVED_ATTRIBUTE = eINSTANCE.getERPCDerivedAttribute();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCMultiValuedAttributeImpl <em>ERPC Multi Valued Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCMultiValuedAttributeImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCMultiValuedAttribute()
		 * @generated
		 */
		EClass ERPC_MULTI_VALUED_ATTRIBUTE = eINSTANCE.getERPCMultiValuedAttribute();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCEntityImpl <em>ERPC Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCEntityImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCEntity()
		 * @generated
		 */
		EClass ERPC_ENTITY = eINSTANCE.getERPCEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERPC_ENTITY__NAME = eINSTANCE.getERPCEntity_Name();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCRegularEntityImpl <em>ERPC Regular Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCRegularEntityImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCRegularEntity()
		 * @generated
		 */
		EClass ERPC_REGULAR_ENTITY = eINSTANCE.getERPCRegularEntity();

		/**
		 * The meta object literal for the '{@link er_peter_chen_extended.impl.ERPCWeakEntityImpl <em>ERPC Weak Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_peter_chen_extended.impl.ERPCWeakEntityImpl
		 * @see er_peter_chen_extended.impl.Er_peter_chen_extendedPackageImpl#getERPCWeakEntity()
		 * @generated
		 */
		EClass ERPC_WEAK_ENTITY = eINSTANCE.getERPCWeakEntity();

	}

} //Er_peter_chen_extendedPackage
