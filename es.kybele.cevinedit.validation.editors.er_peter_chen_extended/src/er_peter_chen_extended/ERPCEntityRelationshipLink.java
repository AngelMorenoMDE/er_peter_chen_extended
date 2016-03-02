/**
 */
package er_peter_chen_extended;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERPC Entity Relationship Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er_peter_chen_extended.ERPCEntityRelationshipLink#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link er_peter_chen_extended.ERPCEntityRelationshipLink#getEntity <em>Entity</em>}</li>
 *   <li>{@link er_peter_chen_extended.ERPCEntityRelationshipLink#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see er_peter_chen_extended.Er_peter_chen_extendedPackage#getERPCEntityRelationshipLink()
 * @model
 * @generated
 */
public interface ERPCEntityRelationshipLink extends ERPCLink {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference.
	 * @see #setRelationship(ERPCRelationship)
	 * @see er_peter_chen_extended.Er_peter_chen_extendedPackage#getERPCEntityRelationshipLink_Relationship()
	 * @model required="true"
	 * @generated
	 */
	ERPCRelationship getRelationship();

	/**
	 * Sets the value of the '{@link er_peter_chen_extended.ERPCEntityRelationshipLink#getRelationship <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(ERPCRelationship value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(ERPCEntity)
	 * @see er_peter_chen_extended.Er_peter_chen_extendedPackage#getERPCEntityRelationshipLink_Entity()
	 * @model required="true"
	 * @generated
	 */
	ERPCEntity getEntity();

	/**
	 * Sets the value of the '{@link er_peter_chen_extended.ERPCEntityRelationshipLink#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(ERPCEntity value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see er_peter_chen_extended.Er_peter_chen_extendedPackage#getERPCEntityRelationshipLink_Cardinality()
	 * @model
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link er_peter_chen_extended.ERPCEntityRelationshipLink#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

} // ERPCEntityRelationshipLink
