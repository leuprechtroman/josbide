package josbide.wcf.soap.operations;

public class GetActiveUserOperation extends OsbideOperation {

	public GetActiveUserOperation() {
		super();
	}

	@Override
	public boolean doesReturnSomething() {
		return true;
	}

	@Override
	protected void initializeOperation() {
		this.requestName = "GetActiveUser";
		this.requestParameterNames = new String[] { "authToken" };
		this.responseName = "GetActiveUserResponse";
		this.responseParameterNames = new String[] { "GetActiveUserResult" };
	}
}
