package josbide.data;

import java.util.List;

public class CodeDocument extends IVSDocument {
	
	private List<CodeDocumentBreakPoint> BreakPoints;
	private List<CodeDocumentErrorListItem> ErrorItems;

	public void addError(CodeDocumentErrorListItem e){
		this.ErrorItems.add(e);
	}
	
	public void addBreakpoint(CodeDocumentBreakPoint b){
		this.BreakPoints.add(b);
	}

	/**
	 * @return the breakPoints
	 */
	public List<CodeDocumentBreakPoint> getBreakPoints() {
		return BreakPoints;
	}

	/**
	 * @param breakPoints the breakPoints to set
	 */
	public void setBreakPoints(List<CodeDocumentBreakPoint> breakPoints) {
		BreakPoints = breakPoints;
	}

	/**
	 * @return the errorItems
	 */
	public List<CodeDocumentErrorListItem> getErrorItems() {
		return ErrorItems;
	}

	/**
	 * @param errorItems the errorItems to set
	 */
	public void setErrorItems(List<CodeDocumentErrorListItem> errorItems) {
		ErrorItems = errorItems;
	}

}
