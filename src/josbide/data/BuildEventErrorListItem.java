package josbide.data;
import josbide.data.events.BuildEvent;

public class BuildEventErrorListItem {
	
	private BuildEvent BuildEvent;
	private int BuildEventId = 0;
	private ErrorListItem ErrorListItem;
	private int ErrorListItemId = 0;
	
	/**
	 * @return the buildEvent
	 */
	public BuildEvent getBuildEvent() {
		return BuildEvent;
	}
	/**
	 * @param buildEvent the buildEvent to set
	 */
	public void setBuildEvent(BuildEvent buildEvent) {
		BuildEvent = buildEvent;
	}
	/**
	 * @return the buildEventId
	 */
	public int getBuildEventId() {
		return BuildEventId;
	}
	/**
	 * @param buildEventId the buildEventId to set
	 */
	public void setBuildEventId(int buildEventId) {
		BuildEventId = buildEventId;
	}
	/**
	 * @return the errorListItem
	 */
	public ErrorListItem getErrorListItem() {
		return ErrorListItem;
	}
	/**
	 * @param errorListItem the errorListItem to set
	 */
	public void setErrorListItem(ErrorListItem errorListItem) {
		ErrorListItem = errorListItem;
	}
	/**
	 * @return the errorListItemId
	 */
	public int getErrorListItemId() {
		return ErrorListItemId;
	}
	/**
	 * @param errorListItemId the errorListItemId to set
	 */
	public void setErrorListItemId(int errorListItemId) {
		ErrorListItemId = errorListItemId;
	}

}
