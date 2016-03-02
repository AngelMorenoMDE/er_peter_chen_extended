package er_peter_chen_extended.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ERPCDiagramItemSemanticEditPolicy
		extends
		er_peter_chen_extended.diagram.edit.policies.Er_peter_chen_extendedBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ERPCDiagramItemSemanticEditPolicy() {
		super(
				er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCDerivedAttribute_2011 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCDerivedAttributeCreateCommand(
					req));
		}
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCWeakEntity_2012 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCWeakEntityCreateCommand(
					req));
		}
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularEntity_2013 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCRegularEntityCreateCommand(
					req));
		}
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCWeakKeyAttribute_2014 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCWeakKeyAttributeCreateCommand(
					req));
		}
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCMultiValuedAttribute_2015 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCMultiValuedAttributeCreateCommand(
					req));
		}
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularRelationship_2016 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCRegularRelationshipCreateCommand(
					req));
		}
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCPrimaryKeyAttribute_2017 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCPrimaryKeyAttributeCreateCommand(
					req));
		}
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCIdentifyingRelationship_2018 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCIdentifyingRelationshipCreateCommand(
					req));
		}
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularAttribute_2019 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCRegularAttributeCreateCommand(
					req));
		}
		if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCCompositeAttribute_2020 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen_extended.diagram.edit.commands.ERPCCompositeAttributeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
