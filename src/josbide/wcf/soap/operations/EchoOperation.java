package josbide.wcf.soap.operations;

public class EchoOperation extends OsbideOperation {

	public EchoOperation() {
		super();
	}

	@Override
	protected void initializeOperation() {
		this.requestName = "Echo";
		this.requestParameterNames = new String[] { "toEcho" };
	}
}
