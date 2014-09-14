package josbide.data;

public class Document {
	
	private int id;
	private String fileName;
	private String content;
	
	/**
	 * @param id
	 * @param fileName
	 * @param content
	 */
	public Document(int id, String fileName, String content) {
		this.id = id;
		this.fileName = fileName;
		this.content = content;
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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
