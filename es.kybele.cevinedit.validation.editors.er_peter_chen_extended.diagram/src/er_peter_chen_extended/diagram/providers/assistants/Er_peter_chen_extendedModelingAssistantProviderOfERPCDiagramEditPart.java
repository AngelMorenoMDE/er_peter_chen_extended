package er_peter_chen_extended.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Er_peter_chen_extendedModelingAssistantProviderOfERPCDiagramEditPart
		extends
		er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(10);
		types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCDerivedAttribute_2011);
		types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCWeakEntity_2012);
		types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularEntity_2013);
		types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCWeakKeyAttribute_2014);
		types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCMultiValuedAttribute_2015);
		types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularRelationship_2016);
		types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCPrimaryKeyAttribute_2017);
		types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCIdentifyingRelationship_2018);
		types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularAttribute_2019);
		types.add(er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCCompositeAttribute_2020);
		return types;
	}

}
