package josbide.wcf.soap.operations;

public class GetMostRecentWhatsNewItemOperation extends OsbideOperation {

	public GetMostRecentWhatsNewItemOperation() {
		super();
	}

	@Override
	protected void initializeOperation() {
		this.requestName = "GetMostRecentWhatsNewItem";
		this.requestParameterNames = new String[] {};
	}
}
