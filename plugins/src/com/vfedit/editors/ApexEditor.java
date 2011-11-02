package com.vfedit.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class ApexEditor extends TextEditor {

	private ColorManager colorManager;

	public ApexEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
