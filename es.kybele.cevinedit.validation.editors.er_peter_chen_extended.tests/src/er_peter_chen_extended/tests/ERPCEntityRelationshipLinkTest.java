/**
 */
package er_peter_chen_extended.tests;

import er_peter_chen_extended.ERPCEntityRelationshipLink;
import er_peter_chen_extended.Er_peter_chen_extendedFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ERPC Entity Relationship Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ERPCEntityRelationshipLinkTest extends ERPCLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ERPCEntityRelationshipLinkTest.class);
	}

	/**
	 * Constructs a new ERPC Entity Relationship Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCEntityRelationshipLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ERPC Entity Relationship Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ERPCEntityRelationshipLink getFixture() {
		return (ERPCEntityRelationshipLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Er_peter_chen_extendedFactory.eINSTANCE.createERPCEntityRelationshipLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ERPCEntityRelationshipLinkTest
