package josbide.data.events;

import java.util.List;

public class LogCommentEvent extends OsbideEvent {
	
	private String content;
	private List<HelpfulMarkGivenEvent> helpfulMarks;
	private String name;
	private EventLog source;
	
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the helpfulMarks
	 */
	public List<HelpfulMarkGivenEvent> getHelpfulMarks() {
		return helpfulMarks;
	}
	/**
	 * @param helpfulMarks the helpfulMarks to set
	 */
	public void setHelpfulMarks(List<HelpfulMarkGivenEvent> helpfulMarks) {
		this.helpfulMarks = helpfulMarks;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the source
	 */
	public EventLog getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(EventLog source) {
		this.source = source;
	}
}
