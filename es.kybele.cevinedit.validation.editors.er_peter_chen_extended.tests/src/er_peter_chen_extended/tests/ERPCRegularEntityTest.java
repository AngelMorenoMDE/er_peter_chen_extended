/**
 */
package er_peter_chen_extended.tests;

import er_peter_chen_extended.ERPCRegularEntity;
import er_peter_chen_extended.Er_peter_chen_extendedFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ERPC Regular Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ERPCRegularEntityTest extends ERPCEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ERPCRegularEntityTest.class);
	}

	/**
	 * Constructs a new ERPC Regular Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCRegularEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ERPC Regular Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ERPCRegularEntity getFixture() {
		return (ERPCRegularEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Er_peter_chen_extendedFactory.eINSTANCE.createERPCRegularEntity());
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

} //ERPCRegularEntityTest
