package josbide.wcf.soap.operations;

public class SubmitAssignmentOperation extends OsbideOperation {

	@Override
	protected void initializeOperation() {
		this.requestName = "SubmitAssignment";
		this.requestParameterNames = new String[] { "assignmentId", "assignmentLog", "authToken" };
	}

}
