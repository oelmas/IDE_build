package customeclipse.example.wizard.MugeNew;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class MugeProjectNewWizard extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage _pageOne;
	public MugeProjectNewWizard() {
		// TODO Auto-generated constructor stub
		setWindowTitle("MUGE Project Wizard");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();
		
		_pageOne = new WizardNewProjectCreationPage("From scratch MUGE Project Wizard");
		_pageOne.setTitle("Muge Project");
		_pageOne.setDescription("Creating Muge Project");
	}
	

}
