/**
 */
package er_peter_chen_extended.impl;

import er_peter_chen_extended.ERPCAttribute;
import er_peter_chen_extended.ERPCRelationship;
import er_peter_chen_extended.ERPCRelationshipAttributeLink;
import er_peter_chen_extended.Er_peter_chen_extendedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERPC Relationship Attribute Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er_peter_chen_extended.impl.ERPCRelationshipAttributeLinkImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link er_peter_chen_extended.impl.ERPCRelationshipAttributeLinkImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERPCRelationshipAttributeLinkImpl extends ERPCLinkImpl implements ERPCRelationshipAttributeLink {
	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected ERPCRelationship relationship;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected ERPCAttribute attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERPCRelationshipAttributeLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Er_peter_chen_extendedPackage.Literals.ERPC_RELATIONSHIP_ATTRIBUTE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCRelationship getRelationship() {
		if (relationship != null && relationship.eIsProxy()) {
			InternalEObject oldRelationship = (InternalEObject)relationship;
			relationship = (ERPCRelationship)eResolveProxy(oldRelationship);
			if (relationship != oldRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK__RELATIONSHIP, oldRelationship, relationship));
			}
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCRelationship basicGetRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(ERPCRelationship newRelationship) {
		ERPCRelationship oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK__RELATIONSHIP, oldRelationship, relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCAttribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (ERPCAttribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCAttribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(ERPCAttribute newAttribute) {
		ERPCAttribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK__RELATIONSHIP:
				if (resolve) return getRelationship();
				return basicGetRelationship();
			case Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK__RELATIONSHIP:
				setRelationship((ERPCRelationship)newValue);
				return;
			case Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK__ATTRIBUTE:
				setAttribute((ERPCAttribute)newValue);
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
			case Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK__RELATIONSHIP:
				setRelationship((ERPCRelationship)null);
				return;
			case Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK__ATTRIBUTE:
				setAttribute((ERPCAttribute)null);
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
			case Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK__RELATIONSHIP:
				return relationship != null;
			case Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK__ATTRIBUTE:
				return attribute != null;
		}
		return super.eIsSet(featureID);
	}

} //ERPCRelationshipAttributeLinkImpl
