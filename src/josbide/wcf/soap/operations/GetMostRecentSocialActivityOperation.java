package josbide.wcf.soap.operations;

public class GetMostRecentSocialActivityOperation extends OsbideOperation {

	@Override
	protected void initializeOperation() {
		this.requestName = "GetMostRecentSocialActivity";
		this.requestParameterNames = new String[] { "authToken" };
	}

}
