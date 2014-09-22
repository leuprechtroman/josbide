package josbide.data.events;

public class HelpfulMarkGivenEvent extends OsbideEvent {
	
	private final String Name;
	private LogCommentEvent LogComment;
	private int LogCommentId;
	
	public HelpfulMarkGivenEvent() {
		super("HelpfulMarkGivenEvent", "Helpful Mark");
		this.Name = this.EventName;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
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