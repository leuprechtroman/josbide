package josbide.data;

public class IVSDocument {
	
	private int Id;
	private String FileName;
	private String Content;
	
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
	 * @return the fileName
	 */
	public String getFileName() {
		return FileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return Content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		Content = content;
	}
	

}
