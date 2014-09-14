package josbide.data.events;

public class ExceptionEvent extends OsbideEvent {
	
	private String documentName;
	private int exceptionAction;
	private int exceptionCode;
	private String exceptionDescription; //This will be set to e.getMessage()!
	private String exceptionName;
	private String exceptionType;
	private String lineContent;
	private int lineNumber;
	private String Name;
	
	
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
	 * @return the exceptionAction
	 */
	public int getExceptionAction() {
		return exceptionAction;
	}
	/**
	 * @param exceptionAction the exceptionAction to set
	 */
	public void setExceptionAction(int exceptionAction) {
		this.exceptionAction = exceptionAction;
	}
	/**
	 * @return the exceptionCode
	 */
	public int getExceptionCode() {
		return exceptionCode;
	}
	/**
	 * @param exceptionCode the exceptionCode to set
	 */
	public void setExceptionCode(int exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	/**
	 * @return the exceptionDescription
	 */
	public String getExceptionDescription() {
		return exceptionDescription;
	}
	/**
	 * @param exceptionDescription the exceptionDescription to set
	 */
	public void setExceptionDescription(String exceptionDescription) {
		this.exceptionDescription = exceptionDescription;
	}
	/**
	 * @return the exceptionName
	 */
	public String getExceptionName() {
		return exceptionName;
	}
	/**
	 * @param exceptionName the exceptionName to set
	 */
	public void setExceptionName(String exceptionName) {
		this.exceptionName = exceptionName;
	}
	/**
	 * @return the exceptionType
	 */
	public String getExceptionType() {
		return exceptionType;
	}
	/**
	 * @param exceptionType the exceptionType to set
	 */
	public void setExceptionType(String exceptionType) {
		this.exceptionType = exceptionType;
	}
	/**
	 * @return the lineContent
	 */
	public String getLineContent() {
		return lineContent;
	}
	/**
	 * @param lineContent the lineContent to set
	 */
	public void setLineContent(String lineContent) {
		this.lineContent = lineContent;
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
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	
}
