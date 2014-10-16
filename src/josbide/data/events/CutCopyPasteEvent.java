package josbide.data.events;

import josbide.data.CutCopyPasteAction;


public class CutCopyPasteEvent extends OsbideEvent {
	
	private CutCopyPasteAction Action;
	private String Content;
	private String DocumentName;
	private final String Name;
	
	public CutCopyPasteEvent() {
		super("CutCopyPasteEvent", "Cut, Copy & Paste");
		this.Name = this.EventName;
	}

	/**
	 * @return the action
	 */
	public CutCopyPasteAction getAction() {
		return Action;
	}
	/**
	 * @param action the action to set
	 */
	public void setAction(CutCopyPasteAction action) {
		this.Action = action;
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
		this.Content = content;
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
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
}
