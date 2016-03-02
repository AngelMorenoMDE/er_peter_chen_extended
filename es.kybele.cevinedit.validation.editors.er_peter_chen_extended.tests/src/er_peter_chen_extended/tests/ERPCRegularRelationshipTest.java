/**
 */
package er_peter_chen_extended.tests;

import er_peter_chen_extended.ERPCRegularRelationship;
import er_peter_chen_extended.Er_peter_chen_extendedFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ERPC Regular Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ERPCRegularRelationshipTest extends ERPCRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ERPCRegularRelationshipTest.class);
	}

	/**
	 * Constructs a new ERPC Regular Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCRegularRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ERPC Regular Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ERPCRegularRelationship getFixture() {
		return (ERPCRegularRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Er_peter_chen_extendedFactory.eINSTANCE.createERPCRegularRelationship());
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

} //ERPCRegularRelationshipTest
