package er_peter_chen_extended.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
