package josbide.data;

public class CodeDocumentBreakPoint {
	
	private int CodeFileId;
	private CodeDocument CodeDocument;
	private int BreakPointId;
	private BreakPoint BreakPoint;
	
	
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
	 * @return the breakPointId
	 */
	public int getBreakPointId() {
		return BreakPointId;
	}
	/**
	 * @param breakPointId the breakPointId to set
	 */
	public void setBreakPointId(int breakPointId) {
		BreakPointId = breakPointId;
	}
	/**
	 * @return the breakPoint
	 */
	public BreakPoint getBreakPoint() {
		return BreakPoint;
	}
	/**
	 * @param breakPoint the breakPoint to set
	 */
	public void setBreakPoint(BreakPoint breakPoint) {
		BreakPoint = breakPoint;
	}
	

}
