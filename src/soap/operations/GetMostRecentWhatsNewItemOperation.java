package soap.operations;

public class GetMostRecentWhatsNewItemOperation extends OsbideOperation {

	public GetMostRecentWhatsNewItemOperation() {
		super();
	}

	@Override
	public boolean doesReturnSomething() {
		return true;
	}

	@Override
	protected void initializeOperation() {
		this.requestName = "GetMostRecentWhatsNewItem";
		this.requestParameterNames = new String[] {};
		this.responseName = "GetMostRecentWhatsNewItemResponse";
		this.responseParameterNames = new String[] { "GetMostRecentWhatsNewItemResult" };
	}
}
