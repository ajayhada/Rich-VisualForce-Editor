package com.vf.apex.editor.assist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 *
 */
public class VisualForceTagDefinition {

	private static ArrayList<Tag> tagList = new ArrayList<Tag>();
	
	public static Tag[] getTagInfoAsArray(){
		return (Tag[])tagList.toArray(new Tag[tagList.size()]);
	}
	
	public static List<Tag> getTagInfoAsList(){
		return tagList;
	}
	
	
	static {
		
		/**
		 *  apex:facet 
		 */
		Tag apexfacet = new Tag("apex:facet", true);
		apexfacet.addAttribute("name");
		tagList.add(apexfacet);
		/**
		 * apex:column
		 * <apex:dataTable> or
		 * <apex:pageBlockTable>
		 */
		Tag apexcolumn = new Tag("apex:column", true);
		apexcolumn.addAttribute("breakBefore");
		apexcolumn.addAttribute("colspan");
		apexcolumn.addAttribute("dir");
		apexcolumn.addAttribute("footerClass");
		apexcolumn.addAttribute("footercolspan");
		apexcolumn.addAttribute("footerdir");
		apexcolumn.addAttribute("footerlang");
		apexcolumn.addAttribute("footeronclick");
		apexcolumn.addAttribute("footerondblclick");
		apexcolumn.addAttribute("footeronkeydown");
		apexcolumn.addAttribute("footeronkeypress");
		apexcolumn.addAttribute("footeronkeyup");
		apexcolumn.addAttribute("footeronmousedown");
		apexcolumn.addAttribute("footeronmousemove");
		apexcolumn.addAttribute("footeronmouseout");
		apexcolumn.addAttribute("footeronmouseover");
		apexcolumn.addAttribute("footeronmouseup");
		apexcolumn.addAttribute("footerstyle");
		apexcolumn.addAttribute("footertitle");
		apexcolumn.addAttribute("footerValue");
		apexcolumn.addAttribute("headerClass");
		apexcolumn.addAttribute("headercolspan");
		apexcolumn.addAttribute("headerdir");
		apexcolumn.addAttribute("headerlang");
		apexcolumn.addAttribute("headeronclick");
		apexcolumn.addAttribute("headerondblclick");
		apexcolumn.addAttribute("headeronkeydown");
		apexcolumn.addAttribute("headeronkeypress");
		apexcolumn.addAttribute("headeronkeyup");
		apexcolumn.addAttribute("headeronmousedown");
		apexcolumn.addAttribute("headeronmousemove");
		apexcolumn.addAttribute("headeronmouseout");
		apexcolumn.addAttribute("headeronmouseover");
		apexcolumn.addAttribute("headeronmouseup");
		apexcolumn.addAttribute("headerstyle");
		apexcolumn.addAttribute("headertitle");
		apexcolumn.addAttribute("headerValue");
		apexcolumn.addAttribute("id");
		apexcolumn.addAttribute("lang");
		apexcolumn.addAttribute("onclick");
		apexcolumn.addAttribute("ondblclick");
		apexcolumn.addAttribute("onkeydown");
		apexcolumn.addAttribute("onkeypress");
		apexcolumn.addAttribute("onkeyup");
		apexcolumn.addAttribute("onmousedown");
		apexcolumn.addAttribute("onmousemove");
		apexcolumn.addAttribute("onmouseout");
		apexcolumn.addAttribute("onmouseover");
		apexcolumn.addAttribute("onmouseup");
		apexcolumn.addAttribute("rendered");
		apexcolumn.addAttribute("rowspan");
		apexcolumn.addAttribute("style");
		apexcolumn.addAttribute("styleClass");
		apexcolumn.addAttribute("title");
		apexcolumn.addAttribute("value");
		apexcolumn.addAttribute("width");
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
		apexinlineEditSupport.addAttribute("changedStyleClass");
		apexinlineEditSupport.addAttribute("disabled");
		apexinlineEditSupport.addAttribute("event");
		apexinlineEditSupport.addAttribute("hideOnEdit");
		apexinlineEditSupport.addAttribute("id");
		apexinlineEditSupport.addAttribute("rendered");
		apexinlineEditSupport.addAttribute("resetFunction");
		apexinlineEditSupport.addAttribute("showOnEdit");
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
		apexparam.addAttribute("assignTo");
		apexparam.addAttribute("id");
		apexparam.addAttribute("name");
		apexparam.addAttribute("value");
		tagList.add(apexparam);
		
		Tag apexPieSeries = new Tag("apex:pieSeries", true);
		apexPieSeries.addAttribute("colorSet");
		apexPieSeries.addAttribute("dataField");
		apexPieSeries.addAttribute("donut");
		apexPieSeries.addAttribute("highlight");
		apexPieSeries.addAttribute("id");
		apexPieSeries.addAttribute("labelField");
		apexPieSeries.addAttribute("rendered");
		apexPieSeries.addAttribute("rendererFn");
		apexPieSeries.addAttribute("showInLegend");
		apexPieSeries.addAttribute("tips");
		tagList.add(apexPieSeries);
		
		Tag apexRadarSeries = new Tag("apex:radarSeries", true);
		apexRadarSeries.addAttribute("fill");
		apexRadarSeries.addAttribute("highlight");
		apexRadarSeries.addAttribute("id");
		apexRadarSeries.addAttribute("markerFill");
		apexRadarSeries.addAttribute("markerSize");
		apexRadarSeries.addAttribute("markerType");
		apexRadarSeries.addAttribute("opacity");
		apexRadarSeries.addAttribute("rendered");
		apexRadarSeries.addAttribute("showInLegend");
		apexRadarSeries.addAttribute("strokeColor");
		apexRadarSeries.addAttribute("strokeWidth");
		apexRadarSeries.addAttribute("tips");
		apexRadarSeries.addAttribute("title");
		apexRadarSeries.addAttribute("xField");
		apexRadarSeries.addAttribute("yField");
		tagList.add(apexRadarSeries);
		
		//apex:pageBlockTable 
		Tag apexpageBlockTable = new Tag("apex:pageBlockTable", true);
		apexpageBlockTable.addAttribute("align");
		apexpageBlockTable.addAttribute("bgcolor");
		apexpageBlockTable.addAttribute("border");
		apexpageBlockTable.addAttribute("captionClass");
		apexpageBlockTable.addAttribute("captionStyle");
		apexpageBlockTable.addAttribute("cellpadding");
		apexpageBlockTable.addAttribute("cellspacing");
		apexpageBlockTable.addAttribute("columnClasses");
		apexpageBlockTable.addAttribute("columns");
		apexpageBlockTable.addAttribute("columnsWidth");
		apexpageBlockTable.addAttribute("dir");
		apexpageBlockTable.addAttribute("first");
		apexpageBlockTable.addAttribute("footerClass");
		apexpageBlockTable.addAttribute("frame");
		apexpageBlockTable.addAttribute("headerClass");
		apexpageBlockTable.addAttribute("id");
		apexpageBlockTable.addAttribute("lang");
		apexpageBlockTable.addAttribute("onclick");
		apexpageBlockTable.addAttribute("ondblclick");
		apexpageBlockTable.addAttribute("onkeydown");
		apexpageBlockTable.addAttribute("onkeypress");
		apexpageBlockTable.addAttribute("onkeyup");
		apexpageBlockTable.addAttribute("onmousedown");
		apexpageBlockTable.addAttribute("onmousemove");
		apexpageBlockTable.addAttribute("onmouseout");
		apexpageBlockTable.addAttribute("onmouseover");
		apexpageBlockTable.addAttribute("onmouseup");
		apexpageBlockTable.addAttribute("onRowClick");
		apexpageBlockTable.addAttribute("onRowDblClick");
		apexpageBlockTable.addAttribute("onRowMouseDown");
		apexpageBlockTable.addAttribute("onRowMouseMove");
		apexpageBlockTable.addAttribute("onRowMouseOut");
		apexpageBlockTable.addAttribute("onRowMouseOver");
		apexpageBlockTable.addAttribute("onRowMouseUp");
		apexpageBlockTable.addAttribute("rendered");
		apexpageBlockTable.addAttribute("rowClasses");
		apexpageBlockTable.addAttribute("rows");
		apexpageBlockTable.addAttribute("rules");
		apexpageBlockTable.addAttribute("style");
		apexpageBlockTable.addAttribute("styleClass");
		apexpageBlockTable.addAttribute("summary");
		apexpageBlockTable.addAttribute("title");
		apexpageBlockTable.addAttribute("value");
		apexpageBlockTable.addAttribute("var");
		apexpageBlockTable.addAttribute("width");
		tagList.add(apexpageBlockTable);
		
		// ROOT ELEMENT
		Tag rootElement = new Tag("apex:page", true);
		rootElement.addAttribute("action");
		rootElement.addAttribute("apiVersion");
		rootElement.addAttribute("cache");
		rootElement.addAttribute("contentType");
		rootElement.addAttribute("controller");
		rootElement.addAttribute("deferLastCommandUntilReady");
		rootElement.addAttribute("docType");
		rootElement.addAttribute("expires");
		rootElement.addAttribute("extensions");
		rootElement.addAttribute("id");
		rootElement.addAttribute("label");
		rootElement.addAttribute("language");
		rootElement.addAttribute("name");
		rootElement.addAttribute("pageStyle");
		rootElement.addAttribute("readOnly");
		rootElement.addAttribute("recordSetName");
		rootElement.addAttribute("recordSetVar");
		rootElement.addAttribute("renderAs");
		rootElement.addAttribute("rendered");
		rootElement.addAttribute("setup");
		rootElement.addAttribute("showChat");
		rootElement.addAttribute("showHeader");
		rootElement.addAttribute("sidebar");
		rootElement.addAttribute("standardController");
		rootElement.addAttribute("standardStylesheets");
		rootElement.addAttribute("tabStyle");
		rootElement.addAttribute("title");
		rootElement.addAttribute("wizard");
		tagList.add(rootElement);
		
		// apex:repeat
		Tag apexrepeat = new Tag("apex:repeat", true);
		apexrepeat.addAttribute("first");
		apexrepeat.addAttribute("id");
		apexrepeat.addAttribute("rendered");
		apexrepeat.addAttribute("rows");
		apexrepeat.addAttribute("value");
		apexrepeat.addAttribute("var");
		tagList.add(apexrepeat);
		
		Tag apexScatterSeries = new Tag("apex:scatterSeries", true);
		apexScatterSeries.addAttribute("axis");
		apexScatterSeries.addAttribute("highlight");
		apexScatterSeries.addAttribute("id");
		apexScatterSeries.addAttribute("markerFill");
		apexScatterSeries.addAttribute("markerSize");
		apexScatterSeries.addAttribute("markerType");
		apexScatterSeries.addAttribute("rendered");
		apexScatterSeries.addAttribute("rendererFn");
		apexScatterSeries.addAttribute("showInLegend");
		apexScatterSeries.addAttribute("tips");
		apexScatterSeries.addAttribute("title");
		apexScatterSeries.addAttribute("xField");
		apexScatterSeries.addAttribute("yField");
		tagList.add(apexScatterSeries);
		
		// ROOT ELEMENT CHILDS
		// FORM ELEMENT
		Tag apexForm = new Tag("apex:form", true);
		apexForm.addAttribute("accept");
		apexForm.addAttribute("acceptcharset");
		apexForm.addAttribute("dir");
		apexForm.addAttribute("enctype");
		apexForm.addAttribute("forceSSL");
		apexForm.addAttribute("id");
		apexForm.addAttribute("lang");
		apexForm.addAttribute("onclick");
		apexForm.addAttribute("ondblclick");
		apexForm.addAttribute("onkeydown");
		apexForm.addAttribute("onkeypress");
		apexForm.addAttribute("onkeyup");
		apexForm.addAttribute("onmousedown");
		apexForm.addAttribute("onmousemove");
		apexForm.addAttribute("onmouseout");
		apexForm.addAttribute("onmouseover");
		apexForm.addAttribute("onmouseup");
		apexForm.addAttribute("onreset");
		apexForm.addAttribute("onsubmit");
		apexForm.addAttribute("prependId");
		apexForm.addAttribute("rendered");
		apexForm.addAttribute("style");
		apexForm.addAttribute("styleClass");
		apexForm.addAttribute("target");
		apexForm.addAttribute("title");
		tagList.add(apexForm);
		
		Tag apexGaugeSeries = new Tag("apex:gaugeSeries", true);
		apexGaugeSeries.addAttribute("colorSet");
		apexGaugeSeries.addAttribute("dataField");
		apexGaugeSeries.addAttribute("donut");
		apexGaugeSeries.addAttribute("highlight");
		apexGaugeSeries.addAttribute("id");
		apexGaugeSeries.addAttribute("labelField");
		apexGaugeSeries.addAttribute("needle");
		apexGaugeSeries.addAttribute("rendered");
		apexGaugeSeries.addAttribute("rendererFn");
		apexGaugeSeries.addAttribute("tips");
		tagList.add(apexGaugeSeries);
		
		
		// apex:inputCheckbox
		Tag apexinputCheckbox = new Tag("apex:inputCheckbox", true);
		apexinputCheckbox.addAttribute("accesskey");
		apexinputCheckbox.addAttribute("dir");
		apexinputCheckbox.addAttribute("disabled");
		apexinputCheckbox.addAttribute("id");
		apexinputCheckbox.addAttribute("immediate");
		apexinputCheckbox.addAttribute("label");
		apexinputCheckbox.addAttribute("lang");
		apexinputCheckbox.addAttribute("onblur");
		apexinputCheckbox.addAttribute("onchange");
		apexinputCheckbox.addAttribute("onclick");
		apexinputCheckbox.addAttribute("ondblclick");
		apexinputCheckbox.addAttribute("onfocus");
		apexinputCheckbox.addAttribute("onkeydown");
		apexinputCheckbox.addAttribute("onkeypress");
		apexinputCheckbox.addAttribute("onkeyup");
		apexinputCheckbox.addAttribute("onmousedown");
		apexinputCheckbox.addAttribute("onmousemove");
		apexinputCheckbox.addAttribute("onmouseout");
		apexinputCheckbox.addAttribute("onmouseover");
		apexinputCheckbox.addAttribute("onmouseup");
		apexinputCheckbox.addAttribute("onselect");
		apexinputCheckbox.addAttribute("rendered");
		apexinputCheckbox.addAttribute("required");
		apexinputCheckbox.addAttribute("selected");
		apexinputCheckbox.addAttribute("style");
		apexinputCheckbox.addAttribute("styleClass");
		apexinputCheckbox.addAttribute("tabindex");
		apexinputCheckbox.addAttribute("title");
		apexinputCheckbox.addAttribute("value");
		tagList.add(apexinputCheckbox);
		
		// apex:inputField
		Tag apexinputField = new Tag("apex:inputField", true);
		apexinputField.addAttribute("id");
		apexinputField.addAttribute("label");
		apexinputField.addAttribute("onblur");
		apexinputField.addAttribute("onchange");
		apexinputField.addAttribute("onclick");
		apexinputField.addAttribute("ondblclick");
		apexinputField.addAttribute("onfocus");
		apexinputField.addAttribute("onkeydown");
		apexinputField.addAttribute("onkeypress");
		apexinputField.addAttribute("onkeyup");
		apexinputField.addAttribute("onmousedown");
		apexinputField.addAttribute("onmousemove");
		apexinputField.addAttribute("onmouseout");
		apexinputField.addAttribute("onmouseover");
		apexinputField.addAttribute("onmouseup");
		apexinputField.addAttribute("onselect");
		apexinputField.addAttribute("rendered");
		apexinputField.addAttribute("required");
		apexinputField.addAttribute("style");
		apexinputField.addAttribute("styleClass");
		apexinputField.addAttribute("taborderhint");
		apexinputField.addAttribute("value");
		tagList.add(apexinputField);
		
		// apex:inputFile
		Tag apexinputFile = new Tag("apex:inputFile", true);
		apexinputFile.addAttribute("accept");
		apexinputFile.addAttribute("accessKey");
		apexinputFile.addAttribute("alt");
		apexinputFile.addAttribute("contentType");
		apexinputFile.addAttribute("dir");
		apexinputFile.addAttribute("disabled");
		apexinputFile.addAttribute("fileName");
		apexinputFile.addAttribute("fileSize");
		apexinputFile.addAttribute("id");
		apexinputFile.addAttribute("lang");
		apexinputFile.addAttribute("onblur");
		apexinputFile.addAttribute("onchange");
		apexinputFile.addAttribute("onclick");
		apexinputFile.addAttribute("ondblclick");
		apexinputFile.addAttribute("onfocus");
		apexinputFile.addAttribute("onkeydown");
		apexinputFile.addAttribute("onkeypress");
		apexinputFile.addAttribute("onkeyup");
		apexinputFile.addAttribute("onmousedown");
		apexinputFile.addAttribute("onmousemove");
		apexinputFile.addAttribute("onmouseout");
		apexinputFile.addAttribute("onmouseover");
		apexinputFile.addAttribute("rendered");
		apexinputFile.addAttribute("required");
		apexinputFile.addAttribute("size");
		apexinputFile.addAttribute("style");
		apexinputFile.addAttribute("styleclass");
		apexinputFile.addAttribute("tabindex");
		apexinputFile.addAttribute("title");
		apexinputFile.addAttribute("value");
		tagList.add(apexinputFile);
		
		//  apex:inputText
		Tag apexinputText = new Tag("apex:inputText", true);
		apexinputText.addAttribute("accesskey");
		apexinputText.addAttribute("alt");
		apexinputText.addAttribute("dir");
		apexinputText.addAttribute("disabled");
		apexinputText.addAttribute("id");
		apexinputText.addAttribute("label");
		apexinputText.addAttribute("lang");
		apexinputText.addAttribute("maxlength");
		apexinputText.addAttribute("onblur");
		apexinputText.addAttribute("onchange");
		apexinputText.addAttribute("onclick");
		apexinputText.addAttribute("ondblclick");
		apexinputText.addAttribute("onfocus");
		apexinputText.addAttribute("onkeydown");
		apexinputText.addAttribute("onkeypress");
		apexinputText.addAttribute("onkeyup");
		apexinputText.addAttribute("onmousedown");
		apexinputText.addAttribute("onmousemove");
		apexinputText.addAttribute("onmouseout");
		apexinputText.addAttribute("onmouseover");
		apexinputText.addAttribute("onmouseup");
		apexinputText.addAttribute("rendered");
		apexinputText.addAttribute("required");
		apexinputText.addAttribute("size");
		apexinputText.addAttribute("style");
		apexinputText.addAttribute("styleClass");
		apexinputText.addAttribute("tabindex");
		apexinputText.addAttribute("title");
		apexinputText.addAttribute("value");
		tagList.add(apexinputText);
		
		// apex:inputTextarea
		Tag apexinputTextarea = new Tag("apex:inputTextarea", true);
		apexinputTextarea.addAttribute("accesskey");
		apexinputTextarea.addAttribute("cols");
		apexinputTextarea.addAttribute("dir");
		apexinputTextarea.addAttribute("disabled");
		apexinputTextarea.addAttribute("id");
		apexinputTextarea.addAttribute("label");
		apexinputTextarea.addAttribute("lang");
		apexinputTextarea.addAttribute("onblur");
		apexinputTextarea.addAttribute("onchange");
		apexinputTextarea.addAttribute("onclick");
		apexinputTextarea.addAttribute("ondblclick");
		apexinputTextarea.addAttribute("onfocus");
		apexinputTextarea.addAttribute("onkeydown");
		apexinputTextarea.addAttribute("onkeypress");
		apexinputTextarea.addAttribute("onkeyup");
		apexinputTextarea.addAttribute("onmousedown");
		apexinputTextarea.addAttribute("onmousemove");
		apexinputTextarea.addAttribute("onmouseout");
		apexinputTextarea.addAttribute("onmouseover");
		apexinputTextarea.addAttribute("onmouseup");
		apexinputTextarea.addAttribute("onselect");
		apexinputTextarea.addAttribute("readonly");
		apexinputTextarea.addAttribute("rendered");
		apexinputTextarea.addAttribute("required");
		apexinputTextarea.addAttribute("richText");
		apexinputTextarea.addAttribute("rows");
		apexinputTextarea.addAttribute("style");
		apexinputTextarea.addAttribute("styleClass");
		apexinputTextarea.addAttribute("tabindex");
		apexinputTextarea.addAttribute("title");
		apexinputTextarea.addAttribute("value");
		tagList.add(apexinputTextarea);
		
		// apex:inputHidden
		Tag apexinputHidden = new Tag("apex:inputHidden", true);
		apexinputHidden.addAttribute("id");
		apexinputHidden.addAttribute("immediate");
		apexinputHidden.addAttribute("rendered");
		apexinputHidden.addAttribute("required");
		apexinputHidden.addAttribute("value");
		tagList.add(apexinputHidden);
		
		// apex:inputSecret
		Tag apexinputSecret = new Tag("apex:inputSecret", true);
		apexinputSecret.addAttribute("accesskey");
		apexinputSecret.addAttribute("alt");
		apexinputSecret.addAttribute("dir");
		apexinputSecret.addAttribute("disabled");
		apexinputSecret.addAttribute("id");
		apexinputSecret.addAttribute("immediate");
		apexinputSecret.addAttribute("label");
		apexinputSecret.addAttribute("lang");
		apexinputSecret.addAttribute("maxlength");
		apexinputSecret.addAttribute("onblur");
		apexinputSecret.addAttribute("onchange");
		apexinputSecret.addAttribute("onclick");
		apexinputSecret.addAttribute("ondblclick");
		apexinputSecret.addAttribute("onfocus");
		apexinputSecret.addAttribute("onkeydown");
		apexinputSecret.addAttribute("onkeypress");
		apexinputSecret.addAttribute("onkeyup");
		apexinputSecret.addAttribute("onmousedown");
		apexinputSecret.addAttribute("onmousemove");
		apexinputSecret.addAttribute("onmouseout");
		apexinputSecret.addAttribute("onmouseover");
		apexinputSecret.addAttribute("onmouseup");
		apexinputSecret.addAttribute("onselect");
		apexinputSecret.addAttribute("readonly");
		apexinputSecret.addAttribute("redisplay");
		apexinputSecret.addAttribute("rendered");
		apexinputSecret.addAttribute("required");
		apexinputSecret.addAttribute("size");
		apexinputSecret.addAttribute("style");
		apexinputSecret.addAttribute("styleClass");
		apexinputSecret.addAttribute("tabindex");
		apexinputSecret.addAttribute("title");
		apexinputSecret.addAttribute("value");
		tagList.add(apexinputSecret);
		
		// apex:selectOption
		Tag apexselectOption = new Tag("apex:selectOption", true);
		apexselectOption.addAttribute("dir");
		apexselectOption.addAttribute("id");
		apexselectOption.addAttribute("itemDescription");
		apexselectOption.addAttribute("itemDisabled");
		apexselectOption.addAttribute("itemEscaped");
		apexselectOption.addAttribute("itemLabel");
		apexselectOption.addAttribute("itemValue");
		apexselectOption.addAttribute("lang");
		apexselectOption.addAttribute("onclick");
		apexselectOption.addAttribute("ondblclick");
		apexselectOption.addAttribute("onkeydown");
		apexselectOption.addAttribute("onkeypress");
		apexselectOption.addAttribute("onkeyup");
		apexselectOption.addAttribute("onmousedown");
		apexselectOption.addAttribute("onmousemove");
		apexselectOption.addAttribute("onmouseout");
		apexselectOption.addAttribute("onmouseover");
		apexselectOption.addAttribute("onmouseup");
		apexselectOption.addAttribute("rendered");
		apexselectOption.addAttribute("style");
		apexselectOption.addAttribute("styleClass");
		apexselectOption.addAttribute("title");
		apexselectOption.addAttribute("value");
		tagList.add(apexselectOption);
		
		// apex:selectOptions
		Tag apexselectOptions = new Tag("apex:selectOptions", true);
		apexselectOptions.addAttribute("id");
		apexselectOptions.addAttribute("rendered");
		apexselectOptions.addAttribute("value");
		tagList.add(apexselectOptions);
		
		// apex:selectCheckboxes
		Tag apexselectCheckboxes = new Tag("apex:selectCheckboxes", true);
		apexselectCheckboxes.addAttribute("accesskey");
		apexselectCheckboxes.addAttribute("border");
		apexselectCheckboxes.addAttribute("dir");
		apexselectCheckboxes.addAttribute("disabled");
		apexselectCheckboxes.addAttribute("disabledClass");
		apexselectCheckboxes.addAttribute("enabledClass");
		apexselectCheckboxes.addAttribute("id");
		apexselectCheckboxes.addAttribute("immediate");
		apexselectCheckboxes.addAttribute("label");
		apexselectCheckboxes.addAttribute("lang");
		apexselectCheckboxes.addAttribute("layout");
		apexselectCheckboxes.addAttribute("onblur");
		apexselectCheckboxes.addAttribute("onchange");
		apexselectCheckboxes.addAttribute("onclick");
		apexselectCheckboxes.addAttribute("ondblclick");
		apexselectCheckboxes.addAttribute("onfocus");
		apexselectCheckboxes.addAttribute("onkeydown");
		apexselectCheckboxes.addAttribute("onkeypress");
		apexselectCheckboxes.addAttribute("onkeyup");
		apexselectCheckboxes.addAttribute("onmousedown");
		apexselectCheckboxes.addAttribute("onmousemove");
		apexselectCheckboxes.addAttribute("onmouseout");
		apexselectCheckboxes.addAttribute("onmouseover");
		apexselectCheckboxes.addAttribute("onmouseup");
		apexselectCheckboxes.addAttribute("onselect");
		apexselectCheckboxes.addAttribute("readonly");
		apexselectCheckboxes.addAttribute("rendered");
		apexselectCheckboxes.addAttribute("required");
		apexselectCheckboxes.addAttribute("style");
		apexselectCheckboxes.addAttribute("styleClass");
		apexselectCheckboxes.addAttribute("tabindex");
		apexselectCheckboxes.addAttribute("title");
		apexselectCheckboxes.addAttribute("value");
		tagList.add(apexselectCheckboxes);
		
		// apex:selectList 
		Tag apexselectList = new Tag("apex:selectList", true);
		apexselectList.addAttribute("accesskey");
		apexselectList.addAttribute("dir");
		apexselectList.addAttribute("disabled");
		apexselectList.addAttribute("disabledClass");
		apexselectList.addAttribute("enabledClass");
		apexselectList.addAttribute("id");
		apexselectList.addAttribute("label");
		apexselectList.addAttribute("lang");
		apexselectList.addAttribute("multiselect");
		apexselectList.addAttribute("onblur");
		apexselectList.addAttribute("onchange");
		apexselectList.addAttribute("onclick");
		apexselectList.addAttribute("ondblclick");
		apexselectList.addAttribute("onfocus");
		apexselectList.addAttribute("onkeydown");
		apexselectList.addAttribute("onkeypress");
		apexselectList.addAttribute("onkeyup");
		apexselectList.addAttribute("onmousedown");
		apexselectList.addAttribute("onmousemove");
		apexselectList.addAttribute("onmouseout");
		apexselectList.addAttribute("onmouseover");
		apexselectList.addAttribute("onmouseup");
		apexselectList.addAttribute("onselect");
		apexselectList.addAttribute("readonly");
		apexselectList.addAttribute("rendered");
		apexselectList.addAttribute("required");
		apexselectList.addAttribute("size");
		apexselectList.addAttribute("style");
		apexselectList.addAttribute("styleClass");
		apexselectList.addAttribute("tabindex");
		apexselectList.addAttribute("title");
		apexselectList.addAttribute("value");
		tagList.add(apexselectList);
		
		
		// apex:selectRadio
		Tag apexselectRadio = new Tag("apex:selectRadio", true);
		apexselectRadio.addAttribute("accesskey");
		apexselectRadio.addAttribute("border");
		apexselectRadio.addAttribute("dir");
		apexselectRadio.addAttribute("disabled");
		apexselectRadio.addAttribute("disabledClass");
		apexselectRadio.addAttribute("enabledClass");
		apexselectRadio.addAttribute("id");
		apexselectRadio.addAttribute("immediate");
		apexselectRadio.addAttribute("label");
		apexselectRadio.addAttribute("lang");
		apexselectRadio.addAttribute("layout");
		apexselectRadio.addAttribute("onblur");
		apexselectRadio.addAttribute("onchange");
		apexselectRadio.addAttribute("onclick");
		apexselectRadio.addAttribute("ondblclick");
		apexselectRadio.addAttribute("onfocus");
		apexselectRadio.addAttribute("onkeydown");
		apexselectRadio.addAttribute("onkeypress");
		apexselectRadio.addAttribute("onkeyup");
		apexselectRadio.addAttribute("onmousedown");
		apexselectRadio.addAttribute("onmousemove");
		apexselectRadio.addAttribute("onmouseout");
		apexselectRadio.addAttribute("onmouseover");
		apexselectRadio.addAttribute("onmouseup");
		apexselectRadio.addAttribute("onselect");
		apexselectRadio.addAttribute("readonly");
		apexselectRadio.addAttribute("rendered");
		apexselectRadio.addAttribute("required");
		apexselectRadio.addAttribute("style");
		apexselectRadio.addAttribute("styleClass");
		apexselectRadio.addAttribute("tabindex");
		apexselectRadio.addAttribute("title");
		apexselectRadio.addAttribute("value");
		tagList.add(apexselectRadio);
		
		// apex:actionFunction CHILDS
		// must be a child of an <apex:form>
		Tag apexactionFunction = new Tag("apex:actionFunction", true);
		apexactionFunction.addAttribute("action");
		apexactionFunction.addAttribute("focus");
		apexactionFunction.addAttribute("id");
		apexactionFunction.addAttribute("immediate");
		apexactionFunction.addAttribute("name");
		apexactionFunction.addAttribute("onbeforedomupdate");
		apexactionFunction.addAttribute("oncomplete");
		apexactionFunction.addAttribute("rendered");
		apexactionFunction.addAttribute("reRender");
		apexactionFunction.addAttribute("status");
		apexactionFunction.addAttribute("timeout");
		tagList.add(apexactionFunction);
		
		// apex:commandButton Element 
		Tag apexcommandButton = new Tag("apex:commandButton", true);
		apexcommandButton.addAttribute("accesskey");
		apexcommandButton.addAttribute("action");
		apexcommandButton.addAttribute("alt");
		apexcommandButton.addAttribute("dir");
		apexcommandButton.addAttribute("disabled");
		apexcommandButton.addAttribute("id");
		apexcommandButton.addAttribute("image");
		apexcommandButton.addAttribute("immediate");
		apexcommandButton.addAttribute("lang");
		apexcommandButton.addAttribute("onblur");
		apexcommandButton.addAttribute("onclick");
		apexcommandButton.addAttribute("oncomplete");
		apexcommandButton.addAttribute("ondblclick");
		apexcommandButton.addAttribute("onfocus");
		apexcommandButton.addAttribute("onkeydown");
		apexcommandButton.addAttribute("onkeypress");
		apexcommandButton.addAttribute("onkeyup");
		apexcommandButton.addAttribute("onmousedown");
		apexcommandButton.addAttribute("onmousemove");
		apexcommandButton.addAttribute("onmouseout");
		apexcommandButton.addAttribute("onmouseover");
		apexcommandButton.addAttribute("onmouseup");
		apexcommandButton.addAttribute("rendered");
		apexcommandButton.addAttribute("reRender");
		apexcommandButton.addAttribute("status");
		apexcommandButton.addAttribute("style");
		apexcommandButton.addAttribute("styleClass");
		apexcommandButton.addAttribute("tabindex");
		apexcommandButton.addAttribute("timeout");
		apexcommandButton.addAttribute("title");
		apexcommandButton.addAttribute("value");
		tagList.add(apexcommandButton);
		
		// apex:commandLink ELEMENT
		Tag apexcommandLink = new Tag("apex:commandLink", true);
		apexcommandLink.addAttribute("accesskey");
		apexcommandLink.addAttribute("action");
		apexcommandLink.addAttribute("charset");
		apexcommandLink.addAttribute("coords");
		apexcommandLink.addAttribute("dir");
		apexcommandLink.addAttribute("hreflang");
		apexcommandLink.addAttribute("id");
		apexcommandLink.addAttribute("immediate");
		apexcommandLink.addAttribute("lang");
		apexcommandLink.addAttribute("onblur");
		apexcommandLink.addAttribute("onclick");
		apexcommandLink.addAttribute("oncomplete");
		apexcommandLink.addAttribute("ondblclick");
		apexcommandLink.addAttribute("onfocus");
		apexcommandLink.addAttribute("onkeydown");
		apexcommandLink.addAttribute("onkeypress");
		apexcommandLink.addAttribute("onkeyup");
		apexcommandLink.addAttribute("onmousedown");
		apexcommandLink.addAttribute("onmousemove");
		apexcommandLink.addAttribute("onmouseout");
		apexcommandLink.addAttribute("onmouseover");
		apexcommandLink.addAttribute("onmouseup");
		apexcommandLink.addAttribute("rel");
		apexcommandLink.addAttribute("rendered");
		apexcommandLink.addAttribute("reRender");
		apexcommandLink.addAttribute("rev");
		apexcommandLink.addAttribute("shape");
		apexcommandLink.addAttribute("status");
		apexcommandLink.addAttribute("style");
		apexcommandLink.addAttribute("styleClass");
		apexcommandLink.addAttribute("tabindex");
		apexcommandLink.addAttribute("target");
		apexcommandLink.addAttribute("timeout");
		apexcommandLink.addAttribute("title");
		apexcommandLink.addAttribute("type");
		apexcommandLink.addAttribute("value");
		tagList.add(apexcommandLink);		
		
		// actionPoller ELEMENT
		Tag apexactionPoller = new Tag("apex:actionPoller", true);
		apexactionPoller.addAttribute("action");
		apexactionPoller.addAttribute("enabled");
		apexactionPoller.addAttribute("id");
		apexactionPoller.addAttribute("interval");
		apexactionPoller.addAttribute("oncomplete");
		apexactionPoller.addAttribute("onsubmit");
		apexactionPoller.addAttribute("rendered");
		apexactionPoller.addAttribute("reRender");
		apexactionPoller.addAttribute("status");
		apexactionPoller.addAttribute("timeout");
		tagList.add(apexactionPoller);	
		
		//apex:actionRegion ELEMENT
		Tag apexactionRegion = new Tag("apex:actionRegion", true);
		apexactionRegion.addAttribute("id");
		apexactionRegion.addAttribute("immediate");
		apexactionRegion.addAttribute("rendered");
		apexactionRegion.addAttribute("renderRegionOnly");
		tagList.add(apexactionRegion);	
		
		// apex:actionStatus ELEMENT
		Tag apexactionStatus = new Tag("apex:actionStatus", true);
		apexactionStatus.addAttribute("dir");
		apexactionStatus.addAttribute("for");
		apexactionStatus.addAttribute("id");
		apexactionStatus.addAttribute("lang");
		apexactionStatus.addAttribute("layout");
		apexactionStatus.addAttribute("onclick");
		apexactionStatus.addAttribute("ondblclick");
		apexactionStatus.addAttribute("onkeydown");
		apexactionStatus.addAttribute("onkeypress");
		apexactionStatus.addAttribute("onkeyup");
		apexactionStatus.addAttribute("onmousedown");
		apexactionStatus.addAttribute("onmousemove");
		apexactionStatus.addAttribute("onmouseout");
		apexactionStatus.addAttribute("onmouseover");
		apexactionStatus.addAttribute("onmouseup");
		apexactionStatus.addAttribute("onstart");
		apexactionStatus.addAttribute("onstop");
		apexactionStatus.addAttribute("rendered");
		apexactionStatus.addAttribute("startStyle");
		apexactionStatus.addAttribute("startStyleClass");
		apexactionStatus.addAttribute("startText");
		apexactionStatus.addAttribute("stopStyle");
		apexactionStatus.addAttribute("stopStyleClass");
		apexactionStatus.addAttribute("stopText");
		apexactionStatus.addAttribute("style");
		apexactionStatus.addAttribute("styleClass");
		apexactionStatus.addAttribute("title");
		tagList.add(apexactionStatus);			
		
		// apex:actionSupport ELEMENT
		Tag apexactionSupport = new Tag("apex:actionSupport", true);
		apexactionSupport.addAttribute("action");
		apexactionSupport.addAttribute("disabled");
		apexactionSupport.addAttribute("disableDefault");
		apexactionSupport.addAttribute("event");
		apexactionSupport.addAttribute("focus");
		apexactionSupport.addAttribute("id");
		apexactionSupport.addAttribute("immediate");
		apexactionSupport.addAttribute("onbeforedomupdate");
		apexactionSupport.addAttribute("oncomplete");
		apexactionSupport.addAttribute("onsubmit");
		apexactionSupport.addAttribute("rendered");
		apexactionSupport.addAttribute("reRender");
		apexactionSupport.addAttribute("status");
		apexactionSupport.addAttribute("timeout");
		tagList.add(apexactionSupport);	
		
		// apex:actionSupport ELEMENT
		//This component must be enclosed within an <apex:chart> component.
		Tag apexareaSeries = new Tag("apex:areaSeries", true);
		apexareaSeries.addAttribute("axis");
		apexareaSeries.addAttribute("colorSet");
		apexareaSeries.addAttribute("highlight");
		apexareaSeries.addAttribute("highlightLineWidth");
		apexareaSeries.addAttribute("highlightOpacity");
		apexareaSeries.addAttribute("highlightStrokeColor");
		apexareaSeries.addAttribute("id");
		apexareaSeries.addAttribute("opacity");
		apexareaSeries.addAttribute("rendered");
		apexareaSeries.addAttribute("rendererFn");
		apexareaSeries.addAttribute("showInLegend");
		apexareaSeries.addAttribute("tips");
		apexareaSeries.addAttribute("title");
		apexareaSeries.addAttribute("xField");
		apexareaSeries.addAttribute("yField");
		tagList.add(apexareaSeries);
		
		// apex:detail Element
		Tag apexdetail = new Tag("apex:detail", true);
		apexdetail.addAttribute("id");
		apexdetail.addAttribute("inlineEdit");
		apexdetail.addAttribute("oncomplete");
		apexdetail.addAttribute("relatedList");
		apexdetail.addAttribute("relatedListHover");
		apexdetail.addAttribute("rendered");
		apexdetail.addAttribute("rerender");
		apexdetail.addAttribute("showChatter");
		apexdetail.addAttribute("subject");
		apexdetail.addAttribute("title");
		tagList.add(apexdetail);	
		
		Tag apexDynamicComponent = new Tag("apex:dynamicComponent", true);
		apexDynamicComponent.addAttribute("componentValue");
		apexDynamicComponent.addAttribute("id");
		apexDynamicComponent.addAttribute("rendered");
		tagList.add(apexDynamicComponent);
		
		
		Tag apexEmailPublisher = new Tag("apex:emailPublisher", true);
		apexEmailPublisher.addAttribute("autoCollapseBody");
		apexEmailPublisher.addAttribute("bccVisibility");
		apexEmailPublisher.addAttribute("ccVisibility");
		apexEmailPublisher.addAttribute("emailBody");
		apexEmailPublisher.addAttribute("emailBodyFormat");
		apexEmailPublisher.addAttribute("emailBodyHeight");
		apexEmailPublisher.addAttribute("enableQuickText");
		apexEmailPublisher.addAttribute("entityId");
		apexEmailPublisher.addAttribute("expandableHeader");
		apexEmailPublisher.addAttribute("fromAddresses");
		apexEmailPublisher.addAttribute("fromVisibility");
		apexEmailPublisher.addAttribute("id");
		apexEmailPublisher.addAttribute("onSubmitFailure");
		apexEmailPublisher.addAttribute("onSubmitSuccess");
		apexEmailPublisher.addAttribute("rendered");
		apexEmailPublisher.addAttribute("reRender");
		apexEmailPublisher.addAttribute("sendButtonName");
		apexEmailPublisher.addAttribute("showAdditionalFields");
		apexEmailPublisher.addAttribute("showAttachments");
		apexEmailPublisher.addAttribute("showSendButton");
		apexEmailPublisher.addAttribute("showTemplates");
		apexEmailPublisher.addAttribute("subject");
		apexEmailPublisher.addAttribute("subjectVisibility");
		apexEmailPublisher.addAttribute("submitFunctionName");
		apexEmailPublisher.addAttribute("title");
		apexEmailPublisher.addAttribute("toAddresses");
		apexEmailPublisher.addAttribute("toVisibility");
		apexEmailPublisher.addAttribute("width");
		
		tagList.add(apexDynamicComponent);
		
		// apex:enhancedList Element
		Tag apexenhancedList = new Tag("apex:enhancedList", true);
		apexenhancedList.addAttribute("customizable");
		apexenhancedList.addAttribute("height");
		apexenhancedList.addAttribute("id");
		apexenhancedList.addAttribute("listId");
		apexenhancedList.addAttribute("oncomplete");
		apexenhancedList.addAttribute("rendered");
		apexenhancedList.addAttribute("reRender");
		apexenhancedList.addAttribute("rowsPerPage");
		apexenhancedList.addAttribute("type");
		apexenhancedList.addAttribute("width");
		tagList.add(apexenhancedList);	
		
		// apex:flash Element
		Tag apexflash = new Tag("apex:flash", true);
		apexflash.addAttribute("flashvars");
		apexflash.addAttribute("height");
		apexflash.addAttribute("id");
		apexflash.addAttribute("loop");
		apexflash.addAttribute("play");
		apexflash.addAttribute("rendered");
		apexflash.addAttribute("src");
		apexflash.addAttribute("width");
		tagList.add(apexflash);	
		
		// apex:iframe Element
		Tag apexiframe = new Tag("apex:iframe", true);
		apexiframe.addAttribute("frameborder");
		apexiframe.addAttribute("height");
		apexiframe.addAttribute("id");
		apexiframe.addAttribute("rendered");
		apexiframe.addAttribute("scrolling");
		apexiframe.addAttribute("src");
		apexiframe.addAttribute("title");
		apexiframe.addAttribute("width");
		tagList.add(apexiframe);	
		
		// apex:image ELEMENT
		Tag apeximage = new Tag("apex:image", true);
		apeximage.addAttribute("alt");
		apeximage.addAttribute("dir");
		apeximage.addAttribute("height");
		apeximage.addAttribute("id");
		apeximage.addAttribute("ismap");
		apeximage.addAttribute("lang");
		apeximage.addAttribute("longdesc");
		apeximage.addAttribute("onclick");
		apeximage.addAttribute("ondblclick");
		apeximage.addAttribute("onkeydown");
		apeximage.addAttribute("onkeypress");
		apeximage.addAttribute("onkeyup");
		apeximage.addAttribute("onmousedown");
		apeximage.addAttribute("onmousemove");
		apeximage.addAttribute("onmouseout");
		apeximage.addAttribute("onmouseover");
		apeximage.addAttribute("onmouseup");
		apeximage.addAttribute("rendered");
		apeximage.addAttribute("style");
		apeximage.addAttribute("styleClass");
		apeximage.addAttribute("title");
		apeximage.addAttribute("url");
		apeximage.addAttribute("usemap");
		apeximage.addAttribute("value");
		apeximage.addAttribute("width");
		tagList.add(apeximage);	
		
		//apex:include ELEMENT
		Tag apexinclude = new Tag("apex:include", true);
		apexinclude.addAttribute("id");
		apexinclude.addAttribute("pageName");
		apexinclude.addAttribute("rendered");
		tagList.add(apexinclude);	
		
		// apex:includeScript Element 
		Tag apexincludeScript = new Tag("apex:includeScript", true);
		apexincludeScript.addAttribute("id");
		apexincludeScript.addAttribute("project");
		apexincludeScript.addAttribute("value");
		tagList.add(apexincludeScript);
		
		// apex:message Element 
		Tag apexmessage = new Tag("apex:message", true);
		apexmessage.addAttribute("dir");
		apexmessage.addAttribute("for");
		apexmessage.addAttribute("id");
		apexmessage.addAttribute("lang");
		apexmessage.addAttribute("rendered");
		apexmessage.addAttribute("style");
		apexmessage.addAttribute("styleClass");
		apexmessage.addAttribute("title");
		tagList.add(apexmessage);
		
		// apex:messages Element 
		Tag apexmessages = new Tag("apex:messages", true);
		apexmessages.addAttribute("dir");
		apexmessages.addAttribute("globalOnly");
		apexmessages.addAttribute("id");
		apexmessages.addAttribute("lang");
		apexmessages.addAttribute("layout");
		apexmessages.addAttribute("rendered");
		apexmessages.addAttribute("style");
		apexmessages.addAttribute("styleClass");
		apexmessages.addAttribute("title");
		tagList.add(apexmessages);
		
		//apex:stylesheet ELEMENT
		Tag apexstylesheet = new Tag("apex:stylesheet", true);
		apexstylesheet.addAttribute("id");
		apexstylesheet.addAttribute("value");
		tagList.add(apexstylesheet);
		
		// apex:tabPanel ELEMENT
		Tag apextabPanel = new Tag("apex:tabPanel", true);
		apextabPanel.addAttribute("activeTabClass");
		apextabPanel.addAttribute("contentClass");
		apextabPanel.addAttribute("contentStyle");
		apextabPanel.addAttribute("dir");
		apextabPanel.addAttribute("disabledTabClass");
		apextabPanel.addAttribute("headerAlignment");
		apextabPanel.addAttribute("headerClass");
		apextabPanel.addAttribute("headerSpacing");
		apextabPanel.addAttribute("height");
		apextabPanel.addAttribute("id");
		apextabPanel.addAttribute("immediate");
		apextabPanel.addAttribute("inactiveTabClass");
		apextabPanel.addAttribute("lang");
		apextabPanel.addAttribute("onclick");
		apextabPanel.addAttribute("ondblclick");
		apextabPanel.addAttribute("onkeydown");
		apextabPanel.addAttribute("onkeypress");
		apextabPanel.addAttribute("onkeyup");
		apextabPanel.addAttribute("onmousedown");
		apextabPanel.addAttribute("onmousemove");
		apextabPanel.addAttribute("onmouseout");
		apextabPanel.addAttribute("onmouseover");
		apextabPanel.addAttribute("onmouseup");
		apextabPanel.addAttribute("rendered");
		apextabPanel.addAttribute("reRender");
		apextabPanel.addAttribute("selectedTab");
		apextabPanel.addAttribute("style");
		apextabPanel.addAttribute("styleClass");
		apextabPanel.addAttribute("switchType");
		apextabPanel.addAttribute("tabClass");
		apextabPanel.addAttribute("title");
		apextabPanel.addAttribute("value");
		apextabPanel.addAttribute("width");
		tagList.add(apextabPanel);
		
		// apex:tab ELEMENT
		Tag apextab = new Tag("apex:tab", true);
		apextab.addAttribute("disabled");
		apextab.addAttribute("focus");
		apextab.addAttribute("id");
		apextab.addAttribute("immediate");
		apextab.addAttribute("label");
		apextab.addAttribute("labelWidth");
		apextab.addAttribute("name");
		apextab.addAttribute("onclick");
		apextab.addAttribute("oncomplete");
		apextab.addAttribute("ondblclick");
		apextab.addAttribute("onkeydown");
		apextab.addAttribute("onkeypress");
		apextab.addAttribute("onkeyup");
		apextab.addAttribute("onmousedown");
		apextab.addAttribute("onmousemove");
		apextab.addAttribute("onmouseout");
		apextab.addAttribute("onmouseover");
		apextab.addAttribute("onmouseup");
		apextab.addAttribute("ontabenter");
		apextab.addAttribute("ontableave");
		apextab.addAttribute("rendered");
		apextab.addAttribute("reRender");
		apextab.addAttribute("status");
		apextab.addAttribute("style");
		apextab.addAttribute("styleClass");
		apextab.addAttribute("switchType");
		apextab.addAttribute("timeout");
		apextab.addAttribute("title");
		tagList.add(apextab);

		// apex:toolbar Element
		Tag apextoolbar = new Tag("apex:toolbar", true);
		apextoolbar.addAttribute("contentClass");
		apextoolbar.addAttribute("contentStyle");
		apextoolbar.addAttribute("height");
		apextoolbar.addAttribute("id");
		apextoolbar.addAttribute("itemSeparator");
		apextoolbar.addAttribute("onclick");
		apextoolbar.addAttribute("ondblclick");
		apextoolbar.addAttribute("onitemclick");
		apextoolbar.addAttribute("onitemdblclick");
		apextoolbar.addAttribute("onitemkeydown");
		apextoolbar.addAttribute("onitemkeypress");
		apextoolbar.addAttribute("onitemkeyup");
		apextoolbar.addAttribute("onitemmousedown");
		apextoolbar.addAttribute("onitemmousemove");
		apextoolbar.addAttribute("onitemmouseout");
		apextoolbar.addAttribute("onitemmouseover");
		apextoolbar.addAttribute("onitemmouseup");
		apextoolbar.addAttribute("onkeydown");
		apextoolbar.addAttribute("onkeypress");
		apextoolbar.addAttribute("onkeyup");
		apextoolbar.addAttribute("onmousedown");
		apextoolbar.addAttribute("onmousemove");
		apextoolbar.addAttribute("onmouseout");
		apextoolbar.addAttribute("onmouseover");
		apextoolbar.addAttribute("onmouseup");
		apextoolbar.addAttribute("rendered");
		apextoolbar.addAttribute("separatorClass");
		apextoolbar.addAttribute("style");
		apextoolbar.addAttribute("styleClass");
		apextoolbar.addAttribute("width");
		tagList.add(apextoolbar);
		
		// apex:toolbarGroup ELEMENT
		Tag apextoolbarGroup = new Tag("apex:toolbarGroup", true);
		apextoolbarGroup.addAttribute("id");
		apextoolbarGroup.addAttribute("itemSeparator");
		apextoolbarGroup.addAttribute("location");
		apextoolbarGroup.addAttribute("onclick");
		apextoolbarGroup.addAttribute("ondblclick");
		apextoolbarGroup.addAttribute("onkeydown");
		apextoolbarGroup.addAttribute("onkeypress");
		apextoolbarGroup.addAttribute("onkeyup");
		apextoolbarGroup.addAttribute("onmousedown");
		apextoolbarGroup.addAttribute("onmousemove");
		apextoolbarGroup.addAttribute("onmouseout");
		apextoolbarGroup.addAttribute("onmouseover");
		apextoolbarGroup.addAttribute("onmouseup");
		apextoolbarGroup.addAttribute("rendered");
		apextoolbarGroup.addAttribute("separatorClass");
		apextoolbarGroup.addAttribute("style");
		apextoolbarGroup.addAttribute("styleClass");
		tagList.add(apextoolbarGroup);
		
		// apex:variable Element
		Tag apexvariable = new Tag("apex:variable", true);
		apexvariable.addAttribute("id");
		apexvariable.addAttribute("rendered");
		apexvariable.addAttribute("value");
		apexvariable.addAttribute("var");
		tagList.add(apexvariable);
		
		// apex:vote Element
		Tag apexvote = new Tag("apex:vote", true);
		apexvote.addAttribute("id");
		apexvote.addAttribute("objectId");
		apexvote.addAttribute("rendered");
		apexvote.addAttribute("rerender");
		tagList.add(apexvote);
		
		// chatter:feed Element
		Tag chatterfeed = new Tag("chatter:feed", true);
		chatterfeed.addAttribute("entityId");
		chatterfeed.addAttribute("feedItemType");
		chatterfeed.addAttribute("id");
		chatterfeed.addAttribute("onComplete");
		chatterfeed.addAttribute("rendered");
		chatterfeed.addAttribute("reRender");
		chatterfeed.addAttribute("showPublisher");
		tagList.add(chatterfeed);
		
		// chatter:feedWithFollowers Element
		Tag chatterfeedWithFollowers = new Tag("chatter:feedWithFollowers", true);
		chatterfeedWithFollowers.addAttribute("entityId");
		chatterfeedWithFollowers.addAttribute("id");
		chatterfeedWithFollowers.addAttribute("onComplete");
		chatterfeedWithFollowers.addAttribute("rendered");
		chatterfeedWithFollowers.addAttribute("reRender");
		chatterfeedWithFollowers.addAttribute("showHeader");
		tagList.add(chatterfeedWithFollowers);
		
		// chatter:follow Element
		Tag chatterfollow = new Tag("chatter:follow", true);
		chatterfollow.addAttribute("entityId");
		chatterfollow.addAttribute("id");
		chatterfollow.addAttribute("onComplete");
		chatterfollow.addAttribute("rendered");
		chatterfollow.addAttribute("reRender");
		tagList.add(chatterfollow);
		
		// chatter:followers Element
		Tag chatterfollowers = new Tag("chatter:followers", true);
		chatterfollowers.addAttribute("entityId");
		chatterfollowers.addAttribute("id");
		chatterfollowers.addAttribute("rendered");
		tagList.add(chatterfollowers);
		
		Tag chatterNewsfeed = new Tag("chatter:newsfeed", true);
		chatterNewsfeed.addAttribute("id");
		chatterNewsfeed.addAttribute("onComplete");
		chatterNewsfeed.addAttribute("rendered");
		chatterNewsfeed.addAttribute("reRender");
		tagList.add(chatterNewsfeed);
		
		Tag chatteranswersAllfeeds = new Tag("chatteranswers:allfeeds", true);
		chatteranswersAllfeeds.addAttribute("articleLanguage");
		chatteranswersAllfeeds.addAttribute("communityId");
		chatteranswersAllfeeds.addAttribute("forceSecureCustomWebAddress");
		chatteranswersAllfeeds.addAttribute("id");
		chatteranswersAllfeeds.addAttribute("noSignIn");
		chatteranswersAllfeeds.addAttribute("rendered");
		chatteranswersAllfeeds.addAttribute("useUrlRewriter");
		tagList.add(chatteranswersAllfeeds);
		
		Tag chatteranswersChangepassword = new Tag("chatteranswers:changepassword", true);
		chatteranswersChangepassword.addAttribute("id");
		chatteranswersChangepassword.addAttribute("rendered");
		tagList.add(chatteranswersChangepassword);
		
		Tag chatteranswersForgotpassword = new Tag("chatteranswers:forgotpassword", true);
		chatteranswersForgotpassword.addAttribute("id");
		chatteranswersForgotpassword.addAttribute("rendered");
		chatteranswersForgotpassword.addAttribute("useUrlRewriter");
		tagList.add(chatteranswersForgotpassword);
		
		Tag chatteranswersForgotpasswordconfirm = new Tag("chatteranswers:forgotpasswordconfirm", true);
		chatteranswersForgotpasswordconfirm.addAttribute("id");
		chatteranswersForgotpasswordconfirm.addAttribute("rendered");
		chatteranswersForgotpasswordconfirm.addAttribute("useUrlRewriter");
		tagList.add(chatteranswersForgotpasswordconfirm);
		
		Tag chatteranswersHelp = new Tag("chatteranswers:help", true);
		chatteranswersHelp.addAttribute("id");
		chatteranswersHelp.addAttribute("rendered");
		tagList.add(chatteranswersHelp);
		
		Tag chatteranswersLogin = new Tag("chatteranswers:login", true);
		chatteranswersLogin.addAttribute("id");
		chatteranswersLogin.addAttribute("rendered");
		chatteranswersLogin.addAttribute("useUrlRewriter");
		tagList.add(chatteranswersLogin);
		
		Tag chatteranswersRegistration = new Tag("chatteranswers:registration", true);
		chatteranswersRegistration.addAttribute("hideTerms");
		chatteranswersRegistration.addAttribute("id");
		chatteranswersRegistration.addAttribute("rendered");
		chatteranswersRegistration.addAttribute("useUrlRewriter");
		tagList.add(chatteranswersRegistration);
		
		Tag chatteranswersSingleitemfeed = new Tag("chatteranswers:singleitemfeed", true);
		chatteranswersSingleitemfeed.addAttribute("entityId");
		chatteranswersSingleitemfeed.addAttribute("id");
		chatteranswersSingleitemfeed.addAttribute("rendered");
		tagList.add(chatteranswersSingleitemfeed);
		
		// flow:interview Element
		Tag flowinterview = new Tag("flow:interview", true);
		flowinterview.addAttribute("buttonLocation");
		flowinterview.addAttribute("buttonStyle");
		flowinterview.addAttribute("finishLocation");
		flowinterview.addAttribute("id");
		flowinterview.addAttribute("interview");
		flowinterview.addAttribute("name");
		flowinterview.addAttribute("rendered");
		flowinterview.addAttribute("rerender");
		flowinterview.addAttribute("showHelp");
		tagList.add(flowinterview);
		
		// flow:interview Element
		Tag ideasdetailOutputLink = new Tag("ideas:detailOutputLink", true);
		ideasdetailOutputLink.addAttribute("id");
		ideasdetailOutputLink.addAttribute("ideaId");
		ideasdetailOutputLink.addAttribute("page");
		ideasdetailOutputLink.addAttribute("pageNumber");
		ideasdetailOutputLink.addAttribute("pageOffset");
		ideasdetailOutputLink.addAttribute("rendered");
		ideasdetailOutputLink.addAttribute("style");
		ideasdetailOutputLink.addAttribute("styleClass");
		tagList.add(ideasdetailOutputLink);
		
		// ideas:listOutputLink Element
		Tag ideaslistOutputLink = new Tag("ideas:listOutputLink", true);
		ideaslistOutputLink.addAttribute("category");
		ideaslistOutputLink.addAttribute("communityId");
		ideaslistOutputLink.addAttribute("id");
		ideaslistOutputLink.addAttribute("page");
		ideaslistOutputLink.addAttribute("pageNumber");
		ideaslistOutputLink.addAttribute("pageOffset");
		ideaslistOutputLink.addAttribute("rendered");
		ideaslistOutputLink.addAttribute("sort");
		ideaslistOutputLink.addAttribute("status");
		ideaslistOutputLink.addAttribute("stickyAttributes");
		ideaslistOutputLink.addAttribute("style");
		ideaslistOutputLink.addAttribute("styleClass");
		tagList.add(ideaslistOutputLink);
		
		// ideas:profileListOutputLink Element
		Tag ideasprofileListOutputLink = new Tag("ideas:profileListOutputLink", true);
		ideasprofileListOutputLink.addAttribute("communityId");
		ideasprofileListOutputLink.addAttribute("id");
		ideasprofileListOutputLink.addAttribute("page");
		ideasprofileListOutputLink.addAttribute("pageNumber");
		ideasprofileListOutputLink.addAttribute("pageOffset");
		ideasprofileListOutputLink.addAttribute("rendered");
		ideasprofileListOutputLink.addAttribute("sort");
		ideasprofileListOutputLink.addAttribute("stickyAttributes");
		ideasprofileListOutputLink.addAttribute("style");
		ideasprofileListOutputLink.addAttribute("styleClass");
		ideasprofileListOutputLink.addAttribute("userId");
		tagList.add(ideasprofileListOutputLink);
		
		// knowledge:articleCaseToolbar 
		Tag knowledgearticleCaseToolbar = new Tag("knowledge:articleCaseToolbar", true);
		knowledgearticleCaseToolbar.addAttribute("articleId");
		knowledgearticleCaseToolbar.addAttribute("caseId");
		knowledgearticleCaseToolbar.addAttribute("id");
		knowledgearticleCaseToolbar.addAttribute("includeCSS");
		knowledgearticleCaseToolbar.addAttribute("rendered");
		tagList.add(knowledgearticleCaseToolbar);
		
		// knowledge:articleList Element 
		Tag knowledgearticleList = new Tag("knowledge:articleList", true);
		knowledgearticleList.addAttribute("articleTypes");
		knowledgearticleList.addAttribute("articleVar");
		knowledgearticleList.addAttribute("categories");
		knowledgearticleList.addAttribute("hasMoreVar");
		knowledgearticleList.addAttribute("id");
		knowledgearticleList.addAttribute("keyword");
		knowledgearticleList.addAttribute("language");
		knowledgearticleList.addAttribute("pageNumber");
		knowledgearticleList.addAttribute("pageSize");
		knowledgearticleList.addAttribute("rendered");
		knowledgearticleList.addAttribute("sortBy");
		tagList.add(knowledgearticleList);
		
		// knowledge:articleRendererToolbar Element
		
		Tag knowledgearticleRendererToolbar = new Tag("knowledge:articleRendererToolbar", true);
		knowledgearticleRendererToolbar.addAttribute("articleId");
		knowledgearticleRendererToolbar.addAttribute("canVote");
		knowledgearticleRendererToolbar.addAttribute("id");
		knowledgearticleRendererToolbar.addAttribute("includeCSS");
		knowledgearticleRendererToolbar.addAttribute("rendered");
		knowledgearticleRendererToolbar.addAttribute("showChatter");
		tagList.add(knowledgearticleRendererToolbar);
		
		// knowledge:articleTypeList Element 

		Tag knowledgearticleTypeList = new Tag("knowledge:articleTypeList", true);
		knowledgearticleTypeList.addAttribute("articleTypeVar");
		knowledgearticleTypeList.addAttribute("id");
		knowledgearticleTypeList.addAttribute("rendered");
		tagList.add(knowledgearticleTypeList);
		// knowledge:categoryList Element 
		
		Tag knowledgecategoryList = new Tag("knowledge:categoryList", true);
		knowledgecategoryList.addAttribute("ancestorsOf");
		knowledgecategoryList.addAttribute("categoryGroup");
		knowledgecategoryList.addAttribute("categoryVar");
		knowledgecategoryList.addAttribute("id");
		knowledgecategoryList.addAttribute("level");
		knowledgecategoryList.addAttribute("rendered");
		knowledgecategoryList.addAttribute("rootCategory");
		tagList.add(knowledgecategoryList);
		
		Tag liveAgentClientChat = new Tag("liveAgent:clientChat", true);
		liveAgentClientChat.addAttribute("id");
		liveAgentClientChat.addAttribute("rendered");
		tagList.add(liveAgentClientChat);
		
		Tag liveAgentClientChatInput = new Tag("liveAgent:clientChatInput", true);
		liveAgentClientChatInput.addAttribute("id");
		liveAgentClientChatInput.addAttribute("rendered");
		tagList.add(liveAgentClientChatInput);
		
		Tag liveAgentClientChatLog = new Tag("liveAgent:clientChatLog", true);
		liveAgentClientChatLog.addAttribute("id");
		liveAgentClientChatLog.addAttribute("rendered");
		tagList.add(liveAgentClientChatLog);
		
		Tag liveAgentClientChatMessages = new Tag("liveAgent:clientChatMessages", true);
		liveAgentClientChatMessages.addAttribute("id");
		liveAgentClientChatMessages.addAttribute("rendered");
		tagList.add(liveAgentClientChatMessages);
		
		Tag liveAgentClientChatQueuePosition = new Tag("liveAgent:clientChatQueuePosition", true);
		liveAgentClientChatQueuePosition.addAttribute("id");
		liveAgentClientChatQueuePosition.addAttribute("rendered");
		tagList.add(liveAgentClientChatQueuePosition);
		
		Tag liveAgentClientChatSaveButton = new Tag("liveAgent:clientChatSaveButton", true);
		liveAgentClientChatSaveButton.addAttribute("id");
		liveAgentClientChatSaveButton.addAttribute("label");
		liveAgentClientChatSaveButton.addAttribute("rendered");
		tagList.add(liveAgentClientChatSaveButton);
		
		Tag liveAgentClientChatSendButton = new Tag("liveAgent:clientChatSendButton", true);
		liveAgentClientChatSendButton.addAttribute("id");
		liveAgentClientChatSendButton.addAttribute("label");
		liveAgentClientChatSendButton.addAttribute("rendered");
		tagList.add(liveAgentClientChatSendButton);
		
		Tag liveAgentClientChatEndButton = new Tag("liveAgent:clientChatEndButton", true);
		liveAgentClientChatEndButton.addAttribute("id");
		liveAgentClientChatEndButton.addAttribute("label");
		liveAgentClientChatEndButton.addAttribute("rendered");
		tagList.add(liveAgentClientChatEndButton);
		
		
		// messaging:attachment Element
		Tag messagingattachment = new Tag("messaging:attachment", true);
		messagingattachment.addAttribute("filename");
		messagingattachment.addAttribute("id");
		messagingattachment.addAttribute("inline");
		messagingattachment.addAttribute("renderAs");
		messagingattachment.addAttribute("rendered");
		tagList.add(messagingattachment);
		
		// messaging:emailHeader Element 
		Tag messagingemailHeader = new Tag("messaging:emailHeader", true);
		messagingemailHeader.addAttribute("id");
		messagingemailHeader.addAttribute("name");
		messagingemailHeader.addAttribute("rendered");
		tagList.add(messagingemailHeader);
		
		// messaging:emailTemplate Element
		Tag messagingemailTemplate = new Tag("messaging:emailTemplate", true);
		messagingemailTemplate.addAttribute("id");
		messagingemailTemplate.addAttribute("language");
		messagingemailTemplate.addAttribute("recipientType");
		messagingemailTemplate.addAttribute("relatedToType");
		messagingemailTemplate.addAttribute("rendered");
		messagingemailTemplate.addAttribute("replyTo");
		messagingemailTemplate.addAttribute("subject");
		tagList.add(messagingemailTemplate);
		
		// messaging:htmlEmailBody Element
		Tag messaginghtmlEmailBody = new Tag("messaging:htmlEmailBody", true);
		messaginghtmlEmailBody.addAttribute("id");
		messaginghtmlEmailBody.addAttribute("rendered");
		tagList.add(messaginghtmlEmailBody);
		
		// messaging:plainTextEmailBody Element
		Tag messagingplainTextEmailBody = new Tag("messaging:plainTextEmailBody", true);
		messagingplainTextEmailBody.addAttribute("id");
		messagingplainTextEmailBody.addAttribute("rendered");
		tagList.add(messagingplainTextEmailBody);
		
		// site:googleAnalyticsTracking Element
		Tag sitegoogleAnalyticsTracking = new Tag("site:googleAnalyticsTracking", true);
		sitegoogleAnalyticsTracking.addAttribute("id");
		sitegoogleAnalyticsTracking.addAttribute("rendered");
		tagList.add(sitegoogleAnalyticsTracking);
		
		//site:previewAsAdmin
		Tag sitepreviewAsAdmin = new Tag("site:previewAsAdmin", true);
		sitepreviewAsAdmin.addAttribute("id");
		sitepreviewAsAdmin.addAttribute("rendered");
		tagList.add(sitepreviewAsAdmin);
		
		//social:profileViewer
		Tag socialProfileViewer = new Tag("social:profileViewer", true);
		socialProfileViewer.addAttribute("entityId");
		socialProfileViewer.addAttribute("id");
		socialProfileViewer.addAttribute("rendered");
		tagList.add(socialProfileViewer);
		
		Tag supportCaseArticles = new Tag("support:caseArticles", true);
		supportCaseArticles.addAttribute("articleTypes");
		supportCaseArticles.addAttribute("attachToEmailEnabled");
		supportCaseArticles.addAttribute("bodyHeight");
		supportCaseArticles.addAttribute("caseId");
		supportCaseArticles.addAttribute("categories");
		supportCaseArticles.addAttribute("categoryMappingEnabled");
		supportCaseArticles.addAttribute("defaultKeywords");
		supportCaseArticles.addAttribute("defaultSearchType");
		supportCaseArticles.addAttribute("id");
		supportCaseArticles.addAttribute("insertLinkToEmail");
		supportCaseArticles.addAttribute("language");
		supportCaseArticles.addAttribute("logSearch");
		supportCaseArticles.addAttribute("mode");
		supportCaseArticles.addAttribute("onSearchComplete");
		supportCaseArticles.addAttribute("rendered");
		supportCaseArticles.addAttribute("reRender");
		supportCaseArticles.addAttribute("searchButtonName");
		supportCaseArticles.addAttribute("searchFieldWidth");
		supportCaseArticles.addAttribute("searchFunctionName");
		supportCaseArticles.addAttribute("showAdvancedSearch");
		supportCaseArticles.addAttribute("title");
		supportCaseArticles.addAttribute("titlebarStyle");
		supportCaseArticles.addAttribute("width");
		tagList.add(socialProfileViewer);

		Tag supportCaseFeed = new Tag("support:caseFeed", true);
		supportCaseFeed.addAttribute("caseId");
		supportCaseFeed.addAttribute("id");
		supportCaseFeed.addAttribute("rendered");
		tagList.add(supportCaseFeed);
		
		Tag supportPortalPublisher = new Tag("support:portalPublisher", true);
		supportPortalPublisher.addAttribute("answerBody");
		supportPortalPublisher.addAttribute("answerBodyHeight");
		supportPortalPublisher.addAttribute("autoCollapseBody");
		supportPortalPublisher.addAttribute("entityId");
		supportPortalPublisher.addAttribute("id");
		supportPortalPublisher.addAttribute("onSubmitFailure");
		supportPortalPublisher.addAttribute("onSubmitSuccess");
		supportPortalPublisher.addAttribute("rendered");
		supportPortalPublisher.addAttribute("reRender");
		supportPortalPublisher.addAttribute("showSendEmailOption");
		supportPortalPublisher.addAttribute("showSubmitButton");
		supportPortalPublisher.addAttribute("submitButtonName");
		supportPortalPublisher.addAttribute("submitFunctionName");
		supportPortalPublisher.addAttribute("title");
		supportPortalPublisher.addAttribute("width");
		tagList.add(supportPortalPublisher);
		
		// apex:listViews Element
		Tag apexlistViews = new Tag("apex:listViews", true);
		apexlistViews.addAttribute("id");
		apexlistViews.addAttribute("rendered");
		apexlistViews.addAttribute("type");
		tagList.add(apexlistViews);
		
		Tag apexLogCallPublisher = new Tag("apex:logCallPublisher", true);
		apexLogCallPublisher.addAttribute("autoCollapseBody");
		apexLogCallPublisher.addAttribute("entityId");
		apexLogCallPublisher.addAttribute("id");
		apexLogCallPublisher.addAttribute("logCallBody");
		apexLogCallPublisher.addAttribute("logCallBodyHeight");
		apexLogCallPublisher.addAttribute("onSubmitFailure");
		apexLogCallPublisher.addAttribute("onSubmitSuccess");
		apexLogCallPublisher.addAttribute("rendered");
		apexLogCallPublisher.addAttribute("reRender");
		apexLogCallPublisher.addAttribute("showAdditionalFields");
		apexLogCallPublisher.addAttribute("showSubmitButton");
		apexLogCallPublisher.addAttribute("submitButtonName");
		apexLogCallPublisher.addAttribute("submitFunctionName");
		apexLogCallPublisher.addAttribute("title");
		apexLogCallPublisher.addAttribute("width");
		tagList.add(apexLogCallPublisher);
		
		// apex:outputField Element
		Tag apexoutputField = new Tag("apex:outputField", true);
		apexoutputField.addAttribute("dir");
		apexoutputField.addAttribute("id");
		apexoutputField.addAttribute("label");
		apexoutputField.addAttribute("lang");
		apexoutputField.addAttribute("rendered");
		apexoutputField.addAttribute("style");
		apexoutputField.addAttribute("styleClass");
		apexoutputField.addAttribute("title");
		apexoutputField.addAttribute("value");
		tagList.add(apexoutputField);
		
		// apex:outputLabel Element
		Tag apexoutputLabel = new Tag("apex:outputLabel", true);
		apexoutputLabel.addAttribute("accesskey");
		apexoutputLabel.addAttribute("dir");
		apexoutputLabel.addAttribute("escape");
		apexoutputLabel.addAttribute("for");
		apexoutputLabel.addAttribute("id");
		apexoutputLabel.addAttribute("lang");
		apexoutputLabel.addAttribute("onblur");
		apexoutputLabel.addAttribute("onclick");
		apexoutputLabel.addAttribute("ondblclick");
		apexoutputLabel.addAttribute("onfocus");
		apexoutputLabel.addAttribute("onkeydown");
		apexoutputLabel.addAttribute("onkeypress");
		apexoutputLabel.addAttribute("onkeyup");
		apexoutputLabel.addAttribute("onmousedown");
		apexoutputLabel.addAttribute("onmousemove");
		apexoutputLabel.addAttribute("onmouseout");
		apexoutputLabel.addAttribute("onmouseover");
		apexoutputLabel.addAttribute("onmouseup");
		apexoutputLabel.addAttribute("rendered");
		apexoutputLabel.addAttribute("style");
		apexoutputLabel.addAttribute("styleClass");
		apexoutputLabel.addAttribute("tabindex");
		apexoutputLabel.addAttribute("title");
		apexoutputLabel.addAttribute("value");
		tagList.add(apexoutputLabel);
		
		// apex:outputLink Element
		Tag apexoutputLink = new Tag("apex:outputLink", true);
		apexoutputLink.addAttribute("accesskey");
		apexoutputLink.addAttribute("charset");
		apexoutputLink.addAttribute("coords");
		apexoutputLink.addAttribute("dir");
		apexoutputLink.addAttribute("disabled");
		apexoutputLink.addAttribute("hreflang");
		apexoutputLink.addAttribute("id");
		apexoutputLink.addAttribute("lang");
		apexoutputLink.addAttribute("onblur");
		apexoutputLink.addAttribute("onclick");
		apexoutputLink.addAttribute("ondblclick");
		apexoutputLink.addAttribute("onfocus");
		apexoutputLink.addAttribute("onkeydown");
		apexoutputLink.addAttribute("onkeypress");
		apexoutputLink.addAttribute("onkeyup");
		apexoutputLink.addAttribute("onmousedown");
		apexoutputLink.addAttribute("onmousemove");
		apexoutputLink.addAttribute("onmouseout");
		apexoutputLink.addAttribute("onmouseover");
		apexoutputLink.addAttribute("onmouseup");
		apexoutputLink.addAttribute("rel");
		apexoutputLink.addAttribute("rendered");
		apexoutputLink.addAttribute("rev");
		apexoutputLink.addAttribute("shape");
		apexoutputLink.addAttribute("style");
		apexoutputLink.addAttribute("styleClass");
		apexoutputLink.addAttribute("tabindex");
		apexoutputLink.addAttribute("target");
		apexoutputLink.addAttribute("title");
		apexoutputLink.addAttribute("type");
		apexoutputLink.addAttribute("value");
		tagList.add(apexoutputLink);
		
		// apex:outputPanel Element
		Tag apexoutputPanel = new Tag("apex:outputPanel", true);
		apexoutputPanel.addAttribute("dir");
		apexoutputPanel.addAttribute("id");
		apexoutputPanel.addAttribute("lang");
		apexoutputPanel.addAttribute("layout");
		apexoutputPanel.addAttribute("onclick");
		apexoutputPanel.addAttribute("ondblclick");
		apexoutputPanel.addAttribute("onkeydown");
		apexoutputPanel.addAttribute("onkeypress");
		apexoutputPanel.addAttribute("onkeyup");
		apexoutputPanel.addAttribute("onmousedown");
		apexoutputPanel.addAttribute("onmousemove");
		apexoutputPanel.addAttribute("onmouseout");
		apexoutputPanel.addAttribute("onmouseover");
		apexoutputPanel.addAttribute("onmouseup");
		apexoutputPanel.addAttribute("rendered");
		apexoutputPanel.addAttribute("style");
		apexoutputPanel.addAttribute("styleClass");
		apexoutputPanel.addAttribute("title");
		tagList.add(apexoutputPanel);
		
		// apex:pageMessage Element
		Tag apexpageMessage = new Tag("apex:pageMessage", true);
		apexpageMessage.addAttribute("detail");
		apexpageMessage.addAttribute("escape");
		apexpageMessage.addAttribute("id");
		apexpageMessage.addAttribute("rendered");
		apexpageMessage.addAttribute("severity");
		apexpageMessage.addAttribute("strength");
		apexpageMessage.addAttribute("summary");
		apexpageMessage.addAttribute("title");
		tagList.add(apexpageMessage);
		
		// apex:pageMessages Element
		Tag apexpageMessages = new Tag("apex:pageMessages", true);
		apexpageMessages.addAttribute("escape");
		apexpageMessages.addAttribute("id");
		apexpageMessages.addAttribute("rendered");
		apexpageMessages.addAttribute("showDetail");
		tagList.add(apexpageMessages);
		
		//apex:outputText Element 
		Tag apexoutputText = new Tag("apex:outputText", true);
		apexoutputText.addAttribute("dir");
		apexoutputText.addAttribute("escape");
		apexoutputText.addAttribute("id");
		apexoutputText.addAttribute("label");
		apexoutputText.addAttribute("lang");
		apexoutputText.addAttribute("rendered");
		apexoutputText.addAttribute("style");
		apexoutputText.addAttribute("styleClass");
		apexoutputText.addAttribute("title");
		apexoutputText.addAttribute("value");
		tagList.add(apexoutputText);
		
		//apex:component ELEMENT
		Tag apexcomponent = new Tag("apex:component", true);
		apexcomponent.addAttribute("access");
		apexcomponent.addAttribute("allowDML");
		apexcomponent.addAttribute("controller");
		apexcomponent.addAttribute("extensions");
		apexcomponent.addAttribute("id");
		apexcomponent.addAttribute("language");
		apexcomponent.addAttribute("layout");
		apexcomponent.addAttribute("rendered");
		apexcomponent.addAttribute("selfClosing");
		tagList.add(apexcomponent);
		
		// apex:componentBody
		Tag apexcomponentBody = new Tag("apex:componentBody", true);
		apexcomponentBody.addAttribute("id");
		apexcomponentBody.addAttribute("rendered");
		tagList.add(apexcomponentBody);
		
		// apex:attribute
		Tag apexattribute = new Tag("apex:attribute", true);
		apexcomponentBody.addAttribute("access");
		apexcomponentBody.addAttribute("assignTo");
		apexcomponentBody.addAttribute("default");
		apexcomponentBody.addAttribute("description");
		apexcomponentBody.addAttribute("encode");
		apexcomponentBody.addAttribute("id");
		apexcomponentBody.addAttribute("name");
		apexcomponentBody.addAttribute("required");
		apexcomponentBody.addAttribute("type");
		tagList.add(apexattribute);
		
		// apex:attribute
		//This component must be enclosed within an <apex:chart> component.
		Tag apexaxis = new Tag("apex:axis", true);
		apexaxis.addAttribute("dashSize");
		apexaxis.addAttribute("fields");
		apexaxis.addAttribute("grid");
		apexaxis.addAttribute("gridFill");
		apexaxis.addAttribute("id");
		apexaxis.addAttribute("maximum");
		apexaxis.addAttribute("minimum");
		apexaxis.addAttribute("position");
		apexaxis.addAttribute("rendered");
		apexaxis.addAttribute("steps");
		apexaxis.addAttribute("title");
		apexaxis.addAttribute("type");
		tagList.add(apexaxis);
		
		
		// apex:attribute
		//This component must be enclosed within an <apex:chart> component.
		Tag apexbarSeries = new Tag("apex:barSeries", true);
		apexbarSeries.addAttribute("axis");
		apexbarSeries.addAttribute("colorSet");
		apexbarSeries.addAttribute("colorsProgressWithinSeries");
		apexbarSeries.addAttribute("groupGutter");
		apexbarSeries.addAttribute("gutter");
		apexbarSeries.addAttribute("highlight");
		apexbarSeries.addAttribute("highlightColor");
		apexbarSeries.addAttribute("highlightLineWidth");
		apexbarSeries.addAttribute("highlightOpacity");
		apexbarSeries.addAttribute("highlightStroke");
		apexbarSeries.addAttribute("id");
		apexbarSeries.addAttribute("orientation");
		apexbarSeries.addAttribute("rendered");
		apexbarSeries.addAttribute("rendererFn");
		apexbarSeries.addAttribute("showInLegend");
		apexbarSeries.addAttribute("stacked");
		apexbarSeries.addAttribute("tips");
		apexbarSeries.addAttribute("title");
		apexbarSeries.addAttribute("xField");
		apexbarSeries.addAttribute("xPadding");
		apexbarSeries.addAttribute("yField");
		apexbarSeries.addAttribute("yPadding");
		tagList.add(apexbarSeries);
		
		Tag apexChart = new Tag("apex:chart", true);
		apexChart.addAttribute("animate");
		apexChart.addAttribute("background");
		apexChart.addAttribute("colorSet");
		apexChart.addAttribute("data");
		apexChart.addAttribute("floating");
		apexChart.addAttribute("height");
		apexChart.addAttribute("hidden");
		apexChart.addAttribute("id");
		apexChart.addAttribute("legend");
		apexChart.addAttribute("name");
		apexChart.addAttribute("rendered");
		apexChart.addAttribute("renderTo");
		apexChart.addAttribute("resizable");
		apexChart.addAttribute("theme");
		apexChart.addAttribute("width");
		tagList.add(apexChart);
		
		// This component must be enclosed by a data series component.
		Tag apexChartTips = new Tag("apex:chartTips", true);
		apexChartTips.addAttribute("height");
		apexChartTips.addAttribute("id");
		apexChartTips.addAttribute("labelField");
		apexChartTips.addAttribute("rendered");
		apexChartTips.addAttribute("rendererFn");
		apexChartTips.addAttribute("trackMouse");
		apexChartTips.addAttribute("valueField");
		apexChartTips.addAttribute("width");
		tagList.add(apexChartTips);
		
		//This component must be enclosed by a data series component or an <apex:axis> component.
		Tag apexChartLabel = new Tag("apex:chartLabel", true);
		apexChartLabel.addAttribute("color");
		apexChartLabel.addAttribute("display");
		apexChartLabel.addAttribute("field");
		apexChartLabel.addAttribute("font");
		apexChartLabel.addAttribute("id");
		apexChartLabel.addAttribute("minMargin");
		apexChartLabel.addAttribute("orientation");
		apexChartLabel.addAttribute("rendered");
		apexChartLabel.addAttribute("rendererFn");
		apexChartLabel.addAttribute("rotate");
		tagList.add(apexChartLabel);
		
		// apex:dataTable ELEMENT
		Tag apexdataTable = new Tag("apex:dataTable", true);
		apexdataTable.addAttribute("align");
		apexdataTable.addAttribute("bgcolor");
		apexdataTable.addAttribute("border");
		apexdataTable.addAttribute("captionClass");
		apexdataTable.addAttribute("captionStyle");
		apexdataTable.addAttribute("cellpadding");
		apexdataTable.addAttribute("cellspacing");
		apexdataTable.addAttribute("columnClasses");
		apexdataTable.addAttribute("columns");
		apexdataTable.addAttribute("columnsWidth");
		apexdataTable.addAttribute("dir");
		apexdataTable.addAttribute("first");
		apexdataTable.addAttribute("footerClass");
		apexdataTable.addAttribute("frame");
		apexdataTable.addAttribute("headerClass");
		apexdataTable.addAttribute("id");
		apexdataTable.addAttribute("lang");
		apexdataTable.addAttribute("onclick");
		apexdataTable.addAttribute("ondblclick");
		apexdataTable.addAttribute("onkeydown");
		apexdataTable.addAttribute("onkeypress");
		apexdataTable.addAttribute("onkeyup");
		apexdataTable.addAttribute("onmousedown");
		apexdataTable.addAttribute("onmousemove");
		apexdataTable.addAttribute("onmouseout");
		apexdataTable.addAttribute("onmouseover");
		apexdataTable.addAttribute("onmouseup");
		apexdataTable.addAttribute("onRowClick");
		apexdataTable.addAttribute("onRowDblClick");
		apexdataTable.addAttribute("onRowMouseDown");
		apexdataTable.addAttribute("onRowMouseMove");
		apexdataTable.addAttribute("onRowMouseOut");
		apexdataTable.addAttribute("onRowMouseOver");
		apexdataTable.addAttribute("onRowMouseUp");
		apexdataTable.addAttribute("rendered");
		apexdataTable.addAttribute("rowClasses");
		apexdataTable.addAttribute("rows");
		apexdataTable.addAttribute("rules");
		apexdataTable.addAttribute("style");
		apexdataTable.addAttribute("styleClass");
		apexdataTable.addAttribute("summary");
		apexdataTable.addAttribute("title");
		apexdataTable.addAttribute("value");
		apexdataTable.addAttribute("var");
		apexdataTable.addAttribute("width");
		tagList.add(apexdataTable);
		
		// apex:scontrol ELEMENT
		Tag apexscontrol = new Tag("apex:scontrol", true);
		apexscontrol.addAttribute("controlName");
		apexscontrol.addAttribute("height");
		apexscontrol.addAttribute("id");
		apexscontrol.addAttribute("rendered");
		apexscontrol.addAttribute("scrollbars");
		apexscontrol.addAttribute("subject");
		apexscontrol.addAttribute("width");
		tagList.add(apexscontrol);
		
		// apex:sectionHeader  Element
		Tag apexsectionHeader = new Tag("apex:sectionHeader", true);
		apexsectionHeader.addAttribute("description");
		apexsectionHeader.addAttribute("help");
		apexsectionHeader.addAttribute("id");
		apexsectionHeader.addAttribute("printUrl");
		apexsectionHeader.addAttribute("rendered");
		apexsectionHeader.addAttribute("subtitle");
		apexsectionHeader.addAttribute("title");
		tagList.add(apexsectionHeader);
		
		// apex:relatedList Element 
		Tag apexrelatedList = new Tag("apex:relatedList", true);
		apexrelatedList.addAttribute("id");
		apexrelatedList.addAttribute("list");
		apexrelatedList.addAttribute("pageSize");
		apexrelatedList.addAttribute("rendered");
		apexrelatedList.addAttribute("subject");
		apexrelatedList.addAttribute("title");
		tagList.add(apexrelatedList);
		
		//apex:panelGrid 
		Tag apexpanelGrid = new Tag("apex:panelGrid", true);
		apexpanelGrid.addAttribute("bgcolor");
		apexpanelGrid.addAttribute("border");
		apexpanelGrid.addAttribute("captionClass");
		apexpanelGrid.addAttribute("captionStyle");
		apexpanelGrid.addAttribute("cellpadding");
		apexpanelGrid.addAttribute("cellspacing");
		apexpanelGrid.addAttribute("columnClasses");
		apexpanelGrid.addAttribute("columns");
		apexpanelGrid.addAttribute("dir");
		apexpanelGrid.addAttribute("footerClass");
		apexpanelGrid.addAttribute("frame");
		apexpanelGrid.addAttribute("headerClass");
		apexpanelGrid.addAttribute("id");
		apexpanelGrid.addAttribute("lang");
		apexpanelGrid.addAttribute("onclick");
		apexpanelGrid.addAttribute("ondblclick");
		apexpanelGrid.addAttribute("onkeydown");
		apexpanelGrid.addAttribute("onkeypress");
		apexpanelGrid.addAttribute("onkeyup");
		apexpanelGrid.addAttribute("onmousedown");
		apexpanelGrid.addAttribute("onmousemove");
		apexpanelGrid.addAttribute("onmouseout");
		apexpanelGrid.addAttribute("onmouseover");
		apexpanelGrid.addAttribute("onmouseup");
		apexpanelGrid.addAttribute("rendered");
		apexpanelGrid.addAttribute("rowClasses");
		apexpanelGrid.addAttribute("rules");
		apexpanelGrid.addAttribute("style");
		apexpanelGrid.addAttribute("styleClass");
		apexpanelGrid.addAttribute("summary");
		apexpanelGrid.addAttribute("title");
		apexpanelGrid.addAttribute("width");
		tagList.add(apexpanelGrid);
		
		//apex:panelGroup 
		Tag apexpanelGroup = new Tag("apex:panelGroup", true);
		apexpanelGroup.addAttribute("id");
		apexpanelGroup.addAttribute("layout");
		apexpanelGroup.addAttribute("rendered");
		apexpanelGroup.addAttribute("style");
		apexpanelGroup.addAttribute("styleClass");
		tagList.add(apexpanelGroup);
		
		// apex:panelBar 
		Tag apexpanelBar = new Tag("apex:panelBar", true);
		apexpanelBar.addAttribute("contentClass");
		apexpanelBar.addAttribute("contentStyle");
		apexpanelBar.addAttribute("headerClass");
		apexpanelBar.addAttribute("headerClassActive");
		apexpanelBar.addAttribute("headerStyle");
		apexpanelBar.addAttribute("headerStyleActive");
		apexpanelBar.addAttribute("height");
		apexpanelBar.addAttribute("id");
		apexpanelBar.addAttribute("items");
		apexpanelBar.addAttribute("rendered");
		apexpanelBar.addAttribute("style");
		apexpanelBar.addAttribute("styleClass");
		apexpanelBar.addAttribute("switchType");
		apexpanelBar.addAttribute("value");
		apexpanelBar.addAttribute("var");
		apexpanelBar.addAttribute("width");
		tagList.add(apexpanelBar);
		
		// apex:panelBarItem
		Tag apexpanelBarItem = new Tag("apex:panelBarItem", true);
		apexpanelBarItem.addAttribute("contentClass");
		apexpanelBarItem.addAttribute("contentStyle");
		apexpanelBarItem.addAttribute("expanded");
		apexpanelBarItem.addAttribute("headerClass");
		apexpanelBarItem.addAttribute("headerClassActive");
		apexpanelBarItem.addAttribute("headerStyle");
		apexpanelBarItem.addAttribute("headerStyleActive");
		apexpanelBarItem.addAttribute("id");
		apexpanelBarItem.addAttribute("label");
		apexpanelBarItem.addAttribute("name");
		apexpanelBarItem.addAttribute("onenter");
		apexpanelBarItem.addAttribute("onleave");
		apexpanelBarItem.addAttribute("rendered");
		tagList.add(apexpanelBarItem);
		
		// apex:composition 
		Tag apexcomposition = new Tag("apex:composition", true);
		apexcomposition.addAttribute("rendered");
		apexcomposition.addAttribute("template");
		tagList.add(apexcomposition);
		
		
		// apex:define 
		Tag apexdefine = new Tag("apex:define", true);
		apexdefine.addAttribute("name");
		tagList.add(apexdefine);
		
		// apex:insert
		Tag apexinsert = new Tag("apex:insert", true);
		apexinsert.addAttribute("name");
		tagList.add(apexinsert);
		
		Tag apexLegend = new Tag("apex:legend", true);
		apexLegend.addAttribute("font");
		apexLegend.addAttribute("id");
		apexLegend.addAttribute("padding");
		apexLegend.addAttribute("position");
		apexLegend.addAttribute("rendered");
		apexLegend.addAttribute("spacing");
		tagList.add(apexLegend);
		
		Tag apexLineSeries = new Tag("apex:lineSeries", true);
		apexLineSeries.addAttribute("axis");
		apexLineSeries.addAttribute("fill");
		apexLineSeries.addAttribute("fillColor");
		apexLineSeries.addAttribute("highlight");
		apexLineSeries.addAttribute("highlightStrokeWidth");
		apexLineSeries.addAttribute("id");
		apexLineSeries.addAttribute("markerFill");
		apexLineSeries.addAttribute("markerSize");
		apexLineSeries.addAttribute("markerType");
		apexLineSeries.addAttribute("opacity");
		apexLineSeries.addAttribute("rendered");
		apexLineSeries.addAttribute("rendererFn");
		apexLineSeries.addAttribute("showInLegend");
		apexLineSeries.addAttribute("smooth");
		apexLineSeries.addAttribute("strokeColor");
		apexLineSeries.addAttribute("strokeWidth");
		apexLineSeries.addAttribute("tips");
		apexLineSeries.addAttribute("title");
		apexLineSeries.addAttribute("xField");
		apexLineSeries.addAttribute("yField");
		tagList.add(apexLineSeries);
		
		// apex:dataList
		Tag apexdataList = new Tag("apex:dataList", true);
		apexdataList.addAttribute("dir");
		apexdataList.addAttribute("first");
		apexdataList.addAttribute("id");
		apexdataList.addAttribute("lang");
		apexdataList.addAttribute("onclick");
		apexdataList.addAttribute("ondblclick");
		apexdataList.addAttribute("onkeydown");
		apexdataList.addAttribute("onkeypress");
		apexdataList.addAttribute("onkeyup");
		apexdataList.addAttribute("onmousedown");
		apexdataList.addAttribute("onmousemove");
		apexdataList.addAttribute("onmouseout");
		apexdataList.addAttribute("onmouseover");
		apexdataList.addAttribute("onmouseup");
		apexdataList.addAttribute("rendered");
		apexdataList.addAttribute("rows");
		apexdataList.addAttribute("style");
		apexdataList.addAttribute("styleClass");
		apexdataList.addAttribute("title");
		apexdataList.addAttribute("type");
		apexdataList.addAttribute("value");
		apexdataList.addAttribute("var");
		tagList.add(apexdataList);		
		
		// apex:pageBlock Element 
		Tag apexpageBlock = new Tag("apex:pageBlock", true);
		apexpageBlock.addAttribute("dir");
		apexpageBlock.addAttribute("helpTitle");
		apexpageBlock.addAttribute("helpUrl");
		apexpageBlock.addAttribute("id");
		apexpageBlock.addAttribute("lang");
		apexpageBlock.addAttribute("mode");
		apexpageBlock.addAttribute("onclick");
		apexpageBlock.addAttribute("ondblclick");
		apexpageBlock.addAttribute("onkeydown");
		apexpageBlock.addAttribute("onkeypress");
		apexpageBlock.addAttribute("onkeyup");
		apexpageBlock.addAttribute("onmousedown");
		apexpageBlock.addAttribute("onmousemove");
		apexpageBlock.addAttribute("onmouseout");
		apexpageBlock.addAttribute("onmouseover");
		apexpageBlock.addAttribute("onmouseup");
		apexpageBlock.addAttribute("rendered");
		apexpageBlock.addAttribute("tabStyle");
		apexpageBlock.addAttribute("title");
		tagList.add(apexpageBlock);
		
		
		// apex:pageBlockButtons 
		Tag apexpageBlockButtons = new Tag("apex:pageBlockButtons", true);
		apexpageBlockButtons.addAttribute("dir");
		apexpageBlockButtons.addAttribute("id");
		apexpageBlockButtons.addAttribute("lang");
		apexpageBlockButtons.addAttribute("location");
		apexpageBlockButtons.addAttribute("onclick");
		apexpageBlockButtons.addAttribute("ondblclick");
		apexpageBlockButtons.addAttribute("onkeydown");
		apexpageBlockButtons.addAttribute("onkeypress");
		apexpageBlockButtons.addAttribute("onkeyup");
		apexpageBlockButtons.addAttribute("onmousedown");
		apexpageBlockButtons.addAttribute("onmousemove");
		apexpageBlockButtons.addAttribute("onmouseout");
		apexpageBlockButtons.addAttribute("onmouseover");
		apexpageBlockButtons.addAttribute("onmouseup");
		apexpageBlockButtons.addAttribute("rendered");
		apexpageBlockButtons.addAttribute("style");
		apexpageBlockButtons.addAttribute("styleClass");
		apexpageBlockButtons.addAttribute("title");
		tagList.add(apexpageBlockButtons);
		
		
		// apex:pageBlockSection
		Tag apexpageBlockSection = new Tag("apex:pageBlockSection", true);
		apexpageBlockSection.addAttribute("collapsible");
		apexpageBlockSection.addAttribute("columns");
		apexpageBlockSection.addAttribute("dir");
		apexpageBlockSection.addAttribute("id");
		apexpageBlockSection.addAttribute("lang");
		apexpageBlockSection.addAttribute("onclick");
		apexpageBlockSection.addAttribute("ondblclick");
		apexpageBlockSection.addAttribute("onkeydown");
		apexpageBlockSection.addAttribute("onkeypress");
		apexpageBlockSection.addAttribute("onkeyup");
		apexpageBlockSection.addAttribute("onmousedown");
		apexpageBlockSection.addAttribute("onmousemove");
		apexpageBlockSection.addAttribute("onmouseout");
		apexpageBlockSection.addAttribute("onmouseover");
		apexpageBlockSection.addAttribute("onmouseup");
		apexpageBlockSection.addAttribute("rendered");
		apexpageBlockSection.addAttribute("showHeader");
		apexpageBlockSection.addAttribute("title");
		tagList.add(apexpageBlockSection);
		
		
		// apex:pageBlockSectionItem
		Tag apexpageBlockSectionItem = new Tag("apex:pageBlockSectionItem", true);
		apexpageBlockSectionItem.addAttribute("dataStyle");
		apexpageBlockSectionItem.addAttribute("dataStyleClass");
		apexpageBlockSectionItem.addAttribute("dataTitle");
		apexpageBlockSectionItem.addAttribute("dir");
		apexpageBlockSectionItem.addAttribute("helpText");
		apexpageBlockSectionItem.addAttribute("id");
		apexpageBlockSectionItem.addAttribute("labelStyle");
		apexpageBlockSectionItem.addAttribute("labelStyleClass");
		apexpageBlockSectionItem.addAttribute("labelTitle");
		apexpageBlockSectionItem.addAttribute("lang");
		apexpageBlockSectionItem.addAttribute("onDataclick");
		apexpageBlockSectionItem.addAttribute("onDatadblclick");
		apexpageBlockSectionItem.addAttribute("onDatakeydown");
		apexpageBlockSectionItem.addAttribute("onDatakeypress");
		apexpageBlockSectionItem.addAttribute("onDatakeyup");
		apexpageBlockSectionItem.addAttribute("onDatamousedown");
		apexpageBlockSectionItem.addAttribute("onDatamousemove");
		apexpageBlockSectionItem.addAttribute("onDatamouseout");
		apexpageBlockSectionItem.addAttribute("onDatamouseover");
		apexpageBlockSectionItem.addAttribute("onDatamouseup");
		apexpageBlockSectionItem.addAttribute("onLabelclick");
		apexpageBlockSectionItem.addAttribute("onLabeldblclick");
		apexpageBlockSectionItem.addAttribute("onLabelkeydown");
		apexpageBlockSectionItem.addAttribute("onLabelkeypress");
		apexpageBlockSectionItem.addAttribute("onLabelkeyup");
		apexpageBlockSectionItem.addAttribute("onLabelmousedown");
		apexpageBlockSectionItem.addAttribute("onLabelmousemove");
		apexpageBlockSectionItem.addAttribute("onLabelmouseout");
		apexpageBlockSectionItem.addAttribute("onLabelmouseover");
		apexpageBlockSectionItem.addAttribute("onLabelmouseup");
		apexpageBlockSectionItem.addAttribute("rendered");
		tagList.add(apexpageBlockSectionItem);
		
	}	
	
}
