package josbide.data.events;

import java.util.List;

public class LogCommentEvent extends OsbideEvent {
	
	private String Content;
	private List<HelpfulMarkGivenEvent> HelpfulMarks;
	private String Name;
	private EventLog SourceEventLog;
	private int SourceEventLogId = 0;
	
	/**
	 * @return the content
	 */
	public String getContent() {
		return Content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.Content = content;
	}
	/**
	 * @return the helpfulMarks
	 */
	public List<HelpfulMarkGivenEvent> getHelpfulMarks() {
		return HelpfulMarks;
	}
	/**
	 * @param helpfulMarks the helpfulMarks to set
	 */
	public void setHelpfulMarks(List<HelpfulMarkGivenEvent> helpfulMarks) {
		this.HelpfulMarks = helpfulMarks;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.Name = name;
	}
	/**
	 * @return the source
	 */
	public EventLog getSource() {
		return SourceEventLog;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(EventLog source) {
		this.SourceEventLog = source;
	}
	/**
	 * @return the sourceEventLog
	 */
	public EventLog getSourceEventLog() {
		return SourceEventLog;
	}
	/**
	 * @param sourceEventLog the sourceEventLog to set
	 */
	public void setSourceEventLog(EventLog sourceEventLog) {
		SourceEventLog = sourceEventLog;
	}
	/**
	 * @return the sourceEventLogId
	 */
	public int getSourceEventLogId() {
		return SourceEventLogId;
	}
	/**
	 * @param sourceEventLogId the sourceEventLogId to set
	 */
	public void setSourceEventLogId(int sourceEventLogId) {
		SourceEventLogId = sourceEventLogId;
	}
}
