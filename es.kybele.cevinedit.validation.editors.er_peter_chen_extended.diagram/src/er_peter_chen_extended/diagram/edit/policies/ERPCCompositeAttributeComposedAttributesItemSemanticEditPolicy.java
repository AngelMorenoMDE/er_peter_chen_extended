package er_peter_chen_extended.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ERPCCompositeAttributeComposedAttributesItemSemanticEditPolicy
		extends
		er_peter_chen_extended.diagram.edit.policies.Er_peter_chen_extendedBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ERPCCompositeAttributeComposedAttributesItemSemanticEditPolicy() {
		super(
				er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCCompositeAttributeComposedAttributes_4008);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
