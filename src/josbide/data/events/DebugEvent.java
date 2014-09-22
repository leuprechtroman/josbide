package josbide.data.events;

public class DebugEvent extends OsbideEvent {
	
	private String DebugOutput;
	private String DocumentName;
	private int ExecutionAction;
	private int LineNumber;
	private String Name;
	/**
	 * @return the debugOutput
	 */
	public String getDebugOutput() {
		return DebugOutput;
	}
	/**
	 * @param debugOutput the debugOutput to set
	 */
	public void setDebugOutput(String debugOutput) {
		this.DebugOutput = debugOutput;
	}
	/**
	 * @return the documentName
	 */
	public String getDocumentName() {
		return DocumentName;
	}
	/**
	 * @param documentName the documentName to set
	 */
	public void setDocumentName(String documentName) {
		this.DocumentName = documentName;
	}
	/**
	 * @return the executionAction
	 */
	public int getExecutionAction() {
		return ExecutionAction;
	}
	/**
	 * @param executionAction the executionAction to set
	 */
	public void setExecutionAction(int executionAction) {
		this.ExecutionAction = executionAction;
	}
	/**
	 * @return the lineNumber
	 */
	public int getLineNumber() {
		return LineNumber;
	}
	/**
	 * @param lineNumber the lineNumber to set
	 */
	public void setLineNumber(int lineNumber) {
		this.LineNumber = lineNumber;
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
}
