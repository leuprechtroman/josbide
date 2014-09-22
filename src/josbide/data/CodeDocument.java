package josbide.data;

import java.util.ArrayList;
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

}
