package josbide.data.events;

import josbide.data.CutCopyPasteAction;

public class CutCopyPasteEvent extends OsbideEvent {
	
	private CutCopyPasteAction action;
	private String content;
	private String documentName;
	private String name;

	/**
	 * @return the action
	 */
	public CutCopyPasteAction getAction() {
		return action;
	}
	/**
	 * @param action the action to set
	 */
	public void setAction(CutCopyPasteAction action) {
		this.action = action;
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
}
