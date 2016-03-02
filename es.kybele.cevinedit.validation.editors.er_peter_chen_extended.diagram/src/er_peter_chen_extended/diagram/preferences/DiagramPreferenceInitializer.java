package er_peter_chen_extended.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		er_peter_chen_extended.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		er_peter_chen_extended.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		er_peter_chen_extended.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		er_peter_chen_extended.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		er_peter_chen_extended.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
