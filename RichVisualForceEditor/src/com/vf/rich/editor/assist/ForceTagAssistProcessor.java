package com.vf.rich.editor.assist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ContextInformation;
import org.eclipse.jface.text.contentassist.ContextInformationValidator;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;

import com.vf.rich.editor.Activator;
/**
 * 
 * @author eclipse and AjayHada
 *
 */
public class ForceTagAssistProcessor implements IContentAssistProcessor {

	private char[] chars = {};
	private Image tagImage;
	private Image attributeImage;

	public ForceTagAssistProcessor() {
		tagImage = Activator.getDefault().getImageRegistry()
				.get(Activator.ICON_TAG);
		attributeImage = Activator.getDefault().getImageRegistry()
				.get(Activator.ICON_ATTR);
	}

	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int documentOffset) {

		String text = viewer.getDocument().get().substring(0, documentOffset);
		String[] dim = getLastWord(text);
		String word = dim[0];//.toLowerCase();
		String prev = dim[1];//.toLowerCase();
		String last = dim[2];

		List list = new ArrayList();
		List tagList = TagDefinition.getTagInfoAsList();

		//System.out.println("[0]" + word + "[1]" + prev + "[2]" + last);

		if (word.startsWith("<") && !word.equals("</")) {
			for (int i = 0; i < tagList.size(); i++) {
				Tag tagInfo = (Tag) tagList.get(i);
				String tagName = tagInfo.getTagName();
				if (("<" + tagName).indexOf(word) == 0) {
					String assistKeyword = null;
					int position = 0;
					if (tagInfo.hasBody()) {
						assistKeyword = tagName + "></" + tagName + "><!-- test1 -->";
						// assistKeyword = tagName + ">";
						position = 1;
					} else {
						assistKeyword = tagName + "/>";
						position = 2;
					}
					list.add(new CompletionProposal(assistKeyword,
							documentOffset - word.length() + 1,
							word.length() - 1, tagName.length() + position,
							tagImage, tagName, null, null));
				}
			}
			
		} else if (!prev.equals("")) {
			String tagName = prev;
			for (int i = 0; i < tagList.size(); i++) {
				Tag tagInfo = (Tag) tagList.get(i);
				if (tagInfo.getTagName().equals(tagName)) {
					Attribute[] attrList = tagInfo.getAttributes();
					for (int j = 0; j < attrList.length; j++) {
						if (attrList[j].getName().indexOf(word) == 0) {
							String assistKeyword = null;
							int position = 0;
							if (attrList[j].hasValue()) {
								assistKeyword = attrList[j].getName() + "=\"\"";
								position = 2;
							} else {
								assistKeyword = attrList[j].getName();
								position = 0;
							}
							list.add(new CompletionProposal(assistKeyword,
									documentOffset - word.length(), word.length(), attrList[j].getName().length() + position,
									attributeImage, attrList[j].getName(),
									null, null));
						}
					}
				}
			}
			
		} else if (!last.equals("")) {
			String assistKeyword = "</" + last + ">";
			int length = 0;
			if (word.equals("</")) {
				length = 2;
			}
			list.add(new CompletionProposal(assistKeyword, documentOffset
					- length, length, assistKeyword.length(), tagImage,
					assistKeyword, null, null));
		}

		CompletionProposal[] prop = (CompletionProposal[]) list
				.toArray(new CompletionProposal[list.size()]);
		return prop;
	}

	private String[] getLastWord(String text) {

		StringBuffer sb = new StringBuffer();
		Stack stack = new Stack();
		String word = "";
		String prevTag = "";
		String lastTag = "";
		String str = "";
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (isDelimiter(c)) {
				str = sb.toString();
				if (str.startsWith("<") && !str.startsWith("</")
						&& !str.startsWith("<!")) {
					prevTag = str.substring(1);
					if (!str.endsWith("/")) {
						stack.push(prevTag);
					}
				} else if (str.startsWith("</") && stack.size() != 0) {
					stack.pop();
				} else if (str.endsWith("/")) {
					stack.pop();
				}
				sb.setLength(0);

				if (c == '<') {
					sb.append(c);
				} else if (c == '>') {
					prevTag = "";
				}
			} else {
				sb.append(c);
			}
		}

		if (stack.size() != 0) {
			lastTag = (String) stack.pop();
		}

		str = sb.toString();
		// if(str.startsWith("<") && !str.startsWith("</")){
		word = str;
		// }

		return new String[] { word, prevTag, lastTag };
	}

	private boolean isDelimiter(char c) {
		if (c == ' ' || c == '(' || c == ')' || c == ',' || c == '.'
				|| c == ';' || c == '\n' || c == '\r' || c == '\t' || c == '+'
				|| c == '>' || c == '<' || c == '*' || c == '^' || c == '{'
				|| c == '}' || c == '[' || c == ']' || c == '"' || c == '\'') {
			return true;
		} else {
			return false;
		}
	}

	public IContextInformation[] computeContextInformation(ITextViewer viewer,
			int documentOffset) {
		ContextInformation[] info = new ContextInformation[0];
		return info;
	}

	public char[] getCompletionProposalAutoActivationCharacters() {
		return chars;
	}

	public char[] getContextInformationAutoActivationCharacters() {
		return chars;
	}

	public IContextInformationValidator getContextInformationValidator() {
		return new ContextInformationValidator(this);
	}

	public String getErrorMessage() {
		return "Error";
	}
}