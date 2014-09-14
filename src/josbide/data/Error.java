package josbide.data;

import josbide.data.events.BuildEvent;

public class Error {
	
	private String errorName;
	private int column;
	private String description;
	private String file;
	private int id;
	private int line;
	private String project;
	private boolean critical;
	private BuildEvent buildEvent;
	private CodeDocument document;
	
	
	/**
	 * @return the errorName
	 */
	public String getErrorName() {
		return errorName;
	}
	/**
	 * @param errorName the errorName to set
	 */
	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}
	/**
	 * @return the column
	 */
	public int getColumn() {
		return column;
	}
	/**
	 * @param column the column to set
	 */
	public void setColumn(int column) {
		this.column = column;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * @return the line
	 */
	public int getLine() {
		return line;
	}
	/**
	 * @param line the line to set
	 */
	public void setLine(int line) {
		this.line = line;
	}
	/**
	 * @return the project
	 */
	public String getProject() {
		return project;
	}
	/**
	 * @param project the project to set
	 */
	public void setProject(String project) {
		this.project = project;
	}
	/**
	 * @return the critical
	 */
	public boolean isCritical() {
		return critical;
	}
	/**
	 * @param critical the critical to set
	 */
	public void setCritical(boolean critical) {
		this.critical = critical;
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
	/**
	 * @return the document
	 */
	public CodeDocument getDocument() {
		return document;
	}
	/**
	 * @param document the document to set
	 */
	public void setDocument(CodeDocument document) {
		this.document = document;
	}
}
