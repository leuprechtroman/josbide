package josbide.data;

public class StackVariable {
	private int id;
	private String name;
	private StackFrame stackFrame;
	private String value;
	
	public StackVariable(StackFrame parent)
	{
		this.setStackFrame(parent);
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the stackFrame
	 */
	public StackFrame getStackFrame() {
		return stackFrame;
	}
	/**
	 * @param stackFrame the stackFrame to set
	 */
	public void setStackFrame(StackFrame stackFrame) {
		this.stackFrame = stackFrame;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
