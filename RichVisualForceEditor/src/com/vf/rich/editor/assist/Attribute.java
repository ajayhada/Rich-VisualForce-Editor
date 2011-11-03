/**
 * 
 */
package com.vf.rich.editor.assist;
/**
 * 
 * @author eclipse and AjayHada
 *
 */
public class Attribute {

	private String name;
	private boolean hasValue;
	
	public Attribute(String attributeName){
		this.name = attributeName;
		this.hasValue      = true;
	}
	
	public Attribute(String attributeName,boolean hasValue){
		this.name = attributeName;
		this.hasValue      = hasValue;
	}
	
	public String getName(){
		return this.name;
	}
	
	public boolean hasValue(){
		return this.hasValue;
	}
}
