package josbide.data.events;

import josbide.data.BreakPoint;

public class BreakpointToggleEvent extends OsbideEvent {
	
	private BreakPoint breakpoint;

	/**
	 * @return the breakpoint
	 */
	public BreakPoint getBreakpoint() {
		return breakpoint;
	}

	/**
	 * @param breakpoint the breakpoint to set
	 */
	public void setBreakpoint(BreakPoint breakpoint) {
		this.breakpoint = breakpoint;
	}
}
