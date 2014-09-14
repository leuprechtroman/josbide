package soap.operations;

public class LoginOperation extends OsbideOperation {

	public LoginOperation() {
		super();
	}

	@Override
	public boolean doesReturnSomething() {
		return true;
	}

	@Override
	protected void initializeOperation() {
		this.requestName = "Login";
		this.requestParameterNames = new String[] { "email", "hashedPassword" };
		this.responseName = "LoginResponse";
		this.responseParameterNames = new String[] { "LoginResult" };
	}
}
