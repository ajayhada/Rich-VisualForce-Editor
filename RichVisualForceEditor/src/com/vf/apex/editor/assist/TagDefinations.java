package com.vf.apex.editor.assist;

import java.util.ArrayList;
import java.util.List;

public class TagDefinations {

	public static List getAllTagsDefinationList() {
		ArrayList tagList = new ArrayList();
		tagList.addAll(VisualForceTagDefinition.getTagInfoAsList());
		tagList.addAll(HTMLFourTagDefination.getTagInfoAsList());
		return tagList;
	}
}
