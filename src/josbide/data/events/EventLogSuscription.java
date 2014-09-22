package josbide.data.events;

import josbide.data.user.OsbideUser;

public class EventLogSuscription {
	private int UserId;
	private OsbideUser User;
	private EventLog Log;
	private int LogId;
	
	/**
	 * @return the user
	 */
	public OsbideUser getUser() {
		return User;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(OsbideUser user) {
		this.User = user;
	}
	/**
	 * @return the log
	 */
	public EventLog getLog() {
		return Log;
	}
	/**
	 * @param log the log to set
	 */
	public void setLog(EventLog log) {
		this.Log = log;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return UserId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		UserId = userId;
	}
	/**
	 * @return the logId
	 */
	public int getLogId() {
		return LogId;
	}
	/**
	 * @param logId the logId to set
	 */
	public void setLogId(int logId) {
		LogId = logId;
	}
}
