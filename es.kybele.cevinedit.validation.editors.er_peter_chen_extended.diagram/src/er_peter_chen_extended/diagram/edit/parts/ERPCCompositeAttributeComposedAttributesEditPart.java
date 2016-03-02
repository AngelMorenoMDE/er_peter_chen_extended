package er_peter_chen_extended.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ERPCCompositeAttributeComposedAttributesEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4008;

	/**
	 * @generated
	 */
	public ERPCCompositeAttributeComposedAttributesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new er_peter_chen_extended.diagram.edit.policies.ERPCCompositeAttributeComposedAttributesItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ERPCCompositeAttributeAttributeLinkFigure();
	}

	/**
	 * @generated
	 */
	public ERPCCompositeAttributeAttributeLinkFigure getPrimaryShape() {
		return (ERPCCompositeAttributeAttributeLinkFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ERPCCompositeAttributeAttributeLinkFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ERPCCompositeAttributeAttributeLinkFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);

		}

	}

}
