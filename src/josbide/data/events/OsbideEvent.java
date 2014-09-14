package josbide.data.events;

import java.util.Date;

public class OsbideEvent {
	
	private int id;
	private int eventLogId;
	private EventLog eventLog;
	private Date eventDate;
	private String solutionName;
	private String eventName;
	private String prettyName;
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the eventLogId
	 */
	public int getEventLogId() {
		return eventLogId;
	}
	/**
	 * @param eventLogId the eventLogId to set
	 */
	public void setEventLogId(int eventLogId) {
		this.eventLogId = eventLogId;
	}
	/**
	 * @return the eventLog
	 */
	public EventLog getEventLog() {
		return eventLog;
	}
	/**
	 * @param eventLog the eventLog to set
	 */
	public void setEventLog(EventLog eventLog) {
		this.eventLog = eventLog;
	}
	/**
	 * @return the eventDate
	 */
	public Date getEventDate() {
		return eventDate;
	}
	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	/**
	 * @return the solutionName
	 */
	public String getSolutionName() {
		return solutionName;
	}
	/**
	 * @param solutionName the solutionName to set
	 */
	public void setSolutionName(String solutionName) {
		this.solutionName = solutionName;
	}
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/**
	 * @return the prettyName
	 */
	public String getPrettyName() {
		return prettyName;
	}
	/**
	 * @param prettyName the prettyName to set
	 */
	public void setPrettyName(String prettyName) {
		this.prettyName = prettyName;
	}

}
