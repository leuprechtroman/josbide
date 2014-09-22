package josbide.data.events;

public class AskForHelpEvent extends OsbideEvent {
	private final String Name;
	
	public AskForHelpEvent(){
		super("AskForHelpEvent", "Ask for Help");
		this.Name = this.EventName;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
}
