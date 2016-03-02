/**
 */
package er_peter_chen_extended;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see er_peter_chen_extended.Er_peter_chen_extendedPackage
 * @generated
 */
public interface Er_peter_chen_extendedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Er_peter_chen_extendedFactory eINSTANCE = er_peter_chen_extended.impl.Er_peter_chen_extendedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ERPC Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Diagram</em>'.
	 * @generated
	 */
	ERPCDiagram createERPCDiagram();

	/**
	 * Returns a new object of class '<em>ERPC Entity Relationship Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Entity Relationship Link</em>'.
	 * @generated
	 */
	ERPCEntityRelationshipLink createERPCEntityRelationshipLink();

	/**
	 * Returns a new object of class '<em>ERPC Entity Attribute Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Entity Attribute Link</em>'.
	 * @generated
	 */
	ERPCEntityAttributeLink createERPCEntityAttributeLink();

	/**
	 * Returns a new object of class '<em>ERPC Relationship Attribute Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Relationship Attribute Link</em>'.
	 * @generated
	 */
	ERPCRelationshipAttributeLink createERPCRelationshipAttributeLink();

	/**
	 * Returns a new object of class '<em>ERPC Regular Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Regular Relationship</em>'.
	 * @generated
	 */
	ERPCRegularRelationship createERPCRegularRelationship();

	/**
	 * Returns a new object of class '<em>ERPC Identifying Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Identifying Relationship</em>'.
	 * @generated
	 */
	ERPCIdentifyingRelationship createERPCIdentifyingRelationship();

	/**
	 * Returns a new object of class '<em>ERPC Regular Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Regular Attribute</em>'.
	 * @generated
	 */
	ERPCRegularAttribute createERPCRegularAttribute();

	/**
	 * Returns a new object of class '<em>ERPC Composite Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Composite Attribute</em>'.
	 * @generated
	 */
	ERPCCompositeAttribute createERPCCompositeAttribute();

	/**
	 * Returns a new object of class '<em>ERPC Primary Key Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Primary Key Attribute</em>'.
	 * @generated
	 */
	ERPCPrimaryKeyAttribute createERPCPrimaryKeyAttribute();

	/**
	 * Returns a new object of class '<em>ERPC Weak Key Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Weak Key Attribute</em>'.
	 * @generated
	 */
	ERPCWeakKeyAttribute createERPCWeakKeyAttribute();

	/**
	 * Returns a new object of class '<em>ERPC Derived Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Derived Attribute</em>'.
	 * @generated
	 */
	ERPCDerivedAttribute createERPCDerivedAttribute();

	/**
	 * Returns a new object of class '<em>ERPC Multi Valued Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Multi Valued Attribute</em>'.
	 * @generated
	 */
	ERPCMultiValuedAttribute createERPCMultiValuedAttribute();

	/**
	 * Returns a new object of class '<em>ERPC Regular Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Regular Entity</em>'.
	 * @generated
	 */
	ERPCRegularEntity createERPCRegularEntity();

	/**
	 * Returns a new object of class '<em>ERPC Weak Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERPC Weak Entity</em>'.
	 * @generated
	 */
	ERPCWeakEntity createERPCWeakEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Er_peter_chen_extendedPackage getEr_peter_chen_extendedPackage();

} //Er_peter_chen_extendedFactory
