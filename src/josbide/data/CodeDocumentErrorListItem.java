package josbide.data;

public class CodeDocumentErrorListItem {
	
	private int CodeFileId;
	private CodeDocument CodeDocument;
	private int ErrorListItemId;
	private ErrorListItem ErrorListItem;
	
	
	/**
	 * @return the codeFileId
	 */
	public int getCodeFileId() {
		return CodeFileId;
	}
	/**
	 * @param codeFileId the codeFileId to set
	 */
	public void setCodeFileId(int codeFileId) {
		CodeFileId = codeFileId;
	}
	/**
	 * @return the codeDocument
	 */
	public CodeDocument getCodeDocument() {
		return CodeDocument;
	}
	/**
	 * @param codeDocument the codeDocument to set
	 */
	public void setCodeDocument(CodeDocument codeDocument) {
		CodeDocument = codeDocument;
	}
	/**
	 * @return the errorListItemId
	 */
	public int getErrorListItemId() {
		return ErrorListItemId;
	}
	/**
	 * @param errorListItemId the errorListItemId to set
	 */
	public void setErrorListItemId(int errorListItemId) {
		ErrorListItemId = errorListItemId;
	}
	/**
	 * @return the errorListItem
	 */
	public ErrorListItem getErrorListItem() {
		return ErrorListItem;
	}
	/**
	 * @param errorListItem the errorListItem to set
	 */
	public void setErrorListItem(ErrorListItem errorListItem) {
		ErrorListItem = errorListItem;
	}
}
