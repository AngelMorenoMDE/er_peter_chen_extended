package er_peter_chen_extended.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ERPCRelationshipAttributeLinkReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

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
	public ERPCRelationshipAttributeLinkReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof er_peter_chen_extended.ERPCRelationshipAttributeLink) {
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
		if (!(oldEnd instanceof er_peter_chen_extended.ERPCRelationship && newEnd instanceof er_peter_chen_extended.ERPCRelationship)) {
			return false;
		}
		er_peter_chen_extended.ERPCAttribute target = getLink().getAttribute();
		if (!(getLink().eContainer() instanceof er_peter_chen_extended.ERPCDiagram)) {
			return false;
		}
		er_peter_chen_extended.ERPCDiagram container = (er_peter_chen_extended.ERPCDiagram) getLink()
				.eContainer();
		return er_peter_chen_extended.diagram.edit.policies.Er_peter_chen_extendedBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistERPCRelationshipAttributeLink_4005(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof er_peter_chen_extended.ERPCAttribute && newEnd instanceof er_peter_chen_extended.ERPCAttribute)) {
			return false;
		}
		er_peter_chen_extended.ERPCRelationship source = getLink()
				.getRelationship();
		if (!(getLink().eContainer() instanceof er_peter_chen_extended.ERPCDiagram)) {
			return false;
		}
		er_peter_chen_extended.ERPCDiagram container = (er_peter_chen_extended.ERPCDiagram) getLink()
				.eContainer();
		return er_peter_chen_extended.diagram.edit.policies.Er_peter_chen_extendedBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistERPCRelationshipAttributeLink_4005(container,
						getLink(), source, getNewTarget());
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
		getLink().setRelationship(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setAttribute(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected er_peter_chen_extended.ERPCRelationshipAttributeLink getLink() {
		return (er_peter_chen_extended.ERPCRelationshipAttributeLink) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected er_peter_chen_extended.ERPCRelationship getOldSource() {
		return (er_peter_chen_extended.ERPCRelationship) oldEnd;
	}

	/**
	 * @generated
	 */
	protected er_peter_chen_extended.ERPCRelationship getNewSource() {
		return (er_peter_chen_extended.ERPCRelationship) newEnd;
	}

	/**
	 * @generated
	 */
	protected er_peter_chen_extended.ERPCAttribute getOldTarget() {
		return (er_peter_chen_extended.ERPCAttribute) oldEnd;
	}

	/**
	 * @generated
	 */
	protected er_peter_chen_extended.ERPCAttribute getNewTarget() {
		return (er_peter_chen_extended.ERPCAttribute) newEnd;
	}
}
