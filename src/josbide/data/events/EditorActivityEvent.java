package josbide.data.events;

public class EditorActivityEvent extends OsbideEvent {
	private String Name;

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
	
	
}
