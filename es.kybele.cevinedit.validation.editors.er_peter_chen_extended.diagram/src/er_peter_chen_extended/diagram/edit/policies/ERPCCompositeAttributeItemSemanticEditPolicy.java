package er_peter_chen_extended.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ERPCCompositeAttributeItemSemanticEditPolicy
		extends
		er_peter_chen_extended.diagram.edit.policies.Er_peter_chen_extendedBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ERPCCompositeAttributeItemSemanticEditPolicy() {
		super(
				er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCCompositeAttribute_2020);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getVisualID(incomingLink) == er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getVisualID(incomingLink) == er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getVisualID(outgoingLink) == er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005 == req
				.getElementType()) {
			return null;
		}
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityAttributeLink_4007 == req
				.getElementType()) {
			return null;
		}
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCCompositeAttributeComposedAttributes_4008 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCCompositeAttributeComposedAttributesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCRelationshipAttributeLinkCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityAttributeLink_4007 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCEntityAttributeLinkCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCCompositeAttributeComposedAttributes_4008 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCRelationshipAttributeLinkReorientCommand(
					req));
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCEntityAttributeLinkReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID:
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCCompositeAttributeComposedAttributesReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
