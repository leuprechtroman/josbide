package josbide.data;

public class ErrorListItem {
	
	private String ErrorName;
	private int Column;
	private String Description;
	private String File;
	private int Id;
	private int Line;
	private String Project;
	private boolean Critical;
	/**
	 * @return the errorName
	 */
	public String getErrorName() {
		return ErrorName;
	}
	/**
	 * @param errorName the errorName to set
	 */
	public void setErrorName(String errorName) {
		ErrorName = errorName;
	}
	/**
	 * @return the column
	 */
	public int getColumn() {
		return Column;
	}
	/**
	 * @param column the column to set
	 */
	public void setColumn(int column) {
		Column = column;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}
	/**
	 * @return the file
	 */
	public String getFile() {
		return File;
	}
	/**
	 * @param file the file to set
	 */
	public void setFile(String file) {
		File = file;
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
		Id = id;
	}
	/**
	 * @return the line
	 */
	public int getLine() {
		return Line;
	}
	/**
	 * @param line the line to set
	 */
	public void setLine(int line) {
		Line = line;
	}
	/**
	 * @return the project
	 */
	public String getProject() {
		return Project;
	}
	/**
	 * @param project the project to set
	 */
	public void setProject(String project) {
		Project = project;
	}
	/**
	 * @return the critical
	 */
	public boolean isCritical() {
		return Critical;
	}
	/**
	 * @param critical the critical to set
	 */
	public void setCritical(boolean critical) {
		Critical = critical;
	}
	

}
