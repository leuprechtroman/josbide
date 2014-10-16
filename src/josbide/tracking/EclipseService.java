package josbide.tracking;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

import javax.tools.JavaCompiler;

import josbide.Activator;
import josbide.data.Assignment;
import josbide.data.events.BreakpointToggleEvent;
import josbide.data.events.EventLog;
import josbide.data.events.OsbideEvent;
import josbide.preferences.PreferenceConstants;
import josbide.util.EclipseLogger;
import josbide.wcf.OsbideWebServiceClient;
import josbide.data.user.Course;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

/**
 * This Class manages everything with EclipseEvents!
 * It recieves the EclipseEvents and produces OsbideEvents
 * 
 * @author Roman Leuprecht
 *
 */

public class EclipseService {
	
	private static EclipseService instance;
	private BreakpointToggleEventTracker t;
	private SaveEventTracker s;
	
	private IPreferenceStore prefs;
	private IJavaProject workingProject;
	
	boolean isSetUp = false;
	boolean isStarting = false;
	
	private OsbideWebServiceClient client;
	
	
	
	private EclipseService(){
		this.client = new OsbideWebServiceClient();
		prefs = Activator.getDefault().getPreferenceStore();
	};
	
	public void setUp(){		
		if(this.isSetUp || this.isStarting)
		{
			return;
		}
		this.isStarting = true;
		
		//Login user:
		
		boolean result = this.client.autoLogin();
		
		if(result == false) //No Credentials filled in
			return;
		
		EclipseLogger.getInstance().logInfo("Osbide Logged in as " + prefs.getString(PreferenceConstants.P_USERNAME));
		//Get Courses:
		
		this.client.getCoursesForUser();
		
		EclipseLogger.getInstance().logInfo("You are assigned in "+ this.client.getCourses().size() +" course(s)");
		
		//Get assignments for all courses:
		List<Course> courses = this.client.getCourses();
		
		int counter = 0;

		for(Iterator<Course> iter = courses.iterator(); iter.hasNext();){
			Course c = iter.next();
			List<Assignment> assignmentsOfThisCourse = this.client.getAssignmentsForCourse(c.getId());
			c.setAssignments(assignmentsOfThisCourse);			
			counter += assignmentsOfThisCourse.size();
		}
		EclipseLogger.getInstance().logInfo("There are "+ counter + " Assignment(s) in all your courses");
		
		//Set up Osbide Now!
		
		
		//set Default project:#
		result = this.setDefaultProjectByName(prefs.getString(PreferenceConstants.P_DEFAULTPROJECT));
		
		if(result == false)
			return;
		
		//We have valid login data and an active project. Set Up trackers:
		
		this.setUpTracking();	
		
		this.isStarting = false;
		this.isSetUp = true;
		
	}
	
	public void setUpTracking(){
		
		t = new BreakpointToggleEventTracker();
		t.enable();
		
		s = new SaveEventTracker();
		s.schedule(60000);
		
		
		
		EclipseLogger.getInstance().logInfo("Osbide is now ready to use");
		
	}
	
	/**
	 * This Method is invoked by the GUI to set a new Project. If the plugin is not set up, it triggers that, too
	 * @param project
	 * @return
	 */
	
	public boolean setDefaultProject(IJavaProject project){
		if(project == null)
			return false;
		
		this.workingProject = project;
		prefs.putValue(PreferenceConstants.P_DEFAULTPROJECT, project.getProject().getName());
		EclipseLogger.getInstance().logInfo("'"+project.getProject().getName()+"' set as Default Project for Osbide to track");
		
		//Is osbide was in standby and we are not in startup phase, we reactivate it:
		if(this.isSetUp == false && this.isStarting == false){
			this.setUp();
		}
		return true;	
	}
	
	public boolean setDefaultProjectByName(String name){
		if(name == null || name.isEmpty()){
			EclipseLogger.getInstance().logInfo("No Default Project set. Osbide will stand by");
			return false;
		}
		
		//Find Project:
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject found = null;
		found = root.getProject(name);
		IJavaProject converted = JavaCore.create(found);
		
		if(found != null){
			return this.setDefaultProject(converted);
		}
		EclipseLogger.getInstance().logInfo("Project with name '" + name + "' could not be found! Please set a new Project as Default for Osbide!");
		EclipseLogger.getInstance().logInfo("No Default Project set. Osbide will stand by");
		return false;		
	}
	
	public void submitAssignmentviaID(String project, int assignmentID){
		//TODO: Submit assignment:
		
	}
	
	public void tearDown(){
		if(!this.isSetUp){
			return;
		}
		t.disable();
		this.isSetUp = false;
	}
	
	public synchronized static EclipseService getInstance(){
		if(EclipseService.instance == null){
			EclipseService.instance = new EclipseService();
		}
		
		return EclipseService.instance;
	}
	
	public synchronized void triggerEvent(EclipseEventType e, Object payload){
		OsbideEvent toSend = null;
		switch (e) {
			case EVENT_RUN:
				break;
			case EVENT_DEBUG:
				break;
			case EVENT_CUTCOPYPASTE:
				break;
			case EVENT_ACTIVITY:
				break;
			case EVENT_BREAKPOINT:
				toSend = new BreakpointToggleEvent();
				toSend.setEventDate(new Date());
				toSend.setSolutionName(this.getActiveProject());
				break;
			case EVENT_SAVE:
				break;
		}
		
	}
	
	private String getActiveProject(){
		 IWorkbench wb = PlatformUI.getWorkbench();
		 ISelectionService iss = wb.getActiveWorkbenchWindow().getSelectionService();
		 String projExpID = "org.eclipse.ui.navigator.ProjectExplorer";
         ISelection sel = iss.getSelection(projExpID);
         Object selectedObject= null;
         if(sel instanceof IStructuredSelection) {
             selectedObject=((IStructuredSelection)sel).getFirstElement();
         }
         if(selectedObject instanceof IAdaptable) {
             IResource res = (IResource) ((IAdaptable) selectedObject).getAdapter(IResource.class);
             IProject project = res.getProject();
             return project.getName();
         }
         return "";		
	}
	
	public static int generateRandomInt(){
		return (int) Math.floor(Math.random() * Integer.MAX_VALUE );	
	}
	
	public void sendEventLog(EventLog payload){
		
	}
	
	public OsbideWebServiceClient getClientInstance(){
		return this.client;
	}

}
