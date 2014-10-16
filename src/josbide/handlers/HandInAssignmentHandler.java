package josbide.handlers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import josbide.data.Assignment;
import josbide.data.user.Course;
import josbide.tracking.EclipseService;
import josbide.util.EclipseLogger;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class HandInAssignmentHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		String nothingAvailable = "No Assignments available!";
		
		 //Prepare the assignments:
		 List<Course> courses = EclipseService.getInstance().getClientInstance().getCourses();
		 List<String> names = new ArrayList<String>();
		 Map<String, Assignment> mapping = new HashMap<String, Assignment>();
		 
		 for(Iterator<Course> iter = courses.iterator(); iter.hasNext();){
				Course c = iter.next();
				List<Assignment> assignmentsOfThisCourse = c.getAssignments();
				
				for(Iterator<Assignment> iter2 = assignmentsOfThisCourse.iterator(); iter2.hasNext();){
					Assignment a = iter2.next();
					String key = a.getName() + " (" + c.getName() + ")";
					names.add(key);
					mapping.put(key, a);
				}	
		}
		 
		 if(names.size() == 0){
			 names.add(nothingAvailable);
		 }
		 
		 //Do the dialog:
		 
		 Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		 ListDialog dialog = new ListDialog(activeShell);
		 dialog.setAddCancelButton(true);
		 dialog.setContentProvider(new ArrayContentProvider());
		 dialog.setLabelProvider(new LabelProvider());
		 dialog.setTitle("Select Assignment");
		 dialog.setMessage("Select an Assignment to hand this project in for");
		 dialog.setInput(names);
		 
		 
		 if (dialog.open() != Window.OK) {
			   	return null; //User aborted;
		 }

		 //User input:
		 Object[] result = dialog.getResult();
		 
		 //Test, if there was nothing selected:
		 if(((String)result[0]).equals(nothingAvailable))
			 return null;
		 
		 //Okay, we have an String, so get the Assignment ID and selected project name and report this to the eclipse service:
		 
		 int selectedId = mapping.get((String)result[0]).getId();
		 
		//Get selected:
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
			
		//Check if project:
		if(structured.getFirstElement() instanceof IJavaProject){
			IJavaProject selected = (IJavaProject) structured.getFirstElement();
			EclipseService.getInstance().submitAssignmentviaID(selected.getProject().getName(), selectedId);
		}else{
			EclipseLogger.getInstance().logInfo("Selected Project was not a Java project, aborting....");
		}
		return null;
	}

}
