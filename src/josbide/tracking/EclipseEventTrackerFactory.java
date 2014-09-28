package josbide.tracking;

public class EclipseEventTrackerFactory {
	
	private static EclipseEventTrackerFactory instance;
	
	private EclipseEventTrackerFactory(){};
	
	public static EclipseEventTrackerFactory getInstance(){
		if(EclipseEventTrackerFactory.instance == null){
			EclipseEventTrackerFactory.instance = new EclipseEventTrackerFactory();
		}
		return EclipseEventTrackerFactory.instance;
	}
	
	public EclipseEventTracker produce(EclipseEventType t){
		EclipseEventTracker result = null;
		switch (t) {
			case EVENT_RUN:
				break;
			case EVENT_DEBUG:
				break;
			case EVENT_CUTCOPYPASTE:
				break;
			case EVENT_ACTIVITY:
				break;
			case EVENT_BREAKPOINT:
				result = new BreakpointToggleEventTracker();
				break;
			case EVENT_SAVE:
				break;
		}
		return result;
	}

}