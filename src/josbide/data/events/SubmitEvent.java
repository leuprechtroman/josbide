package josbide.data.events;

import josbide.data.Assignment;

public class SubmitEvent extends OsbideEvent {
	
	private Assignment assignment;
	private String name;
	private byte[] solutionData;
	
	/**
	 * @return the assignment
	 */
	public Assignment getAssignment() {
		return assignment;
	}
	/**
	 * @param assignment the assignment to set
	 */
	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
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
	/**
	 * @return the solutionData
	 */
	public byte[] getSolutionData() {
		return solutionData;
	}
	/**
	 * @param solutionData the solutionData to set
	 */
	public void setSolutionData(byte[] solutionData) {
		this.solutionData = solutionData;
	}
}
