package josbide.wcf.soap.operations;

public class GetAssignmentsForCourseOperation extends OsbideOperation {

	@Override
	protected void initializeOperation() {
		this.requestName = "GetAssignmentsForCourse";
		this.requestParameterNames = new String[] { "courseId", "authToken" };
	}

}
