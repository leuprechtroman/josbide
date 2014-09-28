package josbide.wcf.soap.operations;

public class SubmitLogOperation extends OsbideOperation {

	
	@Override
	protected void initializeOperation() {
		this.requestName = "SubmitLog";
		this.requestParameterNames = new String[] { "log", "authToken" };
	}

}
