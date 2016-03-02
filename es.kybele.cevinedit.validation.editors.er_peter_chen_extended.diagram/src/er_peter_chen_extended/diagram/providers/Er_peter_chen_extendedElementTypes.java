package er_peter_chen_extended.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class Er_peter_chen_extendedElementTypes {

	/**
	 * @generated
	 */
	private Er_peter_chen_extendedElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ERPCDiagram_1000 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCDerivedAttribute_2011 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCDerivedAttribute_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCWeakEntity_2012 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCWeakEntity_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCRegularEntity_2013 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCRegularEntity_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCWeakKeyAttribute_2014 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCWeakKeyAttribute_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCMultiValuedAttribute_2015 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCMultiValuedAttribute_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCRegularRelationship_2016 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCRegularRelationship_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCPrimaryKeyAttribute_2017 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCPrimaryKeyAttribute_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCIdentifyingRelationship_2018 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCIdentifyingRelationship_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCRegularAttribute_2019 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCRegularAttribute_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCCompositeAttribute_2020 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCCompositeAttribute_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCRelationshipAttributeLink_4005 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCRelationshipAttributeLink_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCEntityRelationshipLink_4006 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCEntityRelationshipLink_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCEntityAttributeLink_4007 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCEntityAttributeLink_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCCompositeAttributeComposedAttributes_4008 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen_extended.diagram.ERPCCompositeAttributeComposedAttributes_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(
					ERPCDiagram_1000,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCDiagram());

			elements.put(
					ERPCDerivedAttribute_2011,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCDerivedAttribute());

			elements.put(
					ERPCWeakEntity_2012,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCWeakEntity());

			elements.put(
					ERPCRegularEntity_2013,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCRegularEntity());

			elements.put(
					ERPCWeakKeyAttribute_2014,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCWeakKeyAttribute());

			elements.put(
					ERPCMultiValuedAttribute_2015,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCMultiValuedAttribute());

			elements.put(
					ERPCRegularRelationship_2016,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCRegularRelationship());

			elements.put(
					ERPCPrimaryKeyAttribute_2017,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCPrimaryKeyAttribute());

			elements.put(
					ERPCIdentifyingRelationship_2018,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCIdentifyingRelationship());

			elements.put(
					ERPCRegularAttribute_2019,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCRegularAttribute());

			elements.put(
					ERPCCompositeAttribute_2020,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCCompositeAttribute());

			elements.put(
					ERPCRelationshipAttributeLink_4005,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCRelationshipAttributeLink());

			elements.put(
					ERPCEntityRelationshipLink_4006,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCEntityRelationshipLink());

			elements.put(
					ERPCEntityAttributeLink_4007,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCEntityAttributeLink());

			elements.put(
					ERPCCompositeAttributeComposedAttributes_4008,
					er_peter_chen_extended.Er_peter_chen_extendedPackage.eINSTANCE
							.getERPCCompositeAttribute_ComposedAttributes());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ERPCDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(ERPCDerivedAttribute_2011);
			KNOWN_ELEMENT_TYPES.add(ERPCWeakEntity_2012);
			KNOWN_ELEMENT_TYPES.add(ERPCRegularEntity_2013);
			KNOWN_ELEMENT_TYPES.add(ERPCWeakKeyAttribute_2014);
			KNOWN_ELEMENT_TYPES.add(ERPCMultiValuedAttribute_2015);
			KNOWN_ELEMENT_TYPES.add(ERPCRegularRelationship_2016);
			KNOWN_ELEMENT_TYPES.add(ERPCPrimaryKeyAttribute_2017);
			KNOWN_ELEMENT_TYPES.add(ERPCIdentifyingRelationship_2018);
			KNOWN_ELEMENT_TYPES.add(ERPCRegularAttribute_2019);
			KNOWN_ELEMENT_TYPES.add(ERPCCompositeAttribute_2020);
			KNOWN_ELEMENT_TYPES.add(ERPCRelationshipAttributeLink_4005);
			KNOWN_ELEMENT_TYPES.add(ERPCEntityRelationshipLink_4006);
			KNOWN_ELEMENT_TYPES.add(ERPCEntityAttributeLink_4007);
			KNOWN_ELEMENT_TYPES
					.add(ERPCCompositeAttributeComposedAttributes_4008);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
			return ERPCDiagram_1000;
		case er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
			return ERPCDerivedAttribute_2011;
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
			return ERPCWeakEntity_2012;
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
			return ERPCRegularEntity_2013;
		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
			return ERPCWeakKeyAttribute_2014;
		case er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
			return ERPCMultiValuedAttribute_2015;
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
			return ERPCRegularRelationship_2016;
		case er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
			return ERPCPrimaryKeyAttribute_2017;
		case er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
			return ERPCIdentifyingRelationship_2018;
		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
			return ERPCRegularAttribute_2019;
		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID:
			return ERPCCompositeAttribute_2020;
		case er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
			return ERPCRelationshipAttributeLink_4005;
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
			return ERPCEntityRelationshipLink_4006;
		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
			return ERPCEntityAttributeLink_4007;
		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID:
			return ERPCCompositeAttributeComposedAttributes_4008;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return er_peter_chen_extended.diagram.providers.Er_peter_chen_extendedElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
