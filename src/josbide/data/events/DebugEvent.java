package josbide.data.events;

public class DebugEvent extends OsbideEvent {
	
	private String debugOutput;
	private String documentName;
	private int executionAction;
	private int lineNumber;
	private String name;
	/**
	 * @return the debugOutput
	 */
	public String getDebugOutput() {
		return debugOutput;
	}
	/**
	 * @param debugOutput the debugOutput to set
	 */
	public void setDebugOutput(String debugOutput) {
		this.debugOutput = debugOutput;
	}
	/**
	 * @return the documentName
	 */
	public String getDocumentName() {
		return documentName;
	}
	/**
	 * @param documentName the documentName to set
	 */
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	/**
	 * @return the executionAction
	 */
	public int getExecutionAction() {
		return executionAction;
	}
	/**
	 * @param executionAction the executionAction to set
	 */
	public void setExecutionAction(int executionAction) {
		this.executionAction = executionAction;
	}
	/**
	 * @return the lineNumber
	 */
	public int getLineNumber() {
		return lineNumber;
	}
	/**
	 * @param lineNumber the lineNumber to set
	 */
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
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
}
