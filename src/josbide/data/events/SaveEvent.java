package josbide.data.events;

import josbide.data.CodeDocument;

public class SaveEvent extends OsbideEvent {
	
	private CodeDocument document;
	private String name;
	
	
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
