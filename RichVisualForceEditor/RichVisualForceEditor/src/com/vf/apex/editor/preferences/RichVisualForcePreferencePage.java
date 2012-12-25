package com.vf.apex.editor.preferences;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.vf.apex.Activator;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class RichVisualForcePreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public RichVisualForcePreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Rich VisualForce editor preference");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		
		addField(new BooleanFieldEditor(
				PreferenceConstants.ENABLE_GIT_COMMIT,
			"Enable git commit on Ctrl+S shortcut", getFieldEditorParent()));
		
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		System.out.println(projects.toString());
		Label label = new Label(getFieldEditorParent(), SWT.BORDER | SWT.BORDER_SOLID);
		label.setText("Please specify repository location for each project, If you want to enable \ncommetting code on \"CTRL+SHIFT+C\" then please dont forget to click on checkbox.");
		  
		for (IProject iProject : projects) {
			Group automaticValidationGroup = new Group(getFieldEditorParent(), SWT.NONE);
			automaticValidationGroup.setText(iProject.getLocation().toFile().getName() + " Configuration");
			GridLayout gridLayout = new GridLayout(2, false);
			GridData gridData = new GridData(SWT.FILL, SWT.TOP, true, false);
			gridData.horizontalSpan = 3;
			
			System.out.println("Project : -- " + iProject.getLocation().toFile().getAbsolutePath());
			addField(new BooleanFieldEditor (
					"COMMIT_ENABLE_" + iProject.getLocation().toFile().getName(),
					"Enable Code Commit",
					automaticValidationGroup));
			
			addField(new DirectoryFieldEditor (
				"REPOSITORY_" + iProject.getLocation().toFile().getName(),
				"Repository Location",
				automaticValidationGroup));	
			
			automaticValidationGroup.setLayoutData(gridData);
			automaticValidationGroup.setLayout(gridLayout);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}