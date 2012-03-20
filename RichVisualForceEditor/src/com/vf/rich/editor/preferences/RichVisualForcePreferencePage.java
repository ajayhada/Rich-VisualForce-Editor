package com.vf.rich.editor.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import com.vf.rich.editor.Activator;

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
		setDescription("Rich VisualForce editor preference page");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		
		addField(new RadioGroupFieldEditor(
				PreferenceConstants.CONTEXT_SENSITIVE_HELP_KEY,
			"Default context Sensitive help key:",
			1,
			new String[][] { {
				"&Alt+1", "alt+1" }
		}, getFieldEditorParent()));
		
		/*
		addField(
			new StringFieldEditor(PreferenceConstants.CONTEXT_SENSITIVE_HELP_KEY, "Context Sensitive Help Key:", getFieldEditorParent()));
				*/    
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}