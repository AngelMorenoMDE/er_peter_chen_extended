package er_peter_chen_extended.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class Er_peter_chen_extendedNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem
				&& !isOwnView(((er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup) {
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup group = (er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup) element;
			return er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem) {
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem navigatorItem = (er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
				.getVisualID(view)) {
		case er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCDiagram", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCDiagram_1000); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCDerivedAttribute", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCDerivedAttribute_2011); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCWeakEntity", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCWeakEntity_2012); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCRegularEntity", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularEntity_2013); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCWeakKeyAttribute", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCWeakKeyAttribute_2014); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCMultiValuedAttribute", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCMultiValuedAttribute_2015); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCRegularRelationship", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularRelationship_2016); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCPrimaryKeyAttribute", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCPrimaryKeyAttribute_2017); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCIdentifyingRelationship", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCIdentifyingRelationship_2018); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCRegularAttribute", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularAttribute_2019); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCCompositeAttribute", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCCompositeAttribute_2020); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCRelationshipAttributeLink", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRelationshipAttributeLink_4005); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCEntityRelationshipLink", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityRelationshipLink_4006); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCEntityAttributeLink", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityAttributeLink_4007); //$NON-NLS-1$
		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kybele.es/gmf/er_peter_chen_extended?ERPCCompositeAttribute?composedAttributes", er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCCompositeAttributeComposedAttributes_4008); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes
						.isKnownElementType(elementType)) {
			image = er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup) {
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup group = (er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem) {
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem navigatorItem = (er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
				.getVisualID(view)) {
		case er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
			return getERPCDiagram_1000Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
			return getERPCDerivedAttribute_2011Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
			return getERPCWeakEntity_2012Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
			return getERPCRegularEntity_2013Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
			return getERPCWeakKeyAttribute_2014Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
			return getERPCMultiValuedAttribute_2015Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
			return getERPCRegularRelationship_2016Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
			return getERPCPrimaryKeyAttribute_2017Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
			return getERPCIdentifyingRelationship_2018Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
			return getERPCRegularAttribute_2019Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID:
			return getERPCCompositeAttribute_2020Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
			return getERPCRelationshipAttributeLink_4005Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
			return getERPCEntityRelationshipLink_4006Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
			return getERPCEntityAttributeLink_4007Text(view);
		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID:
			return getERPCCompositeAttributeComposedAttributes_4008Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getERPCDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getERPCDerivedAttribute_2011Text(View view) {
		IParser parser = er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedParserProvider
				.getParser(
						er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCDerivedAttribute_2011,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
								.getType(er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCWeakEntity_2012Text(View view) {
		IParser parser = er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedParserProvider
				.getParser(
						er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCWeakEntity_2012,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
								.getType(er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCRegularEntity_2013Text(View view) {
		IParser parser = er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedParserProvider
				.getParser(
						er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularEntity_2013,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
								.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCWeakKeyAttribute_2014Text(View view) {
		IParser parser = er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedParserProvider
				.getParser(
						er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCWeakKeyAttribute_2014,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
								.getType(er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCMultiValuedAttribute_2015Text(View view) {
		IParser parser = er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedParserProvider
				.getParser(
						er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCMultiValuedAttribute_2015,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
								.getType(er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCRegularRelationship_2016Text(View view) {
		IParser parser = er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedParserProvider
				.getParser(
						er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularRelationship_2016,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
								.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCPrimaryKeyAttribute_2017Text(View view) {
		IParser parser = er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedParserProvider
				.getParser(
						er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCPrimaryKeyAttribute_2017,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
								.getType(er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCIdentifyingRelationship_2018Text(View view) {
		IParser parser = er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedParserProvider
				.getParser(
						er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCIdentifyingRelationship_2018,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
								.getType(er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCRegularAttribute_2019Text(View view) {
		IParser parser = er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedParserProvider
				.getParser(
						er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCRegularAttribute_2019,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
								.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCCompositeAttribute_2020Text(View view) {
		IParser parser = er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedParserProvider
				.getParser(
						er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCCompositeAttribute_2020,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
								.getType(er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCRelationshipAttributeLink_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getERPCEntityRelationshipLink_4006Text(View view) {
		IParser parser = er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedParserProvider
				.getParser(
						er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes.ERPCEntityRelationshipLink_4006,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
								.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkCardinalityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCEntityAttributeLink_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getERPCCompositeAttributeComposedAttributes_4008Text(
			View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.MODEL_ID
				.equals(er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
						.getModelID(view));
	}

}
