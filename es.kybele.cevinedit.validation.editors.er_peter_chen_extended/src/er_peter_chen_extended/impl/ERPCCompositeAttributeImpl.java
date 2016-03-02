/**
 */
package er_peter_chen_extended.impl;

import er_peter_chen_extended.ERPCCompositeAttribute;
import er_peter_chen_extended.ERPCRegularAttribute;
import er_peter_chen_extended.Er_peter_chen_extendedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERPC Composite Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er_peter_chen_extended.impl.ERPCCompositeAttributeImpl#getComposedAttributes <em>Composed Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERPCCompositeAttributeImpl extends ERPCAttributeImpl implements ERPCCompositeAttribute {
	/**
	 * The cached value of the '{@link #getComposedAttributes() <em>Composed Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ERPCRegularAttribute> composedAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERPCCompositeAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Er_peter_chen_extendedPackage.Literals.ERPC_COMPOSITE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERPCRegularAttribute> getComposedAttributes() {
		if (composedAttributes == null) {
			composedAttributes = new EObjectResolvingEList<ERPCRegularAttribute>(ERPCRegularAttribute.class, this, Er_peter_chen_extendedPackage.ERPC_COMPOSITE_ATTRIBUTE__COMPOSED_ATTRIBUTES);
		}
		return composedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Er_peter_chen_extendedPackage.ERPC_COMPOSITE_ATTRIBUTE__COMPOSED_ATTRIBUTES:
				return getComposedAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Er_peter_chen_extendedPackage.ERPC_COMPOSITE_ATTRIBUTE__COMPOSED_ATTRIBUTES:
				getComposedAttributes().clear();
				getComposedAttributes().addAll((Collection<? extends ERPCRegularAttribute>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Er_peter_chen_extendedPackage.ERPC_COMPOSITE_ATTRIBUTE__COMPOSED_ATTRIBUTES:
				getComposedAttributes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Er_peter_chen_extendedPackage.ERPC_COMPOSITE_ATTRIBUTE__COMPOSED_ATTRIBUTES:
				return composedAttributes != null && !composedAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ERPCCompositeAttributeImpl
