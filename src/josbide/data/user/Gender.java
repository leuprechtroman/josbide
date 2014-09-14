package josbide.data.user;

public enum Gender {
	
	UNKNOWN(1), MALE(2), FEMALE(3);
	
	private int code;
	
	private Gender(int c){
		this.code = c;
	}
	
	public int getCode(){
		return this.code;
	}
}
