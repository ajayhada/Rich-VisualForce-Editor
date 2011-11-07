package com.vf.rich.editor;


import org.eclipse.ui.editors.text.TextEditor;

public class RichVisualForceEditor extends TextEditor {

	private ColorManager colorManager;

	public RichVisualForceEditor() {
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
