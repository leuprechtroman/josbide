package josbide.wcf.soap.operations;

public class GetCoursesForUserOperation extends OsbideOperation {

	@Override
	protected void initializeOperation() {
		this.requestName = "GetCoursesForUser";
		this.requestParameterNames = new String[] { "authToken" };
	}

}
