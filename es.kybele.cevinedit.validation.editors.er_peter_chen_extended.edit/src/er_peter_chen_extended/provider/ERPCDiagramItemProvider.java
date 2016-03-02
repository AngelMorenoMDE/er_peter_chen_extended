/**
 */
package er_peter_chen_extended.provider;


import er_peter_chen_extended.ERPCDiagram;
import er_peter_chen_extended.Er_peter_chen_extendedFactory;
import er_peter_chen_extended.Er_peter_chen_extendedPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link er_peter_chen_extended.ERPCDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ERPCDiagramItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPCDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__LINKS);
			childrenFeatures.add(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__RELATIONSHIPS);
			childrenFeatures.add(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__ATTRIBUTES);
			childrenFeatures.add(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__ENTITIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ERPCDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ERPCDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ERPCDiagram_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ERPCDiagram.class)) {
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__LINKS:
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__RELATIONSHIPS:
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ATTRIBUTES:
			case Er_peter_chen_extendedPackage.ERPC_DIAGRAM__ENTITIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__LINKS,
				 Er_peter_chen_extendedFactory.eINSTANCE.createERPCEntityRelationshipLink()));

		newChildDescriptors.add
			(createChildParameter
				(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__LINKS,
				 Er_peter_chen_extendedFactory.eINSTANCE.createERPCEntityAttributeLink()));

		newChildDescriptors.add
			(createChildParameter
				(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__LINKS,
				 Er_peter_chen_extendedFactory.eINSTANCE.createERPCRelationshipAttributeLink()));

		newChildDescriptors.add
			(createChildParameter
				(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__RELATIONSHIPS,
				 Er_peter_chen_extendedFactory.eINSTANCE.createERPCRegularRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__RELATIONSHIPS,
				 Er_peter_chen_extendedFactory.eINSTANCE.createERPCIdentifyingRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__ATTRIBUTES,
				 Er_peter_chen_extendedFactory.eINSTANCE.createERPCRegularAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__ATTRIBUTES,
				 Er_peter_chen_extendedFactory.eINSTANCE.createERPCCompositeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__ATTRIBUTES,
				 Er_peter_chen_extendedFactory.eINSTANCE.createERPCPrimaryKeyAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__ATTRIBUTES,
				 Er_peter_chen_extendedFactory.eINSTANCE.createERPCWeakKeyAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__ATTRIBUTES,
				 Er_peter_chen_extendedFactory.eINSTANCE.createERPCDerivedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__ATTRIBUTES,
				 Er_peter_chen_extendedFactory.eINSTANCE.createERPCMultiValuedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__ENTITIES,
				 Er_peter_chen_extendedFactory.eINSTANCE.createERPCRegularEntity()));

		newChildDescriptors.add
			(createChildParameter
				(Er_peter_chen_extendedPackage.Literals.ERPC_DIAGRAM__ENTITIES,
				 Er_peter_chen_extendedFactory.eINSTANCE.createERPCWeakEntity()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Er_peter_chen_extendedEditPlugin.INSTANCE;
	}

}
