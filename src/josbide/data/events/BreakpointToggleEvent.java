package josbide.data.events;

import josbide.data.Breakpoint;

public class BreakpointToggleEvent extends OsbideEvent {
	
	private Breakpoint breakpoint;

	/**
	 * @return the breakpoint
	 */
	public Breakpoint getBreakpoint() {
		return breakpoint;
	}

	/**
	 * @param breakpoint the breakpoint to set
	 */
	public void setBreakpoint(Breakpoint breakpoint) {
		this.breakpoint = breakpoint;
	}
}
