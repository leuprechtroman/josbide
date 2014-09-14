package josbide.data.user;

public enum SystemRole {
	
	STUDENT(1), TA(2), INSTRUCTOR(4), ADMIN(8);
	
	private int code;
	
	private SystemRole(int c){
		this.code = c;
	}
	
	public int getCode(){
		return this.code;
	}

}
