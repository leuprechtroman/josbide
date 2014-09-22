package josbide.data.events;

import java.util.Date;

public class OsbideEvent {
	
	protected int Id;
	protected int EventLogId;
	protected EventLog EventLog;
	protected Date EventDate;
	protected String SolutionName;
	protected final String EventName;
	protected final String PrettyName;
	
	public OsbideEvent(String EventName, String PrettyName) {
		this.EventName = EventName;
		this.PrettyName = PrettyName;
	}	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.Id = id;
	}
	/**
	 * @return the eventLogId
	 */
	public int getEventLogId() {
		return EventLogId;
	}
	/**
	 * @param eventLogId the eventLogId to set
	 */
	public void setEventLogId(int eventLogId) {
		this.EventLogId = eventLogId;
	}
	/**
	 * @return the eventLog
	 */
	public EventLog getEventLog() {
		return EventLog;
	}
	/**
	 * @param eventLog the eventLog to set
	 */
	public void setEventLog(EventLog eventLog) {
		this.EventLog = eventLog;
	}
	/**
	 * @return the eventDate
	 */
	public Date getEventDate() {
		return EventDate;
	}
	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(Date eventDate) {
		this.EventDate = eventDate;
	}
	/**
	 * @return the solutionName
	 */
	public String getSolutionName() {
		return SolutionName;
	}
	/**
	 * @param solutionName the solutionName to set
	 */
	public void setSolutionName(String solutionName) {
		this.SolutionName = solutionName;
	}
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return EventName;
	}
	/**
	 * @return the prettyName
	 */
	public String getPrettyName() {
		return PrettyName;
	}

}
