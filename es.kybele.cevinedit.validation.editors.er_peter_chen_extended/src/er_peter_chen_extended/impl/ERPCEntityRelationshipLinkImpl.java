/**
 */
package er_peter_chen_extended.impl;

import er_peter_chen_extended.ERPCEntity;
import er_peter_chen_extended.ERPCEntityRelationshipLink;
import er_peter_chen_extended.ERPCRelationship;
import er_peter_chen_extended.Er_peter_chen_extendedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERPC Entity Relationship Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er_peter_chen_extended.impl.ERPCEntityRelationshipLinkImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link er_peter_chen_extended.impl.ERPCEntityRelationshipLinkImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link er_peter_chen_extended.impl.ERPCEntityRelationshipLinkImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERPCEntityRelationshipLinkImpl extends ERPCLinkImpl implements ERPCEntityRelationshipLink {
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
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected ERPCEntity entity;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected String cardinality = CARDINALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERPCEntityRelationshipLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Er_peter_chen_extendedPackage.Literals.ERPC_ENTITY_RELATIONSHIP_LINK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__RELATIONSHIP, oldRelationship, relationship));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__RELATIONSHIP, oldRelationship, relationship));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__ENTITY, oldEntity, entity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(String newCardinality) {
		String oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__RELATIONSHIP:
				if (resolve) return getRelationship();
				return basicGetRelationship();
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__CARDINALITY:
				return getCardinality();
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
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__RELATIONSHIP:
				setRelationship((ERPCRelationship)newValue);
				return;
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__ENTITY:
				setEntity((ERPCEntity)newValue);
				return;
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__CARDINALITY:
				setCardinality((String)newValue);
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
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__RELATIONSHIP:
				setRelationship((ERPCRelationship)null);
				return;
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__ENTITY:
				setEntity((ERPCEntity)null);
				return;
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
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
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__RELATIONSHIP:
				return relationship != null;
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__ENTITY:
				return entity != null;
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK__CARDINALITY:
				return CARDINALITY_EDEFAULT == null ? cardinality != null : !CARDINALITY_EDEFAULT.equals(cardinality);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //ERPCEntityRelationshipLinkImpl
