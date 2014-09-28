package josbide.wcf.soap.operations;

public class GetActiveUserOperation extends OsbideOperation {

	public GetActiveUserOperation() {
		super();
	}

	@Override
	protected void initializeOperation() {
		this.requestName = "GetActiveUser";
		this.requestParameterNames = new String[] { "authToken" };
	}
}
