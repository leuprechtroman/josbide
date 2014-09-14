package josbide.data.events;

import josbide.data.user.OsbideUser;

public class EventLogSuscription {
	private OsbideUser user;
	private EventLog log;
	
	
	/**
	 * @return the user
	 */
	public OsbideUser getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(OsbideUser user) {
		this.user = user;
	}
	/**
	 * @return the log
	 */
	public EventLog getLog() {
		return log;
	}
	/**
	 * @param log the log to set
	 */
	public void setLog(EventLog log) {
		this.log = log;
	}
}
