package com.vf.rich.editor.assist;

import java.util.ArrayList;
/**
 * 
 * @author eclipse and AjayHada
 *
 */
public class Tag {

	private String name;
	private boolean hasBody;
	private ArrayList attributes = new ArrayList();
	
	public Tag(String tagName,boolean hasBody){
		this.name = tagName;
		this.hasBody = hasBody;
	}
	
	public Tag(String tagName,boolean hasBody,String[] attributeList){
		this.name = tagName;
		this.hasBody = hasBody;
		for (String attributeName : attributeList) {
			attributes.add(new Attribute(attributeName));
		}
	}
	
	public String getTagName(){
		return this.name;
	}
	
	public boolean hasBody(){
		return this.hasBody;
	}
	
	public void addAttribute(String attribute){
		this.attributes.add(new Attribute(attribute));
	}
	
	public Attribute[] getAttributes(){
		return (Attribute[])this.attributes.toArray(new Attribute[this.attributes.size()]);
	}
}
