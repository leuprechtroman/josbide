package josbide.data.events;

public class ExceptionEvent extends OsbideEvent {
	
	private String DocumentName;
	private int ExceptionAction;
	private int ExceptionCode;
	private String ExceptionDescription; //This will be set to e.getMessage()!
	private String ExceptionName;
	private String ExceptionType;
	private String LineContent;
	private int LineNumber;
	private final String Name;
	
	public ExceptionEvent() {
		super("ExceptionEvent", "Exception");
		this.Name = this.EventName;
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
	 * @return the exceptionAction
	 */
	public int getExceptionAction() {
		return ExceptionAction;
	}
	/**
	 * @param exceptionAction the exceptionAction to set
	 */
	public void setExceptionAction(int exceptionAction) {
		this.ExceptionAction = exceptionAction;
	}
	/**
	 * @return the exceptionCode
	 */
	public int getExceptionCode() {
		return ExceptionCode;
	}
	/**
	 * @param exceptionCode the exceptionCode to set
	 */
	public void setExceptionCode(int exceptionCode) {
		this.ExceptionCode = exceptionCode;
	}
	/**
	 * @return the exceptionDescription
	 */
	public String getExceptionDescription() {
		return ExceptionDescription;
	}
	/**
	 * @param exceptionDescription the exceptionDescription to set
	 */
	public void setExceptionDescription(String exceptionDescription) {
		this.ExceptionDescription = exceptionDescription;
	}
	/**
	 * @return the exceptionName
	 */
	public String getExceptionName() {
		return ExceptionName;
	}
	/**
	 * @param exceptionName the exceptionName to set
	 */
	public void setExceptionName(String exceptionName) {
		this.ExceptionName = exceptionName;
	}
	/**
	 * @return the exceptionType
	 */
	public String getExceptionType() {
		return ExceptionType;
	}
	/**
	 * @param exceptionType the exceptionType to set
	 */
	public void setExceptionType(String exceptionType) {
		this.ExceptionType = exceptionType;
	}
	/**
	 * @return the lineContent
	 */
	public String getLineContent() {
		return LineContent;
	}
	/**
	 * @param lineContent the lineContent to set
	 */
	public void setLineContent(String lineContent) {
		this.LineContent = lineContent;
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
	
}
