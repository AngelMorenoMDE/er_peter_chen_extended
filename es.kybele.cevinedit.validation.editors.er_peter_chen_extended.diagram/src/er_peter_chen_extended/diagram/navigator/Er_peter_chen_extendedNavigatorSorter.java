package er_peter_chen_extended.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class Er_peter_chen_extendedNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4010;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem) {
			er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem item = (er_peter_chen_extended.diagram.navigator.Er_peter_chen_extendedNavigatorItem) element;
			return er_peter_chen_extended.diagram.part.Er_peter_chen_extendedVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
