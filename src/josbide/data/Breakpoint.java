package josbide.data;

import josbide.data.events.BuildEvent;

public class Breakpoint {
	
	private String condition;
	private boolean enabled;
	private String file;
	private int fileColumn;
	private int fileLine;
	private int functionColumnOffset;
	private int functionLineOffset;
	private String functionName;
	private int id;
	private String name;
	private CodeDocument codeDocument;
	private BuildEvent buildEvent;
	/**
	 * @return the condition
	 */
	public String getCondition() {
		return condition;
	}
	/**
	 * @param condition the condition to set
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}
	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}
	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	/**
	 * @return the file
	 */
	public String getFile() {
		return file;
	}
	/**
	 * @param file the file to set
	 */
	public void setFile(String file) {
		this.file = file;
	}
	/**
	 * @return the fileColumn
	 */
	public int getFileColumn() {
		return fileColumn;
	}
	/**
	 * @param fileColumn the fileColumn to set
	 */
	public void setFileColumn(int fileColumn) {
		this.fileColumn = fileColumn;
	}
	/**
	 * @return the fileLine
	 */
	public int getFileLine() {
		return fileLine;
	}
	/**
	 * @param fileLine the fileLine to set
	 */
	public void setFileLine(int fileLine) {
		this.fileLine = fileLine;
	}
	/**
	 * @return the functionColumnOffset
	 */
	public int getFunctionColumnOffset() {
		return functionColumnOffset;
	}
	/**
	 * @param functionColumnOffset the functionColumnOffset to set
	 */
	public void setFunctionColumnOffset(int functionColumnOffset) {
		this.functionColumnOffset = functionColumnOffset;
	}
	/**
	 * @return the functionLineOffset
	 */
	public int getFunctionLineOffset() {
		return functionLineOffset;
	}
	/**
	 * @param functionLineOffset the functionLineOffset to set
	 */
	public void setFunctionLineOffset(int functionLineOffset) {
		this.functionLineOffset = functionLineOffset;
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
	 * @return the codeDocument
	 */
	public CodeDocument getCodeDocument() {
		return codeDocument;
	}
	/**
	 * @param codeDocument the codeDocument to set
	 */
	public void setCodeDocument(CodeDocument codeDocument) {
		this.codeDocument = codeDocument;
	}
	/**
	 * @return the buildEvent
	 */
	public BuildEvent getBuildEvent() {
		return buildEvent;
	}
	/**
	 * @param buildEvent the buildEvent to set
	 */
	public void setBuildEvent(BuildEvent buildEvent) {
		this.buildEvent = buildEvent;
	}
}
