package er_peter_chen_extended.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ERPCEntityAttributeLinkItemSemanticEditPolicy
		extends
		er_peter_chen_extended.diagram.edit.policies.Er_peter_chen_extendedBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ERPCEntityAttributeLinkItemSemanticEditPolicy() {
		super(
				er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityAttributeLink_4007);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
