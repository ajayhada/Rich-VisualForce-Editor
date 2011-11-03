
package com.vf.rich.editor.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * 
 * @author eclipse and AjayHada
 *
 */
@Deprecated
public class NonMatchingRule implements IPredicateRule
{

	public NonMatchingRule()
	{
		super();
	}

	public IToken getSuccessToken()
	{
		return Token.UNDEFINED;
	}

	public IToken evaluate(ICharacterScanner scanner, boolean resume)
	{
		return Token.UNDEFINED;
	}

	public IToken evaluate(ICharacterScanner scanner)
	{
		return Token.UNDEFINED;
	}

}
