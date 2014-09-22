package josbide.data;

import java.util.Date;

import josbide.data.events.BuildEvent;
import josbide.data.user.OsbideUser;

public class BuildDocument {
	
	private int BuildId = 0;
	private BuildEvent Build;
	private int DocumentId = 0;
	private CodeDocument Document;
	private int NumberOfInserted = 0;
	private int NumberOfModified = 0;
	private int NumberOfDeleted = 0;
	private Date UpdatedOn;
	public int UpdatedBy = 0;
	public OsbideUser UpdatedByUser;
	
	
	/**
	 * @return the buildId
	 */
	public int getBuildId() {
		return BuildId;
	}
	/**
	 * @param buildId the buildId to set
	 */
	public void setBuildId(int buildId) {
		BuildId = buildId;
	}
	/**
	 * @return the build
	 */
	public BuildEvent getBuild() {
		return Build;
	}
	/**
	 * @param build the build to set
	 */
	public void setBuild(BuildEvent build) {
		Build = build;
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
		Document = document;
	}
	/**
	 * @return the numberOfInserted
	 */
	public int getNumberOfInserted() {
		return NumberOfInserted;
	}
	/**
	 * @param numberOfInserted the numberOfInserted to set
	 */
	public void setNumberOfInserted(int numberOfInserted) {
		NumberOfInserted = numberOfInserted;
	}
	/**
	 * @return the numberOfModified
	 */
	public int getNumberOfModified() {
		return NumberOfModified;
	}
	/**
	 * @param numberOfModified the numberOfModified to set
	 */
	public void setNumberOfModified(int numberOfModified) {
		NumberOfModified = numberOfModified;
	}
	/**
	 * @return the numberOfDeleted
	 */
	public int getNumberOfDeleted() {
		return NumberOfDeleted;
	}
	/**
	 * @param numberOfDeleted the numberOfDeleted to set
	 */
	public void setNumberOfDeleted(int numberOfDeleted) {
		NumberOfDeleted = numberOfDeleted;
	}
	/**
	 * @return the updatedOn
	 */
	public Date getUpdatedOn() {
		return UpdatedOn;
	}
	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(Date updatedOn) {
		UpdatedOn = updatedOn;
	}
	/**
	 * @return the updatedBy
	 */
	public int getUpdatedBy() {
		return UpdatedBy;
	}
	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(int updatedBy) {
		UpdatedBy = updatedBy;
	}
	/**
	 * @return the updatedByUser
	 */
	public OsbideUser getUpdatedByUser() {
		return UpdatedByUser;
	}
	/**
	 * @param updatedByUser the updatedByUser to set
	 */
	public void setUpdatedByUser(OsbideUser updatedByUser) {
		UpdatedByUser = updatedByUser;
	}
	

}
