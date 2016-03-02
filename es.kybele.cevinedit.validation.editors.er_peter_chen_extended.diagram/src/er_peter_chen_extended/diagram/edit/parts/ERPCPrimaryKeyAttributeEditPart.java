package er_peter_chen_extended.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class ERPCPrimaryKeyAttributeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2017;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ERPCPrimaryKeyAttributeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new er_peter_chen_extended.diagram.edit.policies.ERPCPrimaryKeyAttributeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ERPCPrimaryKeyAttributeFigure();
	}

	/**
	 * @generated
	 */
	public ERPCPrimaryKeyAttributeFigure getPrimaryShape() {
		return (ERPCPrimaryKeyAttributeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeNameEditPart) {
			((er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureERPCPrimaryKeyAttributeLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
				.getType(er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ERPCPrimaryKeyAttributeFigure extends Ellipse {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureERPCPrimaryKeyAttributeLabel;

		/**
		 * @generated
		 */
		public ERPCPrimaryKeyAttributeFigure() {
			this.setLayoutManager(new XYLayout());
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.red);
			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(40)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(40)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(40)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureERPCPrimaryKeyAttributeLabel = new WrappingLabel();

			fFigureERPCPrimaryKeyAttributeLabel.setText("Set Label...");

			fFigureERPCPrimaryKeyAttributeLabel
					.setFont(FFIGUREERPCPRIMARYKEYATTRIBUTELABEL_FONT);

			fFigureERPCPrimaryKeyAttributeLabel.setBorder(new MarginBorder(
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(fFigureERPCPrimaryKeyAttributeLabel);

			RectangleFigure eRPCPrimaryKeyAttributeUnderline0 = new RectangleFigure();

			eRPCPrimaryKeyAttributeUnderline0.setLineWidth(2);
			eRPCPrimaryKeyAttributeUnderline0
					.setBackgroundColor(ColorConstants.black);
			eRPCPrimaryKeyAttributeUnderline0.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(80), getMapMode().DPtoLP(2)));
			eRPCPrimaryKeyAttributeUnderline0.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(80), getMapMode().DPtoLP(2)));
			eRPCPrimaryKeyAttributeUnderline0.setMinimumSize(new Dimension(
					getMapMode().DPtoLP(80), getMapMode().DPtoLP(2)));

			this.add(eRPCPrimaryKeyAttributeUnderline0, new Rectangle(
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(24),
					getMapMode().DPtoLP(80), getMapMode().DPtoLP(2)));
			eRPCPrimaryKeyAttributeUnderline0.setLayoutManager(new XYLayout());

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureERPCPrimaryKeyAttributeLabel() {
			return fFigureERPCPrimaryKeyAttributeLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 242, 183, 191);

	/**
	 * @generated
	 */
	static final Font FFIGUREERPCPRIMARYKEYATTRIBUTELABEL_FONT = new Font(
			Display.getCurrent(), "Arial", 9, SWT.BOLD);

}
