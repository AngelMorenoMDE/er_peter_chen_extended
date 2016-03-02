package er_peter_chen_extended.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Er_peter_chen_extendedDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor> getSemanticChildren(
			View view) {
		switch (er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
				.getVisualID(view)) {
		case er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
			return getERPCDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor> getERPCDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		er_peter_chen_extended.ERPCDiagram modelElement = (er_peter_chen_extended.ERPCDiagram) view
				.getElement();
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			er_peter_chen_extended.ERPCAttribute childElement = (er_peter_chen_extended.ERPCAttribute) it
					.next();
			int visualID = er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID) {
				result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID) {
				result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID) {
				result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID) {
				result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID) {
				result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID) {
				result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEntities().iterator(); it
				.hasNext();) {
			er_peter_chen_extended.ERPCEntity childElement = (er_peter_chen_extended.ERPCEntity) it
					.next();
			int visualID = er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID) {
				result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID) {
				result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRelationships().iterator(); it
				.hasNext();) {
			er_peter_chen_extended.ERPCRelationship childElement = (er_peter_chen_extended.ERPCRelationship) it
					.next();
			int visualID = er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID) {
				result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID) {
				result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getContainedLinks(
			View view) {
		switch (er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
				.getVisualID(view)) {
		case er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
			return getERPCDiagram_1000ContainedLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
			return getERPCDerivedAttribute_2011ContainedLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
			return getERPCWeakEntity_2012ContainedLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
			return getERPCRegularEntity_2013ContainedLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
			return getERPCWeakKeyAttribute_2014ContainedLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
			return getERPCMultiValuedAttribute_2015ContainedLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
			return getERPCRegularRelationship_2016ContainedLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
			return getERPCPrimaryKeyAttribute_2017ContainedLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
			return getERPCIdentifyingRelationship_2018ContainedLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
			return getERPCRegularAttribute_2019ContainedLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID:
			return getERPCCompositeAttribute_2020ContainedLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
			return getERPCRelationshipAttributeLink_4005ContainedLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
			return getERPCEntityRelationshipLink_4006ContainedLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
			return getERPCEntityAttributeLink_4007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getIncomingLinks(
			View view) {
		switch (er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
				.getVisualID(view)) {
		case er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
			return getERPCDerivedAttribute_2011IncomingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
			return getERPCWeakEntity_2012IncomingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
			return getERPCRegularEntity_2013IncomingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
			return getERPCWeakKeyAttribute_2014IncomingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
			return getERPCMultiValuedAttribute_2015IncomingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
			return getERPCRegularRelationship_2016IncomingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
			return getERPCPrimaryKeyAttribute_2017IncomingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
			return getERPCIdentifyingRelationship_2018IncomingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
			return getERPCRegularAttribute_2019IncomingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID:
			return getERPCCompositeAttribute_2020IncomingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
			return getERPCRelationshipAttributeLink_4005IncomingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
			return getERPCEntityRelationshipLink_4006IncomingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
			return getERPCEntityAttributeLink_4007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
				.getVisualID(view)) {
		case er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
			return getERPCDerivedAttribute_2011OutgoingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
			return getERPCWeakEntity_2012OutgoingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
			return getERPCRegularEntity_2013OutgoingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
			return getERPCWeakKeyAttribute_2014OutgoingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
			return getERPCMultiValuedAttribute_2015OutgoingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
			return getERPCRegularRelationship_2016OutgoingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
			return getERPCPrimaryKeyAttribute_2017OutgoingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
			return getERPCIdentifyingRelationship_2018OutgoingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
			return getERPCRegularAttribute_2019OutgoingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID:
			return getERPCCompositeAttribute_2020OutgoingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
			return getERPCRelationshipAttributeLink_4005OutgoingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
			return getERPCEntityRelationshipLink_4006OutgoingLinks(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
			return getERPCEntityAttributeLink_4007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCDiagram_1000ContainedLinks(
			View view) {
		er_peter_chen_extended.ERPCDiagram modelElement = (er_peter_chen_extended.ERPCDiagram) view
				.getElement();
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ERPCRelationshipAttributeLink_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ERPCEntityRelationshipLink_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ERPCEntityAttributeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCDerivedAttribute_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCWeakEntity_2012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCRegularEntity_2013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCWeakKeyAttribute_2014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCMultiValuedAttribute_2015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCRegularRelationship_2016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCPrimaryKeyAttribute_2017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCIdentifyingRelationship_2018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCRegularAttribute_2019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCCompositeAttribute_2020ContainedLinks(
			View view) {
		er_peter_chen_extended.ERPCCompositeAttribute modelElement = (er_peter_chen_extended.ERPCCompositeAttribute) view
				.getElement();
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ERPCCompositeAttribute_ComposedAttributes_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCRelationshipAttributeLink_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCEntityRelationshipLink_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCEntityAttributeLink_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCDerivedAttribute_2011IncomingLinks(
			View view) {
		er_peter_chen_extended.ERPCDerivedAttribute modelElement = (er_peter_chen_extended.ERPCDerivedAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCWeakEntity_2012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCRegularEntity_2013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCWeakKeyAttribute_2014IncomingLinks(
			View view) {
		er_peter_chen_extended.ERPCWeakKeyAttribute modelElement = (er_peter_chen_extended.ERPCWeakKeyAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCMultiValuedAttribute_2015IncomingLinks(
			View view) {
		er_peter_chen_extended.ERPCMultiValuedAttribute modelElement = (er_peter_chen_extended.ERPCMultiValuedAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCRegularRelationship_2016IncomingLinks(
			View view) {
		er_peter_chen_extended.ERPCRegularRelationship modelElement = (er_peter_chen_extended.ERPCRegularRelationship) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityRelationshipLink_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCPrimaryKeyAttribute_2017IncomingLinks(
			View view) {
		er_peter_chen_extended.ERPCPrimaryKeyAttribute modelElement = (er_peter_chen_extended.ERPCPrimaryKeyAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCIdentifyingRelationship_2018IncomingLinks(
			View view) {
		er_peter_chen_extended.ERPCIdentifyingRelationship modelElement = (er_peter_chen_extended.ERPCIdentifyingRelationship) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityRelationshipLink_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCRegularAttribute_2019IncomingLinks(
			View view) {
		er_peter_chen_extended.ERPCRegularAttribute modelElement = (er_peter_chen_extended.ERPCRegularAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ERPCCompositeAttribute_ComposedAttributes_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCCompositeAttribute_2020IncomingLinks(
			View view) {
		er_peter_chen_extended.ERPCCompositeAttribute modelElement = (er_peter_chen_extended.ERPCCompositeAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCRelationshipAttributeLink_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCEntityRelationshipLink_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCEntityAttributeLink_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCDerivedAttribute_2011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCWeakEntity_2012OutgoingLinks(
			View view) {
		er_peter_chen_extended.ERPCWeakEntity modelElement = (er_peter_chen_extended.ERPCWeakEntity) view
				.getElement();
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ERPCEntityRelationshipLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ERPCEntityAttributeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCRegularEntity_2013OutgoingLinks(
			View view) {
		er_peter_chen_extended.ERPCRegularEntity modelElement = (er_peter_chen_extended.ERPCRegularEntity) view
				.getElement();
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ERPCEntityRelationshipLink_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ERPCEntityAttributeLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCWeakKeyAttribute_2014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCMultiValuedAttribute_2015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCRegularRelationship_2016OutgoingLinks(
			View view) {
		er_peter_chen_extended.ERPCRegularRelationship modelElement = (er_peter_chen_extended.ERPCRegularRelationship) view
				.getElement();
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCPrimaryKeyAttribute_2017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCIdentifyingRelationship_2018OutgoingLinks(
			View view) {
		er_peter_chen_extended.ERPCIdentifyingRelationship modelElement = (er_peter_chen_extended.ERPCIdentifyingRelationship) view
				.getElement();
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCRegularAttribute_2019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCCompositeAttribute_2020OutgoingLinks(
			View view) {
		er_peter_chen_extended.ERPCCompositeAttribute modelElement = (er_peter_chen_extended.ERPCCompositeAttribute) view
				.getElement();
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ERPCCompositeAttribute_ComposedAttributes_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCRelationshipAttributeLink_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCEntityRelationshipLink_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getERPCEntityAttributeLink_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getContainedTypeModelFacetLinks_ERPCRelationshipAttributeLink_4005(
			er_peter_chen_extended.ERPCDiagram container) {
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_peter_chen_extended.ERPCRelationshipAttributeLink) {
				continue;
			}
			er_peter_chen_extended.ERPCRelationshipAttributeLink link = (er_peter_chen_extended.ERPCRelationshipAttributeLink) linkObject;
			if (er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID != er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen_extended.ERPCAttribute dst = link.getAttribute();
			er_peter_chen_extended.ERPCRelationship src = link
					.getRelationship();
			result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor(
					src,
					dst,
					link,
					er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005,
					er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getContainedTypeModelFacetLinks_ERPCEntityRelationshipLink_4006(
			er_peter_chen_extended.ERPCDiagram container) {
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_peter_chen_extended.ERPCEntityRelationshipLink) {
				continue;
			}
			er_peter_chen_extended.ERPCEntityRelationshipLink link = (er_peter_chen_extended.ERPCEntityRelationshipLink) linkObject;
			if (er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID != er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen_extended.ERPCRelationship dst = link
					.getRelationship();
			er_peter_chen_extended.ERPCEntity src = link.getEntity();
			result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor(
					src,
					dst,
					link,
					er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityRelationshipLink_4006,
					er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getContainedTypeModelFacetLinks_ERPCEntityAttributeLink_4007(
			er_peter_chen_extended.ERPCDiagram container) {
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_peter_chen_extended.ERPCEntityAttributeLink) {
				continue;
			}
			er_peter_chen_extended.ERPCEntityAttributeLink link = (er_peter_chen_extended.ERPCEntityAttributeLink) linkObject;
			if (er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID != er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen_extended.ERPCAttribute dst = link.getAttribute();
			er_peter_chen_extended.ERPCEntity src = link.getEntity();
			result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor(
					src,
					dst,
					link,
					er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityAttributeLink_4007,
					er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4005(
			er_peter_chen_extended.ERPCAttribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCRelationshipAttributeLink_Attribute()
					|| false == setting.getEObject() instanceof er_peter_chen_extended.ERPCRelationshipAttributeLink) {
				continue;
			}
			er_peter_chen_extended.ERPCRelationshipAttributeLink link = (er_peter_chen_extended.ERPCRelationshipAttributeLink) setting
					.getEObject();
			if (er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID != er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen_extended.ERPCRelationship src = link
					.getRelationship();
			result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor(
					src,
					target,
					link,
					er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005,
					er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getIncomingTypeModelFacetLinks_ERPCEntityRelationshipLink_4006(
			er_peter_chen_extended.ERPCRelationship target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCEntityRelationshipLink_Relationship()
					|| false == setting.getEObject() instanceof er_peter_chen_extended.ERPCEntityRelationshipLink) {
				continue;
			}
			er_peter_chen_extended.ERPCEntityRelationshipLink link = (er_peter_chen_extended.ERPCEntityRelationshipLink) setting
					.getEObject();
			if (er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID != er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen_extended.ERPCEntity src = link.getEntity();
			result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor(
					src,
					target,
					link,
					er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityRelationshipLink_4006,
					er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4007(
			er_peter_chen_extended.ERPCAttribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCEntityAttributeLink_Attribute()
					|| false == setting.getEObject() instanceof er_peter_chen_extended.ERPCEntityAttributeLink) {
				continue;
			}
			er_peter_chen_extended.ERPCEntityAttributeLink link = (er_peter_chen_extended.ERPCEntityAttributeLink) setting
					.getEObject();
			if (er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID != er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen_extended.ERPCEntity src = link.getEntity();
			result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor(
					src,
					target,
					link,
					er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityAttributeLink_4007,
					er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getIncomingFeatureModelFacetLinks_ERPCCompositeAttribute_ComposedAttributes_4008(
			er_peter_chen_extended.ERPCRegularAttribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCCompositeAttribute_ComposedAttributes()) {
				result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor(
						setting.getEObject(),
						target,
						er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCCompositeAttributeComposedAttributes_4008,
						er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getOutgoingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4005(
			er_peter_chen_extended.ERPCRelationship source) {
		er_peter_chen_extended.ERPCDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof er_peter_chen_extended.ERPCDiagram) {
				container = (er_peter_chen_extended.ERPCDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_peter_chen_extended.ERPCRelationshipAttributeLink) {
				continue;
			}
			er_peter_chen_extended.ERPCRelationshipAttributeLink link = (er_peter_chen_extended.ERPCRelationshipAttributeLink) linkObject;
			if (er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID != er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen_extended.ERPCAttribute dst = link.getAttribute();
			er_peter_chen_extended.ERPCRelationship src = link
					.getRelationship();
			if (src != source) {
				continue;
			}
			result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor(
					src,
					dst,
					link,
					er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005,
					er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getOutgoingTypeModelFacetLinks_ERPCEntityRelationshipLink_4006(
			er_peter_chen_extended.ERPCEntity source) {
		er_peter_chen_extended.ERPCDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof er_peter_chen_extended.ERPCDiagram) {
				container = (er_peter_chen_extended.ERPCDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_peter_chen_extended.ERPCEntityRelationshipLink) {
				continue;
			}
			er_peter_chen_extended.ERPCEntityRelationshipLink link = (er_peter_chen_extended.ERPCEntityRelationshipLink) linkObject;
			if (er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID != er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen_extended.ERPCRelationship dst = link
					.getRelationship();
			er_peter_chen_extended.ERPCEntity src = link.getEntity();
			if (src != source) {
				continue;
			}
			result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor(
					src,
					dst,
					link,
					er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityRelationshipLink_4006,
					er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getOutgoingTypeModelFacetLinks_ERPCEntityAttributeLink_4007(
			er_peter_chen_extended.ERPCEntity source) {
		er_peter_chen_extended.ERPCDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof er_peter_chen_extended.ERPCDiagram) {
				container = (er_peter_chen_extended.ERPCDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_peter_chen_extended.ERPCEntityAttributeLink) {
				continue;
			}
			er_peter_chen_extended.ERPCEntityAttributeLink link = (er_peter_chen_extended.ERPCEntityAttributeLink) linkObject;
			if (er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID != er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen_extended.ERPCAttribute dst = link.getAttribute();
			er_peter_chen_extended.ERPCEntity src = link.getEntity();
			if (src != source) {
				continue;
			}
			result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor(
					src,
					dst,
					link,
					er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityAttributeLink_4007,
					er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getOutgoingFeatureModelFacetLinks_ERPCCompositeAttribute_ComposedAttributes_4008(
			er_peter_chen_extended.ERPCCompositeAttribute source) {
		LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> result = new LinkedList<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor>();
		for (Iterator<?> destinations = source.getComposedAttributes()
				.iterator(); destinations.hasNext();) {
			er_peter_chen_extended.ERPCRegularAttribute destination = (er_peter_chen_extended.ERPCRegularAttribute) destinations
					.next();
			result.add(new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor(
					source,
					destination,
					er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCCompositeAttributeComposedAttributes_4008,
					er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedNodeDescriptor> getSemanticChildren(
				View view) {
			return Er_peter_chen_extendedDiagramUpdater
					.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getContainedLinks(
				View view) {
			return Er_peter_chen_extendedDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getIncomingLinks(
				View view) {
			return Er_peter_chen_extendedDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<er_peter_chen_extended.diagram.part.Er_peter_chen_extendedLinkDescriptor> getOutgoingLinks(
				View view) {
			return Er_peter_chen_extendedDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
