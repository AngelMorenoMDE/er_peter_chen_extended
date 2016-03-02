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
public class ERPCEntityAttributeLinkEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4007;

	/**
	 * @generated
	 */
	public ERPCEntityAttributeLinkEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new er_peter_chen_extended.diagram.edit.policies.ERPCEntityAttributeLinkItemSemanticEditPolicy());
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
		return new ERPCEntityAttributeLinkFigure();
	}

	/**
	 * @generated
	 */
	public ERPCEntityAttributeLinkFigure getPrimaryShape() {
		return (ERPCEntityAttributeLinkFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ERPCEntityAttributeLinkFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ERPCEntityAttributeLinkFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			PolylineConnectionEx eRPCEntityAttributeLinkFigure0 = new PolylineConnectionEx();

			eRPCEntityAttributeLinkFigure0.setLineWidth(2);
			eRPCEntityAttributeLinkFigure0
					.setForegroundColor(ColorConstants.black);

			this.add(eRPCEntityAttributeLinkFigure0);

		}

	}

}
