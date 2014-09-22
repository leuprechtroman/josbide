package josbide.data;

import josbide.data.events.BuildEvent;


public class BuildEventBreakPoint {
	
	private int BuildEventId;
	private BuildEvent BuildEvent;
	private BreakPoint BreakPoint;
	private int BreakPointId;
	

	/**
	 * @return the buildEvent
	 */
	public BuildEvent getBuildEvent() {
		return BuildEvent;
	}
	/**
	 * @param buildEvent the buildEvent to set
	 */
	public void setBuildEvent(BuildEvent BuildEvent) {
		this.BuildEvent = BuildEvent;
	}
	/**
	 * @return the breakPointId
	 */
	public int getBreakPointId() {
		return BreakPointId;
	}
	/**
	 * @param breakPointId the breakPointId to set
	 */
	public void setBreakPointId(int breakPointId) {
		BreakPointId = breakPointId;
	}
	/**
	 * @return the buildEventId
	 */
	public int getBuildEventId() {
		return BuildEventId;
	}
	/**
	 * @param buildEventId the buildEventId to set
	 */
	public void setBuildEventId(int buildEventId) {
		BuildEventId = buildEventId;
	}
	
	public BreakPoint getBreakPoint() {
		return BreakPoint;
	}
	public void setBreakPoint(BreakPoint breakPoint) {
		BreakPoint = breakPoint;
	}
	

}
