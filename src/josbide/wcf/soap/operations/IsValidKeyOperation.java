package josbide.wcf.soap.operations;

public class IsValidKeyOperation extends OsbideOperation {

	public IsValidKeyOperation() {
		super();
	}

	@Override
	protected void initializeOperation() {
		this.requestName = "IsValidKey";
		this.requestParameterNames = new String[] { "authToken" };
	}
}
