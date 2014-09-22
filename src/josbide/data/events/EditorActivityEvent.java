package josbide.data.events;

public class EditorActivityEvent extends OsbideEvent {
	private final String Name;
	
	public EditorActivityEvent() {
		super("EditorActivityEvent", "Activity");
		this.Name = this.EventName;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}	
}
