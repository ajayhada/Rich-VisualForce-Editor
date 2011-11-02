package com.vfedit.assist;

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
	
	public String getTagName(){
		return this.name;
	}
	
	public boolean hasBody(){
		return this.hasBody;
	}
	
	public void addAttribute(Attribute attribute){
		this.attributes.add(attribute);
	}
	
	public Attribute[] getAttributes(){
		return (Attribute[])this.attributes.toArray(new Attribute[this.attributes.size()]);
	}
}
