package er_peter_chen_extended.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Er_peter_chen_extendedEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getVisualID(view)) {

			case er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeNameEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeNameEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityNameEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityNameEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityNameEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityNameEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeNameEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeNameEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeNameEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeNameEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipNameEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipNameEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeNameEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeNameEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipNameEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipNameEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeNameEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeNameEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeNameEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeNameEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkCardinalityEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkCardinalityEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart(
						view);

			case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID:
				return new er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
