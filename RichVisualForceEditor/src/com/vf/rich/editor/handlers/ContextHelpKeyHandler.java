package com.vf.rich.editor.handlers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;

import com.vf.rich.editor.assist.Tag;
import com.vf.rich.editor.assist.VisualForceTagDefinition;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ContextHelpKeyHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public ContextHelpKeyHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// IWorkbenchWindow window =
		// HandlerUtil.getActiveWorkbenchWindowChecked(event);

		IWorkbenchBrowserSupport support = PlatformUI.getWorkbench()
				.getBrowserSupport();
		IWebBrowser browser;
		try {

			IWorkbench wb = PlatformUI.getWorkbench();
			IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
			Object data = wb.getDisplay().getActiveShell().getData();
			IWorkbenchPage page = win.getActivePage();
			IEditorPart editorPart = page.getActiveEditor();
			ITextEditor editor = (ITextEditor) editorPart;
			ISelectionProvider sp = editor.getSelectionProvider();
			ITextSelection selection = (ITextSelection) sp.getSelection();

			// /
			// org.eclipse.ui.texteditor.IDocumentProvider
			// ITextEditor editor = (ITextEditor)
			// editorPart.getAdapter(ITextEditor.class);
			IDocumentProvider documentProvider = editor.getDocumentProvider();
			IDocument document = documentProvider.getDocument(editorPart
					.getEditorInput());
			/*
					
					*/
			/*
			 * System.out.println(document.get());
			 * System.out.println(document.getLegalContentTypes());
			 * System.out.println(document.getLegalLineDelimiters());
			 * System.out.println(document.getLength());
			 * System.out.println(document.getLineInformation(lineNumber));
			 * System.out.println("offset - "+offset);
			 * System.out.println("lineNumber - "+lineNumber);
			 */
			ITextSelection textSelection = (ITextSelection) editorPart
					.getSite().getSelectionProvider().getSelection();
			int cursorLocation = textSelection.getOffset();
			int lineNumber = document.getLineOfOffset(cursorLocation);
			IRegion lineInformation = document.getLineInformation(lineNumber);
			String lineText = document.get().substring(
					lineInformation.getOffset(),
					lineInformation.getOffset() + lineInformation.getLength());
			String offsetWord = getOffsetWord(lineText, cursorLocation
					- lineInformation.getOffset());
			// System.out.println("offsetWord" + offsetWord);
			//
			String word = offsetWord.substring(offsetWord.lastIndexOf(":") + 1,
					offsetWord.length());
			List<Tag> tagInfoAsList = VisualForceTagDefinition.getTagInfoAsList();
			String tagInEditor = "apex:" + word;
			boolean found=false;
			for (Tag tag : tagInfoAsList) {
				if(tag.getTagName().equalsIgnoreCase(tagInEditor)){
					found = true;
				}
			}
			

			browser = support.createBrowser("" + System.currentTimeMillis());
			
			if (found) {
				browser.openURL(new URL(
						"http://www.salesforce.com/us/developer/docs/pages/Content/pages_compref_"
								+ word + ".htm"));
			} else {
				browser.openURL(new URL(
						"http://www.salesforce.com/us/developer/docs/pages/index.htm?"+word));
			}

			//

		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private String getOffsetWord(String str, int offset) {

		int lastBeforWordDelimiter = 0;
		int firstAfterWordDelimiter = 0;
		for (int i = 0; i < offset; i++) {
			char charAt = str.charAt(i);
			if (isDelimiter(charAt)) {
				lastBeforWordDelimiter = i;
			}

		}
		for (int i = offset; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (isDelimiter(charAt)) {
				firstAfterWordDelimiter = i;
				break;
			}

		}

		return str.substring(lastBeforWordDelimiter, firstAfterWordDelimiter);

	}

	private boolean isDelimiter(char c) {
		if (c == ' ' || c == '(' || c == ')' || c == ',' || c == '.' || c == '='
				|| c == ';' || c == '\n' || c == '\r' || c == '\t' || c == '+'
				|| c == '>' || c == '<' || c == '*' || c == '^' || c == '{'
				|| c == '}' || c == '[' || c == ']' || c == '"' || c == '\'' || c == '/') {
			return true;
		} else {
			return false;
		}
	}

}
