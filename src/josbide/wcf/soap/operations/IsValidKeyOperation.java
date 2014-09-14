package josbide.wcf.soap.operations;

public class IsValidKeyOperation extends OsbideOperation {

	public IsValidKeyOperation() {
		super();
	}

	@Override
	public boolean doesReturnSomething() {
		return true;
	}

	@Override
	protected void initializeOperation() {
		this.requestName = "IsValidKey";
		this.requestParameterNames = new String[] { "authToken" };
		this.responseName = "IsValidKeyResponse";
		this.responseParameterNames = new String[] { "IsValidKeyResult" };
	}
}
