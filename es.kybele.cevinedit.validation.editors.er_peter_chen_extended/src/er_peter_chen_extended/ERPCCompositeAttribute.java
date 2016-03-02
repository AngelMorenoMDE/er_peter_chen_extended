/**
 */
package er_peter_chen_extended;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERPC Composite Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er_peter_chen_extended.ERPCCompositeAttribute#getComposedAttributes <em>Composed Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see er_peter_chen_extended.Er_peter_chen_extendedPackage#getERPCCompositeAttribute()
 * @model
 * @generated
 */
public interface ERPCCompositeAttribute extends ERPCAttribute {
	/**
	 * Returns the value of the '<em><b>Composed Attributes</b></em>' reference list.
	 * The list contents are of type {@link er_peter_chen_extended.ERPCRegularAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Attributes</em>' reference list.
	 * @see er_peter_chen_extended.Er_peter_chen_extendedPackage#getERPCCompositeAttribute_ComposedAttributes()
	 * @model
	 * @generated
	 */
	EList<ERPCRegularAttribute> getComposedAttributes();

} // ERPCCompositeAttribute
