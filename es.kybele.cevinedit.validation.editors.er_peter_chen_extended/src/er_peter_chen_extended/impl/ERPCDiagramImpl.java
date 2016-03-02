/**
 */
package er_peter_chen_extended.impl;

import er_peter_chen_extended.ERPCAttribute;
import er_peter_chen_extended.ERPCDiagram;
import er_peter_chen_extended.ERPCEntity;
import er_peter_chen_extended.ERPCLink;
import er_peter_chen_extended.ERPCRelationship;
import er_peter_chen_extended.Er_peter_chen_extendedPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERPC Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er_peter_chen_extended.impl.ERPCDiagramImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link er_peter_chen_extended.impl.ERPCDiagramImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link er_peter_chen_extended.impl.ERPCDiagramImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link er_peter_chen_extended.impl.ERPCDiagramImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERPCDiagramImpl extends MinimalEObjectImpl.Container implements ERPCDiagram {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ERPCLink> links;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<ERPCRelationship> relationships;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ERPCAttribute> attributes;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<ERPCEntity> entities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERPCDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERPCLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<ERPCLink>(ERPCLink.class, this, Er_peter_chen_extendedPackage.ERPC_DIAGRAM__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERPCRelationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<ERPCRelationship>(ERPCRelationship.class, this, Er_peter_chen_extendedPackage.ERPC_DIAGRAM__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERPCAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<ERPCAttribute>(ERPCAttribute.class, this, Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERPCEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<ERPCEntity>(ERPCEntity.class, this, Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__LINKS:
				return getLinks();
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__RELATIONSHIPS:
				return getRelationships();
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ATTRIBUTES:
				return getAttributes();
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ENTITIES:
				return getEntities();
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
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends ERPCLink>)newValue);
				return;
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends ERPCRelationship>)newValue);
				return;
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends ERPCAttribute>)newValue);
				return;
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends ERPCEntity>)newValue);
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
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__LINKS:
				getLinks().clear();
				return;
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ATTRIBUTES:
				getAttributes().clear();
				return;
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ENTITIES:
				getEntities().clear();
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
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__LINKS:
				return links != null && !links.isEmpty();
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ENTITIES:
				return entities != null && !entities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ERPCDiagramImpl
