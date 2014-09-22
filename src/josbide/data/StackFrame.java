package josbide.data;

import java.util.List;

import josbide.data.events.ExceptionEvent;

public class StackFrame {
	private int Depth;
	private ExceptionEvent Exception;
	private String FileName;
	private String FunctionName;
	private String Language;
	private int LineNumber;
	private String Module; //In java: Package!
	private String ReturnType;
	private List<StackFrameVariable> Variables;
	
	
	/**
	 * @return the depth
	 */
	public int getDepth() {
		return Depth;
	}
	/**
	 * @param depth the depth to set
	 */
	public void setDepth(int depth) {
		this.Depth = depth;
	}
	/**
	 * @return the exception
	 */
	public ExceptionEvent getException() {
		return Exception;
	}
	/**
	 * @param exception the exception to set
	 */
	public void setException(ExceptionEvent exception) {
		this.Exception = exception;
	}
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return FileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.FileName = fileName;
	}
	/**
	 * @return the functionName
	 */
	public String getFunctionName() {
		return FunctionName;
	}
	/**
	 * @param functionName the functionName to set
	 */
	public void setFunctionName(String functionName) {
		this.FunctionName = functionName;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return Language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.Language = language;
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
		return ReturnType;
	}
	/**
	 * @param returnType the returnType to set
	 */
	public void setReturnType(String returnType) {
		this.ReturnType = returnType;
	}
	/**
	 * @return the variables
	 */
	public List<StackFrameVariable> getVariables() {
		return Variables;
	}
	/**
	 * @param variables the variables to set
	 */
	public void setVariables(List<StackFrameVariable> variables) {
		this.Variables = variables;
	}
}
