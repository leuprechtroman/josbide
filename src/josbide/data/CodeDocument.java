package josbide.data;

import java.util.ArrayList;
import java.util.List;

public class CodeDocument extends Document {
	
	private List<Error> errors;
	private List<Breakpoint> breakpoints;

	public CodeDocument(int id, String fileName, String content) {
		super(id, fileName, content);
		this.errors = new ArrayList<Error>();
		this.breakpoints = new ArrayList<Breakpoint>();
	}
	
	public void addError(Error e){
		this.errors.add(e);
	}
	
	public void addBreakpoint(Breakpoint b){
		this.breakpoints.add(b);
	}

}
