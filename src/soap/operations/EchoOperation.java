package soap.operations;

public class EchoOperation extends OsbideOperation {

	public EchoOperation() {
		super();
	}

	@Override
	public boolean doesReturnSomething() {
		return true;
	}

	@Override
	protected void initializeOperation() {
		this.requestName = "Echo";
		this.requestParameterNames = new String[] { "toEcho" };
		this.responseName = "EchoResponse";
		this.responseParameterNames = new String[] { "EchoResult" };
	}
}
