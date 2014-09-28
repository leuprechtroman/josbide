package josbide.tracking;
import java.util.Date;
import java.util.Deque;

import josbide.data.events.BreakpointToggleEvent;
import josbide.data.events.EventLog;
import josbide.data.events.OsbideEvent;
import josbide.util.EclipseLogger;
import josbide.wcf.OsbideWebServiceClient;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
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
	
	boolean isSetUp = false;
	
	private Deque<EventLog> toSend;
	private OsbideWebServiceClient client;
	
	private EclipseService(){
		this.client = new OsbideWebServiceClient();
	};
	
	public void setUp(){
		if(this.isSetUp)
		{
			return;
		}
		t = new BreakpointToggleEventTracker();
		t.enable();
		EclipseLogger.getInstance().log(this, "Plugin started");
		String AuthToken = this.client.login("username", "password");
		boolean test = this.client.isValidKey(AuthToken);
		if(test)
			EclipseLogger.getInstance().log(this, "Success");
		this.isSetUp = true;
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

}
