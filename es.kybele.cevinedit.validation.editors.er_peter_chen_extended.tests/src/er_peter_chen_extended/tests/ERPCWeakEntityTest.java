/**
 */
package er_peter_chen_extended.tests;

import er_peter_chen_extended.ERPCWeakEntity;
import er_peter_chen_extended.Er_peter_chen_extendedFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ERPC Weak Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ERPCWeakEntityTest extends ERPCEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ERPCWeakEntityTest.class);
	}

	/**
	 * Constructs a new ERPC Weak Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCWeakEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ERPC Weak Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ERPCWeakEntity getFixture() {
		return (ERPCWeakEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Er_peter_chen_extendedFactory.eINSTANCE.createERPCWeakEntity());
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

} //ERPCWeakEntityTest
