package er_peter_chen_extended.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ERPCCompositeAttributeComposedAttributesReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ERPCCompositeAttributeComposedAttributesReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof er_peter_chen_extended.ERPCCompositeAttribute) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof er_peter_chen_extended.ERPCRegularAttribute && newEnd instanceof er_peter_chen_extended.ERPCCompositeAttribute)) {
			return false;
		}
		return er_peter_chen_extended.diagram.edit.policies.Er_peter_chen_extendedBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistERPCCompositeAttributeComposedAttributes_4008(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof er_peter_chen_extended.ERPCRegularAttribute && newEnd instanceof er_peter_chen_extended.ERPCRegularAttribute)) {
			return false;
		}
		return er_peter_chen_extended.diagram.edit.policies.Er_peter_chen_extendedBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistERPCCompositeAttributeComposedAttributes_4008(
						getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getComposedAttributes().remove(getOldTarget());
		getNewSource().getComposedAttributes().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getComposedAttributes().remove(getOldTarget());
		getOldSource().getComposedAttributes().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected er_peter_chen_extended.ERPCCompositeAttribute getOldSource() {
		return (er_peter_chen_extended.ERPCCompositeAttribute) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected er_peter_chen_extended.ERPCCompositeAttribute getNewSource() {
		return (er_peter_chen_extended.ERPCCompositeAttribute) newEnd;
	}

	/**
	 * @generated
	 */
	protected er_peter_chen_extended.ERPCRegularAttribute getOldTarget() {
		return (er_peter_chen_extended.ERPCRegularAttribute) oldEnd;
	}

	/**
	 * @generated
	 */
	protected er_peter_chen_extended.ERPCRegularAttribute getNewTarget() {
		return (er_peter_chen_extended.ERPCRegularAttribute) newEnd;
	}
}
