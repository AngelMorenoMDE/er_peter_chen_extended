package er_peter_chen_extended.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Er_peter_chen_extendedModelingAssistantProviderOfERPCRegularRelationshipEditPart
		extends
		er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart) {
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005);
		}
		if (targetEditPart instanceof er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart) {
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005);
		}
		if (targetEditPart instanceof er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart) {
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005);
		}
		if (targetEditPart instanceof er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart) {
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005);
		}
		if (targetEditPart instanceof er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart) {
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005);
		}
		if (targetEditPart instanceof er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart) {
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005) {
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCDerivedAttribute_2011);
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCWeakKeyAttribute_2014);
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCMultiValuedAttribute_2015);
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCPrimaryKeyAttribute_2017);
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularAttribute_2019);
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCCompositeAttribute_2020);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityRelationshipLink_4006);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityRelationshipLink_4006) {
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCWeakEntity_2012);
			types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularEntity_2013);
		}
		return types;
	}

}
