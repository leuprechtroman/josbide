package josbide.tracking;

import java.util.Date;

import josbide.Activator;
import josbide.data.BreakPoint;
import josbide.preferences.PreferenceConstants;
import josbide.util.EclipseLogger;

import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointListener;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.jdt.debug.core.IJavaLineBreakpoint;

public class BreakpointToggleEventTracker implements EclipseEventTracker, IBreakpointListener {

	@Override
	public void enable() {
		DebugPlugin.getDefault().getBreakpointManager().addBreakpointListener(this);
		
	}

	@Override
	public void disable() {
		DebugPlugin.getDefault().getBreakpointManager().removeBreakpointListener(this);
		
	}

	@Override
	public void breakpointAdded(IBreakpoint breakpoint) {
		BreakPoint payload = this.createPayload(breakpoint, true);
		EclipseService.getInstance().triggerEvent(EclipseEventType.EVENT_BREAKPOINT, payload);		
	}

	@Override
	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
		BreakPoint payload = this.createPayload(breakpoint, false);
		EclipseService.getInstance().triggerEvent(EclipseEventType.EVENT_BREAKPOINT, payload);		
	}

	@Override
	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
		BreakPoint payload = this.createPayload(breakpoint, true);
		EclipseService.getInstance().triggerEvent(EclipseEventType.EVENT_BREAKPOINT, payload);		
	}
	
	private BreakPoint createPayload(IBreakpoint data, boolean enabled){
		IJavaLineBreakpoint supplied = null;
		if(data instanceof IJavaLineBreakpoint){
			supplied = (IJavaLineBreakpoint) data;
		}
		else{
			EclipseLogger.getInstance().log(this, "Conversion of Breakpoint failed: Supplied Breakpoint was no Instance of org.eclipse.jdt.debug.core.IJavaLineBreakpoint!");
			return null;
		}
		BreakPoint payload = new BreakPoint();
		//Set Date:
		//Get and set Condition of breakpoint:
		try {
			if(supplied.isConditionEnabled()){
				payload.setCondition(supplied.getCondition());
			}
			//Set enabled value:
			payload.setEnabled(enabled);
			
			payload.setFileLine(supplied.getLineNumber());
			payload.setFileColumn(0);
			
			//Set File Name:
			payload.setFile(supplied.getTypeName());
			
			//set FunctionName:
			
			
			//set FunctionLineOffset
			
			
			//set FunctionColumnOffset
			
		} catch (CoreException e) {
			EclipseLogger.getInstance().log(this, "Breakpoint Condition could not be accessed: " + e.getMessage());
		}
		
		EclipseLogger.getInstance().logDebug("Breakpoint Event created:");
		EclipseLogger.getInstance().logDebug("Breakpoint condition: " + payload.getCondition());
		EclipseLogger.getInstance().logDebug("Breakpoint file: " + payload.getFile());
		EclipseLogger.getInstance().logDebug("Breakpoint line: " + payload.getFileLine());
		
		
		
		return payload;	
	}

}
