package josbide.tracking;

import josbide.util.EclipseLogger;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class SaveEventTracker extends Job {

	public SaveEventTracker() {
		super("Save Event Tracker");
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		EclipseLogger.getInstance().logDebug("Save Event Triggered");
		this.schedule(60000);
		//TODO: Send event to Eclipse Service
		return Status.OK_STATUS;
	}

}
