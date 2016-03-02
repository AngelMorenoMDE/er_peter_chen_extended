package er_peter_chen_extended.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class Er_peter_chen_extendedNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public Er_peter_chen_extendedNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem> result = new ArrayList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup) {
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup group = (er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem) {
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem navigatorItem = (er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
				.getVisualID(view)) {

		case er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup links = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Node sv = (Node) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup incominglinks = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCDerivedAttribute_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Node sv = (Node) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup outgoinglinks = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCWeakEntity_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Node sv = (Node) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup outgoinglinks = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCRegularEntity_2013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Node sv = (Node) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup incominglinks = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCWeakKeyAttribute_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Node sv = (Node) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup incominglinks = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCMultiValuedAttribute_2015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Node sv = (Node) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup outgoinglinks = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCRegularRelationship_2016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup incominglinks = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCRegularRelationship_2016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Node sv = (Node) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup incominglinks = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCPrimaryKeyAttribute_2017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Node sv = (Node) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup outgoinglinks = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCIdentifyingRelationship_2018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup incominglinks = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCIdentifyingRelationship_2018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Node sv = (Node) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup incominglinks = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCRegularAttribute_2019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Node sv = (Node) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup incominglinks = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCCompositeAttribute_2020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup outgoinglinks = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCCompositeAttribute_2020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup target = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCRelationshipAttributeLink_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup source = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCRelationshipAttributeLink_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup target = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCEntityRelationshipLink_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup source = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCEntityRelationshipLink_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup target = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCEntityAttributeLink_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup source = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCEntityAttributeLink_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID: {
			LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem> result = new LinkedList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup target = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCCompositeAttributeComposedAttributes_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup source = new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorGroup(
					er_peter_chen_extended.diagram.part.Messages.NavigatorGroupName_ERPCCompositeAttributeComposedAttributes_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
							.getType(er_peter_chen_extended.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return er_peter_chen_extended.diagram.edit.parts.ERPCDiagramEditPart.MODEL_ID
				.equals(er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem> result = new ArrayList<er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem) {
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem abstractNavigatorItem = (er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
