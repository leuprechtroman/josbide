package josbide.data.events;

import josbide.data.CodeDocument;

public class SaveEvent extends OsbideEvent {
	
	private CodeDocument Document;
	private int DocumentId = 0;
	private String Name;
	
	
	/**
	 * @return the document
	 */
	public CodeDocument getDocument() {
		return Document;
	}
	/**
	 * @param document the document to set
	 */
	public void setDocument(CodeDocument document) {
		this.Document = document;
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
		this.Name = name;
	}
	/**
	 * @return the documentId
	 */
	public int getDocumentId() {
		return DocumentId;
	}
	/**
	 * @param documentId the documentId to set
	 */
	public void setDocumentId(int documentId) {
		DocumentId = documentId;
	}
}
