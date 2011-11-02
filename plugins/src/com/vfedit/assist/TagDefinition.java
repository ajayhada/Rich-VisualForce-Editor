package com.vfedit.assist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 *
 */
public class TagDefinition {

	private static ArrayList tagList = new ArrayList();
	
	public static Tag[] getTagInfoAsArray(){
		return (Tag[])tagList.toArray(new Tag[tagList.size()]);
	}
	
	public static List getTagInfoAsList(){
		return tagList;
	}
	
	
	static {
		
		/**
		 *  apex:facet 
		 */
		Tag apexfacet = new Tag("apex:facet", true);
		apexfacet.addAttribute(new Attribute("name"));
		tagList.add(apexfacet);
		/**
		 * apex:column
		 * <apex:dataTable> or
		 * <apex:pageBlockTable>
		 */
		Tag apexcolumn = new Tag("apex:column", true);
		apexcolumn.addAttribute(new Attribute("breakBefore"));
		apexcolumn.addAttribute(new Attribute("colspan"));
		apexcolumn.addAttribute(new Attribute("dir"));
		apexcolumn.addAttribute(new Attribute("footerClass"));
		apexcolumn.addAttribute(new Attribute("footercolspan"));
		apexcolumn.addAttribute(new Attribute("footerdir"));
		apexcolumn.addAttribute(new Attribute("footerlang"));
		apexcolumn.addAttribute(new Attribute("footeronclick"));
		apexcolumn.addAttribute(new Attribute("footerondblclick"));
		apexcolumn.addAttribute(new Attribute("footeronkeydown"));
		apexcolumn.addAttribute(new Attribute("footeronkeypress"));
		apexcolumn.addAttribute(new Attribute("footeronkeyup"));
		apexcolumn.addAttribute(new Attribute("footeronmousedown"));
		apexcolumn.addAttribute(new Attribute("footeronmousemove"));
		apexcolumn.addAttribute(new Attribute("footeronmouseout"));
		apexcolumn.addAttribute(new Attribute("footeronmouseover"));
		apexcolumn.addAttribute(new Attribute("footeronmouseup"));
		apexcolumn.addAttribute(new Attribute("footerstyle"));
		apexcolumn.addAttribute(new Attribute("footertitle"));
		apexcolumn.addAttribute(new Attribute("footerValue"));
		apexcolumn.addAttribute(new Attribute("headerClass"));
		apexcolumn.addAttribute(new Attribute("headercolspan"));
		apexcolumn.addAttribute(new Attribute("headerdir"));
		apexcolumn.addAttribute(new Attribute("headerlang"));
		apexcolumn.addAttribute(new Attribute("headeronclick"));
		apexcolumn.addAttribute(new Attribute("headerondblclick"));
		apexcolumn.addAttribute(new Attribute("headeronkeydown"));
		apexcolumn.addAttribute(new Attribute("headeronkeypress"));
		apexcolumn.addAttribute(new Attribute("headeronkeyup"));
		apexcolumn.addAttribute(new Attribute("headeronmousedown"));
		apexcolumn.addAttribute(new Attribute("headeronmousemove"));
		apexcolumn.addAttribute(new Attribute("headeronmouseout"));
		apexcolumn.addAttribute(new Attribute("headeronmouseover"));
		apexcolumn.addAttribute(new Attribute("headeronmouseup"));
		apexcolumn.addAttribute(new Attribute("headerstyle"));
		apexcolumn.addAttribute(new Attribute("headertitle"));
		apexcolumn.addAttribute(new Attribute("headerValue"));
		apexcolumn.addAttribute(new Attribute("id"));
		apexcolumn.addAttribute(new Attribute("lang"));
		apexcolumn.addAttribute(new Attribute("onclick"));
		apexcolumn.addAttribute(new Attribute("ondblclick"));
		apexcolumn.addAttribute(new Attribute("onkeydown"));
		apexcolumn.addAttribute(new Attribute("onkeypress"));
		apexcolumn.addAttribute(new Attribute("onkeyup"));
		apexcolumn.addAttribute(new Attribute("onmousedown"));
		apexcolumn.addAttribute(new Attribute("onmousemove"));
		apexcolumn.addAttribute(new Attribute("onmouseout"));
		apexcolumn.addAttribute(new Attribute("onmouseover"));
		apexcolumn.addAttribute(new Attribute("onmouseup"));
		apexcolumn.addAttribute(new Attribute("rendered"));
		apexcolumn.addAttribute(new Attribute("rowspan"));
		apexcolumn.addAttribute(new Attribute("style"));
		apexcolumn.addAttribute(new Attribute("styleClass"));
		apexcolumn.addAttribute(new Attribute("title"));
		apexcolumn.addAttribute(new Attribute("value"));
		apexcolumn.addAttribute(new Attribute("width"));
		tagList.add(apexcolumn);
		
		
		/**
		 * apex:inlineEditSupport
		 * <apex:dataList>
			<apex:dataTable>
			<apex:form>
			<apex:outputField>
			<apex:pageBlock>
			<apex:pageBlockSection>
			<apex:pageBlockTable>
			<apex:repeat>
		 */
		Tag apexinlineEditSupport = new Tag("apex:inlineEditSupport", true);
		apexinlineEditSupport.addAttribute(new Attribute("changedStyleClass"));
		apexinlineEditSupport.addAttribute(new Attribute("disabled"));
		apexinlineEditSupport.addAttribute(new Attribute("event"));
		apexinlineEditSupport.addAttribute(new Attribute("hideOnEdit"));
		apexinlineEditSupport.addAttribute(new Attribute("id"));
		apexinlineEditSupport.addAttribute(new Attribute("rendered"));
		apexinlineEditSupport.addAttribute(new Attribute("resetFunction"));
		apexinlineEditSupport.addAttribute(new Attribute("showOnEdit"));
		tagList.add(apexinlineEditSupport);
		
		/**APEX PARAM USED FOR following tags
		 * 	<apex:actionFunction>
			<apex:actionSupport>
			<apex:commandButton>
			<apex:commandLink>
			<apex:outputLink>
			<apex:outputText>
			<flow:interview>
		 */
		Tag apexparam = new Tag("apex:param", true);
		apexparam.addAttribute(new Attribute("assignTo"));
		apexparam.addAttribute(new Attribute("id"));
		apexparam.addAttribute(new Attribute("name"));
		apexparam.addAttribute(new Attribute("value"));
		tagList.add(apexparam);
		
		//apex:pageBlockTable 
		Tag apexpageBlockTable = new Tag("apex:pageBlockTable", true);
		apexpageBlockTable.addAttribute(new Attribute("assignTo"));
		apexpageBlockTable.addAttribute(new Attribute("align"));
		apexpageBlockTable.addAttribute(new Attribute("bgcolor"));
		apexpageBlockTable.addAttribute(new Attribute("border"));
		apexpageBlockTable.addAttribute(new Attribute("captionClass"));
		apexpageBlockTable.addAttribute(new Attribute("captionStyle"));
		apexpageBlockTable.addAttribute(new Attribute("cellpadding"));
		apexpageBlockTable.addAttribute(new Attribute("cellspacing"));
		apexpageBlockTable.addAttribute(new Attribute("columnClasses"));
		apexpageBlockTable.addAttribute(new Attribute("columns"));
		apexpageBlockTable.addAttribute(new Attribute("columnsWidth"));
		apexpageBlockTable.addAttribute(new Attribute("dir"));
		apexpageBlockTable.addAttribute(new Attribute("first"));
		apexpageBlockTable.addAttribute(new Attribute("footerClass"));
		apexpageBlockTable.addAttribute(new Attribute("frame"));
		apexpageBlockTable.addAttribute(new Attribute("headerClass"));
		apexpageBlockTable.addAttribute(new Attribute("id"));
		apexpageBlockTable.addAttribute(new Attribute("lang"));
		apexpageBlockTable.addAttribute(new Attribute("onclick"));
		apexpageBlockTable.addAttribute(new Attribute("ondblclick"));
		apexpageBlockTable.addAttribute(new Attribute("onkeydown"));
		apexpageBlockTable.addAttribute(new Attribute("onkeypress"));
		apexpageBlockTable.addAttribute(new Attribute("onkeyup"));
		apexpageBlockTable.addAttribute(new Attribute("onmousedown"));
		apexpageBlockTable.addAttribute(new Attribute("onmousemove"));
		apexpageBlockTable.addAttribute(new Attribute("onmouseout"));
		apexpageBlockTable.addAttribute(new Attribute("onmouseover"));
		apexpageBlockTable.addAttribute(new Attribute("onmouseup"));
		apexpageBlockTable.addAttribute(new Attribute("onRowClick"));
		apexpageBlockTable.addAttribute(new Attribute("onRowDblClick"));
		apexpageBlockTable.addAttribute(new Attribute("onRowMouseDown"));
		apexpageBlockTable.addAttribute(new Attribute("onRowMouseMove"));
		apexpageBlockTable.addAttribute(new Attribute("onRowMouseOut"));
		apexpageBlockTable.addAttribute(new Attribute("onRowMouseOver"));
		apexpageBlockTable.addAttribute(new Attribute("onRowMouseUp"));
		apexpageBlockTable.addAttribute(new Attribute("rendered"));
		apexpageBlockTable.addAttribute(new Attribute("rowClasses"));
		apexpageBlockTable.addAttribute(new Attribute("rows"));
		apexpageBlockTable.addAttribute(new Attribute("rules"));
		apexpageBlockTable.addAttribute(new Attribute("style"));
		apexpageBlockTable.addAttribute(new Attribute("styleClass"));
		apexpageBlockTable.addAttribute(new Attribute("summary"));
		apexpageBlockTable.addAttribute(new Attribute("title"));
		apexpageBlockTable.addAttribute(new Attribute("value"));
		apexpageBlockTable.addAttribute(new Attribute("var"));
		apexpageBlockTable.addAttribute(new Attribute("width"));
		tagList.add(apexpageBlockTable);
		
		// ROOT ELEMENT
		Tag rootElement = new Tag("apex:page", true);
		rootElement.addAttribute(new Attribute("action"));
		rootElement.addAttribute(new Attribute("apiVersion"));
		rootElement.addAttribute(new Attribute("cache"));
		rootElement.addAttribute(new Attribute("contentType"));
		rootElement.addAttribute(new Attribute("controller"));
		rootElement.addAttribute(new Attribute("expires"));
		rootElement.addAttribute(new Attribute("extensions"));
		rootElement.addAttribute(new Attribute("id"));
		rootElement.addAttribute(new Attribute("label"));
		rootElement.addAttribute(new Attribute("language"));
		rootElement.addAttribute(new Attribute("name"));
		rootElement.addAttribute(new Attribute("pageStyle"));
		rootElement.addAttribute(new Attribute("recordSetName"));
		rootElement.addAttribute(new Attribute("recordSetVar"));
		rootElement.addAttribute(new Attribute("renderAs"));
		rootElement.addAttribute(new Attribute("rendered"));
		rootElement.addAttribute(new Attribute("setup"));
		rootElement.addAttribute(new Attribute("showHeader"));
		rootElement.addAttribute(new Attribute("sidebar"));
		rootElement.addAttribute(new Attribute("standardController"));
		rootElement.addAttribute(new Attribute("standardStylesheets"));
		rootElement.addAttribute(new Attribute("tabStyle"));
		rootElement.addAttribute(new Attribute("title"));
		rootElement.addAttribute(new Attribute("wizard"));
		tagList.add(rootElement);
		
		// apex:repeat
		Tag apexrepeat = new Tag("apex:repeat", true);
		apexrepeat.addAttribute(new Attribute("first"));
		apexrepeat.addAttribute(new Attribute("id"));
		apexrepeat.addAttribute(new Attribute("rendered"));
		apexrepeat.addAttribute(new Attribute("rows"));
		apexrepeat.addAttribute(new Attribute("value"));
		apexrepeat.addAttribute(new Attribute("var"));
		tagList.add(apexrepeat);
		
		// ROOT ELEMENT CHILDS
		// FORM ELEMENT
		Tag apexForm = new Tag("apex:form", true);
		apexForm.addAttribute(new Attribute("accept"));
		apexForm.addAttribute(new Attribute("acceptcharset"));
		apexForm.addAttribute(new Attribute("dir"));
		apexForm.addAttribute(new Attribute("enctype"));
		apexForm.addAttribute(new Attribute("forceSSL"));
		apexForm.addAttribute(new Attribute("id"));
		apexForm.addAttribute(new Attribute("lang"));
		apexForm.addAttribute(new Attribute("onclick"));
		apexForm.addAttribute(new Attribute("ondblclick"));
		apexForm.addAttribute(new Attribute("onkeydown"));
		apexForm.addAttribute(new Attribute("onkeypress"));
		apexForm.addAttribute(new Attribute("onkeyup"));
		apexForm.addAttribute(new Attribute("onmousedown"));
		apexForm.addAttribute(new Attribute("onmousemove"));
		apexForm.addAttribute(new Attribute("onmouseout"));
		apexForm.addAttribute(new Attribute("onmouseover"));
		apexForm.addAttribute(new Attribute("onmouseup"));
		apexForm.addAttribute(new Attribute("onreset"));
		apexForm.addAttribute(new Attribute("onsubmit"));
		apexForm.addAttribute(new Attribute("prependId"));
		apexForm.addAttribute(new Attribute("rendered"));
		apexForm.addAttribute(new Attribute("style"));
		apexForm.addAttribute(new Attribute("styleClass"));
		apexForm.addAttribute(new Attribute("target"));
		apexForm.addAttribute(new Attribute("title"));
		tagList.add(apexForm);
		
		// apex:inputCheckbox
		Tag apexinputCheckbox = new Tag("apex:inputCheckbox", true);
		apexinputCheckbox.addAttribute(new Attribute("accesskey"));
		apexinputCheckbox.addAttribute(new Attribute("dir"));
		apexinputCheckbox.addAttribute(new Attribute("disabled"));
		apexinputCheckbox.addAttribute(new Attribute("id"));
		apexinputCheckbox.addAttribute(new Attribute("immediate"));
		apexinputCheckbox.addAttribute(new Attribute("lang"));
		apexinputCheckbox.addAttribute(new Attribute("onblur"));
		apexinputCheckbox.addAttribute(new Attribute("onchange"));
		apexinputCheckbox.addAttribute(new Attribute("onclick"));
		apexinputCheckbox.addAttribute(new Attribute("ondblclick"));
		apexinputCheckbox.addAttribute(new Attribute("onfocus"));
		apexinputCheckbox.addAttribute(new Attribute("onkeydown"));
		apexinputCheckbox.addAttribute(new Attribute("onkeypress"));
		apexinputCheckbox.addAttribute(new Attribute("onkeyup"));
		apexinputCheckbox.addAttribute(new Attribute("onmousedown"));
		apexinputCheckbox.addAttribute(new Attribute("onmousemove"));
		apexinputCheckbox.addAttribute(new Attribute("onmouseout"));
		apexinputCheckbox.addAttribute(new Attribute("onmouseover"));
		apexinputCheckbox.addAttribute(new Attribute("onmouseup"));
		apexinputCheckbox.addAttribute(new Attribute("onselect"));
		apexinputCheckbox.addAttribute(new Attribute("rendered"));
		apexinputCheckbox.addAttribute(new Attribute("required"));
		apexinputCheckbox.addAttribute(new Attribute("selected"));
		apexinputCheckbox.addAttribute(new Attribute("style"));
		apexinputCheckbox.addAttribute(new Attribute("styleClass"));
		apexinputCheckbox.addAttribute(new Attribute("tabindex"));
		apexinputCheckbox.addAttribute(new Attribute("title"));
		apexinputCheckbox.addAttribute(new Attribute("value"));
		tagList.add(apexinputCheckbox);
		
		// apex:inputField
		Tag apexinputField = new Tag("apex:inputField", true);
		apexinputField.addAttribute(new Attribute("id"));
		apexinputField.addAttribute(new Attribute("onblur"));
		apexinputField.addAttribute(new Attribute("onchange"));
		apexinputField.addAttribute(new Attribute("onclick"));
		apexinputField.addAttribute(new Attribute("ondblclick"));
		apexinputField.addAttribute(new Attribute("onfocus"));
		apexinputField.addAttribute(new Attribute("onkeydown"));
		apexinputField.addAttribute(new Attribute("onkeypress"));
		apexinputField.addAttribute(new Attribute("onkeyup"));
		apexinputField.addAttribute(new Attribute("onmousedown"));
		apexinputField.addAttribute(new Attribute("onmousemove"));
		apexinputField.addAttribute(new Attribute("onmouseout"));
		apexinputField.addAttribute(new Attribute("onmouseover"));
		apexinputField.addAttribute(new Attribute("onmouseup"));
		apexinputField.addAttribute(new Attribute("onselect"));
		apexinputField.addAttribute(new Attribute("rendered"));
		apexinputField.addAttribute(new Attribute("required"));
		apexinputField.addAttribute(new Attribute("style"));
		apexinputField.addAttribute(new Attribute("styleClass"));
		apexinputField.addAttribute(new Attribute("value"));
		tagList.add(apexinputField);
		
		// apex:inputFile
		Tag apexinputFile = new Tag("apex:inputFile", true);
		apexinputFile.addAttribute(new Attribute("accept"));
		apexinputFile.addAttribute(new Attribute("accessKey"));
		apexinputFile.addAttribute(new Attribute("alt"));
		apexinputFile.addAttribute(new Attribute("contentType"));
		apexinputFile.addAttribute(new Attribute("dir"));
		apexinputFile.addAttribute(new Attribute("disabled"));
		apexinputFile.addAttribute(new Attribute("fileName"));
		apexinputFile.addAttribute(new Attribute("fileSize"));
		apexinputFile.addAttribute(new Attribute("id"));
		apexinputFile.addAttribute(new Attribute("lang"));
		apexinputFile.addAttribute(new Attribute("onblur"));
		apexinputFile.addAttribute(new Attribute("onchange"));
		apexinputFile.addAttribute(new Attribute("onclick"));
		apexinputFile.addAttribute(new Attribute("ondblclick"));
		apexinputFile.addAttribute(new Attribute("onfocus"));
		apexinputFile.addAttribute(new Attribute("onkeydown"));
		apexinputFile.addAttribute(new Attribute("onkeypress"));
		apexinputFile.addAttribute(new Attribute("onkeyup"));
		apexinputFile.addAttribute(new Attribute("onmousedown"));
		apexinputFile.addAttribute(new Attribute("onmousemove"));
		apexinputFile.addAttribute(new Attribute("onmouseout"));
		apexinputFile.addAttribute(new Attribute("onmouseover"));
		apexinputFile.addAttribute(new Attribute("onmouseup"));
		apexinputFile.addAttribute(new Attribute("onselect"));
		apexinputFile.addAttribute(new Attribute("readonly"));
		apexinputFile.addAttribute(new Attribute("redisplay"));
		apexinputFile.addAttribute(new Attribute("rendered"));
		apexinputFile.addAttribute(new Attribute("required"));
		apexinputFile.addAttribute(new Attribute("size"));
		apexinputFile.addAttribute(new Attribute("style"));
		apexinputFile.addAttribute(new Attribute("styleClass"));
		apexinputFile.addAttribute(new Attribute("tabindex"));
		apexinputFile.addAttribute(new Attribute("title"));
		apexinputFile.addAttribute(new Attribute("value"));
		tagList.add(apexinputFile);
		
		//  apex:inputText
		Tag apexinputText = new Tag("apex:inputText", true);
		apexinputText.addAttribute(new Attribute("accesskey"));
		apexinputText.addAttribute(new Attribute("alt"));
		apexinputText.addAttribute(new Attribute("dir"));
		apexinputText.addAttribute(new Attribute("disabled"));
		apexinputText.addAttribute(new Attribute("id"));
		apexinputText.addAttribute(new Attribute("lang"));
		apexinputText.addAttribute(new Attribute("maxlength"));
		apexinputText.addAttribute(new Attribute("onblur"));
		apexinputText.addAttribute(new Attribute("onchange"));
		apexinputText.addAttribute(new Attribute("onclick"));
		apexinputText.addAttribute(new Attribute("ondblclick"));
		apexinputText.addAttribute(new Attribute("onfocus"));
		apexinputText.addAttribute(new Attribute("onkeydown"));
		apexinputText.addAttribute(new Attribute("onkeypress"));
		apexinputText.addAttribute(new Attribute("onkeyup"));
		apexinputText.addAttribute(new Attribute("onmousedown"));
		apexinputText.addAttribute(new Attribute("onmousemove"));
		apexinputText.addAttribute(new Attribute("onmouseout"));
		apexinputText.addAttribute(new Attribute("onmouseover"));
		apexinputText.addAttribute(new Attribute("onmouseup"));
		apexinputText.addAttribute(new Attribute("rendered"));
		apexinputText.addAttribute(new Attribute("required"));
		apexinputText.addAttribute(new Attribute("size"));
		apexinputText.addAttribute(new Attribute("style"));
		apexinputText.addAttribute(new Attribute("styleClass"));
		apexinputText.addAttribute(new Attribute("tabindex"));
		apexinputText.addAttribute(new Attribute("title"));
		apexinputText.addAttribute(new Attribute("value"));
		tagList.add(apexinputText);
		
		// apex:inputTextarea
		Tag apexinputTextarea = new Tag("apex:inputTextarea", true);
		apexinputTextarea.addAttribute(new Attribute("accesskey"));
		apexinputTextarea.addAttribute(new Attribute("cols"));
		apexinputTextarea.addAttribute(new Attribute("dir"));
		apexinputTextarea.addAttribute(new Attribute("disabled"));
		apexinputTextarea.addAttribute(new Attribute("id"));
		apexinputTextarea.addAttribute(new Attribute("lang"));
		apexinputTextarea.addAttribute(new Attribute("onblur"));
		apexinputTextarea.addAttribute(new Attribute("onchange"));
		apexinputTextarea.addAttribute(new Attribute("onclick"));
		apexinputTextarea.addAttribute(new Attribute("ondblclick"));
		apexinputTextarea.addAttribute(new Attribute("onfocus"));
		apexinputTextarea.addAttribute(new Attribute("onkeydown"));
		apexinputTextarea.addAttribute(new Attribute("onkeypress"));
		apexinputTextarea.addAttribute(new Attribute("onkeyup"));
		apexinputTextarea.addAttribute(new Attribute("onmousedown"));
		apexinputTextarea.addAttribute(new Attribute("onmousemove"));
		apexinputTextarea.addAttribute(new Attribute("onmouseout"));
		apexinputTextarea.addAttribute(new Attribute("onmouseover"));
		apexinputTextarea.addAttribute(new Attribute("onmouseup"));
		apexinputTextarea.addAttribute(new Attribute("onselect"));
		apexinputTextarea.addAttribute(new Attribute("readonly"));
		apexinputTextarea.addAttribute(new Attribute("rendered"));
		apexinputTextarea.addAttribute(new Attribute("required"));
		apexinputTextarea.addAttribute(new Attribute("richText"));
		apexinputTextarea.addAttribute(new Attribute("rows"));
		apexinputTextarea.addAttribute(new Attribute("style"));
		apexinputTextarea.addAttribute(new Attribute("styleClass"));
		apexinputTextarea.addAttribute(new Attribute("tabindex"));
		apexinputTextarea.addAttribute(new Attribute("title"));
		apexinputTextarea.addAttribute(new Attribute("value"));
		tagList.add(apexinputTextarea);
		
		// apex:inputHidden
		Tag apexinputHidden = new Tag("apex:inputHidden", true);
		apexinputHidden.addAttribute(new Attribute("id"));
		apexinputHidden.addAttribute(new Attribute("immediate"));
		apexinputHidden.addAttribute(new Attribute("rendered"));
		apexinputHidden.addAttribute(new Attribute("required"));
		apexinputHidden.addAttribute(new Attribute("value"));
		tagList.add(apexinputHidden);
		
		// apex:inputSecret
		Tag apexinputSecret = new Tag("apex:inputSecret", true);
		apexinputSecret.addAttribute(new Attribute("accesskey"));
		apexinputSecret.addAttribute(new Attribute("alt"));
		apexinputSecret.addAttribute(new Attribute("dir"));
		apexinputSecret.addAttribute(new Attribute("disabled"));
		apexinputSecret.addAttribute(new Attribute("id"));
		apexinputSecret.addAttribute(new Attribute("immediate"));
		apexinputSecret.addAttribute(new Attribute("lang"));
		apexinputSecret.addAttribute(new Attribute("maxlength"));
		apexinputSecret.addAttribute(new Attribute("onblur"));
		apexinputSecret.addAttribute(new Attribute("onchange"));
		apexinputSecret.addAttribute(new Attribute("onclick"));
		apexinputSecret.addAttribute(new Attribute("ondblclick"));
		apexinputSecret.addAttribute(new Attribute("onfocus"));
		apexinputSecret.addAttribute(new Attribute("onkeydown"));
		apexinputSecret.addAttribute(new Attribute("onkeypress"));
		apexinputSecret.addAttribute(new Attribute("onkeyup"));
		apexinputSecret.addAttribute(new Attribute("onmousedown"));
		apexinputSecret.addAttribute(new Attribute("onmousemove"));
		apexinputSecret.addAttribute(new Attribute("onmouseout"));
		apexinputSecret.addAttribute(new Attribute("onmouseover"));
		apexinputSecret.addAttribute(new Attribute("onmouseup"));
		apexinputSecret.addAttribute(new Attribute("onselect"));
		apexinputSecret.addAttribute(new Attribute("readonly"));
		apexinputSecret.addAttribute(new Attribute("redisplay"));
		apexinputSecret.addAttribute(new Attribute("rendered"));
		apexinputSecret.addAttribute(new Attribute("required"));
		apexinputSecret.addAttribute(new Attribute("size"));
		apexinputSecret.addAttribute(new Attribute("style"));
		apexinputSecret.addAttribute(new Attribute("styleClass"));
		apexinputSecret.addAttribute(new Attribute("tabindex"));
		apexinputSecret.addAttribute(new Attribute("title"));
		apexinputSecret.addAttribute(new Attribute("value"));
		tagList.add(apexinputSecret);
		
		// apex:selectOption
		Tag apexselectOption = new Tag("apex:selectOption", true);
		apexselectOption.addAttribute(new Attribute("dir"));
		apexselectOption.addAttribute(new Attribute("id"));
		apexselectOption.addAttribute(new Attribute("itemDescription"));
		apexselectOption.addAttribute(new Attribute("itemDisabled"));
		apexselectOption.addAttribute(new Attribute("itemEscaped"));
		apexselectOption.addAttribute(new Attribute("itemLabel"));
		apexselectOption.addAttribute(new Attribute("itemValue"));
		apexselectOption.addAttribute(new Attribute("lang"));
		apexselectOption.addAttribute(new Attribute("onclick"));
		apexselectOption.addAttribute(new Attribute("ondblclick"));
		apexselectOption.addAttribute(new Attribute("onkeydown"));
		apexselectOption.addAttribute(new Attribute("onkeypress"));
		apexselectOption.addAttribute(new Attribute("onkeyup"));
		apexselectOption.addAttribute(new Attribute("onmousedown"));
		apexselectOption.addAttribute(new Attribute("onmousemove"));
		apexselectOption.addAttribute(new Attribute("onmouseout"));
		apexselectOption.addAttribute(new Attribute("onmouseover"));
		apexselectOption.addAttribute(new Attribute("onmouseup"));
		apexselectOption.addAttribute(new Attribute("rendered"));
		apexselectOption.addAttribute(new Attribute("style"));
		apexselectOption.addAttribute(new Attribute("styleClass"));
		apexselectOption.addAttribute(new Attribute("title"));
		apexselectOption.addAttribute(new Attribute("value"));
		tagList.add(apexselectOption);
		
		// apex:selectOptions
		Tag apexselectOptions = new Tag("apex:selectOptions", true);
		apexselectOptions.addAttribute(new Attribute("id"));
		apexselectOptions.addAttribute(new Attribute("rendered"));
		apexselectOptions.addAttribute(new Attribute("value"));
		tagList.add(apexselectOptions);
		
		// apex:selectCheckboxes
		Tag apexselectCheckboxes = new Tag("apex:selectCheckboxes", true);
		apexselectCheckboxes.addAttribute(new Attribute("accesskey"));
		apexselectCheckboxes.addAttribute(new Attribute("border"));
		apexselectCheckboxes.addAttribute(new Attribute("dir"));
		apexselectCheckboxes.addAttribute(new Attribute("disabled"));
		apexselectCheckboxes.addAttribute(new Attribute("disabledClass"));
		apexselectCheckboxes.addAttribute(new Attribute("enabledClass"));
		apexselectCheckboxes.addAttribute(new Attribute("id"));
		apexselectCheckboxes.addAttribute(new Attribute("immediate"));
		apexselectCheckboxes.addAttribute(new Attribute("lang"));
		apexselectCheckboxes.addAttribute(new Attribute("layout"));
		apexselectCheckboxes.addAttribute(new Attribute("onblur"));
		apexselectCheckboxes.addAttribute(new Attribute("onchange"));
		apexselectCheckboxes.addAttribute(new Attribute("onclick"));
		apexselectCheckboxes.addAttribute(new Attribute("ondblclick"));
		apexselectCheckboxes.addAttribute(new Attribute("onfocus"));
		apexselectCheckboxes.addAttribute(new Attribute("onkeydown"));
		apexselectCheckboxes.addAttribute(new Attribute("onkeypress"));
		apexselectCheckboxes.addAttribute(new Attribute("onkeyup"));
		apexselectCheckboxes.addAttribute(new Attribute("onmousedown"));
		apexselectCheckboxes.addAttribute(new Attribute("onmousemove"));
		apexselectCheckboxes.addAttribute(new Attribute("onmouseout"));
		apexselectCheckboxes.addAttribute(new Attribute("onmouseover"));
		apexselectCheckboxes.addAttribute(new Attribute("onmouseup"));
		apexselectCheckboxes.addAttribute(new Attribute("onselect"));
		apexselectCheckboxes.addAttribute(new Attribute("readonly"));
		apexselectCheckboxes.addAttribute(new Attribute("rendered"));
		apexselectCheckboxes.addAttribute(new Attribute("required"));
		apexselectCheckboxes.addAttribute(new Attribute("style"));
		apexselectCheckboxes.addAttribute(new Attribute("styleClass"));
		apexselectCheckboxes.addAttribute(new Attribute("tabindex"));
		apexselectCheckboxes.addAttribute(new Attribute("title"));
		apexselectCheckboxes.addAttribute(new Attribute("value"));
		tagList.add(apexselectCheckboxes);
		
		// apex:selectList 
		Tag apexselectList = new Tag("apex:selectList", true);
		apexselectList.addAttribute(new Attribute("accesskey"));
		apexselectList.addAttribute(new Attribute("dir"));
		apexselectList.addAttribute(new Attribute("disabled"));
		apexselectList.addAttribute(new Attribute("disabledClass"));
		apexselectList.addAttribute(new Attribute("enabledClass"));
		apexselectList.addAttribute(new Attribute("id"));
		apexselectList.addAttribute(new Attribute("lang"));
		apexselectList.addAttribute(new Attribute("multiselect"));
		apexselectList.addAttribute(new Attribute("onblur"));
		apexselectList.addAttribute(new Attribute("onchange"));
		apexselectList.addAttribute(new Attribute("onclick"));
		apexselectList.addAttribute(new Attribute("ondblclick"));
		apexselectList.addAttribute(new Attribute("onfocus"));
		apexselectList.addAttribute(new Attribute("onkeydown"));
		apexselectList.addAttribute(new Attribute("onkeypress"));
		apexselectList.addAttribute(new Attribute("onkeyup"));
		apexselectList.addAttribute(new Attribute("onmousedown"));
		apexselectList.addAttribute(new Attribute("onmousemove"));
		apexselectList.addAttribute(new Attribute("onmouseout"));
		apexselectList.addAttribute(new Attribute("onmouseover"));
		apexselectList.addAttribute(new Attribute("onmouseup"));
		apexselectList.addAttribute(new Attribute("onselect"));
		apexselectList.addAttribute(new Attribute("readonly"));
		apexselectList.addAttribute(new Attribute("rendered"));
		apexselectList.addAttribute(new Attribute("required"));
		apexselectList.addAttribute(new Attribute("size"));
		apexselectList.addAttribute(new Attribute("style"));
		apexselectList.addAttribute(new Attribute("styleClass"));
		apexselectList.addAttribute(new Attribute("tabindex"));
		apexselectList.addAttribute(new Attribute("title"));
		apexselectList.addAttribute(new Attribute("value"));
		tagList.add(apexselectList);
		
		
		// apex:selectRadio
		Tag apexselectRadio = new Tag("apex:selectRadio", true);
		apexselectRadio.addAttribute(new Attribute("accesskey"));
		apexselectRadio.addAttribute(new Attribute("border"));
		apexselectRadio.addAttribute(new Attribute("dir"));
		apexselectRadio.addAttribute(new Attribute("disabled"));
		apexselectRadio.addAttribute(new Attribute("disabledClass"));
		apexselectRadio.addAttribute(new Attribute("enabledClass"));
		apexselectRadio.addAttribute(new Attribute("id"));
		apexselectRadio.addAttribute(new Attribute("immediate"));
		apexselectRadio.addAttribute(new Attribute("lang"));
		apexselectRadio.addAttribute(new Attribute("layout"));
		apexselectRadio.addAttribute(new Attribute("onblur"));
		apexselectRadio.addAttribute(new Attribute("onchange"));
		apexselectRadio.addAttribute(new Attribute("onclick"));
		apexselectRadio.addAttribute(new Attribute("ondblclick"));
		apexselectRadio.addAttribute(new Attribute("onfocus"));
		apexselectRadio.addAttribute(new Attribute("onkeydown"));
		apexselectRadio.addAttribute(new Attribute("onkeypress"));
		apexselectRadio.addAttribute(new Attribute("onkeyup"));
		apexselectRadio.addAttribute(new Attribute("onmousedown"));
		apexselectRadio.addAttribute(new Attribute("onmousemove"));
		apexselectRadio.addAttribute(new Attribute("onmouseout"));
		apexselectRadio.addAttribute(new Attribute("onmouseover"));
		apexselectRadio.addAttribute(new Attribute("onmouseup"));
		apexselectRadio.addAttribute(new Attribute("onselect"));
		apexselectRadio.addAttribute(new Attribute("readonly"));
		apexselectRadio.addAttribute(new Attribute("rendered"));
		apexselectRadio.addAttribute(new Attribute("required"));
		apexselectRadio.addAttribute(new Attribute("style"));
		apexselectRadio.addAttribute(new Attribute("styleClass"));
		apexselectRadio.addAttribute(new Attribute("tabindex"));
		apexselectRadio.addAttribute(new Attribute("title"));
		apexselectRadio.addAttribute(new Attribute("value"));
		tagList.add(apexselectRadio);
		// apex:actionFunction CHILDS
		Tag apexactionFunction = new Tag("apex:actionFunction", true);
		apexactionFunction.addAttribute(new Attribute("action"));
		apexactionFunction.addAttribute(new Attribute("focus"));
		apexactionFunction.addAttribute(new Attribute("id"));
		apexactionFunction.addAttribute(new Attribute("immediate"));
		apexactionFunction.addAttribute(new Attribute("name"));
		apexactionFunction.addAttribute(new Attribute("onbeforedomupdate"));
		apexactionFunction.addAttribute(new Attribute("oncomplete"));
		apexactionFunction.addAttribute(new Attribute("rendered"));
		apexactionFunction.addAttribute(new Attribute("reRender"));
		apexactionFunction.addAttribute(new Attribute("status"));
		apexactionFunction.addAttribute(new Attribute("timeout"));
		tagList.add(apexactionFunction);
		
		// apex:commandButton Element 
		Tag apexcommandButton = new Tag("apex:commandButton", true);
		apexcommandButton.addAttribute(new Attribute("accesskey"));
		apexcommandButton.addAttribute(new Attribute("action"));
		apexcommandButton.addAttribute(new Attribute("alt"));
		apexcommandButton.addAttribute(new Attribute("dir"));
		apexcommandButton.addAttribute(new Attribute("disabled"));
		apexcommandButton.addAttribute(new Attribute("id"));
		apexcommandButton.addAttribute(new Attribute("image"));
		apexcommandButton.addAttribute(new Attribute("immediate"));
		apexcommandButton.addAttribute(new Attribute("lang"));
		apexcommandButton.addAttribute(new Attribute("onblur"));
		apexcommandButton.addAttribute(new Attribute("onclick"));
		apexcommandButton.addAttribute(new Attribute("oncomplete"));
		apexcommandButton.addAttribute(new Attribute("ondblclick"));
		apexcommandButton.addAttribute(new Attribute("onfocus"));
		apexcommandButton.addAttribute(new Attribute("onkeydown"));
		apexcommandButton.addAttribute(new Attribute("onkeypress"));
		apexcommandButton.addAttribute(new Attribute("onkeyup"));
		apexcommandButton.addAttribute(new Attribute("onmousedown"));
		apexcommandButton.addAttribute(new Attribute("onmousemove"));
		apexcommandButton.addAttribute(new Attribute("onmouseout"));
		apexcommandButton.addAttribute(new Attribute("onmouseover"));
		apexcommandButton.addAttribute(new Attribute("onmouseup"));
		apexcommandButton.addAttribute(new Attribute("rendered"));
		apexcommandButton.addAttribute(new Attribute("reRender"));
		apexcommandButton.addAttribute(new Attribute("status"));
		apexcommandButton.addAttribute(new Attribute("style"));
		apexcommandButton.addAttribute(new Attribute("styleClass"));
		apexcommandButton.addAttribute(new Attribute("tabindex"));
		apexcommandButton.addAttribute(new Attribute("timeout"));
		apexcommandButton.addAttribute(new Attribute("title"));
		apexcommandButton.addAttribute(new Attribute("value"));
		tagList.add(apexcommandButton);
		
		// apex:commandLink ELEMENT
		Tag apexcommandLink = new Tag("apex:commandLink", true);
		apexcommandLink.addAttribute(new Attribute("accesskey"));
		apexcommandLink.addAttribute(new Attribute("action"));
		apexcommandLink.addAttribute(new Attribute("charset"));
		apexcommandLink.addAttribute(new Attribute("coords"));
		apexcommandLink.addAttribute(new Attribute("dir"));
		apexcommandLink.addAttribute(new Attribute("hreflang"));
		apexcommandLink.addAttribute(new Attribute("id"));
		apexcommandLink.addAttribute(new Attribute("immediate"));
		apexcommandLink.addAttribute(new Attribute("lang"));
		apexcommandLink.addAttribute(new Attribute("onblur"));
		apexcommandLink.addAttribute(new Attribute("onclick"));
		apexcommandLink.addAttribute(new Attribute("oncomplete"));
		apexcommandLink.addAttribute(new Attribute("ondblclick"));
		apexcommandLink.addAttribute(new Attribute("onfocus"));
		apexcommandLink.addAttribute(new Attribute("onkeydown"));
		apexcommandLink.addAttribute(new Attribute("onkeypress"));
		apexcommandLink.addAttribute(new Attribute("onkeyup"));
		apexcommandLink.addAttribute(new Attribute("onmousedown"));
		apexcommandLink.addAttribute(new Attribute("onmousemove"));
		apexcommandLink.addAttribute(new Attribute("onmouseout"));
		apexcommandLink.addAttribute(new Attribute("onmouseover"));
		apexcommandLink.addAttribute(new Attribute("onmouseup"));
		apexcommandLink.addAttribute(new Attribute("rel"));
		apexcommandLink.addAttribute(new Attribute("rev"));
		apexcommandLink.addAttribute(new Attribute("shape"));
		apexcommandLink.addAttribute(new Attribute("rendered"));
		apexcommandLink.addAttribute(new Attribute("reRender"));
		apexcommandLink.addAttribute(new Attribute("status"));
		apexcommandLink.addAttribute(new Attribute("style"));
		apexcommandLink.addAttribute(new Attribute("styleClass"));
		apexcommandLink.addAttribute(new Attribute("tabindex"));
		apexcommandLink.addAttribute(new Attribute("target"));
		apexcommandLink.addAttribute(new Attribute("timeout"));
		apexcommandLink.addAttribute(new Attribute("title"));
		apexcommandLink.addAttribute(new Attribute("type"));
		apexcommandLink.addAttribute(new Attribute("value"));
		tagList.add(apexcommandLink);		
		
		// actionPoller ELEMENT
		Tag apexactionPoller = new Tag("apex:actionPoller", true);
		apexactionPoller.addAttribute(new Attribute("action"));
		apexactionPoller.addAttribute(new Attribute("enabled"));
		apexactionPoller.addAttribute(new Attribute("id"));
		apexactionPoller.addAttribute(new Attribute("interval"));
		apexactionPoller.addAttribute(new Attribute("oncomplete"));
		apexactionPoller.addAttribute(new Attribute("onsubmit"));
		apexactionPoller.addAttribute(new Attribute("rendered"));
		apexactionPoller.addAttribute(new Attribute("reRender"));
		apexactionPoller.addAttribute(new Attribute("status"));
		apexactionPoller.addAttribute(new Attribute("timeout"));
		tagList.add(apexactionPoller);	
		
		//apex:actionRegion ELEMENT
		Tag apexactionRegion = new Tag("apex:actionRegion", true);
		apexactionRegion.addAttribute(new Attribute("id"));
		apexactionRegion.addAttribute(new Attribute("immediate"));
		apexactionRegion.addAttribute(new Attribute("rendered"));
		apexactionRegion.addAttribute(new Attribute("renderRegionOnly"));
		tagList.add(apexactionRegion);	
		
		// apex:actionStatus ELEMENT
		Tag apexactionStatus = new Tag("apex:actionStatus", true);
		apexactionStatus.addAttribute(new Attribute("dir"));
		apexactionStatus.addAttribute(new Attribute("for"));
		apexactionStatus.addAttribute(new Attribute("id"));
		apexactionStatus.addAttribute(new Attribute("lang"));
		apexactionStatus.addAttribute(new Attribute("layout"));
		apexactionStatus.addAttribute(new Attribute("onclick"));
		apexactionStatus.addAttribute(new Attribute("ondblclick"));
		apexactionStatus.addAttribute(new Attribute("onkeydown"));
		apexactionStatus.addAttribute(new Attribute("onkeypress"));
		apexactionStatus.addAttribute(new Attribute("onkeyup"));
		apexactionStatus.addAttribute(new Attribute("onmousedown"));
		apexactionStatus.addAttribute(new Attribute("onmousemove"));
		apexactionStatus.addAttribute(new Attribute("onmouseout"));
		apexactionStatus.addAttribute(new Attribute("onmouseover"));
		apexactionStatus.addAttribute(new Attribute("onmouseup"));
		apexactionStatus.addAttribute(new Attribute("onstart"));
		apexactionStatus.addAttribute(new Attribute("onstop"));
		apexactionStatus.addAttribute(new Attribute("rendered"));
		apexactionStatus.addAttribute(new Attribute("startStyle"));
		apexactionStatus.addAttribute(new Attribute("startStyleClass"));
		apexactionStatus.addAttribute(new Attribute("startText"));
		apexactionStatus.addAttribute(new Attribute("stopStyle"));
		apexactionStatus.addAttribute(new Attribute("stopStyleClass"));
		apexactionStatus.addAttribute(new Attribute("stopText"));
		apexactionStatus.addAttribute(new Attribute("style"));
		apexactionStatus.addAttribute(new Attribute("styleClass"));
		apexactionStatus.addAttribute(new Attribute("title"));
		tagList.add(apexactionStatus);			
		
		// apex:actionSupport ELEMENT
		Tag apexactionSupport = new Tag("apex:actionSupport", true);
		apexactionSupport.addAttribute(new Attribute("action"));
		apexactionSupport.addAttribute(new Attribute("disabled"));
		apexactionSupport.addAttribute(new Attribute("disableDefault"));
		apexactionSupport.addAttribute(new Attribute("event"));
		apexactionSupport.addAttribute(new Attribute("focus"));
		apexactionSupport.addAttribute(new Attribute("id"));
		apexactionSupport.addAttribute(new Attribute("immediate"));
		apexactionSupport.addAttribute(new Attribute("onbeforedomupdate"));
		apexactionSupport.addAttribute(new Attribute("oncomplete"));
		apexactionSupport.addAttribute(new Attribute("onsubmit"));
		apexactionSupport.addAttribute(new Attribute("rendered"));
		apexactionSupport.addAttribute(new Attribute("reRender"));
		apexactionSupport.addAttribute(new Attribute("status"));
		apexactionSupport.addAttribute(new Attribute("timeout"));
		tagList.add(apexactionSupport);		
		
		// apex:detail Element
		Tag apexdetail = new Tag("apex:detail", true);
		apexdetail.addAttribute(new Attribute("id"));
		apexdetail.addAttribute(new Attribute("inlineEdit"));
		apexdetail.addAttribute(new Attribute("oncomplete"));
		apexdetail.addAttribute(new Attribute("relatedList"));
		apexdetail.addAttribute(new Attribute("relatedListHover"));
		apexdetail.addAttribute(new Attribute("rendered"));
		apexdetail.addAttribute(new Attribute("rerender"));
		apexdetail.addAttribute(new Attribute("showChatter"));
		apexdetail.addAttribute(new Attribute("subject"));
		apexdetail.addAttribute(new Attribute("title"));
		tagList.add(apexdetail);	
		
		// apex:enhancedList Element
		Tag apexenhancedList = new Tag("apex:enhancedList", true);
		apexenhancedList.addAttribute(new Attribute("customizable"));
		apexenhancedList.addAttribute(new Attribute("height"));
		apexenhancedList.addAttribute(new Attribute("id"));
		apexenhancedList.addAttribute(new Attribute("listId"));
		apexenhancedList.addAttribute(new Attribute("oncomplete"));
		apexenhancedList.addAttribute(new Attribute("rendered"));
		apexenhancedList.addAttribute(new Attribute("reRender"));
		apexenhancedList.addAttribute(new Attribute("rowsPerPage"));
		apexenhancedList.addAttribute(new Attribute("type"));
		apexenhancedList.addAttribute(new Attribute("width"));
		tagList.add(apexenhancedList);	
		
		// apex:flash Element
		Tag apexflash = new Tag("apex:flash", true);
		apexflash.addAttribute(new Attribute("flashvars"));
		apexflash.addAttribute(new Attribute("height"));
		apexflash.addAttribute(new Attribute("id"));
		apexflash.addAttribute(new Attribute("loop"));
		apexflash.addAttribute(new Attribute("play"));
		apexflash.addAttribute(new Attribute("rendered"));
		apexflash.addAttribute(new Attribute("src"));
		apexflash.addAttribute(new Attribute("width"));
		tagList.add(apexflash);	
		
		// apex:iframe Element
		Tag apexiframe = new Tag("apex:iframe", true);
		apexiframe.addAttribute(new Attribute("frameborder"));
		apexiframe.addAttribute(new Attribute("height"));
		apexiframe.addAttribute(new Attribute("id"));
		apexiframe.addAttribute(new Attribute("rendered"));
		apexiframe.addAttribute(new Attribute("scrolling"));
		apexiframe.addAttribute(new Attribute("src"));
		apexiframe.addAttribute(new Attribute("title"));
		apexiframe.addAttribute(new Attribute("width"));
		tagList.add(apexiframe);	
		
		// apex:image ELEMENT
		Tag apeximage = new Tag("apex:image", true);
		apeximage.addAttribute(new Attribute("alt"));
		apeximage.addAttribute(new Attribute("dir"));
		apeximage.addAttribute(new Attribute("height"));
		apeximage.addAttribute(new Attribute("id"));
		apeximage.addAttribute(new Attribute("ismap"));
		apeximage.addAttribute(new Attribute("lang"));
		apeximage.addAttribute(new Attribute("longdesc"));
		apeximage.addAttribute(new Attribute("onclick"));
		apeximage.addAttribute(new Attribute("ondblclick"));
		apeximage.addAttribute(new Attribute("onkeydown"));
		apeximage.addAttribute(new Attribute("onkeypress"));
		apeximage.addAttribute(new Attribute("onkeyup"));
		apeximage.addAttribute(new Attribute("onmousedown"));
		apeximage.addAttribute(new Attribute("onmousemove"));
		apeximage.addAttribute(new Attribute("onmouseout"));
		apeximage.addAttribute(new Attribute("onmouseover"));
		apeximage.addAttribute(new Attribute("onmouseup"));
		apeximage.addAttribute(new Attribute("rendered"));
		apeximage.addAttribute(new Attribute("style"));
		apeximage.addAttribute(new Attribute("styleClass"));
		apeximage.addAttribute(new Attribute("title"));
		apeximage.addAttribute(new Attribute("url"));
		apeximage.addAttribute(new Attribute("usemap"));
		apeximage.addAttribute(new Attribute("value"));
		apeximage.addAttribute(new Attribute("width"));
		tagList.add(apeximage);	
		
		//apex:include ELEMENT
		Tag apexinclude = new Tag("apex:include", true);
		apexinclude.addAttribute(new Attribute("id"));
		apexinclude.addAttribute(new Attribute("pageName"));
		apexinclude.addAttribute(new Attribute("rendered"));
		tagList.add(apexinclude);	
		
		// apex:includeScript Element 
		Tag apexincludeScript = new Tag("apex:includeScript", true);
		apexincludeScript.addAttribute(new Attribute("id"));
		apexincludeScript.addAttribute(new Attribute("value"));
		tagList.add(apexincludeScript);
		
		// apex:message Element 
		Tag apexmessage = new Tag("apex:message", true);
		apexmessage.addAttribute(new Attribute("dir"));
		apexmessage.addAttribute(new Attribute("for"));
		apexmessage.addAttribute(new Attribute("id"));
		apexmessage.addAttribute(new Attribute("lang"));
		apexmessage.addAttribute(new Attribute("rendered"));
		apexmessage.addAttribute(new Attribute("style"));
		apexmessage.addAttribute(new Attribute("styleClass"));
		apexmessage.addAttribute(new Attribute("title"));
		tagList.add(apexmessage);
		
		// apex:messages Element 
		Tag apexmessages = new Tag("apex:messages", true);
		apexmessages.addAttribute(new Attribute("dir"));
		apexmessages.addAttribute(new Attribute("globalOnly"));
		apexmessages.addAttribute(new Attribute("id"));
		apexmessages.addAttribute(new Attribute("lang"));
		apexmessages.addAttribute(new Attribute("layout"));
		apexmessages.addAttribute(new Attribute("rendered"));
		apexmessages.addAttribute(new Attribute("style"));
		apexmessages.addAttribute(new Attribute("styleClass"));
		apexmessages.addAttribute(new Attribute("title"));
		tagList.add(apexmessages);
		
		//apex:stylesheet ELEMENT
		Tag apexstylesheet = new Tag("apex:stylesheet", true);
		apexstylesheet.addAttribute(new Attribute("id"));
		apexstylesheet.addAttribute(new Attribute("value"));
		tagList.add(apexstylesheet);
		
		// apex:tabPanel ELEMENT
		Tag apextabPanel = new Tag("apex:tabPanel", true);
		apextabPanel.addAttribute(new Attribute("activeTabClass"));
		apextabPanel.addAttribute(new Attribute("contentClass"));
		apextabPanel.addAttribute(new Attribute("contentStyle"));
		apextabPanel.addAttribute(new Attribute("dir"));
		apextabPanel.addAttribute(new Attribute("disabledTabClass"));
		apextabPanel.addAttribute(new Attribute("headerAlignment"));
		apextabPanel.addAttribute(new Attribute("headerClass"));
		apextabPanel.addAttribute(new Attribute("headerSpacing"));
		apextabPanel.addAttribute(new Attribute("height"));
		apextabPanel.addAttribute(new Attribute("id"));
		apextabPanel.addAttribute(new Attribute("immediate"));
		apextabPanel.addAttribute(new Attribute("inactiveTabClass"));
		apextabPanel.addAttribute(new Attribute("lang"));
		apextabPanel.addAttribute(new Attribute("onclick"));
		apextabPanel.addAttribute(new Attribute("ondblclick"));
		apextabPanel.addAttribute(new Attribute("onkeydown"));
		apextabPanel.addAttribute(new Attribute("onkeypress"));
		apextabPanel.addAttribute(new Attribute("onkeyup"));
		apextabPanel.addAttribute(new Attribute("onmousedown"));
		apextabPanel.addAttribute(new Attribute("onmousemove"));
		apextabPanel.addAttribute(new Attribute("onmouseout"));
		apextabPanel.addAttribute(new Attribute("onmouseover"));
		apextabPanel.addAttribute(new Attribute("onmouseup"));
		apextabPanel.addAttribute(new Attribute("rendered"));
		apextabPanel.addAttribute(new Attribute("reRender"));
		apextabPanel.addAttribute(new Attribute("selectedTab"));
		apextabPanel.addAttribute(new Attribute("style"));
		apextabPanel.addAttribute(new Attribute("styleClass"));
		apextabPanel.addAttribute(new Attribute("switchType"));
		apextabPanel.addAttribute(new Attribute("tabClass"));
		apextabPanel.addAttribute(new Attribute("title"));
		apextabPanel.addAttribute(new Attribute("value"));
		apextabPanel.addAttribute(new Attribute("width"));
		tagList.add(apextabPanel);
		// apex:tab ELEMENT
		Tag apextab = new Tag("apex:tab", true);
		apextab.addAttribute(new Attribute("disabled"));
		apextab.addAttribute(new Attribute("focus"));
		apextab.addAttribute(new Attribute("id"));
		apextab.addAttribute(new Attribute("immediate"));
		apextab.addAttribute(new Attribute("label"));
		apextab.addAttribute(new Attribute("labelWidth"));
		apextab.addAttribute(new Attribute("name"));
		apextab.addAttribute(new Attribute("onclick"));
		apextab.addAttribute(new Attribute("oncomplete"));
		apextab.addAttribute(new Attribute("ondblclick"));
		apextab.addAttribute(new Attribute("onkeydown"));
		apextab.addAttribute(new Attribute("onkeypress"));
		apextab.addAttribute(new Attribute("onkeyup"));
		apextab.addAttribute(new Attribute("onmousedown"));
		apextab.addAttribute(new Attribute("onmousemove"));
		apextab.addAttribute(new Attribute("onmouseout"));
		apextab.addAttribute(new Attribute("onmouseover"));
		apextab.addAttribute(new Attribute("onmouseup"));
		apextab.addAttribute(new Attribute("ontabenter"));
		apextab.addAttribute(new Attribute("ontableave"));
		apextab.addAttribute(new Attribute("rendered"));
		apextab.addAttribute(new Attribute("reRender"));
		apextab.addAttribute(new Attribute("status"));
		apextab.addAttribute(new Attribute("style"));
		apextab.addAttribute(new Attribute("styleClass"));
		apextab.addAttribute(new Attribute("switchType"));
		apextab.addAttribute(new Attribute("timeout"));
		apextab.addAttribute(new Attribute("title"));
		tagList.add(apextab);
		// apex:toolbar Element
		Tag apextoolbar = new Tag("apex:toolbar", true);
		apextoolbar.addAttribute(new Attribute("contentClass"));
		apextoolbar.addAttribute(new Attribute("contentStyle"));
		apextoolbar.addAttribute(new Attribute("height"));
		apextoolbar.addAttribute(new Attribute("id"));
		apextoolbar.addAttribute(new Attribute("itemSeparator"));
		apextoolbar.addAttribute(new Attribute("onclick"));
		apextoolbar.addAttribute(new Attribute("ondblclick"));
		apextoolbar.addAttribute(new Attribute("onitemclick"));
		apextoolbar.addAttribute(new Attribute("onitemdblclick"));
		apextoolbar.addAttribute(new Attribute("onitemkeydown"));
		apextoolbar.addAttribute(new Attribute("onitemkeypress"));
		apextoolbar.addAttribute(new Attribute("onitemkeyup"));
		apextoolbar.addAttribute(new Attribute("onitemmousedown"));
		apextoolbar.addAttribute(new Attribute("onitemmousemove"));
		apextoolbar.addAttribute(new Attribute("onitemmouseout"));
		apextoolbar.addAttribute(new Attribute("onitemmouseover"));
		apextoolbar.addAttribute(new Attribute("onitemmouseup"));
		apextoolbar.addAttribute(new Attribute("onkeydown"));
		apextoolbar.addAttribute(new Attribute("onkeypress"));
		apextoolbar.addAttribute(new Attribute("onkeyup"));
		apextoolbar.addAttribute(new Attribute("onmousedown"));
		apextoolbar.addAttribute(new Attribute("onmousemove"));
		apextoolbar.addAttribute(new Attribute("onmouseout"));
		apextoolbar.addAttribute(new Attribute("onmouseover"));
		apextoolbar.addAttribute(new Attribute("onmouseup"));
		apextoolbar.addAttribute(new Attribute("rendered"));
		apextoolbar.addAttribute(new Attribute("separatorClass"));
		apextoolbar.addAttribute(new Attribute("style"));
		apextoolbar.addAttribute(new Attribute("styleClass"));
		apextoolbar.addAttribute(new Attribute("width"));
		tagList.add(apextoolbar);
		
		// apex:toolbarGroup ELEMENT
		Tag apextoolbarGroup = new Tag("apex:toolbarGroup", true);
		apextoolbarGroup.addAttribute(new Attribute("id"));
		apextoolbarGroup.addAttribute(new Attribute("itemSeparator"));
		apextoolbarGroup.addAttribute(new Attribute("location"));
		apextoolbarGroup.addAttribute(new Attribute("onclick"));
		apextoolbarGroup.addAttribute(new Attribute("ondblclick"));
		apextoolbarGroup.addAttribute(new Attribute("onkeydown"));
		apextoolbarGroup.addAttribute(new Attribute("onkeypress"));
		apextoolbarGroup.addAttribute(new Attribute("onkeyup"));
		apextoolbarGroup.addAttribute(new Attribute("onmousedown"));
		apextoolbarGroup.addAttribute(new Attribute("onmousemove"));
		apextoolbarGroup.addAttribute(new Attribute("onmouseout"));
		apextoolbarGroup.addAttribute(new Attribute("onmouseover"));
		apextoolbarGroup.addAttribute(new Attribute("onmouseup"));
		apextoolbarGroup.addAttribute(new Attribute("rendered"));
		apextoolbarGroup.addAttribute(new Attribute("separatorClass"));
		apextoolbarGroup.addAttribute(new Attribute("style"));
		apextoolbarGroup.addAttribute(new Attribute("styleClass"));
		tagList.add(apextoolbarGroup);
		
		// apex:variable Element
		Tag apexvariable = new Tag("apex:variable", true);
		apexvariable.addAttribute(new Attribute("id"));
		apexvariable.addAttribute(new Attribute("rendered"));
		apexvariable.addAttribute(new Attribute("value"));
		apexvariable.addAttribute(new Attribute("var"));
		tagList.add(apexvariable);
		
		// apex:vote Element
		Tag apexvote = new Tag("apex:vote", true);
		apexvote.addAttribute(new Attribute("id"));
		apexvote.addAttribute(new Attribute("objectId"));
		apexvote.addAttribute(new Attribute("rendered"));
		apexvote.addAttribute(new Attribute("rerender"));
		tagList.add(apexvote);
		
		// chatter:feed Element
		Tag chatterfeed = new Tag("chatter:feed", true);
		chatterfeed.addAttribute(new Attribute("entityId"));
		chatterfeed.addAttribute(new Attribute("id"));
		chatterfeed.addAttribute(new Attribute("onComplete"));
		chatterfeed.addAttribute(new Attribute("rendered"));
		chatterfeed.addAttribute(new Attribute("reRender"));
		tagList.add(chatterfeed);
		
		// chatter:feedWithFollowers Element
		Tag chatterfeedWithFollowers = new Tag("chatter:feedWithFollowers", true);
		chatterfeedWithFollowers.addAttribute(new Attribute("entityId"));
		chatterfeedWithFollowers.addAttribute(new Attribute("id"));
		chatterfeedWithFollowers.addAttribute(new Attribute("onComplete"));
		chatterfeedWithFollowers.addAttribute(new Attribute("rendered"));
		chatterfeedWithFollowers.addAttribute(new Attribute("reRender"));
		chatterfeedWithFollowers.addAttribute(new Attribute("showHeader"));
		tagList.add(chatterfeedWithFollowers);
		
		// chatter:follow Element
		Tag chatterfollow = new Tag("chatter:follow", true);
		chatterfollow.addAttribute(new Attribute("entityId"));
		chatterfollow.addAttribute(new Attribute("id"));
		chatterfollow.addAttribute(new Attribute("onComplete"));
		chatterfollow.addAttribute(new Attribute("rendered"));
		chatterfollow.addAttribute(new Attribute("reRender"));
		tagList.add(chatterfollow);
		
		// chatter:followers Element
		Tag chatterfollowers = new Tag("chatter:followers", true);
		chatterfollowers.addAttribute(new Attribute("entityId"));
		chatterfollowers.addAttribute(new Attribute("id"));
		chatterfollowers.addAttribute(new Attribute("rendered"));
		tagList.add(chatterfollowers);
		
		// flow:interview Element
		Tag flowinterview = new Tag("flow:interview", true);
		flowinterview.addAttribute(new Attribute("buttonStyle"));
		flowinterview.addAttribute(new Attribute("finishLocation"));
		flowinterview.addAttribute(new Attribute("id"));
		flowinterview.addAttribute(new Attribute("interview"));
		flowinterview.addAttribute(new Attribute("name"));
		flowinterview.addAttribute(new Attribute("rendered"));
		flowinterview.addAttribute(new Attribute("rerender"));
		flowinterview.addAttribute(new Attribute("showHelp"));
		tagList.add(flowinterview);
		
		// flow:interview Element
		Tag ideasdetailOutputLink = new Tag("ideas:detailOutputLink", true);
		ideasdetailOutputLink.addAttribute(new Attribute("id"));
		ideasdetailOutputLink.addAttribute(new Attribute("ideaId"));
		ideasdetailOutputLink.addAttribute(new Attribute("page"));
		ideasdetailOutputLink.addAttribute(new Attribute("pageNumber"));
		ideasdetailOutputLink.addAttribute(new Attribute("pageOffset"));
		ideasdetailOutputLink.addAttribute(new Attribute("rendered"));
		ideasdetailOutputLink.addAttribute(new Attribute("style"));
		ideasdetailOutputLink.addAttribute(new Attribute("styleClass"));
		tagList.add(ideasdetailOutputLink);
		
		// ideas:listOutputLink Element
		Tag ideaslistOutputLink = new Tag("ideas:listOutputLink", true);
		ideaslistOutputLink.addAttribute(new Attribute("category"));
		ideaslistOutputLink.addAttribute(new Attribute("communityId"));
		ideaslistOutputLink.addAttribute(new Attribute("id"));
		ideaslistOutputLink.addAttribute(new Attribute("page"));
		ideaslistOutputLink.addAttribute(new Attribute("pageNumber"));
		ideaslistOutputLink.addAttribute(new Attribute("pageOffset"));
		ideaslistOutputLink.addAttribute(new Attribute("rendered"));
		ideaslistOutputLink.addAttribute(new Attribute("sort"));
		ideaslistOutputLink.addAttribute(new Attribute("status"));
		ideaslistOutputLink.addAttribute(new Attribute("stickyAttributes"));
		ideaslistOutputLink.addAttribute(new Attribute("style"));
		ideaslistOutputLink.addAttribute(new Attribute("styleClass"));
		tagList.add(ideaslistOutputLink);
		
		// ideas:profileListOutputLink Element
		Tag ideasprofileListOutputLink = new Tag("ideas:profileListOutputLink", true);
		ideasprofileListOutputLink.addAttribute(new Attribute("communityId"));
		ideasprofileListOutputLink.addAttribute(new Attribute("id"));
		ideasprofileListOutputLink.addAttribute(new Attribute("page"));
		ideasprofileListOutputLink.addAttribute(new Attribute("pageNumber"));
		ideasprofileListOutputLink.addAttribute(new Attribute("pageOffset"));
		ideasprofileListOutputLink.addAttribute(new Attribute("rendered"));
		ideasprofileListOutputLink.addAttribute(new Attribute("sort"));
		ideasprofileListOutputLink.addAttribute(new Attribute("stickyAttributes"));
		ideasprofileListOutputLink.addAttribute(new Attribute("style"));
		ideasprofileListOutputLink.addAttribute(new Attribute("styleClass"));
		ideasprofileListOutputLink.addAttribute(new Attribute("userId"));
		tagList.add(ideasprofileListOutputLink);
		
		// knowledge:articleCaseToolbar 
		Tag knowledgearticleCaseToolbar = new Tag("knowledge:articleCaseToolbar", true);
		knowledgearticleCaseToolbar.addAttribute(new Attribute("articleId"));
		knowledgearticleCaseToolbar.addAttribute(new Attribute("caseId"));
		knowledgearticleCaseToolbar.addAttribute(new Attribute("id"));
		knowledgearticleCaseToolbar.addAttribute(new Attribute("includeCSS"));
		knowledgearticleCaseToolbar.addAttribute(new Attribute("rendered"));
		tagList.add(knowledgearticleCaseToolbar);
		
		// knowledge:articleList Element 
		Tag knowledgearticleList = new Tag("knowledge:articleList", true);
		knowledgearticleList.addAttribute(new Attribute("articleTypes"));
		knowledgearticleList.addAttribute(new Attribute("articleVar"));
		knowledgearticleList.addAttribute(new Attribute("categories"));
		knowledgearticleList.addAttribute(new Attribute("hasMoreVar"));
		knowledgearticleList.addAttribute(new Attribute("id"));
		knowledgearticleList.addAttribute(new Attribute("keyword"));
		knowledgearticleList.addAttribute(new Attribute("language"));
		knowledgearticleList.addAttribute(new Attribute("pageNumber"));
		knowledgearticleList.addAttribute(new Attribute("pageSize"));
		knowledgearticleList.addAttribute(new Attribute("rendered"));
		knowledgearticleList.addAttribute(new Attribute("sortBy"));
		tagList.add(knowledgearticleList);
		
		// knowledge:articleRendererToolbar Element
		
		Tag knowledgearticleRendererToolbar = new Tag("knowledge:articleRendererToolbar", true);
		knowledgearticleRendererToolbar.addAttribute(new Attribute("articleId"));
		knowledgearticleRendererToolbar.addAttribute(new Attribute("canVote"));
		knowledgearticleRendererToolbar.addAttribute(new Attribute("id"));
		knowledgearticleRendererToolbar.addAttribute(new Attribute("includeCSS"));
		knowledgearticleRendererToolbar.addAttribute(new Attribute("rendered"));
		knowledgearticleRendererToolbar.addAttribute(new Attribute("showChatter"));
		tagList.add(knowledgearticleRendererToolbar);
		
		// knowledge:articleTypeList Element 

		Tag knowledgearticleTypeList = new Tag("knowledge:articleTypeList", true);
		knowledgearticleTypeList.addAttribute(new Attribute("articleTypeVar"));
		knowledgearticleTypeList.addAttribute(new Attribute("id"));
		knowledgearticleTypeList.addAttribute(new Attribute("rendered"));
		tagList.add(knowledgearticleTypeList);
		// knowledge:categoryList Element 
		
		Tag knowledgecategoryList = new Tag("knowledge:categoryList", true);
		knowledgecategoryList.addAttribute(new Attribute("ancestorsOf"));
		knowledgecategoryList.addAttribute(new Attribute("categoryGroup"));
		knowledgecategoryList.addAttribute(new Attribute("categoryVar"));
		knowledgecategoryList.addAttribute(new Attribute("id"));
		knowledgecategoryList.addAttribute(new Attribute("level"));
		knowledgecategoryList.addAttribute(new Attribute("rendered"));
		knowledgecategoryList.addAttribute(new Attribute("rootCategory"));
		tagList.add(knowledgecategoryList);
		
		// messaging:attachment Element
		Tag messagingattachment = new Tag("messaging:attachment", true);
		messagingattachment.addAttribute(new Attribute("filename"));
		messagingattachment.addAttribute(new Attribute("id"));
		messagingattachment.addAttribute(new Attribute("inline"));
		messagingattachment.addAttribute(new Attribute("renderAs"));
		messagingattachment.addAttribute(new Attribute("rendered"));
		tagList.add(messagingattachment);
		
		// messaging:emailHeader Element 
		Tag messagingemailHeader = new Tag("messaging:emailHeader", true);
		messagingemailHeader.addAttribute(new Attribute("id"));
		messagingemailHeader.addAttribute(new Attribute("name"));
		messagingemailHeader.addAttribute(new Attribute("rendered"));
		tagList.add(messagingemailHeader);
		
		// messaging:emailTemplate Element
		Tag messagingemailTemplate = new Tag("messaging:emailTemplate", true);
		messagingemailTemplate.addAttribute(new Attribute("id"));
		messagingemailTemplate.addAttribute(new Attribute("language"));
		messagingemailTemplate.addAttribute(new Attribute("recipientType"));
		messagingemailTemplate.addAttribute(new Attribute("relatedToType"));
		messagingemailTemplate.addAttribute(new Attribute("rendered"));
		messagingemailTemplate.addAttribute(new Attribute("replyTo"));
		messagingemailTemplate.addAttribute(new Attribute("subject"));
		tagList.add(messagingemailTemplate);
		
		// messaging:htmlEmailBody Element
		Tag messaginghtmlEmailBody = new Tag("messaging:htmlEmailBody", true);
		messaginghtmlEmailBody.addAttribute(new Attribute("id"));
		messaginghtmlEmailBody.addAttribute(new Attribute("rendered"));
		tagList.add(messaginghtmlEmailBody);
		
		// messaging:plainTextEmailBody Element
		Tag messagingplainTextEmailBody = new Tag("messaging:plainTextEmailBody", true);
		messagingplainTextEmailBody.addAttribute(new Attribute("id"));
		messagingplainTextEmailBody.addAttribute(new Attribute("rendered"));
		tagList.add(messagingplainTextEmailBody);
		
		// site:googleAnalyticsTracking Element
		Tag sitegoogleAnalyticsTracking = new Tag("site:googleAnalyticsTracking", true);
		sitegoogleAnalyticsTracking.addAttribute(new Attribute("id"));
		sitegoogleAnalyticsTracking.addAttribute(new Attribute("rendered"));
		tagList.add(sitegoogleAnalyticsTracking);
		
		//site:previewAsAdmin
		Tag sitepreviewAsAdmin = new Tag("site:previewAsAdmin", true);
		sitepreviewAsAdmin.addAttribute(new Attribute("id"));
		sitepreviewAsAdmin.addAttribute(new Attribute("rendered"));
		tagList.add(sitepreviewAsAdmin);
		
		// apex:listViews Element
		Tag apexlistViews = new Tag("apex:listViews", true);
		apexlistViews.addAttribute(new Attribute("id"));
		apexlistViews.addAttribute(new Attribute("rendered"));
		apexlistViews.addAttribute(new Attribute("type"));
		tagList.add(apexlistViews);
		
		// apex:outputField Element
		Tag apexoutputField = new Tag("apex:outputField", true);
		apexoutputField.addAttribute(new Attribute("dir"));
		apexoutputField.addAttribute(new Attribute("id"));
		apexoutputField.addAttribute(new Attribute("lang"));
		apexoutputField.addAttribute(new Attribute("rendered"));
		apexoutputField.addAttribute(new Attribute("style"));
		apexoutputField.addAttribute(new Attribute("styleClass"));
		apexoutputField.addAttribute(new Attribute("title"));
		apexoutputField.addAttribute(new Attribute("value"));
		tagList.add(apexoutputField);
		
		// apex:outputLabel Element
		Tag apexoutputLabel = new Tag("apex:outputLabel", true);
		apexoutputLabel.addAttribute(new Attribute("accesskey"));
		apexoutputLabel.addAttribute(new Attribute("dir"));
		apexoutputLabel.addAttribute(new Attribute("escape"));
		apexoutputLabel.addAttribute(new Attribute("for"));
		apexoutputLabel.addAttribute(new Attribute("id"));
		apexoutputLabel.addAttribute(new Attribute("lang"));
		apexoutputLabel.addAttribute(new Attribute("onblur"));
		apexoutputLabel.addAttribute(new Attribute("onclick"));
		apexoutputLabel.addAttribute(new Attribute("ondblclick"));
		apexoutputLabel.addAttribute(new Attribute("onfocus"));
		apexoutputLabel.addAttribute(new Attribute("onkeydown"));
		apexoutputLabel.addAttribute(new Attribute("onkeypress"));
		apexoutputLabel.addAttribute(new Attribute("onkeyup"));
		apexoutputLabel.addAttribute(new Attribute("onmousedown"));
		apexoutputLabel.addAttribute(new Attribute("onmousemove"));
		apexoutputLabel.addAttribute(new Attribute("onmouseout"));
		apexoutputLabel.addAttribute(new Attribute("onmouseover"));
		apexoutputLabel.addAttribute(new Attribute("onmouseup"));
		apexoutputLabel.addAttribute(new Attribute("rendered"));
		apexoutputLabel.addAttribute(new Attribute("style"));
		apexoutputLabel.addAttribute(new Attribute("styleClass"));
		apexoutputLabel.addAttribute(new Attribute("tabindex"));
		apexoutputLabel.addAttribute(new Attribute("title"));
		apexoutputLabel.addAttribute(new Attribute("value"));
		tagList.add(apexoutputLabel);
		
		// apex:outputLink Element
		Tag apexoutputLink = new Tag("apex:outputLink", true);
		apexoutputLink.addAttribute(new Attribute("accesskey"));
		apexoutputLink.addAttribute(new Attribute("charset"));
		apexoutputLink.addAttribute(new Attribute("coords"));
		apexoutputLink.addAttribute(new Attribute("dir"));
		apexoutputLink.addAttribute(new Attribute("disabled"));
		apexoutputLink.addAttribute(new Attribute("hreflang"));
		apexoutputLink.addAttribute(new Attribute("id"));
		apexoutputLink.addAttribute(new Attribute("lang"));
		apexoutputLink.addAttribute(new Attribute("onblur"));
		apexoutputLink.addAttribute(new Attribute("onclick"));
		apexoutputLink.addAttribute(new Attribute("ondblclick"));
		apexoutputLink.addAttribute(new Attribute("onfocus"));
		apexoutputLink.addAttribute(new Attribute("onkeydown"));
		apexoutputLink.addAttribute(new Attribute("onkeypress"));
		apexoutputLink.addAttribute(new Attribute("onkeyup"));
		apexoutputLink.addAttribute(new Attribute("onmousedown"));
		apexoutputLink.addAttribute(new Attribute("onmousemove"));
		apexoutputLink.addAttribute(new Attribute("onmouseout"));
		apexoutputLink.addAttribute(new Attribute("onmouseover"));
		apexoutputLink.addAttribute(new Attribute("onmouseup"));
		apexoutputLink.addAttribute(new Attribute("rel"));
		apexoutputLink.addAttribute(new Attribute("rendered"));
		apexoutputLink.addAttribute(new Attribute("rev"));
		apexoutputLink.addAttribute(new Attribute("shape"));
		apexoutputLink.addAttribute(new Attribute("style"));
		apexoutputLink.addAttribute(new Attribute("styleClass"));
		apexoutputLink.addAttribute(new Attribute("tabindex"));
		apexoutputLink.addAttribute(new Attribute("target"));
		apexoutputLink.addAttribute(new Attribute("title"));
		apexoutputLink.addAttribute(new Attribute("type"));
		apexoutputLink.addAttribute(new Attribute("value"));
		tagList.add(apexoutputLink);
		
		// apex:outputPanel Element
		Tag apexoutputPanel = new Tag("apex:outputPanel", true);
		apexoutputPanel.addAttribute(new Attribute("dir"));
		apexoutputPanel.addAttribute(new Attribute("id"));
		apexoutputPanel.addAttribute(new Attribute("lang"));
		apexoutputPanel.addAttribute(new Attribute("layout"));
		apexoutputPanel.addAttribute(new Attribute("onclick"));
		apexoutputPanel.addAttribute(new Attribute("ondblclick"));
		apexoutputPanel.addAttribute(new Attribute("onkeydown"));
		apexoutputPanel.addAttribute(new Attribute("onkeypress"));
		apexoutputPanel.addAttribute(new Attribute("onkeyup"));
		apexoutputPanel.addAttribute(new Attribute("onmousedown"));
		apexoutputPanel.addAttribute(new Attribute("onmousemove"));
		apexoutputPanel.addAttribute(new Attribute("onmouseout"));
		apexoutputPanel.addAttribute(new Attribute("onmouseover"));
		apexoutputPanel.addAttribute(new Attribute("onmouseup"));
		apexoutputPanel.addAttribute(new Attribute("rendered"));
		apexoutputPanel.addAttribute(new Attribute("style"));
		apexoutputPanel.addAttribute(new Attribute("styleClass"));
		apexoutputPanel.addAttribute(new Attribute("title"));
		tagList.add(apexoutputPanel);
		
		// apex:pageMessage Element
		Tag apexpageMessage = new Tag("apex:pageMessage", true);
		apexpageMessage.addAttribute(new Attribute("detail"));
		apexpageMessage.addAttribute(new Attribute("escape"));
		apexpageMessage.addAttribute(new Attribute("id"));
		apexpageMessage.addAttribute(new Attribute("rendered"));
		apexpageMessage.addAttribute(new Attribute("severity"));
		apexpageMessage.addAttribute(new Attribute("strength"));
		apexpageMessage.addAttribute(new Attribute("summary"));
		apexpageMessage.addAttribute(new Attribute("title"));
		tagList.add(apexpageMessage);
		
		// apex:pageMessages Element
		Tag apexpageMessages = new Tag("apex:pageMessages", true);
		apexpageMessages.addAttribute(new Attribute("escape"));
		apexpageMessages.addAttribute(new Attribute("id"));
		apexpageMessages.addAttribute(new Attribute("rendered"));
		apexpageMessages.addAttribute(new Attribute("showDetail"));
		tagList.add(apexpageMessages);
		
		//apex:outputText Element 
		Tag apexoutputText = new Tag("apex:outputText", true);
		apexoutputText.addAttribute(new Attribute("dir"));
		apexoutputText.addAttribute(new Attribute("escape"));
		apexoutputText.addAttribute(new Attribute("id"));
		apexoutputText.addAttribute(new Attribute("lang"));
		apexoutputText.addAttribute(new Attribute("rendered"));
		apexoutputText.addAttribute(new Attribute("style"));
		apexoutputText.addAttribute(new Attribute("styleClass"));
		apexoutputText.addAttribute(new Attribute("title"));
		apexoutputText.addAttribute(new Attribute("value"));
		tagList.add(apexoutputText);
		
		//apex:component ELEMENT
		Tag apexcomponent = new Tag("apex:component", true);
		apexcomponent.addAttribute(new Attribute("access"));
		apexcomponent.addAttribute(new Attribute("allowDML"));
		apexcomponent.addAttribute(new Attribute("controller"));
		apexcomponent.addAttribute(new Attribute("extensions"));
		apexcomponent.addAttribute(new Attribute("id"));
		apexcomponent.addAttribute(new Attribute("language"));
		apexcomponent.addAttribute(new Attribute("rendered"));
		apexcomponent.addAttribute(new Attribute("selfClosing"));
		tagList.add(apexcomponent);
		
		// apex:componentBody
		Tag apexcomponentBody = new Tag("apex:componentBody", true);
		apexcomponentBody.addAttribute(new Attribute("id"));
		apexcomponentBody.addAttribute(new Attribute("rendered"));
		tagList.add(apexcomponentBody);
		
		// apex:attribute
		Tag apexattribute = new Tag("apex:attribute", true);
		apexcomponentBody.addAttribute(new Attribute("access"));
		apexcomponentBody.addAttribute(new Attribute("assignTo"));
		apexcomponentBody.addAttribute(new Attribute("default"));
		apexcomponentBody.addAttribute(new Attribute("description"));
		apexcomponentBody.addAttribute(new Attribute("encode"));
		apexcomponentBody.addAttribute(new Attribute("id"));
		apexcomponentBody.addAttribute(new Attribute("name"));
		apexcomponentBody.addAttribute(new Attribute("required"));
		apexcomponentBody.addAttribute(new Attribute("type"));
		tagList.add(apexcomponentBody);
		
		
		// apex:dataTable ELEMENT
		Tag apexdataTable = new Tag("apex:dataTable", true);
		apexdataTable.addAttribute(new Attribute("align"));
		apexdataTable.addAttribute(new Attribute("bgcolor"));
		apexdataTable.addAttribute(new Attribute("border"));
		apexdataTable.addAttribute(new Attribute("captionClass"));
		apexdataTable.addAttribute(new Attribute("captionStyle"));
		apexdataTable.addAttribute(new Attribute("cellpadding"));
		apexdataTable.addAttribute(new Attribute("cellspacing"));
		apexdataTable.addAttribute(new Attribute("columnClasses"));
		apexdataTable.addAttribute(new Attribute("columns"));
		apexdataTable.addAttribute(new Attribute("columnsWidth"));
		apexdataTable.addAttribute(new Attribute("dir"));
		apexdataTable.addAttribute(new Attribute("first"));
		apexdataTable.addAttribute(new Attribute("footerClass"));
		apexdataTable.addAttribute(new Attribute("frame"));
		apexdataTable.addAttribute(new Attribute("headerClass"));
		apexdataTable.addAttribute(new Attribute("id"));
		apexdataTable.addAttribute(new Attribute("lang"));
		apexdataTable.addAttribute(new Attribute("onclick"));
		apexdataTable.addAttribute(new Attribute("ondblclick"));
		apexdataTable.addAttribute(new Attribute("onkeydown"));
		apexdataTable.addAttribute(new Attribute("onkeypress"));
		apexdataTable.addAttribute(new Attribute("onkeyup"));
		apexdataTable.addAttribute(new Attribute("onmousedown"));
		apexdataTable.addAttribute(new Attribute("onmousemove"));
		apexdataTable.addAttribute(new Attribute("onmouseout"));
		apexdataTable.addAttribute(new Attribute("onmouseover"));
		apexdataTable.addAttribute(new Attribute("onmouseup"));
		apexdataTable.addAttribute(new Attribute("onRowClick"));
		apexdataTable.addAttribute(new Attribute("onRowDblClick"));
		apexdataTable.addAttribute(new Attribute("onRowMouseDown"));
		apexdataTable.addAttribute(new Attribute("onRowMouseMove"));
		apexdataTable.addAttribute(new Attribute("onRowMouseOut"));
		apexdataTable.addAttribute(new Attribute("onRowMouseOver"));
		apexdataTable.addAttribute(new Attribute("onRowMouseUp"));
		apexdataTable.addAttribute(new Attribute("rendered"));
		apexdataTable.addAttribute(new Attribute("rowClasses"));
		apexdataTable.addAttribute(new Attribute("rows"));
		apexdataTable.addAttribute(new Attribute("rules"));
		apexdataTable.addAttribute(new Attribute("style"));
		apexdataTable.addAttribute(new Attribute("styleClass"));
		apexdataTable.addAttribute(new Attribute("summary"));
		apexdataTable.addAttribute(new Attribute("title"));
		apexdataTable.addAttribute(new Attribute("value"));
		apexdataTable.addAttribute(new Attribute("var"));
		apexdataTable.addAttribute(new Attribute("width"));
		tagList.add(apexdataTable);
		
		// apex:scontrol ELEMENT
		Tag apexscontrol = new Tag("apex:scontrol", true);
		apexscontrol.addAttribute(new Attribute("controlName"));
		apexscontrol.addAttribute(new Attribute("height"));
		apexscontrol.addAttribute(new Attribute("id"));
		apexscontrol.addAttribute(new Attribute("rendered"));
		apexscontrol.addAttribute(new Attribute("scrollbars"));
		apexscontrol.addAttribute(new Attribute("subject"));
		apexscontrol.addAttribute(new Attribute("width"));
		tagList.add(apexscontrol);
		
		// apex:sectionHeader  Element
		Tag apexsectionHeader = new Tag("apex:sectionHeader", true);
		apexsectionHeader.addAttribute(new Attribute("description"));
		apexsectionHeader.addAttribute(new Attribute("help"));
		apexsectionHeader.addAttribute(new Attribute("id"));
		apexsectionHeader.addAttribute(new Attribute("printUrl"));
		apexsectionHeader.addAttribute(new Attribute("rendered"));
		apexsectionHeader.addAttribute(new Attribute("subtitle"));
		apexsectionHeader.addAttribute(new Attribute("title"));
		tagList.add(apexsectionHeader);
		
		// apex:relatedList Element 
		Tag apexrelatedList = new Tag("apex:relatedList", true);
		apexrelatedList.addAttribute(new Attribute("id"));
		apexrelatedList.addAttribute(new Attribute("list"));
		apexrelatedList.addAttribute(new Attribute("pageSize"));
		apexrelatedList.addAttribute(new Attribute("rendered"));
		apexrelatedList.addAttribute(new Attribute("subject"));
		apexrelatedList.addAttribute(new Attribute("title"));
		tagList.add(apexrelatedList);
		
		//apex:panelGrid 
		Tag apexpanelGrid = new Tag("apex:panelGrid", true);
		apexpanelGrid.addAttribute(new Attribute("bgcolor"));
		apexpanelGrid.addAttribute(new Attribute("border"));
		apexpanelGrid.addAttribute(new Attribute("captionClass"));
		apexpanelGrid.addAttribute(new Attribute("captionStyle"));
		apexpanelGrid.addAttribute(new Attribute("cellpadding"));
		apexpanelGrid.addAttribute(new Attribute("cellspacing"));
		apexpanelGrid.addAttribute(new Attribute("columnClasses"));
		apexpanelGrid.addAttribute(new Attribute("columns"));
		apexpanelGrid.addAttribute(new Attribute("dir"));
		apexpanelGrid.addAttribute(new Attribute("footerClass"));
		apexpanelGrid.addAttribute(new Attribute("frame"));
		apexpanelGrid.addAttribute(new Attribute("headerClass"));
		apexpanelGrid.addAttribute(new Attribute("id"));
		apexpanelGrid.addAttribute(new Attribute("lang"));
		apexpanelGrid.addAttribute(new Attribute("onclick"));
		apexpanelGrid.addAttribute(new Attribute("ondblclick"));
		apexpanelGrid.addAttribute(new Attribute("onkeydown"));
		apexpanelGrid.addAttribute(new Attribute("onkeypress"));
		apexpanelGrid.addAttribute(new Attribute("onkeyup"));
		apexpanelGrid.addAttribute(new Attribute("onmousedown"));
		apexpanelGrid.addAttribute(new Attribute("onmousemove"));
		apexpanelGrid.addAttribute(new Attribute("onmouseout"));
		apexpanelGrid.addAttribute(new Attribute("onmouseover"));
		apexpanelGrid.addAttribute(new Attribute("onmouseup"));
		apexpanelGrid.addAttribute(new Attribute("rendered"));
		apexpanelGrid.addAttribute(new Attribute("rowClasses"));
		apexpanelGrid.addAttribute(new Attribute("rules"));
		apexpanelGrid.addAttribute(new Attribute("style"));
		apexpanelGrid.addAttribute(new Attribute("styleClass"));
		apexpanelGrid.addAttribute(new Attribute("summary"));
		apexpanelGrid.addAttribute(new Attribute("title"));
		apexpanelGrid.addAttribute(new Attribute("width"));
		tagList.add(apexpanelGrid);
		
		//apex:panelGroup 
		Tag apexpanelGroup = new Tag("apex:panelGroup", true);
		apexpanelGroup.addAttribute(new Attribute("id"));
		apexpanelGroup.addAttribute(new Attribute("layout"));
		apexpanelGroup.addAttribute(new Attribute("rendered"));
		apexpanelGroup.addAttribute(new Attribute("style"));
		apexpanelGroup.addAttribute(new Attribute("styleClass"));
		tagList.add(apexpanelGroup);
		
		// apex:panelBar 
		Tag apexpanelBar = new Tag("apex:panelBar", true);
		apexpanelBar.addAttribute(new Attribute("contentClass"));
		apexpanelBar.addAttribute(new Attribute("contentStyle"));
		apexpanelBar.addAttribute(new Attribute("headerClass"));
		apexpanelBar.addAttribute(new Attribute("headerClassActive"));
		apexpanelBar.addAttribute(new Attribute("headerStyle"));
		apexpanelBar.addAttribute(new Attribute("headerStyleActive"));
		apexpanelBar.addAttribute(new Attribute("height"));
		apexpanelBar.addAttribute(new Attribute("id"));
		apexpanelBar.addAttribute(new Attribute("items"));
		apexpanelBar.addAttribute(new Attribute("rendered"));
		apexpanelBar.addAttribute(new Attribute("style"));
		apexpanelBar.addAttribute(new Attribute("styleClass"));
		apexpanelBar.addAttribute(new Attribute("switchType"));
		apexpanelBar.addAttribute(new Attribute("value"));
		apexpanelBar.addAttribute(new Attribute("var"));
		apexpanelBar.addAttribute(new Attribute("width"));
		tagList.add(apexpanelBar);
		
		// apex:panelBarItem
		Tag apexpanelBarItem = new Tag("apex:panelBarItem", true);
		apexpanelBarItem.addAttribute(new Attribute("contentClass"));
		apexpanelBarItem.addAttribute(new Attribute("contentStyle"));
		apexpanelBarItem.addAttribute(new Attribute("expanded"));
		apexpanelBarItem.addAttribute(new Attribute("headerClass"));
		apexpanelBarItem.addAttribute(new Attribute("headerClassActive"));
		apexpanelBarItem.addAttribute(new Attribute("headerStyle"));
		apexpanelBarItem.addAttribute(new Attribute("headerStyleActive"));
		apexpanelBarItem.addAttribute(new Attribute("id"));
		apexpanelBarItem.addAttribute(new Attribute("label"));
		apexpanelBarItem.addAttribute(new Attribute("name"));
		apexpanelBarItem.addAttribute(new Attribute("onenter"));
		apexpanelBarItem.addAttribute(new Attribute("onleave"));
		apexpanelBarItem.addAttribute(new Attribute("rendered"));
		tagList.add(apexpanelBarItem);
		
		// apex:composition 
		Tag apexcomposition = new Tag("apex:composition", true);
		apexcomposition.addAttribute(new Attribute("rendered"));
		apexcomposition.addAttribute(new Attribute("template"));
		tagList.add(apexcomposition);
		
		
		// apex:define 
		Tag apexdefine = new Tag("apex:define", true);
		apexdefine.addAttribute(new Attribute("name"));
		tagList.add(apexdefine);
		
		// apex:insert
		Tag apexinsert = new Tag("apex:insert", true);
		apexinsert.addAttribute(new Attribute("name"));
		tagList.add(apexinsert);
		
		// apex:dataList
		Tag apexdataList = new Tag("apex:dataList", true);
		apexdataList.addAttribute(new Attribute("dir"));
		apexdataList.addAttribute(new Attribute("first"));
		apexdataList.addAttribute(new Attribute("id"));
		apexdataList.addAttribute(new Attribute("lang"));
		apexdataList.addAttribute(new Attribute("onclick"));
		apexdataList.addAttribute(new Attribute("ondblclick"));
		apexdataList.addAttribute(new Attribute("onkeydown"));
		apexdataList.addAttribute(new Attribute("onkeypress"));
		apexdataList.addAttribute(new Attribute("onkeyup"));
		apexdataList.addAttribute(new Attribute("onmousedown"));
		apexdataList.addAttribute(new Attribute("onmousemove"));
		apexdataList.addAttribute(new Attribute("onmouseout"));
		apexdataList.addAttribute(new Attribute("onmouseover"));
		apexdataList.addAttribute(new Attribute("onmouseup"));
		apexdataList.addAttribute(new Attribute("rendered"));
		apexdataList.addAttribute(new Attribute("rows"));
		apexdataList.addAttribute(new Attribute("style"));
		apexdataList.addAttribute(new Attribute("styleClass"));
		apexdataList.addAttribute(new Attribute("title"));
		apexdataList.addAttribute(new Attribute("type"));
		apexdataList.addAttribute(new Attribute("value"));
		apexdataList.addAttribute(new Attribute("var"));
		tagList.add(apexdataList);		
		
		// apex:pageBlock Element 
		Tag apexpageBlock = new Tag("apex:pageBlock", true);
		apexpageBlock.addAttribute(new Attribute("dir"));
		apexpageBlock.addAttribute(new Attribute("helpTitle"));
		apexpageBlock.addAttribute(new Attribute("helpUrl"));
		apexpageBlock.addAttribute(new Attribute("id"));
		apexpageBlock.addAttribute(new Attribute("lang"));
		apexpageBlock.addAttribute(new Attribute("mode"));
		apexpageBlock.addAttribute(new Attribute("onkeydown"));
		apexpageBlock.addAttribute(new Attribute("onkeypress"));
		apexpageBlock.addAttribute(new Attribute("onclick"));
		apexpageBlock.addAttribute(new Attribute("ondblclick"));
		apexpageBlock.addAttribute(new Attribute("onkeydown"));
		apexpageBlock.addAttribute(new Attribute("onkeypress"));
		apexpageBlock.addAttribute(new Attribute("onkeyup"));
		apexpageBlock.addAttribute(new Attribute("onmousedown"));
		apexpageBlock.addAttribute(new Attribute("onmousemove"));
		apexpageBlock.addAttribute(new Attribute("onmouseout"));
		apexpageBlock.addAttribute(new Attribute("onmouseover"));
		apexpageBlock.addAttribute(new Attribute("onmouseup"));
		apexpageBlock.addAttribute(new Attribute("rendered"));
		apexpageBlock.addAttribute(new Attribute("tabStyle"));
		apexpageBlock.addAttribute(new Attribute("title"));
		tagList.add(apexpageBlock);
		
		
		// apex:pageBlockButtons 
		Tag apexpageBlockButtons = new Tag("apex:pageBlockButtons", true);
		apexpageBlockButtons.addAttribute(new Attribute("dir"));
		apexpageBlockButtons.addAttribute(new Attribute("id"));
		apexpageBlockButtons.addAttribute(new Attribute("lang"));
		apexpageBlockButtons.addAttribute(new Attribute("location"));
		apexpageBlockButtons.addAttribute(new Attribute("onclick"));
		apexpageBlockButtons.addAttribute(new Attribute("ondblclick"));
		apexpageBlockButtons.addAttribute(new Attribute("onkeydown"));
		apexpageBlockButtons.addAttribute(new Attribute("onkeypress"));
		apexpageBlockButtons.addAttribute(new Attribute("onkeyup"));
		apexpageBlockButtons.addAttribute(new Attribute("onmousedown"));
		apexpageBlockButtons.addAttribute(new Attribute("onmousemove"));
		apexpageBlockButtons.addAttribute(new Attribute("onmouseout"));
		apexpageBlockButtons.addAttribute(new Attribute("onmouseover"));
		apexpageBlockButtons.addAttribute(new Attribute("onmouseup"));
		apexpageBlockButtons.addAttribute(new Attribute("rendered"));
		apexpageBlockButtons.addAttribute(new Attribute("style"));
		apexpageBlockButtons.addAttribute(new Attribute("styleClass"));
		apexpageBlockButtons.addAttribute(new Attribute("title"));
		tagList.add(apexpageBlockButtons);
		
		
		// apex:pageBlockSection
		Tag apexpageBlockSection = new Tag("apex:pageBlockSection", true);
		apexpageBlockSection.addAttribute(new Attribute("collapsible"));
		apexpageBlockSection.addAttribute(new Attribute("columns"));
		apexpageBlockSection.addAttribute(new Attribute("dir"));
		apexpageBlockSection.addAttribute(new Attribute("id"));
		apexpageBlockSection.addAttribute(new Attribute("lang"));
		apexpageBlockSection.addAttribute(new Attribute("onclick"));
		apexpageBlockSection.addAttribute(new Attribute("ondblclick"));
		apexpageBlockSection.addAttribute(new Attribute("onkeydown"));
		apexpageBlockSection.addAttribute(new Attribute("onkeypress"));
		apexpageBlockSection.addAttribute(new Attribute("onkeyup"));
		apexpageBlockSection.addAttribute(new Attribute("onmousedown"));
		apexpageBlockSection.addAttribute(new Attribute("onmousemove"));
		apexpageBlockSection.addAttribute(new Attribute("onmouseout"));
		apexpageBlockSection.addAttribute(new Attribute("onmouseover"));
		apexpageBlockSection.addAttribute(new Attribute("onmouseup"));
		apexpageBlockSection.addAttribute(new Attribute("rendered"));
		apexpageBlockSection.addAttribute(new Attribute("showHeader"));
		apexpageBlockSection.addAttribute(new Attribute("title"));
		tagList.add(apexpageBlockSection);
		
		
		// apex:pageBlockSectionItem
		Tag apexpageBlockSectionItem = new Tag("apex:pageBlockSectionItem", true);
		apexpageBlockSectionItem.addAttribute(new Attribute("dataStyle"));
		apexpageBlockSectionItem.addAttribute(new Attribute("dataStyleClass"));
		apexpageBlockSectionItem.addAttribute(new Attribute("dataTitle"));
		apexpageBlockSectionItem.addAttribute(new Attribute("dir"));
		apexpageBlockSectionItem.addAttribute(new Attribute("helpText"));
		apexpageBlockSectionItem.addAttribute(new Attribute("id"));
		apexpageBlockSectionItem.addAttribute(new Attribute("labelStyle"));
		apexpageBlockSectionItem.addAttribute(new Attribute("labelStyleClass"));
		apexpageBlockSectionItem.addAttribute(new Attribute("labelTitle"));
		apexpageBlockSectionItem.addAttribute(new Attribute("lang"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onDataclick"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onDatadblclick"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onDatakeydown"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onDatakeypress"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onDatakeyup"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onDatamousedown"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onDatamousemove"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onDatamouseout"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onDatamouseover"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onDatamouseup"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onLabelclick"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onLabeldblclick"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onLabelkeydown"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onLabelkeypress"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onLabelkeyup"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onLabelmousedown"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onLabelmousemove"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onLabelmouseout"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onLabelmouseover"));
		apexpageBlockSectionItem.addAttribute(new Attribute("onLabelmouseup"));
		apexpageBlockSectionItem.addAttribute(new Attribute("rendered"));
		tagList.add(apexpageBlockSectionItem);
		
		Tag a = new Tag("a",true);
		a.addAttribute(new Attribute("href",true));
		a.addAttribute(new Attribute("name",true));
		a.addAttribute(new Attribute("target",true));
		a.addAttribute(new Attribute("charset",true));
		a.addAttribute(new Attribute("hreflang",true));
		a.addAttribute(new Attribute("methods",true));
		a.addAttribute(new Attribute("rel",true));
		a.addAttribute(new Attribute("rev",true));
		a.addAttribute(new Attribute("type",true));
		a.addAttribute(new Attribute("urn",true));
		a.addAttribute(new Attribute("coords",true));
		a.addAttribute(new Attribute("shape",true));
		a.addAttribute(new Attribute("class",true));
		a.addAttribute(new Attribute("dir",true));
		a.addAttribute(new Attribute("id",true));
		a.addAttribute(new Attribute("lang",true));
		a.addAttribute(new Attribute("style",true));
		a.addAttribute(new Attribute("title",true));
		tagList.add(a);
		
		Tag abbr = new Tag("abbr",true);
		abbr.addAttribute(new Attribute("class",true));
		abbr.addAttribute(new Attribute("dir",true));
		abbr.addAttribute(new Attribute("id",true));
		abbr.addAttribute(new Attribute("lang",true));
		abbr.addAttribute(new Attribute("style",true));
		abbr.addAttribute(new Attribute("title",true));
		tagList.add(abbr);
		
		Tag acronym = new Tag("acronym",true);
		acronym.addAttribute(new Attribute("class",true));
		acronym.addAttribute(new Attribute("dir",true));
		acronym.addAttribute(new Attribute("id",true));
		acronym.addAttribute(new Attribute("lang",true));
		acronym.addAttribute(new Attribute("style",true));
		acronym.addAttribute(new Attribute("title",true));
		tagList.add(acronym);

		Tag address = new Tag("address",true);
		address.addAttribute(new Attribute("class",true));
		address.addAttribute(new Attribute("dir",true));
		address.addAttribute(new Attribute("id",true));
		address.addAttribute(new Attribute("lang",true));
		address.addAttribute(new Attribute("style",true));
		address.addAttribute(new Attribute("title",true));
		tagList.add(address);
		
		Tag applet = new Tag("applet",true);
		applet.addAttribute(new Attribute("alt",true));
		applet.addAttribute(new Attribute("archive",true));
		applet.addAttribute(new Attribute("code",true));
		applet.addAttribute(new Attribute("codebase",true));
		applet.addAttribute(new Attribute("align",true));
		applet.addAttribute(new Attribute("height",true));
		applet.addAttribute(new Attribute("hspace",true));
		applet.addAttribute(new Attribute("vspace",true));
		applet.addAttribute(new Attribute("width",true));
		applet.addAttribute(new Attribute("class",true));
		applet.addAttribute(new Attribute("id",true));
		applet.addAttribute(new Attribute("name",true));
		applet.addAttribute(new Attribute("style",true));
		applet.addAttribute(new Attribute("title",true));
		tagList.add(applet);
		
		Tag area = new Tag("area",false);
		area.addAttribute(new Attribute("shape",true));
		area.addAttribute(new Attribute("coords",true));
		area.addAttribute(new Attribute("href",true));
		area.addAttribute(new Attribute("alt",true));
		area.addAttribute(new Attribute("class",true));
		area.addAttribute(new Attribute("dir",true));
		area.addAttribute(new Attribute("id",true));
		area.addAttribute(new Attribute("lang",true));
		area.addAttribute(new Attribute("language",true));
		area.addAttribute(new Attribute("name",true));
		area.addAttribute(new Attribute("style",true));
		area.addAttribute(new Attribute("title",true));
		tagList.add(area);
		
		Tag b = new Tag("b",true);
		b.addAttribute(new Attribute("class",true));
		b.addAttribute(new Attribute("dir",true));
		b.addAttribute(new Attribute("id",true));
		b.addAttribute(new Attribute("lang",true));
		b.addAttribute(new Attribute("style",true));
		b.addAttribute(new Attribute("title",true));
		tagList.add(b);

		Tag base = new Tag("base",false);
		base.addAttribute(new Attribute("href",true));
		base.addAttribute(new Attribute("target",true));
		tagList.add(base);
		
		Tag basefont = new Tag("basefont",false);
		base.addAttribute(new Attribute("size",true));
		base.addAttribute(new Attribute("color",true));
		base.addAttribute(new Attribute("face",true));
		base.addAttribute(new Attribute("class",true));
		base.addAttribute(new Attribute("id",true));
		base.addAttribute(new Attribute("lang",true));
		base.addAttribute(new Attribute("style",true));
		tagList.add(basefont);
		
		Tag bdo = new Tag("bdo",true);
		bdo.addAttribute(new Attribute("class",true));
		bdo.addAttribute(new Attribute("dir",true));
		bdo.addAttribute(new Attribute("id",true));
		bdo.addAttribute(new Attribute("lang",true));
		bdo.addAttribute(new Attribute("style",true));
		bdo.addAttribute(new Attribute("title",true));
		tagList.add(bdo);
		
		Tag bgsound = new Tag("bgsound",false);
		bgsound.addAttribute(new Attribute("balance",true));
		bgsound.addAttribute(new Attribute("loop",true));
		bgsound.addAttribute(new Attribute("src",true));
		bgsound.addAttribute(new Attribute("volume",true));
		bgsound.addAttribute(new Attribute("class",true));
		bgsound.addAttribute(new Attribute("id",true));
		bgsound.addAttribute(new Attribute("lang",true));
		bgsound.addAttribute(new Attribute("title",true));
		tagList.add(bgsound);
		
		Tag big = new Tag("big",true);
		big.addAttribute(new Attribute("class",true));
		big.addAttribute(new Attribute("dir",true));
		big.addAttribute(new Attribute("id",true));
		big.addAttribute(new Attribute("lang",true));
		big.addAttribute(new Attribute("style",true));
		big.addAttribute(new Attribute("title",true));
		tagList.add(big);

		Tag blink = new Tag("blink",true);
		blink.addAttribute(new Attribute("class",true));
		blink.addAttribute(new Attribute("dir",true));
		blink.addAttribute(new Attribute("id",true));
		blink.addAttribute(new Attribute("lang",true));
		blink.addAttribute(new Attribute("style",true));
		blink.addAttribute(new Attribute("title",true));		
		tagList.add(blink);
		
		Tag blockquote = new Tag("blockquote",true);
		blockquote.addAttribute(new Attribute("cite",true));
		blockquote.addAttribute(new Attribute("class",true));
		blockquote.addAttribute(new Attribute("dir",true));
		blockquote.addAttribute(new Attribute("id",true));
		blockquote.addAttribute(new Attribute("lang",true));
		blockquote.addAttribute(new Attribute("style",true));
		blockquote.addAttribute(new Attribute("title",true));
		tagList.add(blockquote);
		
		Tag body = new Tag("body",true);
		body.addAttribute(new Attribute("text",true));
		body.addAttribute(new Attribute("link",true));
		body.addAttribute(new Attribute("vlink",true));
		body.addAttribute(new Attribute("alink",true));
		body.addAttribute(new Attribute("bgcolor",true));
		body.addAttribute(new Attribute("background",true));
		body.addAttribute(new Attribute("marginheight",true));
		body.addAttribute(new Attribute("marginwidth",true));
		body.addAttribute(new Attribute("topmargin",true));
		body.addAttribute(new Attribute("leftmargin",true));
		body.addAttribute(new Attribute("bottommargin",true));
		body.addAttribute(new Attribute("rightmargin",true));
		body.addAttribute(new Attribute("scroll",true));
		body.addAttribute(new Attribute("class",true));
		body.addAttribute(new Attribute("dir",true));
		body.addAttribute(new Attribute("id",true));
		body.addAttribute(new Attribute("lang",true));
		body.addAttribute(new Attribute("style",true));
		body.addAttribute(new Attribute("title",true));
		tagList.add(body);
		
		Tag br = new Tag("br",false);
		br.addAttribute(new Attribute("clear",true));
		br.addAttribute(new Attribute("class",true));
		br.addAttribute(new Attribute("id",true));
		br.addAttribute(new Attribute("language",true));
		br.addAttribute(new Attribute("style",true));
		br.addAttribute(new Attribute("title",true));
		tagList.add(br);
		
		Tag button = new Tag("button",true);
		button.addAttribute(new Attribute("disabled",false));
		button.addAttribute(new Attribute("type",true));
		button.addAttribute(new Attribute("value",true));
		button.addAttribute(new Attribute("class",true));
		button.addAttribute(new Attribute("dir",true));
		button.addAttribute(new Attribute("id",true));
		button.addAttribute(new Attribute("lang",true));
		button.addAttribute(new Attribute("name",true));
		button.addAttribute(new Attribute("style",true));
		button.addAttribute(new Attribute("title",true));
		tagList.add(button);
		
		Tag caption = new Tag("caption",true);
		caption.addAttribute(new Attribute("align",true));
		caption.addAttribute(new Attribute("valign",true));
		caption.addAttribute(new Attribute("class",true));
		caption.addAttribute(new Attribute("dir",true));
		caption.addAttribute(new Attribute("id",true));
		caption.addAttribute(new Attribute("lang",true));
		caption.addAttribute(new Attribute("style",true));
		caption.addAttribute(new Attribute("title",true));		
		tagList.add(caption);

		Tag center = new Tag("center",true);
		center.addAttribute(new Attribute("class",true));
		center.addAttribute(new Attribute("dir",true));
		center.addAttribute(new Attribute("id",true));
		center.addAttribute(new Attribute("lang",true));
		center.addAttribute(new Attribute("style",true));
		center.addAttribute(new Attribute("title",true));
		tagList.add(center);
		
		Tag cite = new Tag("cite",true);
		cite.addAttribute(new Attribute("class",true));
		cite.addAttribute(new Attribute("dir",true));
		cite.addAttribute(new Attribute("id",true));
		cite.addAttribute(new Attribute("lang",true));
		cite.addAttribute(new Attribute("style",true));
		cite.addAttribute(new Attribute("title",true));
		tagList.add(cite);
		
		Tag code = new Tag("code",true);
		code.addAttribute(new Attribute("class",true));
		code.addAttribute(new Attribute("dir",true));
		code.addAttribute(new Attribute("id",true));
		code.addAttribute(new Attribute("lang",true));
		code.addAttribute(new Attribute("style",true));
		code.addAttribute(new Attribute("title",true));
		tagList.add(code);

		Tag col = new Tag("col",true);
		col.addAttribute(new Attribute("align",true));
		col.addAttribute(new Attribute("bgcolor",true));
		col.addAttribute(new Attribute("char",true));
		col.addAttribute(new Attribute("charoff",true));
		col.addAttribute(new Attribute("span",true));
		col.addAttribute(new Attribute("valign",true));
		col.addAttribute(new Attribute("width",true));
		col.addAttribute(new Attribute("class",true));
		col.addAttribute(new Attribute("dir",true));
		col.addAttribute(new Attribute("id",true));
		col.addAttribute(new Attribute("lang",true));
		col.addAttribute(new Attribute("style",true));
		col.addAttribute(new Attribute("title",true));
		tagList.add(col);

		Tag colgroup = new Tag("colgroup",true);
		colgroup.addAttribute(new Attribute("align",true));
		colgroup.addAttribute(new Attribute("bgcolor",true));
		colgroup.addAttribute(new Attribute("char",true));
		colgroup.addAttribute(new Attribute("charoff",true));
		colgroup.addAttribute(new Attribute("span",true));
		colgroup.addAttribute(new Attribute("valign",true));
		colgroup.addAttribute(new Attribute("width",true));
		colgroup.addAttribute(new Attribute("class",true));
		colgroup.addAttribute(new Attribute("dir",true));
		colgroup.addAttribute(new Attribute("id",true));
		colgroup.addAttribute(new Attribute("lang",true));
		colgroup.addAttribute(new Attribute("style",true));
		colgroup.addAttribute(new Attribute("title",true));
		tagList.add(colgroup);

		Tag comment = new Tag("comment",true);
		comment.addAttribute(new Attribute("id",true));
		comment.addAttribute(new Attribute("lang",true));
		tagList.add(comment);
	
		Tag dd = new Tag("dd",true);
		dd.addAttribute(new Attribute("class",true));
		dd.addAttribute(new Attribute("dir",true));
		dd.addAttribute(new Attribute("id",true));
		dd.addAttribute(new Attribute("lang",true));
		dd.addAttribute(new Attribute("style",true));
		dd.addAttribute(new Attribute("title",true));
		tagList.add(dd);
		
		Tag del = new Tag("del",true);
		del.addAttribute(new Attribute("cite",true));
		del.addAttribute(new Attribute("datetime",true));
		del.addAttribute(new Attribute("class",true));
		del.addAttribute(new Attribute("dir",true));
		del.addAttribute(new Attribute("id",true));
		del.addAttribute(new Attribute("lang",true));
		del.addAttribute(new Attribute("style",true));
		del.addAttribute(new Attribute("title",true));
		tagList.add(del);
		
		Tag dfn = new Tag("dfn",true);
		dfn.addAttribute(new Attribute("class",true));
		dfn.addAttribute(new Attribute("dir",true));
		dfn.addAttribute(new Attribute("id",true));
		dfn.addAttribute(new Attribute("lang",true));
		dfn.addAttribute(new Attribute("style",true));
		dfn.addAttribute(new Attribute("title",true));
		tagList.add(dfn);
		
		Tag dir = new Tag("dir",true);
		dir.addAttribute(new Attribute("compact",false));
		dir.addAttribute(new Attribute("type",true));
		dir.addAttribute(new Attribute("class",true));
		dir.addAttribute(new Attribute("dir",true));
		dir.addAttribute(new Attribute("id",true));
		dir.addAttribute(new Attribute("lang",true));
		dir.addAttribute(new Attribute("style",true));
		dir.addAttribute(new Attribute("title",true));
		tagList.add(dir);
		
		Tag div = new Tag("div",true);
		div.addAttribute(new Attribute("align",false));
		div.addAttribute(new Attribute("class",true));
		div.addAttribute(new Attribute("dir",true));
		div.addAttribute(new Attribute("id",true));
		div.addAttribute(new Attribute("lang",true));
		div.addAttribute(new Attribute("style",true));
		div.addAttribute(new Attribute("title",true));
		tagList.add(div);
		
		Tag dl = new Tag("dl",true);
		dl.addAttribute(new Attribute("compact",false));
		dl.addAttribute(new Attribute("class",true));
		dl.addAttribute(new Attribute("dir",true));
		dl.addAttribute(new Attribute("id",true));
		dl.addAttribute(new Attribute("lang",true));
		dl.addAttribute(new Attribute("style",true));
		dl.addAttribute(new Attribute("title",true));
		tagList.add(dl);
		
		Tag dt = new Tag("dt",true);
		dt.addAttribute(new Attribute("class",true));
		dt.addAttribute(new Attribute("dir",true));
		dt.addAttribute(new Attribute("id",true));
		dt.addAttribute(new Attribute("lang",true));
		dt.addAttribute(new Attribute("style",true));
		dt.addAttribute(new Attribute("title",true));
		tagList.add(dt);
		
		Tag em = new Tag("em",true);
		em.addAttribute(new Attribute("class",true));
		em.addAttribute(new Attribute("dir",true));
		em.addAttribute(new Attribute("id",true));
		em.addAttribute(new Attribute("lang",true));
		em.addAttribute(new Attribute("style",true));
		em.addAttribute(new Attribute("title",true));		
		tagList.add(em);

		Tag embed = new Tag("embed",false);
		embed.addAttribute(new Attribute("src",true));
		embed.addAttribute(new Attribute("align",true));
		embed.addAttribute(new Attribute("height",true));
		embed.addAttribute(new Attribute("hspace",true));
		embed.addAttribute(new Attribute("vspace",true));
		embed.addAttribute(new Attribute("units",true));
		embed.addAttribute(new Attribute("border",true));
		embed.addAttribute(new Attribute("frameborder",true));
		embed.addAttribute(new Attribute("hidden",true));
		embed.addAttribute(new Attribute("alt",true));
		embed.addAttribute(new Attribute("code",true));
		embed.addAttribute(new Attribute("codebase",true));
		embed.addAttribute(new Attribute("type",true));
		embed.addAttribute(new Attribute("palette",true));
		embed.addAttribute(new Attribute("pluginspace",true));
		embed.addAttribute(new Attribute("pluginurl",true));
		embed.addAttribute(new Attribute("class",true));
		embed.addAttribute(new Attribute("id",true));
		embed.addAttribute(new Attribute("name",true));
		embed.addAttribute(new Attribute("style",true));
		embed.addAttribute(new Attribute("title",true));		
		tagList.add(embed);
		
		Tag fieldset = new Tag("fieldset",true);
		fieldset.addAttribute(new Attribute("align",true));
		fieldset.addAttribute(new Attribute("class",true));
		fieldset.addAttribute(new Attribute("dir",true));
		fieldset.addAttribute(new Attribute("id",true));
		fieldset.addAttribute(new Attribute("lang",true));
		fieldset.addAttribute(new Attribute("style",true));
		fieldset.addAttribute(new Attribute("title",true));
		tagList.add(fieldset);
		
		Tag font = new Tag("font",true);
		font.addAttribute(new Attribute("size",true));
		font.addAttribute(new Attribute("color",true));
		font.addAttribute(new Attribute("face",true));
		font.addAttribute(new Attribute("font-weight",true));
		font.addAttribute(new Attribute("point-size",true));
		font.addAttribute(new Attribute("class",true));
		font.addAttribute(new Attribute("dir",true));
		font.addAttribute(new Attribute("id",true));
		font.addAttribute(new Attribute("lang",true));
		font.addAttribute(new Attribute("style",true));
		font.addAttribute(new Attribute("title",true));
		tagList.add(font);
		
		Tag form = new Tag("form",true);
		form.addAttribute(new Attribute("action",true));
		form.addAttribute(new Attribute("method",true));
		form.addAttribute(new Attribute("target",true));
		form.addAttribute(new Attribute("accept",true));
		form.addAttribute(new Attribute("accept-charset",true));
		form.addAttribute(new Attribute("autocomplete",true));
		form.addAttribute(new Attribute("enctype",true));
		form.addAttribute(new Attribute("urn",false));
		form.addAttribute(new Attribute("class",true));
		form.addAttribute(new Attribute("dir",true));
		form.addAttribute(new Attribute("id",true));
		form.addAttribute(new Attribute("lang",true));
		form.addAttribute(new Attribute("name",true));
		form.addAttribute(new Attribute("style",true));
		form.addAttribute(new Attribute("title",true));
		tagList.add(form);
		
		Tag frame = new Tag("frame",true);
		frame.addAttribute(new Attribute("src",true));
		frame.addAttribute(new Attribute("height",true));
		frame.addAttribute(new Attribute("width",true));
		frame.addAttribute(new Attribute("bordercolor",true));
		frame.addAttribute(new Attribute("frameborder",true));
		frame.addAttribute(new Attribute("marginheight",true));
		frame.addAttribute(new Attribute("marginwidth",true));
		frame.addAttribute(new Attribute("noresize",false));
		frame.addAttribute(new Attribute("scrolling",true));
		frame.addAttribute(new Attribute("class",true));
		frame.addAttribute(new Attribute("id",true));
		frame.addAttribute(new Attribute("lang",true));
		frame.addAttribute(new Attribute("language",true));
		frame.addAttribute(new Attribute("name",true));
		frame.addAttribute(new Attribute("style",true));
		frame.addAttribute(new Attribute("title",true));
		tagList.add(frame);
		
		Tag frameset = new Tag("frameset",true);
		frameset.addAttribute(new Attribute("border",true));
		frameset.addAttribute(new Attribute("bordercolor",true));
		frameset.addAttribute(new Attribute("cols",true));
		frameset.addAttribute(new Attribute("frameborder",true));
		frameset.addAttribute(new Attribute("framespacing",true));
		frameset.addAttribute(new Attribute("rows",true));
		frameset.addAttribute(new Attribute("class",true));
		frameset.addAttribute(new Attribute("id",true));
		frameset.addAttribute(new Attribute("lang",true));
		frameset.addAttribute(new Attribute("language",true));
		frameset.addAttribute(new Attribute("name",true));
		frameset.addAttribute(new Attribute("style",true));
		frameset.addAttribute(new Attribute("title",true));
		tagList.add(frameset);
		
		Tag h1 = new Tag("h1",true);
		h1.addAttribute(new Attribute("align",true));
		h1.addAttribute(new Attribute("class",true));
		h1.addAttribute(new Attribute("dir",true));
		h1.addAttribute(new Attribute("id",true));
		h1.addAttribute(new Attribute("lang",true));
		h1.addAttribute(new Attribute("style",true));
		h1.addAttribute(new Attribute("title",true));
		tagList.add(h1);

		Tag h2 = new Tag("h2",true);
		h2.addAttribute(new Attribute("align",true));
		h2.addAttribute(new Attribute("class",true));
		h2.addAttribute(new Attribute("dir",true));
		h2.addAttribute(new Attribute("id",true));
		h2.addAttribute(new Attribute("lang",true));
		h2.addAttribute(new Attribute("style",true));
		h2.addAttribute(new Attribute("title",true));
		tagList.add(h2);

		Tag h3 = new Tag("h3",true);
		h3.addAttribute(new Attribute("align",true));
		h3.addAttribute(new Attribute("class",true));
		h3.addAttribute(new Attribute("dir",true));
		h3.addAttribute(new Attribute("id",true));
		h3.addAttribute(new Attribute("lang",true));
		h3.addAttribute(new Attribute("style",true));
		h3.addAttribute(new Attribute("title",true));
		tagList.add(h3);
		
		Tag h4 = new Tag("h4",true);
		h4.addAttribute(new Attribute("align",true));
		h4.addAttribute(new Attribute("class",true));
		h4.addAttribute(new Attribute("dir",true));
		h4.addAttribute(new Attribute("id",true));
		h4.addAttribute(new Attribute("lang",true));
		h4.addAttribute(new Attribute("style",true));
		h4.addAttribute(new Attribute("title",true));
		tagList.add(h4);
		
		Tag h5 = new Tag("h5",true);
		h5.addAttribute(new Attribute("align",true));
		h5.addAttribute(new Attribute("class",true));
		h5.addAttribute(new Attribute("dir",true));
		h5.addAttribute(new Attribute("id",true));
		h5.addAttribute(new Attribute("lang",true));
		h5.addAttribute(new Attribute("style",true));
		h5.addAttribute(new Attribute("title",true));
		tagList.add(h5);
		
		Tag h6 = new Tag("h6",true);
		h6.addAttribute(new Attribute("align",true));
		h6.addAttribute(new Attribute("class",true));
		h6.addAttribute(new Attribute("dir",true));
		h6.addAttribute(new Attribute("id",true));
		h6.addAttribute(new Attribute("lang",true));
		h6.addAttribute(new Attribute("style",true));
		h6.addAttribute(new Attribute("title",true));
		tagList.add(h6);
		
		Tag head = new Tag("head",true);
		head.addAttribute(new Attribute("profile",true));
		head.addAttribute(new Attribute("class",true));
		head.addAttribute(new Attribute("dir",true));
		head.addAttribute(new Attribute("id",true));
		head.addAttribute(new Attribute("lang",true));
		head.addAttribute(new Attribute("title",true));
		tagList.add(head);
		
		Tag hr = new Tag("hr",true);
		hr.addAttribute(new Attribute("align",true));
		hr.addAttribute(new Attribute("color",true));
		hr.addAttribute(new Attribute("nochade",false));
		hr.addAttribute(new Attribute("size",true));
		hr.addAttribute(new Attribute("width",true));
		hr.addAttribute(new Attribute("class",true));
		hr.addAttribute(new Attribute("dir",true));
		hr.addAttribute(new Attribute("id",true));
		hr.addAttribute(new Attribute("lang",true));
		hr.addAttribute(new Attribute("language",true));
		hr.addAttribute(new Attribute("style",true));
		hr.addAttribute(new Attribute("title",true));
		tagList.add(hr);
		
		Tag html = new Tag("html",true);
		html.addAttribute(new Attribute("version",true));
		html.addAttribute(new Attribute("class",true));
		html.addAttribute(new Attribute("dir",true));
		html.addAttribute(new Attribute("id",true));
		html.addAttribute(new Attribute("lang",true));
		html.addAttribute(new Attribute("language",true));
		html.addAttribute(new Attribute("style",true));
		html.addAttribute(new Attribute("title",true));
		tagList.add(html);

		Tag i = new Tag("i",true);
		i.addAttribute(new Attribute("class",true));
		i.addAttribute(new Attribute("dir",true));
		i.addAttribute(new Attribute("id",true));
		i.addAttribute(new Attribute("lang",true));
		i.addAttribute(new Attribute("style",true));
		i.addAttribute(new Attribute("title",true));
		tagList.add(i);
		
		Tag iframe = new Tag("iframe",true);
		iframe.addAttribute(new Attribute("src",true));
		iframe.addAttribute(new Attribute("align",true));
		iframe.addAttribute(new Attribute("height",true));
		iframe.addAttribute(new Attribute("width",true));
		iframe.addAttribute(new Attribute("hspace",true));
		iframe.addAttribute(new Attribute("vspace",true));
		iframe.addAttribute(new Attribute("marginheight",true));
		iframe.addAttribute(new Attribute("marginwidth",true));
		iframe.addAttribute(new Attribute("border",true));
		iframe.addAttribute(new Attribute("bordercolor",true));
		iframe.addAttribute(new Attribute("frameborder",true));
		iframe.addAttribute(new Attribute("framespacing",true));
		iframe.addAttribute(new Attribute("scrolling",true));
		iframe.addAttribute(new Attribute("class",true));
		iframe.addAttribute(new Attribute("dir",true));
		iframe.addAttribute(new Attribute("id",true));
		iframe.addAttribute(new Attribute("lang",true));
		iframe.addAttribute(new Attribute("language",true));
		iframe.addAttribute(new Attribute("name",true));
		iframe.addAttribute(new Attribute("style",true));
		iframe.addAttribute(new Attribute("title",true));
		tagList.add(iframe);
		
		Tag img = new Tag("img",false);
		img.addAttribute(new Attribute("src",true));
		img.addAttribute(new Attribute("alt",true));
		img.addAttribute(new Attribute("height",true));
		img.addAttribute(new Attribute("width",true));
		img.addAttribute(new Attribute("align",true));
		img.addAttribute(new Attribute("border",true));
		img.addAttribute(new Attribute("galleryimg",true));
		img.addAttribute(new Attribute("hspace",true));
		img.addAttribute(new Attribute("lowsrc",true));
		img.addAttribute(new Attribute("suppress",true));
		img.addAttribute(new Attribute("vspace",true));
		img.addAttribute(new Attribute("ismap",false));
		img.addAttribute(new Attribute("usemap",true));
		img.addAttribute(new Attribute("class",true));
		img.addAttribute(new Attribute("dir",true));
		img.addAttribute(new Attribute("id",true));
		img.addAttribute(new Attribute("lang",true));
		img.addAttribute(new Attribute("language",true));
		img.addAttribute(new Attribute("name",true));
		img.addAttribute(new Attribute("style",true));
		img.addAttribute(new Attribute("title",true));		
		tagList.add(img);

		Tag input = new Tag("input",true);
		input.addAttribute(new Attribute("type",true));
		input.addAttribute(new Attribute("value",true));
		input.addAttribute(new Attribute("size",true));
		input.addAttribute(new Attribute("maxlength",true));
		input.addAttribute(new Attribute("disabled",false));
		input.addAttribute(new Attribute("readonly",false));
		input.addAttribute(new Attribute("checked",false));
		input.addAttribute(new Attribute("align",true));
		input.addAttribute(new Attribute("alt",true));
		input.addAttribute(new Attribute("border",true));
		input.addAttribute(new Attribute("dynsrc",true));
		input.addAttribute(new Attribute("height",true));
		input.addAttribute(new Attribute("ismap",false));
		input.addAttribute(new Attribute("lowsrc",true));
		input.addAttribute(new Attribute("src",true));
		input.addAttribute(new Attribute("width",true));
		input.addAttribute(new Attribute("class",true));
		input.addAttribute(new Attribute("dir",true));
		input.addAttribute(new Attribute("id",true));
		input.addAttribute(new Attribute("lang",true));
		input.addAttribute(new Attribute("language",true));
		input.addAttribute(new Attribute("name",true));
		input.addAttribute(new Attribute("style",true));
		input.addAttribute(new Attribute("title",true));
		tagList.add(input);
		
		Tag ins = new Tag("ins",true);
		ins.addAttribute(new Attribute("cite",true));
		ins.addAttribute(new Attribute("datetime",true));
		ins.addAttribute(new Attribute("class",true));
		ins.addAttribute(new Attribute("dir",true));
		ins.addAttribute(new Attribute("id",true));
		ins.addAttribute(new Attribute("lang",true));
		ins.addAttribute(new Attribute("style",true));
		ins.addAttribute(new Attribute("title",true));		
		tagList.add(ins);
		
		Tag isindex = new Tag("isindex",false);
		isindex.addAttribute(new Attribute("action",true));
		isindex.addAttribute(new Attribute("prompt",true));
		isindex.addAttribute(new Attribute("class",true));
		isindex.addAttribute(new Attribute("dir",true));
		isindex.addAttribute(new Attribute("id",true));
		isindex.addAttribute(new Attribute("lang",true));
		isindex.addAttribute(new Attribute("style",true));
		isindex.addAttribute(new Attribute("title",true));		
		tagList.add(isindex);

		Tag kbd = new Tag("kbd",true);
		kbd.addAttribute(new Attribute("class",true));
		kbd.addAttribute(new Attribute("dir",true));
		kbd.addAttribute(new Attribute("id",true));
		kbd.addAttribute(new Attribute("lang",true));
		kbd.addAttribute(new Attribute("style",true));
		kbd.addAttribute(new Attribute("title",true));		
		tagList.add(kbd);
		
		Tag keygen = new Tag("keygen",false);
		keygen.addAttribute(new Attribute("name",true));
		keygen.addAttribute(new Attribute("challenge",true));
		tagList.add(keygen);

		Tag label = new Tag("label",true);
		label.addAttribute(new Attribute("class",true));
		label.addAttribute(new Attribute("dir",true));
		label.addAttribute(new Attribute("id",true));
		label.addAttribute(new Attribute("lang",true));
		label.addAttribute(new Attribute("style",true));
		label.addAttribute(new Attribute("title",true));
		tagList.add(label);
		
		Tag legend = new Tag("legend",true);
		legend.addAttribute(new Attribute("align",true));
		legend.addAttribute(new Attribute("class",true));
		legend.addAttribute(new Attribute("dir",true));
		legend.addAttribute(new Attribute("id",true));
		legend.addAttribute(new Attribute("lang",true));
		legend.addAttribute(new Attribute("style",true));
		legend.addAttribute(new Attribute("title",true));		
		tagList.add(legend);
		
		Tag li = new Tag("li",true);
		li.addAttribute(new Attribute("type",true));
		li.addAttribute(new Attribute("value",true));
		li.addAttribute(new Attribute("class",true));
		li.addAttribute(new Attribute("dir",true));
		li.addAttribute(new Attribute("id",true));
		li.addAttribute(new Attribute("lang",true));
		li.addAttribute(new Attribute("style",true));
		li.addAttribute(new Attribute("title",true));		
		tagList.add(li);
		
		Tag link = new Tag("link",true);
		link.addAttribute(new Attribute("rel",true));
		link.addAttribute(new Attribute("href",true));
		link.addAttribute(new Attribute("src",true));
		link.addAttribute(new Attribute("charset",true));
		link.addAttribute(new Attribute("disabled",false));
		link.addAttribute(new Attribute("hreflang",true));
		link.addAttribute(new Attribute("media",true));
		link.addAttribute(new Attribute("methods",true));
		link.addAttribute(new Attribute("rev",true));
		link.addAttribute(new Attribute("target",true));
		link.addAttribute(new Attribute("type",true));
		link.addAttribute(new Attribute("urn",true));
		link.addAttribute(new Attribute("class",true));
		link.addAttribute(new Attribute("dir",true));
		link.addAttribute(new Attribute("id",true));
		link.addAttribute(new Attribute("lang",true));
		link.addAttribute(new Attribute("language",true));
		link.addAttribute(new Attribute("style",true));
		link.addAttribute(new Attribute("title",true));
		tagList.add(link);
		
		Tag map = new Tag("map",true);
		map.addAttribute(new Attribute("name",true));
		map.addAttribute(new Attribute("class",true));
		map.addAttribute(new Attribute("dir",true));
		map.addAttribute(new Attribute("id",true));
		map.addAttribute(new Attribute("lang",true));
		map.addAttribute(new Attribute("language",true));
		map.addAttribute(new Attribute("name",true));
		map.addAttribute(new Attribute("style",true));
		map.addAttribute(new Attribute("title",true));
		tagList.add(map);
		
		Tag marquee = new Tag("marquee",true);
		marquee.addAttribute(new Attribute("behavior",true));
		marquee.addAttribute(new Attribute("bgcolor",true));
		marquee.addAttribute(new Attribute("direction",true));
		marquee.addAttribute(new Attribute("height",true));
		marquee.addAttribute(new Attribute("hspace",true));
		marquee.addAttribute(new Attribute("loop",true));
		marquee.addAttribute(new Attribute("scrollamount",true));
		marquee.addAttribute(new Attribute("scrolldelay",true));
		marquee.addAttribute(new Attribute("truespeed",false));
		marquee.addAttribute(new Attribute("vspace",true));
		marquee.addAttribute(new Attribute("width",true));
		marquee.addAttribute(new Attribute("class",true));
		marquee.addAttribute(new Attribute("dir",true));
		marquee.addAttribute(new Attribute("id",true));
		marquee.addAttribute(new Attribute("lang",true));
		marquee.addAttribute(new Attribute("style",true));
		marquee.addAttribute(new Attribute("title",true));
		tagList.add(marquee);
		
		Tag menu = new Tag("menu",true);
		menu.addAttribute(new Attribute("compact",false));
		menu.addAttribute(new Attribute("type",true));
		menu.addAttribute(new Attribute("class",true));
		menu.addAttribute(new Attribute("dir",true));
		menu.addAttribute(new Attribute("id",true));
		menu.addAttribute(new Attribute("lang",true));
		menu.addAttribute(new Attribute("style",true));
		menu.addAttribute(new Attribute("title",true));
		tagList.add(menu);
		
		Tag meta = new Tag("meta",false);
		meta.addAttribute(new Attribute("name",true));
		meta.addAttribute(new Attribute("http-equiv",true));
		meta.addAttribute(new Attribute("content",true));
		meta.addAttribute(new Attribute("scheme",true));
		meta.addAttribute(new Attribute("dir",true));
		meta.addAttribute(new Attribute("lang",true));
		meta.addAttribute(new Attribute("title",true));
		tagList.add(meta);
		
		Tag nobr = new Tag("nobr",true);
		nobr.addAttribute(new Attribute("class",true));
		nobr.addAttribute(new Attribute("dir",true));
		nobr.addAttribute(new Attribute("id",true));
		nobr.addAttribute(new Attribute("lang",true));
		nobr.addAttribute(new Attribute("style",true));
		nobr.addAttribute(new Attribute("title",true));
		tagList.add(nobr);
		
		Tag noembed = new Tag("noembed",true);
		tagList.add(noembed);
		
		Tag noframes = new Tag("noframes",true);
		noframes.addAttribute(new Attribute("class",true));
		noframes.addAttribute(new Attribute("dir",true));
		noframes.addAttribute(new Attribute("id",true));
		noframes.addAttribute(new Attribute("lang",true));
		noframes.addAttribute(new Attribute("style",true));
		noframes.addAttribute(new Attribute("title",true));
		tagList.add(noframes);
		
		Tag noscript = new Tag("noscript",true);
		noscript.addAttribute(new Attribute("class",true));
		noscript.addAttribute(new Attribute("dir",true));
		noscript.addAttribute(new Attribute("id",true));
		noscript.addAttribute(new Attribute("lang",true));
		noscript.addAttribute(new Attribute("style",true));
		noscript.addAttribute(new Attribute("title",true));
		tagList.add(noscript);
		
		Tag object = new Tag("object",true);
		object.addAttribute(new Attribute("alt",true));
		object.addAttribute(new Attribute("archive",true));
		object.addAttribute(new Attribute("border",true));
		object.addAttribute(new Attribute("classid",true));
		object.addAttribute(new Attribute("code",true));
		object.addAttribute(new Attribute("codebase",true));
		object.addAttribute(new Attribute("codetype",true));
		object.addAttribute(new Attribute("data",true));
		object.addAttribute(new Attribute("declare",false));
		object.addAttribute(new Attribute("name",true));
		object.addAttribute(new Attribute("standby",true));
		object.addAttribute(new Attribute("type",true));
		object.addAttribute(new Attribute("usemap",true));
		object.addAttribute(new Attribute("align",true));
		object.addAttribute(new Attribute("width",true));
		object.addAttribute(new Attribute("height",true));
		object.addAttribute(new Attribute("hspace",true));
		object.addAttribute(new Attribute("vspace",true));
		object.addAttribute(new Attribute("class",true));
		object.addAttribute(new Attribute("dir",true));
		object.addAttribute(new Attribute("id",true));
		object.addAttribute(new Attribute("lang",true));
		object.addAttribute(new Attribute("language",true));
		object.addAttribute(new Attribute("style",true));
		object.addAttribute(new Attribute("title",true));		
		tagList.add(object);
		
		Tag ol = new Tag("ol",true);
		ol.addAttribute(new Attribute("compact",false));
		ol.addAttribute(new Attribute("start",true));
		ol.addAttribute(new Attribute("type",true));
		ol.addAttribute(new Attribute("class",true));
		ol.addAttribute(new Attribute("dir",true));
		ol.addAttribute(new Attribute("id",true));
		ol.addAttribute(new Attribute("lang",true));
		ol.addAttribute(new Attribute("style",true));
		ol.addAttribute(new Attribute("title",true));		
		tagList.add(ol);
		
		Tag optgroup = new Tag("optgroup",true);
		optgroup.addAttribute(new Attribute("disabled",false));
		optgroup.addAttribute(new Attribute("label",false));
		optgroup.addAttribute(new Attribute("class",true));
		optgroup.addAttribute(new Attribute("dir",true));
		optgroup.addAttribute(new Attribute("id",true));
		optgroup.addAttribute(new Attribute("lang",true));
		optgroup.addAttribute(new Attribute("language",true));
		optgroup.addAttribute(new Attribute("style",true));
		optgroup.addAttribute(new Attribute("title",true));			
		tagList.add(optgroup);
		
		Tag option = new Tag("option",true);
		option.addAttribute(new Attribute("disabled",false));
		option.addAttribute(new Attribute("label",false));
		option.addAttribute(new Attribute("selected",false));
		option.addAttribute(new Attribute("value",true));
		option.addAttribute(new Attribute("class",true));
		option.addAttribute(new Attribute("dir",true));
		option.addAttribute(new Attribute("id",true));
		option.addAttribute(new Attribute("lang",true));
		option.addAttribute(new Attribute("language",true));
		option.addAttribute(new Attribute("style",true));
		option.addAttribute(new Attribute("title",true));
		tagList.add(option);
		
		Tag p = new Tag("p",true);
		p.addAttribute(new Attribute("align",true));
		p.addAttribute(new Attribute("class",true));
		p.addAttribute(new Attribute("dir",true));
		p.addAttribute(new Attribute("id",true));
		p.addAttribute(new Attribute("lang",true));
		p.addAttribute(new Attribute("style",true));
		p.addAttribute(new Attribute("title",true));		
		tagList.add(p);
		
		Tag param = new Tag("param",true);
		param.addAttribute(new Attribute("name",true));
		param.addAttribute(new Attribute("value",true));
		param.addAttribute(new Attribute("valuetype",true));
		param.addAttribute(new Attribute("type",true));
		param.addAttribute(new Attribute("class",true));
		param.addAttribute(new Attribute("dir",true));
		param.addAttribute(new Attribute("id",true));
		param.addAttribute(new Attribute("lang",true));
		param.addAttribute(new Attribute("language",true));
		param.addAttribute(new Attribute("style",true));
		param.addAttribute(new Attribute("title",true));
		tagList.add(param);
		
		Tag pre = new Tag("pre",true);
		pre.addAttribute(new Attribute("cols",true));
		pre.addAttribute(new Attribute("width",true));
		pre.addAttribute(new Attribute("wrap",false));
		pre.addAttribute(new Attribute("class",true));
		pre.addAttribute(new Attribute("dir",true));
		pre.addAttribute(new Attribute("id",true));
		pre.addAttribute(new Attribute("lang",true));
		pre.addAttribute(new Attribute("style",true));
		pre.addAttribute(new Attribute("title",true));		
		tagList.add(pre);
		
		Tag q = new Tag("q",true);
		q.addAttribute(new Attribute("cite",true));
		q.addAttribute(new Attribute("class",true));
		q.addAttribute(new Attribute("dir",true));
		q.addAttribute(new Attribute("id",true));
		q.addAttribute(new Attribute("lang",true));
		q.addAttribute(new Attribute("style",true));
		q.addAttribute(new Attribute("title",true));			
		tagList.add(q);
		
		Tag rb = new Tag("rb",true);
		rb.addAttribute(new Attribute("class",true));
		rb.addAttribute(new Attribute("dir",true));
		rb.addAttribute(new Attribute("id",true));
		rb.addAttribute(new Attribute("lang",true));
		rb.addAttribute(new Attribute("language",true));
		rb.addAttribute(new Attribute("style",true));
		rb.addAttribute(new Attribute("title",true));
		tagList.add(rb);
		
		Tag rp = new Tag("rp",true);
		rp.addAttribute(new Attribute("class",true));
		rp.addAttribute(new Attribute("dir",true));
		rp.addAttribute(new Attribute("id",true));
		rp.addAttribute(new Attribute("lang",true));
		rp.addAttribute(new Attribute("language",true));
		rp.addAttribute(new Attribute("style",true));
		rp.addAttribute(new Attribute("title",true));		
		tagList.add(rp);
		
		Tag rt = new Tag("rt",true);
		rt.addAttribute(new Attribute("class",true));
		rt.addAttribute(new Attribute("dir",true));
		rt.addAttribute(new Attribute("id",true));
		rt.addAttribute(new Attribute("lang",true));
		rt.addAttribute(new Attribute("style",true));
		rt.addAttribute(new Attribute("title",true));		
		tagList.add(rt);
		
		Tag ruby = new Tag("ruby",true);
		ruby.addAttribute(new Attribute("class",true));
		ruby.addAttribute(new Attribute("dir",true));
		ruby.addAttribute(new Attribute("id",true));
		ruby.addAttribute(new Attribute("lang",true));
		ruby.addAttribute(new Attribute("style",true));
		ruby.addAttribute(new Attribute("title",true));		
		tagList.add(ruby);
		
		Tag s = new Tag("s",true);
		s.addAttribute(new Attribute("class",true));
		s.addAttribute(new Attribute("dir",true));
		s.addAttribute(new Attribute("id",true));
		s.addAttribute(new Attribute("lang",true));
		s.addAttribute(new Attribute("style",true));
		s.addAttribute(new Attribute("title",true));
		tagList.add(s);
		
		Tag samp = new Tag("samp",true);
		samp.addAttribute(new Attribute("class",true));
		samp.addAttribute(new Attribute("dir",true));
		samp.addAttribute(new Attribute("id",true));
		samp.addAttribute(new Attribute("lang",true));
		samp.addAttribute(new Attribute("style",true));
		samp.addAttribute(new Attribute("title",true));		
		tagList.add(samp);
		
		Tag script = new Tag("script",true);
		script.addAttribute(new Attribute("charset",true));
		script.addAttribute(new Attribute("defer",false));
		script.addAttribute(new Attribute("event",true));
		script.addAttribute(new Attribute("for",true));
		script.addAttribute(new Attribute("src",true));
		script.addAttribute(new Attribute("type",true));
		script.addAttribute(new Attribute("class",true));
		script.addAttribute(new Attribute("id",true));
		script.addAttribute(new Attribute("language",true));
		script.addAttribute(new Attribute("title",true));		
		tagList.add(script);
		
		Tag select = new Tag("select",true);
		select.addAttribute(new Attribute("align",true));
		select.addAttribute(new Attribute("disabled",false));
		select.addAttribute(new Attribute("multiple",false));
		select.addAttribute(new Attribute("size",true));
		select.addAttribute(new Attribute("class",true));
		select.addAttribute(new Attribute("dir",true));
		select.addAttribute(new Attribute("id",true));
		select.addAttribute(new Attribute("lang",true));
		select.addAttribute(new Attribute("language",true));
		select.addAttribute(new Attribute("name",true));
		select.addAttribute(new Attribute("style",true));
		select.addAttribute(new Attribute("title",true));
		tagList.add(select);
		
		Tag small = new Tag("small",true);
		small.addAttribute(new Attribute("class",true));
		small.addAttribute(new Attribute("dir",true));
		small.addAttribute(new Attribute("id",true));
		small.addAttribute(new Attribute("lang",true));
		small.addAttribute(new Attribute("style",true));
		small.addAttribute(new Attribute("title",true));
		tagList.add(small);
		
		Tag span = new Tag("span",true);
		span.addAttribute(new Attribute("class",true));
		span.addAttribute(new Attribute("dir",true));
		span.addAttribute(new Attribute("id",true));
		span.addAttribute(new Attribute("lang",true));
		span.addAttribute(new Attribute("style",true));
		span.addAttribute(new Attribute("title",true));
		tagList.add(span);
		
		Tag strike = new Tag("strike",true);
		strike.addAttribute(new Attribute("class",true));
		strike.addAttribute(new Attribute("dir",true));
		strike.addAttribute(new Attribute("id",true));
		strike.addAttribute(new Attribute("lang",true));
		strike.addAttribute(new Attribute("style",true));
		strike.addAttribute(new Attribute("title",true));
		tagList.add(strike);
		
		Tag strong = new Tag("strong",true);
		strong.addAttribute(new Attribute("class",true));
		strong.addAttribute(new Attribute("dir",true));
		strong.addAttribute(new Attribute("id",true));
		strong.addAttribute(new Attribute("lang",true));
		strong.addAttribute(new Attribute("style",true));
		strong.addAttribute(new Attribute("title",true));
		tagList.add(strong);
		
		Tag style = new Tag("style",true);
		style.addAttribute(new Attribute("disabled",true));
		style.addAttribute(new Attribute("media",true));
		style.addAttribute(new Attribute("type",true));
		style.addAttribute(new Attribute("dir",true));
		style.addAttribute(new Attribute("lang",true));
		style.addAttribute(new Attribute("title",true));
		tagList.add(style);
		
		Tag sub = new Tag("sub",true);
		sub.addAttribute(new Attribute("class",true));
		sub.addAttribute(new Attribute("dir",true));
		sub.addAttribute(new Attribute("id",true));
		sub.addAttribute(new Attribute("lang",true));
		sub.addAttribute(new Attribute("style",true));
		sub.addAttribute(new Attribute("title",true));
		tagList.add(sub);
		
		Tag sup = new Tag("sup",true);
		sup.addAttribute(new Attribute("class",true));
		sup.addAttribute(new Attribute("dir",true));
		sup.addAttribute(new Attribute("id",true));
		sup.addAttribute(new Attribute("lang",true));
		sup.addAttribute(new Attribute("style",true));
		sup.addAttribute(new Attribute("title",true));
		tagList.add(sup);
		
		Tag table = new Tag("table",true);
		table.addAttribute(new Attribute("border",true));
		table.addAttribute(new Attribute("bordercolor",true));
		table.addAttribute(new Attribute("bordercolordark",true));
		table.addAttribute(new Attribute("bordercolorlight",true));
		table.addAttribute(new Attribute("frame",true));
		table.addAttribute(new Attribute("rules",true));
		table.addAttribute(new Attribute("background",true));
		table.addAttribute(new Attribute("bgcolor",true));
		table.addAttribute(new Attribute("align",true));
		table.addAttribute(new Attribute("cellpadding",true));
		table.addAttribute(new Attribute("cellspacing",true));
		table.addAttribute(new Attribute("height",true));
		table.addAttribute(new Attribute("hspace",true));
		table.addAttribute(new Attribute("vspace",true));
		table.addAttribute(new Attribute("width",true));
		table.addAttribute(new Attribute("cols",true));
		table.addAttribute(new Attribute("class",true));
		table.addAttribute(new Attribute("dir",true));
		table.addAttribute(new Attribute("id",true));
		table.addAttribute(new Attribute("lang",true));
		table.addAttribute(new Attribute("language",true));
		table.addAttribute(new Attribute("style",true));
		table.addAttribute(new Attribute("title",true));
		tagList.add(table);
		
		Tag tbody = new Tag("tbody",true);
		tbody.addAttribute(new Attribute("align",true));
		tbody.addAttribute(new Attribute("bgcolor",true));
		tbody.addAttribute(new Attribute("char",true));
		tbody.addAttribute(new Attribute("charoff",true));
		tbody.addAttribute(new Attribute("valign",true));
		tbody.addAttribute(new Attribute("class",true));
		tbody.addAttribute(new Attribute("dir",true));
		tbody.addAttribute(new Attribute("id",true));
		tbody.addAttribute(new Attribute("lang",true));
		tbody.addAttribute(new Attribute("language",true));
		tbody.addAttribute(new Attribute("style",true));
		tbody.addAttribute(new Attribute("title",true));
		tagList.add(tbody);
		
		Tag td = new Tag("td",true);
		td.addAttribute(new Attribute("bordercolor",true));
		td.addAttribute(new Attribute("bordercolordark",true));
		td.addAttribute(new Attribute("bordercolorlight",true));
		td.addAttribute(new Attribute("background",true));
		td.addAttribute(new Attribute("bgcolor",true));
		td.addAttribute(new Attribute("align",true));
		td.addAttribute(new Attribute("valign",true));
		td.addAttribute(new Attribute("height",true));
		td.addAttribute(new Attribute("width",true));
		td.addAttribute(new Attribute("nowrap",false));
		td.addAttribute(new Attribute("char",true));
		td.addAttribute(new Attribute("charoff",true));
		td.addAttribute(new Attribute("colspan",true));
		td.addAttribute(new Attribute("rowspan",true));
		td.addAttribute(new Attribute("abbr",true));
		td.addAttribute(new Attribute("axis",true));
		td.addAttribute(new Attribute("headers",true));
		td.addAttribute(new Attribute("scope",true));
		td.addAttribute(new Attribute("class",true));
		td.addAttribute(new Attribute("dir",true));
		td.addAttribute(new Attribute("id",true));
		td.addAttribute(new Attribute("lang",true));
		td.addAttribute(new Attribute("language",true));
		td.addAttribute(new Attribute("style",true));
		td.addAttribute(new Attribute("title",true));
		tagList.add(td);
		
		Tag textarea = new Tag("textarea",true);
		textarea.addAttribute(new Attribute("align",true));
		textarea.addAttribute(new Attribute("cols",true));
		textarea.addAttribute(new Attribute("disabled",false));
		textarea.addAttribute(new Attribute("istyle",true));
		textarea.addAttribute(new Attribute("readonly",false));
		textarea.addAttribute(new Attribute("rows",true));
		textarea.addAttribute(new Attribute("wrap",true));
		textarea.addAttribute(new Attribute("class",true));
		textarea.addAttribute(new Attribute("dir",true));
		textarea.addAttribute(new Attribute("id",true));
		textarea.addAttribute(new Attribute("lang",true));
		textarea.addAttribute(new Attribute("name",true));
		textarea.addAttribute(new Attribute("style",true));
		textarea.addAttribute(new Attribute("title",true));
		tagList.add(textarea);
		
		Tag tfoot = new Tag("tfoot",true);
		tfoot.addAttribute(new Attribute("align",true));
		tfoot.addAttribute(new Attribute("bgcolor",true));
		tfoot.addAttribute(new Attribute("char",true));
		tfoot.addAttribute(new Attribute("charoff",true));
		tfoot.addAttribute(new Attribute("valign",true));
		tfoot.addAttribute(new Attribute("class",true));
		tfoot.addAttribute(new Attribute("dir",true));
		tfoot.addAttribute(new Attribute("id",true));
		tfoot.addAttribute(new Attribute("lang",true));
		tfoot.addAttribute(new Attribute("language",true));
		tfoot.addAttribute(new Attribute("style",true));
		tfoot.addAttribute(new Attribute("title",true));
		tagList.add(tfoot);
		
		Tag th = new Tag("th",true);
		th.addAttribute(new Attribute("bordercolor",true));
		th.addAttribute(new Attribute("bordercolordark",true));
		th.addAttribute(new Attribute("bordercolorlight",true));
		th.addAttribute(new Attribute("background",true));
		th.addAttribute(new Attribute("bgcolor",true));
		th.addAttribute(new Attribute("align",true));
		th.addAttribute(new Attribute("valign",true));
		th.addAttribute(new Attribute("height",true));
		th.addAttribute(new Attribute("width",true));
		th.addAttribute(new Attribute("nowrap",false));
		th.addAttribute(new Attribute("char",true));
		th.addAttribute(new Attribute("charoff",true));
		th.addAttribute(new Attribute("colspan",true));
		th.addAttribute(new Attribute("rowspan",true));
		th.addAttribute(new Attribute("abbr",true));
		th.addAttribute(new Attribute("axis",true));
		th.addAttribute(new Attribute("headers",true));
		th.addAttribute(new Attribute("scope",true));
		th.addAttribute(new Attribute("class",true));
		th.addAttribute(new Attribute("dir",true));
		th.addAttribute(new Attribute("id",true));
		th.addAttribute(new Attribute("lang",true));
		th.addAttribute(new Attribute("language",true));
		th.addAttribute(new Attribute("style",true));
		th.addAttribute(new Attribute("title",true));		
		tagList.add(th);
		
		Tag thead = new Tag("thead",true);
		thead.addAttribute(new Attribute("align",true));
		thead.addAttribute(new Attribute("bgcolor",true));
		thead.addAttribute(new Attribute("char",true));
		thead.addAttribute(new Attribute("charoff",true));
		thead.addAttribute(new Attribute("valign",true));
		thead.addAttribute(new Attribute("class",true));
		thead.addAttribute(new Attribute("dir",true));
		thead.addAttribute(new Attribute("id",true));
		thead.addAttribute(new Attribute("lang",true));
		thead.addAttribute(new Attribute("language",true));
		thead.addAttribute(new Attribute("style",true));
		thead.addAttribute(new Attribute("title",true));		
		tagList.add(thead);
		
		Tag title = new Tag("title",true);
		title.addAttribute(new Attribute("dir",true));
		title.addAttribute(new Attribute("id",true));
		title.addAttribute(new Attribute("lang",true));
		title.addAttribute(new Attribute("title",true));		
		tagList.add(title);
		
		Tag tr = new Tag("tr",true);
		tr.addAttribute(new Attribute("bordercolor",true));
		tr.addAttribute(new Attribute("bordercolordark",true));
		tr.addAttribute(new Attribute("bordercolorlight",true));
		tr.addAttribute(new Attribute("background",true));
		tr.addAttribute(new Attribute("bgcolor",true));
		tr.addAttribute(new Attribute("align",true));
		tr.addAttribute(new Attribute("char",true));
		tr.addAttribute(new Attribute("charoff",true));
		tr.addAttribute(new Attribute("height",true));
		tr.addAttribute(new Attribute("valign",true));
		tr.addAttribute(new Attribute("class",true));
		tr.addAttribute(new Attribute("dir",true));
		tr.addAttribute(new Attribute("id",true));
		tr.addAttribute(new Attribute("lang",true));
		tr.addAttribute(new Attribute("language",true));
		tr.addAttribute(new Attribute("style",true));
		tr.addAttribute(new Attribute("title",true));
		tagList.add(tr);
		
		Tag tt = new Tag("tt",true);
		tt.addAttribute(new Attribute("class",true));
		tt.addAttribute(new Attribute("dir",true));
		tt.addAttribute(new Attribute("id",true));
		tt.addAttribute(new Attribute("lang",true));
		tt.addAttribute(new Attribute("style",true));
		tt.addAttribute(new Attribute("title",true));
		tagList.add(tt);
		
		Tag u = new Tag("u",true);
		u.addAttribute(new Attribute("class",true));
		u.addAttribute(new Attribute("dir",true));
		u.addAttribute(new Attribute("id",true));
		u.addAttribute(new Attribute("lang",true));
		u.addAttribute(new Attribute("style",true));
		u.addAttribute(new Attribute("title",true));
		tagList.add(u);

		Tag ul = new Tag("ul",true);
		ul.addAttribute(new Attribute("compact",false));
		ul.addAttribute(new Attribute("type",true));
		ul.addAttribute(new Attribute("class",true));
		ul.addAttribute(new Attribute("dir",true));
		ul.addAttribute(new Attribute("id",true));
		ul.addAttribute(new Attribute("lang",true));
		ul.addAttribute(new Attribute("style",true));
		ul.addAttribute(new Attribute("title",true));
		tagList.add(ul);
		
		Tag var = new Tag("var",true);
		var.addAttribute(new Attribute("class",true));
		var.addAttribute(new Attribute("dir",true));
		var.addAttribute(new Attribute("id",true));
		var.addAttribute(new Attribute("lang",true));
		var.addAttribute(new Attribute("style",true));
		var.addAttribute(new Attribute("title",true));
		tagList.add(var);
		
		Tag wbr = new Tag("wbr",false);
		wbr.addAttribute(new Attribute("class",true));
		wbr.addAttribute(new Attribute("dir",true));
		wbr.addAttribute(new Attribute("id",true));
		wbr.addAttribute(new Attribute("lang",true));
		wbr.addAttribute(new Attribute("language",true));
		wbr.addAttribute(new Attribute("style",true));
		wbr.addAttribute(new Attribute("title",true));
		tagList.add(wbr);
	}	
	
}
