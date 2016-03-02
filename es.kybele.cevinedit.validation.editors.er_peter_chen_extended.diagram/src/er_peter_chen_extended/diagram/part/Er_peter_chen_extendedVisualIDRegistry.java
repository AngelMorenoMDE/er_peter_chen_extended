package er_peter_chen_extended.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Er_peter_chen_extendedVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.MODEL_ID
					.equals(view.getType())) {
				return er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
				.getERPCDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((er_peter_chen_extended.ERPCDiagram) domainElement)) {
			return er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
				.getModelID(containerView);
		if (!er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
			if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCDerivedAttribute().isSuperTypeOf(
							domainElement.eClass())) {
				return er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID;
			}
			if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCWeakEntity().isSuperTypeOf(domainElement.eClass())) {
				return er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID;
			}
			if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCRegularEntity().isSuperTypeOf(
							domainElement.eClass())) {
				return er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID;
			}
			if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCWeakKeyAttribute().isSuperTypeOf(
							domainElement.eClass())) {
				return er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID;
			}
			if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCMultiValuedAttribute().isSuperTypeOf(
							domainElement.eClass())) {
				return er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID;
			}
			if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCRegularRelationship().isSuperTypeOf(
							domainElement.eClass())) {
				return er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID;
			}
			if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCPrimaryKeyAttribute().isSuperTypeOf(
							domainElement.eClass())) {
				return er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID;
			}
			if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCIdentifyingRelationship().isSuperTypeOf(
							domainElement.eClass())) {
				return er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID;
			}
			if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCRegularAttribute().isSuperTypeOf(
							domainElement.eClass())) {
				return er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID;
			}
			if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCCompositeAttribute().isSuperTypeOf(
							domainElement.eClass())) {
				return er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
				.getModelID(containerView);
		if (!er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
			if (er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
			if (er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
			if (er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
			if (er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
			if (er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
			if (er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
			if (er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
			if (er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
			if (er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
			if (er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID:
			if (er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
			if (er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkCardinalityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
				.getERPCRelationshipAttributeLink().isSuperTypeOf(
						domainElement.eClass())) {
			return er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID;
		}
		if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
				.getERPCEntityRelationshipLink().isSuperTypeOf(
						domainElement.eClass())) {
			return er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID;
		}
		if (er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
				.getERPCEntityAttributeLink().isSuperTypeOf(
						domainElement.eClass())) {
			return er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(er_peter_chen_extended.ERPCDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
			return false;
		case er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
		case er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
		case er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
		case er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
