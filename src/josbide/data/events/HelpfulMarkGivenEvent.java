package josbide.data.events;

public class HelpfulMarkGivenEvent extends OsbideEvent {
	
	private String Name;
	private LogCommentEvent LogComment;
	private int LogCommentId;
	
	
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
	 * @return the logComment
	 */
	public LogCommentEvent getLogComment() {
		return LogComment;
	}
	/**
	 * @param logComment the logComment to set
	 */
	public void setLogComment(LogCommentEvent logComment) {
		this.LogComment = logComment;
	}
	/**
	 * @return the logCommentId
	 */
	public int getLogCommentId() {
		return LogCommentId;
	}
	/**
	 * @param logCommentId the logCommentId to set
	 */
	public void setLogCommentId(int logCommentId) {
		LogCommentId = logCommentId;
	}
}