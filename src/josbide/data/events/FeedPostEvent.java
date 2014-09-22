package josbide.data.events;

public class FeedPostEvent extends OsbideEvent {
	
	private final String Name;
	private String Comment;
	
	public FeedPostEvent() {
		super("FeedPostEvent", "Feed Post");
		this.Name = this.EventName;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return Comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.Comment = comment;
	}
}
