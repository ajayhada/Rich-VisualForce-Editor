package com.vf.apex;

import java.io.IOException;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IExecutionListener;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.errors.ConfigInvalidException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.StoredConfig;
import org.eclipse.jgit.storage.file.FileRepository;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.vf.apex.editor.actions.GitPushAction;
import com.vf.apex.editor.preferences.PreferenceConstants;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin{

	// The plug-in ID
	public static final String PLUGIN_ID = "RichVisualForceEditor";

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
		registry.put(ICON_HTML,ImageDescriptor.createFromURL(getBundle().getEntry("icons/html.png")));
		registry.put(ICON_TAG,ImageDescriptor.createFromURL(getBundle().getEntry("icons/tag.gif")));
		registry.put(ICON_ATTR,ImageDescriptor.createFromURL(getBundle().getEntry("icons/attribute.gif")));
		
		getDefault().getPreferenceStore().addPropertyChangeListener(new IPropertyChangeListener(){
			public void propertyChange(PropertyChangeEvent event) {
				if(event.getProperty().startsWith("REPOSITORY")){
					String repoPath = event.getNewValue().toString();
			        try {
			             
						Git git = new Git( new FileRepository(repoPath + "/.git"));
						Repository repository = git.getRepository();
						
						String head = repository.getFullBranch();
						if (head!=null && head.startsWith("refs/heads/")) {
						        System.out.println("Current branch is " + repository.getBranch());
						        //Map<String, Ref> allRefs = repository.getAllRefs();
						        //Set<ObjectId> additionalHaves = repository.getAdditionalHaves();
						        StoredConfig config = repository.getConfig();
								config.load();
								//RepositoryState repositoryState = repository.getRepositoryState();
								//Map<String, Ref> tags = repository.getTags();
								System.out.println("GIT COnfig: " + config);
						}else{
							MessageDialog.openError(getDefault().getWorkbench().getActiveWorkbenchWindow().getShell() , "Project Git Repository is not a valid repository", "Project Git Repository is not a valid repository. \n ProjectName: " + event.getProperty() + "\n Path: " + event.getNewValue());
						}
						
					} catch (IOException e) {
						e.printStackTrace();
					} catch (ConfigInvalidException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
			        
				}
				
			}
		 });
		
		earlyStartup();
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
	
	@Override
	public ImageRegistry getImageRegistry() {
		return registry;
	}

	public void earlyStartup() {
		// TODO Auto-generated method stub
		String commandId = "org.eclipse.ui.file.save";
		ICommandService service = (ICommandService) PlatformUI.getWorkbench().getService(ICommandService.class);
		Command command = service.getCommand(commandId);
		command.addExecutionListener(new IExecutionListener() {
			
			public void preExecute(String commandId, ExecutionEvent event) {
				// TODO Auto-generated method stub
				
			}
			
			public void postExecuteSuccess(String commandId, Object returnValue) {
				Boolean isCommitEnable = Activator.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.ENABLE_GIT_COMMIT);
				if(isCommitEnable){
					GitPushAction action = new GitPushAction();
					action.run(null);
				}
			}
			
			public void postExecuteFailure(String commandId, ExecutionException exception) {
				// TODO Auto-generated method stub
				
			}
			
			public void notHandled(String commandId, NotHandledException exception) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
}
