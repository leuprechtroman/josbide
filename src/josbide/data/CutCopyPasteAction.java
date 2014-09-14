package josbide.data;

public enum CutCopyPasteAction {
	CUT(0), COPY(1), PASTE(2);
	
	private int code;
	
	private CutCopyPasteAction(int code){
		this.code = code;
	}
	
	public int getCode(){
		return this.code;
	}
}
