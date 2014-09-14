package josbide.data.events;

public class HelpfulMarkGivenEvent extends OsbideEvent {
	
	private String name;
	private LogCommentEvent logComment;
	
	
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
	 * @return the logComment
	 */
	public LogCommentEvent getLogComment() {
		return logComment;
	}
	/**
	 * @param logComment the logComment to set
	 */
	public void setLogComment(LogCommentEvent logComment) {
		this.logComment = logComment;
	}
}