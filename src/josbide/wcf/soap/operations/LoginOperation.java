package josbide.wcf.soap.operations;

public class LoginOperation extends OsbideOperation {

	public LoginOperation() {
		super();
	}

	@Override
	protected void initializeOperation() {
		this.requestName = "Login";
		this.requestParameterNames = new String[] { "email", "hashedPassword" };
	}
}
