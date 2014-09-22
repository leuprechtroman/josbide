package josbide.data.events;

import java.util.List;

import josbide.data.BuildDocument;
import josbide.data.BuildEventBreakPoint;
import josbide.data.BuildEventErrorListItem;

public class BuildEvent extends OsbideEvent {
	
	private List<BuildEventBreakPoint> Breakpoints;
	private int CriticalErrorCount;
	private List<BuildEventErrorListItem> CriticalErrorItems;
	private List<String> CriticalErrorNames;
	private List<BuildDocument> Documents;
	private List<BuildEventErrorListItem> ErrorItems;
	private String[] AllowedExtensions = new String[0];
	
	public BuildEvent() {
		super("BuildEvent", "Build");
	}	
	
	
	/**
	 * @return the breakpoints
	 */
	public List<BuildEventBreakPoint> getBreakpoints() {
		return Breakpoints;
	}
	/**
	 * @param breakpoints the breakpoints to set
	 */
	public void setBreakpoints(List<BuildEventBreakPoint> breakpoints) {
		Breakpoints = breakpoints;
	}
	/**
	 * @return the criticalErrorCount
	 */
	public int getCriticalErrorCount() {
		return CriticalErrorCount;
	}
	/**
	 * @param criticalErrorCount the criticalErrorCount to set
	 */
	public void setCriticalErrorCount(int criticalErrorCount) {
		CriticalErrorCount = criticalErrorCount;
	}
	/**
	 * @return the criticalErrorItems
	 */
	public List<BuildEventErrorListItem> getCriticalErrorItems() {
		return CriticalErrorItems;
	}
	/**
	 * @param criticalErrorItems the criticalErrorItems to set
	 */
	public void setCriticalErrorItems(List<BuildEventErrorListItem> criticalErrorItems) {
		CriticalErrorItems = criticalErrorItems;
	}
	/**
	 * @return the criticalErrorNames
	 */
	public List<String> getCriticalErrorNames() {
		return CriticalErrorNames;
	}
	/**
	 * @param criticalErrorNames the criticalErrorNames to set
	 */
	public void setCriticalErrorNames(List<String> criticalErrorNames) {
		CriticalErrorNames = criticalErrorNames;
	}
	/**
	 * @return the documents
	 */
	public List<BuildDocument> getDocuments() {
		return Documents;
	}
	/**
	 * @param documents the documents to set
	 */
	public void setDocuments(List<BuildDocument> documents) {
		Documents = documents;
	}
	/**
	 * @return the errorItems
	 */
	public List<BuildEventErrorListItem> getErrorItems() {
		return ErrorItems;
	}
	/**
	 * @param errorItems the errorItems to set
	 */
	public void setErrorItems(List<BuildEventErrorListItem> errorItems) {
		ErrorItems = errorItems;
	}
	/**
	 * @return the allowedExtensions
	 */
	public String[] getAllowedExtensions() {
		return AllowedExtensions;
	}
	/**
	 * @param allowedExtensions the allowedExtensions to set
	 */
	public void setAllowedExtensions(String[] allowedExtensions) {
		AllowedExtensions = allowedExtensions;
	}	
}
