package er_peter_chen_extended.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class Er_peter_chen_extendedCreationWizard extends Wizard implements
		INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected er_peter_chen_extended.diagram.part.Er_peter_chen_extendedCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected er_peter_chen_extended.diagram.part.Er_peter_chen_extendedCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(er_peter_chen_extended.diagram.part.Messages.Er_peter_chen_extendedCreationWizardTitle);
		setDefaultPageImageDescriptor(er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewEr_peter_chen_extendedWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedCreationWizardPage(
				"DiagramModelFile", getSelection(), "er_peter_chen_extended_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(er_peter_chen_extended.diagram.part.Messages.Er_peter_chen_extendedCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(er_peter_chen_extended.diagram.part.Messages.Er_peter_chen_extendedCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new er_peter_chen_extended.diagram.part.Er_peter_chen_extendedCreationWizardPage(
				"DomainModelFile", getSelection(), "er_peter_chen_extended") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".er_peter_chen_extended_diagram".length()); //$NON-NLS-1$
					setFileName(er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "er_peter_chen_extended")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(er_peter_chen_extended.diagram.part.Messages.Er_peter_chen_extendedCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(er_peter_chen_extended.diagram.part.Messages.Er_peter_chen_extendedCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										er_peter_chen_extended.diagram.part.Messages.Er_peter_chen_extendedCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								er_peter_chen_extended.diagram.part.Messages.Er_peter_chen_extendedCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				er_peter_chen_extended.diagram.part.Er_peter_chen_extendedDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
