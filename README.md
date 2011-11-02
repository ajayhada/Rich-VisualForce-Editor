# Visual Force Editor Plugin #


## Features ##
  * Html4 tag and attribute assistance 
  * VisualForce tag and attribute assistance

## What I am planing for : ##
  * HTML5 tag support will be added to future versions 
  * Only applicable tags will be visible inside tags like apex:param will only be visible for applicable parent tags
  * Display validation errors for apex and html tags
  * Used attributes will be removed from the suggestion box.
  * Suggestion box will also show some mark to show that tag is related to APEX, or HTML4, or HTML5
  * Proper Tag, Attribute, Text, Comment color scheme

## How to install : ##

  * Copy VisualForce editor plugin jar to eclipse/plugin/ folder and restart your eclipse.


## How to use ## 
  * plugin will automatically attach with .page (visualforce) pages and if not then open visualforce page with this editor.
  * Plugin will add a new Visualforce page editor option to your editor's list.
  * Open your apex visualforce file with VisualForce page editor
  * If you are creating a new visualforce file then please add at least one tag as top level parent tag.

## example ##
code><pre>
&lt;apex:page&gt;
&lt;[press ctrl+space] **
&lt;/apex:page&gt;
</pre></code>
