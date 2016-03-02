package er_peter_chen_extended.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Er_peter_chen_extendedParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser eRPCDerivedAttributeName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getERPCDerivedAttributeName_5011Parser() {
		if (eRPCDerivedAttributeName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCAttribute_Name() };
			er_peter_chen_extended.diagram.parsers.MessageFormatParser parser = new er_peter_chen_extended.diagram.parsers.MessageFormatParser(
					features);
			eRPCDerivedAttributeName_5011Parser = parser;
		}
		return eRPCDerivedAttributeName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCWeakEntityName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getERPCWeakEntityName_5012Parser() {
		if (eRPCWeakEntityName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCEntity_Name() };
			er_peter_chen_extended.diagram.parsers.MessageFormatParser parser = new er_peter_chen_extended.diagram.parsers.MessageFormatParser(
					features);
			eRPCWeakEntityName_5012Parser = parser;
		}
		return eRPCWeakEntityName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCRegularEntityName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getERPCRegularEntityName_5013Parser() {
		if (eRPCRegularEntityName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCEntity_Name() };
			er_peter_chen_extended.diagram.parsers.MessageFormatParser parser = new er_peter_chen_extended.diagram.parsers.MessageFormatParser(
					features);
			eRPCRegularEntityName_5013Parser = parser;
		}
		return eRPCRegularEntityName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCWeakKeyAttributeName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getERPCWeakKeyAttributeName_5014Parser() {
		if (eRPCWeakKeyAttributeName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCAttribute_Name() };
			er_peter_chen_extended.diagram.parsers.MessageFormatParser parser = new er_peter_chen_extended.diagram.parsers.MessageFormatParser(
					features);
			eRPCWeakKeyAttributeName_5014Parser = parser;
		}
		return eRPCWeakKeyAttributeName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCMultiValuedAttributeName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getERPCMultiValuedAttributeName_5015Parser() {
		if (eRPCMultiValuedAttributeName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCAttribute_Name() };
			er_peter_chen_extended.diagram.parsers.MessageFormatParser parser = new er_peter_chen_extended.diagram.parsers.MessageFormatParser(
					features);
			eRPCMultiValuedAttributeName_5015Parser = parser;
		}
		return eRPCMultiValuedAttributeName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCRegularRelationshipName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getERPCRegularRelationshipName_5016Parser() {
		if (eRPCRegularRelationshipName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCRelationship_Name() };
			er_peter_chen_extended.diagram.parsers.MessageFormatParser parser = new er_peter_chen_extended.diagram.parsers.MessageFormatParser(
					features);
			eRPCRegularRelationshipName_5016Parser = parser;
		}
		return eRPCRegularRelationshipName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCPrimaryKeyAttributeName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getERPCPrimaryKeyAttributeName_5017Parser() {
		if (eRPCPrimaryKeyAttributeName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCAttribute_Name() };
			er_peter_chen_extended.diagram.parsers.MessageFormatParser parser = new er_peter_chen_extended.diagram.parsers.MessageFormatParser(
					features);
			eRPCPrimaryKeyAttributeName_5017Parser = parser;
		}
		return eRPCPrimaryKeyAttributeName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCIdentifyingRelationshipName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getERPCIdentifyingRelationshipName_5018Parser() {
		if (eRPCIdentifyingRelationshipName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCRelationship_Name() };
			er_peter_chen_extended.diagram.parsers.MessageFormatParser parser = new er_peter_chen_extended.diagram.parsers.MessageFormatParser(
					features);
			eRPCIdentifyingRelationshipName_5018Parser = parser;
		}
		return eRPCIdentifyingRelationshipName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCRegularAttributeName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getERPCRegularAttributeName_5019Parser() {
		if (eRPCRegularAttributeName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCAttribute_Name() };
			er_peter_chen_extended.diagram.parsers.MessageFormatParser parser = new er_peter_chen_extended.diagram.parsers.MessageFormatParser(
					features);
			eRPCRegularAttributeName_5019Parser = parser;
		}
		return eRPCRegularAttributeName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCCompositeAttributeName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getERPCCompositeAttributeName_5020Parser() {
		if (eRPCCompositeAttributeName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCAttribute_Name() };
			er_peter_chen_extended.diagram.parsers.MessageFormatParser parser = new er_peter_chen_extended.diagram.parsers.MessageFormatParser(
					features);
			eRPCCompositeAttributeName_5020Parser = parser;
		}
		return eRPCCompositeAttributeName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCEntityRelationshipLinkCardinality_6002Parser;

	/**
	 * @generated
	 */
	private IParser getERPCEntityRelationshipLinkCardinality_6002Parser() {
		if (eRPCEntityRelationshipLinkCardinality_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
					.getERPCEntityRelationshipLink_Cardinality() };
			er_peter_chen_extended.diagram.parsers.MessageFormatParser parser = new er_peter_chen_extended.diagram.parsers.MessageFormatParser(
					features);
			eRPCEntityRelationshipLinkCardinality_6002Parser = parser;
		}
		return eRPCEntityRelationshipLinkCardinality_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeNameEditPart.VISUAL_ID:
			return getERPCDerivedAttributeName_5011Parser();
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityNameEditPart.VISUAL_ID:
			return getERPCWeakEntityName_5012Parser();
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityNameEditPart.VISUAL_ID:
			return getERPCRegularEntityName_5013Parser();
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeNameEditPart.VISUAL_ID:
			return getERPCWeakKeyAttributeName_5014Parser();
		case er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeNameEditPart.VISUAL_ID:
			return getERPCMultiValuedAttributeName_5015Parser();
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipNameEditPart.VISUAL_ID:
			return getERPCRegularRelationshipName_5016Parser();
		case er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeNameEditPart.VISUAL_ID:
			return getERPCPrimaryKeyAttributeName_5017Parser();
		case er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipNameEditPart.VISUAL_ID:
			return getERPCIdentifyingRelationshipName_5018Parser();
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeNameEditPart.VISUAL_ID:
			return getERPCRegularAttributeName_5019Parser();
		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeNameEditPart.VISUAL_ID:
			return getERPCCompositeAttributeName_5020Parser();
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkCardinalityEditPart.VISUAL_ID:
			return getERPCEntityRelationshipLinkCardinality_6002Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
