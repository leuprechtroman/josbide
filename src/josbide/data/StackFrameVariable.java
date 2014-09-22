package josbide.data;

public class StackFrameVariable {
	private int Id;
	private String Name;
	private StackFrame StackFrame;
	private int StackFrameId;
	private String Value;
	
	public StackFrameVariable(StackFrame parent)
	{
		this.setStackFrame(parent);
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.Id = id;
	}
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
	 * @return the stackFrame
	 */
	public StackFrame getStackFrame() {
		return StackFrame;
	}
	/**
	 * @param stackFrame the stackFrame to set
	 */
	public void setStackFrame(StackFrame stackFrame) {
		this.StackFrame = stackFrame;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return Value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.Value = value;
	}


	public int getStackFrameId() {
		return StackFrameId;
	}


	public void setStackFrameId(int stackFrameId) {
		StackFrameId = stackFrameId;
	}

}
