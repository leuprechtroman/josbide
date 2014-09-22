package josbide.data.events;

import josbide.data.BreakPoint;

public class BreakpointToggleEvent extends OsbideEvent {
	
	private BreakPoint Breakpoint;

	/**
	 * @return the breakpoint
	 */
	public BreakPoint getBreakpoint() {
		return Breakpoint;
	}

	/**
	 * @param breakpoint the breakpoint to set
	 */
	public void setBreakpoint(BreakPoint breakpoint) {
		this.Breakpoint = breakpoint;
	}
}
