package josbide.data;

public class BreakPoint {
	
	private int Id;
	private String Condition;
	private String File;
	private int FileColumn;
	private int FileLine;
	private int FunctionColumnOffset;
	private int FunctionLineOffset;
	private String FunctionName;
	private String Name;
	private boolean Enabled;
	
	
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
	 * @return the condition
	 */
	public String getCondition() {
		return Condition;
	}
	/**
	 * @param condition the condition to set
	 */
	public void setCondition(String condition) {
		Condition = condition;
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
	 * @return the fileColumn
	 */
	public int getFileColumn() {
		return FileColumn;
	}
	/**
	 * @param fileColumn the fileColumn to set
	 */
	public void setFileColumn(int fileColumn) {
		FileColumn = fileColumn;
	}
	/**
	 * @return the fileLine
	 */
	public int getFileLine() {
		return FileLine;
	}
	/**
	 * @param fileLine the fileLine to set
	 */
	public void setFileLine(int fileLine) {
		FileLine = fileLine;
	}
	/**
	 * @return the functionColumnOffset
	 */
	public int getFunctionColumnOffset() {
		return FunctionColumnOffset;
	}
	/**
	 * @param functionColumnOffset the functionColumnOffset to set
	 */
	public void setFunctionColumnOffset(int functionColumnOffset) {
		FunctionColumnOffset = functionColumnOffset;
	}
	/**
	 * @return the functionLineOffset
	 */
	public int getFunctionLineOffset() {
		return FunctionLineOffset;
	}
	/**
	 * @param functionLineOffset the functionLineOffset to set
	 */
	public void setFunctionLineOffset(int functionLineOffset) {
		FunctionLineOffset = functionLineOffset;
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
		FunctionName = functionName;
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
	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return Enabled;
	}
	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		Enabled = enabled;
	}
	
}
