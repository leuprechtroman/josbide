package josbide.data;

import java.util.List;

import josbide.data.events.ExceptionEvent;

public class StackFrame {
	private int depth;
	private ExceptionEvent exception;
	private String fileName;
	private String functionName;
	private String language;
	private int lineNumber;
	private String Module; //In java: Package!
	private String returnType;
	private List<StackVariable> variables;
	
	
	/**
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}
	/**
	 * @param depth the depth to set
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}
	/**
	 * @return the exception
	 */
	public ExceptionEvent getException() {
		return exception;
	}
	/**
	 * @param exception the exception to set
	 */
	public void setException(ExceptionEvent exception) {
		this.exception = exception;
	}
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * @return the functionName
	 */
	public String getFunctionName() {
		return functionName;
	}
	/**
	 * @param functionName the functionName to set
	 */
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
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
	 * @return the module
	 */
	public String getModule() {
		return Module;
	}
	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		Module = module;
	}
	/**
	 * @return the returnType
	 */
	public String getReturnType() {
		return returnType;
	}
	/**
	 * @param returnType the returnType to set
	 */
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	/**
	 * @return the variables
	 */
	public List<StackVariable> getVariables() {
		return variables;
	}
	/**
	 * @param variables the variables to set
	 */
	public void setVariables(List<StackVariable> variables) {
		this.variables = variables;
	}
}
