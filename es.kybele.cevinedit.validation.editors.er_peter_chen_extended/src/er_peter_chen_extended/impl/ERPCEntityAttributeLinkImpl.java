/**
 */
package er_peter_chen_extended.impl;

import er_peter_chen_extended.ERPCAttribute;
import er_peter_chen_extended.ERPCEntity;
import er_peter_chen_extended.ERPCEntityAttributeLink;
import er_peter_chen_extended.Er_peter_chen_extendedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERPC Entity Attribute Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er_peter_chen_extended.impl.ERPCEntityAttributeLinkImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link er_peter_chen_extended.impl.ERPCEntityAttributeLinkImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERPCEntityAttributeLinkImpl extends ERPCLinkImpl implements ERPCEntityAttributeLink {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected ERPCEntity entity;

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
	protected ERPCEntityAttributeLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Er_peter_chen_extendedPackage.Literals.ERPC_ENTITY_ATTRIBUTE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCEntity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (ERPCEntity)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCEntity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(ERPCEntity newEntity) {
		ERPCEntity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK__ENTITY, oldEntity, entity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK__ATTRIBUTE, oldAttribute, attribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK__ATTRIBUTE:
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
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK__ENTITY:
				setEntity((ERPCEntity)newValue);
				return;
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK__ATTRIBUTE:
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
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK__ENTITY:
				setEntity((ERPCEntity)null);
				return;
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK__ATTRIBUTE:
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
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK__ENTITY:
				return entity != null;
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK__ATTRIBUTE:
				return attribute != null;
		}
		return super.eIsSet(featureID);
	}

} //ERPCEntityAttributeLinkImpl
