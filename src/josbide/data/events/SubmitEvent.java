package josbide.data.events;

import josbide.data.Assignment;


public class SubmitEvent extends OsbideEvent {
	
	private Assignment Assignment;
	private int AssignmentId;
	private final String Name;
	private byte[] SolutionData;
	private String SolutionName;
	
	public SubmitEvent() {
		super("SubmitEvent", "Submit Assignment");
		this.Name = this.EventName;
	}
	
	/**
	 * @return the assignment
	 */
	public Assignment getAssignment() {
		return Assignment;
	}
	/**
	 * @param assignment the assignment to set
	 */
	public void setAssignment(Assignment assignment) {
		this.Assignment = assignment;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @return the solutionData
	 */
	public byte[] getSolutionData() {
		return SolutionData;
	}
	/**
	 * @param solutionData the solutionData to set
	 */
	public void setSolutionData(byte[] solutionData) {
		this.SolutionData = solutionData;
	}
	/**
	 * @return the assignmentId
	 */
	public int getAssignmentId() {
		return AssignmentId;
	}
	/**
	 * @param assignmentId the assignmentId to set
	 */
	public void setAssignmentId(int assignmentId) {
		AssignmentId = assignmentId;
	}
	/**
	 * @return the solutionName
	 */
	public String getSolutionName() {
		return SolutionName;
	}
	/**
	 * @param solutionName the solutionName to set
	 */
	public void setSolutionName(String solutionName) {
		SolutionName = solutionName;
	}
}
