package com.vf.rich.editor;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * @author eclipse and AjayHada
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "Fedit"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	//Image Registry
	private ImageRegistry registry = new ImageRegistry();
	
	public static final String ICON_HTML = "_icon_html";
	public static final String ICON_TAG  = "_icon_tag";
	public static final String ICON_ATTR = "_icon_attribute";
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		registry.put(ICON_HTML,ImageDescriptor.createFromURL(getBundle().getEntry("/icons/html.png")));
		registry.put(ICON_TAG,ImageDescriptor.createFromURL(getBundle().getEntry("/icons/tag.gif")));
		registry.put(ICON_ATTR,ImageDescriptor.createFromURL(getBundle().getEntry("/icons/attribute.gif")));
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
