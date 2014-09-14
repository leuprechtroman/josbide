package josbide.data.user;

public enum CourseRole {
	
	STUDENT(0), ASSISTANT(1), COORDINATOR(2);
	
	private int code;
	
	private CourseRole(int c) {
		this.code = c;
	}

	public int getCode() {
		return this.code;
	}
}
