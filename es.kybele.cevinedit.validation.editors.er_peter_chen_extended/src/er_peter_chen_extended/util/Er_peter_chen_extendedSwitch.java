/**
 */
package er_peter_chen_extended.util;

import er_peter_chen_extended.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see er_peter_chen_extended.Er_peter_chen_extendedPackage
 * @generated
 */
public class Er_peter_chen_extendedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Er_peter_chen_extendedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Er_peter_chen_extendedSwitch() {
		if (modelPackage == null) {
			modelPackage = Er_peter_chen_extendedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM: {
				ERPCDiagram erpcDiagram = (ERPCDiagram)theEObject;
				T result = caseERPCDiagram(erpcDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_LINK: {
				ERPCLink erpcLink = (ERPCLink)theEObject;
				T result = caseERPCLink(erpcLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_RELATIONSHIP_LINK: {
				ERPCEntityRelationshipLink erpcEntityRelationshipLink = (ERPCEntityRelationshipLink)theEObject;
				T result = caseERPCEntityRelationshipLink(erpcEntityRelationshipLink);
				if (result == null) result = caseERPCLink(erpcEntityRelationshipLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_ENTITY_ATTRIBUTE_LINK: {
				ERPCEntityAttributeLink erpcEntityAttributeLink = (ERPCEntityAttributeLink)theEObject;
				T result = caseERPCEntityAttributeLink(erpcEntityAttributeLink);
				if (result == null) result = caseERPCLink(erpcEntityAttributeLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP_ATTRIBUTE_LINK: {
				ERPCRelationshipAttributeLink erpcRelationshipAttributeLink = (ERPCRelationshipAttributeLink)theEObject;
				T result = caseERPCRelationshipAttributeLink(erpcRelationshipAttributeLink);
				if (result == null) result = caseERPCLink(erpcRelationshipAttributeLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_RELATIONSHIP: {
				ERPCRelationship erpcRelationship = (ERPCRelationship)theEObject;
				T result = caseERPCRelationship(erpcRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_REGULAR_RELATIONSHIP: {
				ERPCRegularRelationship erpcRegularRelationship = (ERPCRegularRelationship)theEObject;
				T result = caseERPCRegularRelationship(erpcRegularRelationship);
				if (result == null) result = caseERPCRelationship(erpcRegularRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_IDENTIFYING_RELATIONSHIP: {
				ERPCIdentifyingRelationship erpcIdentifyingRelationship = (ERPCIdentifyingRelationship)theEObject;
				T result = caseERPCIdentifyingRelationship(erpcIdentifyingRelationship);
				if (result == null) result = caseERPCRelationship(erpcIdentifyingRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_ATTRIBUTE: {
				ERPCAttribute erpcAttribute = (ERPCAttribute)theEObject;
				T result = caseERPCAttribute(erpcAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_REGULAR_ATTRIBUTE: {
				ERPCRegularAttribute erpcRegularAttribute = (ERPCRegularAttribute)theEObject;
				T result = caseERPCRegularAttribute(erpcRegularAttribute);
				if (result == null) result = caseERPCAttribute(erpcRegularAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_COMPOSITE_ATTRIBUTE: {
				ERPCCompositeAttribute erpcCompositeAttribute = (ERPCCompositeAttribute)theEObject;
				T result = caseERPCCompositeAttribute(erpcCompositeAttribute);
				if (result == null) result = caseERPCAttribute(erpcCompositeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_PRIMARY_KEY_ATTRIBUTE: {
				ERPCPrimaryKeyAttribute erpcPrimaryKeyAttribute = (ERPCPrimaryKeyAttribute)theEObject;
				T result = caseERPCPrimaryKeyAttribute(erpcPrimaryKeyAttribute);
				if (result == null) result = caseERPCAttribute(erpcPrimaryKeyAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_WEAK_KEY_ATTRIBUTE: {
				ERPCWeakKeyAttribute erpcWeakKeyAttribute = (ERPCWeakKeyAttribute)theEObject;
				T result = caseERPCWeakKeyAttribute(erpcWeakKeyAttribute);
				if (result == null) result = caseERPCAttribute(erpcWeakKeyAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_DERIVED_ATTRIBUTE: {
				ERPCDerivedAttribute erpcDerivedAttribute = (ERPCDerivedAttribute)theEObject;
				T result = caseERPCDerivedAttribute(erpcDerivedAttribute);
				if (result == null) result = caseERPCAttribute(erpcDerivedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_MULTI_VALUED_ATTRIBUTE: {
				ERPCMultiValuedAttribute erpcMultiValuedAttribute = (ERPCMultiValuedAttribute)theEObject;
				T result = caseERPCMultiValuedAttribute(erpcMultiValuedAttribute);
				if (result == null) result = caseERPCAttribute(erpcMultiValuedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_ENTITY: {
				ERPCEntity erpcEntity = (ERPCEntity)theEObject;
				T result = caseERPCEntity(erpcEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_REGULAR_ENTITY: {
				ERPCRegularEntity erpcRegularEntity = (ERPCRegularEntity)theEObject;
				T result = caseERPCRegularEntity(erpcRegularEntity);
				if (result == null) result = caseERPCEntity(erpcRegularEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Er_peter_chen_extendedPackage.ERPC_WEAK_ENTITY: {
				ERPCWeakEntity erpcWeakEntity = (ERPCWeakEntity)theEObject;
				T result = caseERPCWeakEntity(erpcWeakEntity);
				if (result == null) result = caseERPCEntity(erpcWeakEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCDiagram(ERPCDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCLink(ERPCLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Entity Relationship Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Entity Relationship Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCEntityRelationshipLink(ERPCEntityRelationshipLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Entity Attribute Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Entity Attribute Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCEntityAttributeLink(ERPCEntityAttributeLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Relationship Attribute Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Relationship Attribute Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCRelationshipAttributeLink(ERPCRelationshipAttributeLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCRelationship(ERPCRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Regular Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Regular Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCRegularRelationship(ERPCRegularRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Identifying Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Identifying Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCIdentifyingRelationship(ERPCIdentifyingRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCAttribute(ERPCAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Regular Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Regular Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCRegularAttribute(ERPCRegularAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Composite Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Composite Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCCompositeAttribute(ERPCCompositeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Primary Key Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Primary Key Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCPrimaryKeyAttribute(ERPCPrimaryKeyAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Weak Key Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Weak Key Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCWeakKeyAttribute(ERPCWeakKeyAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Derived Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Derived Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCDerivedAttribute(ERPCDerivedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Multi Valued Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Multi Valued Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCMultiValuedAttribute(ERPCMultiValuedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCEntity(ERPCEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Regular Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Regular Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCRegularEntity(ERPCRegularEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERPC Weak Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERPC Weak Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERPCWeakEntity(ERPCWeakEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Er_peter_chen_extendedSwitch
