package josbide.wcf;

import java.util.ArrayList;
import javax.xml.bind.DatatypeConverter;
import java.util.Date;
import java.util.List;

import josbide.Activator;
import josbide.data.Assignment;

import javax.xml.bind.DatatypeConverter;

import josbide.data.events.EventLog;
import josbide.data.user.Course;
import josbide.data.user.OsbideUser;
import josbide.preferences.PreferenceConstants;
import josbide.util.EclipseLogger;
import josbide.util.OsbideCryptoHelper;
import josbide.wcf.soap.EasyClient;
import josbide.wcf.soap.operations.EchoOperation;
import josbide.wcf.soap.operations.GetAssignmentsForCourseOperation;
import josbide.wcf.soap.operations.GetCoursesForUserOperation;
import josbide.wcf.soap.operations.GetMostRecentWhatsNewItemOperation;
import josbide.wcf.soap.operations.IsValidKeyOperation;
import josbide.wcf.soap.operations.LoginOperation;
import josbide.wcf.soap.operations.OsbideOperation;

import org.eclipse.jface.preference.IPreferenceStore;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class OsbideWebServiceClient extends EasyClient {
	
	private String AuthToken;
	
	private List<Course> courses;
	
	public OsbideWebServiceClient(){
		super();
		this.courses = new ArrayList<Course>();
	}
	
	public String echo(String toEcho){
		OsbideOperation op = new EchoOperation();
		op.setRequestParameter("toEcho", toEcho);
		
		Document result = this.doRequest(op);
		
		Node echoResponse = result.getFirstChild();
		Node echoResult = echoResponse.getFirstChild();
		
		return echoResult.getTextContent();
	}
	
	public OsbideUser getActiveUser(){
		
		//TODO: implement
		return null;
		
	}
	
	public List<Assignment> getAssignmentsForCourse(int courseId){
		
		OsbideOperation op = new GetAssignmentsForCourseOperation();
		op.setRequestParameter("authToken", this.AuthToken);
		op.setRequestParameter("courseId", Integer.toString(courseId));
		
		Document result = this.doRequest(op);
		
		EclipseLogger.getInstance().logDebug(this.getStringFromDocument(result));
		
		Node getAssignmentsForCourseResponse = result.getFirstChild();
		Node getAssignmentsForCourseResult = getAssignmentsForCourseResponse.getFirstChild();
		
		NodeList assignmentObjects = getAssignmentsForCourseResult.getChildNodes();
		
		List<Assignment> assignmentList = new ArrayList<Assignment>();
		
		for(int c =0; c < assignmentObjects.getLength(); c++){
			NodeList assignmentNode = assignmentObjects.item(c).getChildNodes();
			Assignment data = new Assignment();
			//Course will be omitted
			//Course ID:
			data.setCourseId(Integer.parseInt(assignmentNode.item(1).getTextContent()));
			//Course Due Date:
			data.setDueDate(DatatypeConverter.parseDateTime(assignmentNode.item(3).getTextContent()).getTime());
			//Course due Time (why double?)
			//Course ID:
			data.setId(Integer.parseInt(assignmentNode.item(5).getTextContent()));
			//Is Deleted:
			data.setIsDeleted(Boolean.parseBoolean(assignmentNode.item(6).getTextContent()));
			//Name:
			data.setName(assignmentNode.item(7).getTextContent());
			//Release Date:
			data.setReleaseDate(DatatypeConverter.parseDateTime(assignmentNode.item(8).getTextContent()).getTime());
			//Release Time (why double?):
			
			assignmentList.add(data);		
		}
		
		return assignmentList;
	}
	
	public List<Course> getCoursesForUser(){
		
		OsbideOperation op = new GetCoursesForUserOperation();
		op.setRequestParameter("authToken", this.AuthToken);
		
		Document result = this.doRequest(op);
		
		EclipseLogger.getInstance().logDebug(this.getStringFromDocument(result));
		
		Node getCoursesForUserResponse = result.getFirstChild();
		Node getCoursesForUserResult = getCoursesForUserResponse.getFirstChild();
		
		NodeList courseObjects = getCoursesForUserResult.getChildNodes();
		
		for(int i=0; i< courseObjects.getLength(); i++){
			NodeList courseNode = courseObjects.item(i).getChildNodes();
			Course data = new Course();
			//Assignments seem to be ommited
			//Number:
			data.setNumber(Integer.parseInt(courseNode.item(1).getTextContent()));
			//Course/User Relationships. We ignore them, we only get courses send, we're enrolled in
			//Course Description:
			data.setDescription(courseNode.item(3).getTextContent());
			//ID:
			data.setId(Integer.parseInt(courseNode.item(4).getTextContent()));
			//Is Deleted:
			data.setDeleted(Boolean.parseBoolean(courseNode.item(5).getTextContent()));
			//Prefix:
			data.setPrefix(courseNode.item(6).getTextContent());
			//Requires Approval before admission:
			data.setRequiresApprovalBeforeAdmission(
					Boolean.parseBoolean(courseNode.item(7).getTextContent()));
			//School id:
			data.setSchoolId(Integer.parseInt(courseNode.item(8).getTextContent()));
			//School seems to be ommited
			//Season:
			data.setSeason(courseNode.item(10).getTextContent());
			//Year:
			data.setYear(Integer.parseInt(courseNode.item(11).getTextContent()));
			
			//Add this course to our list
			this.courses.add(data);			
		}
		
		EclipseLogger.getInstance().logDebug("Courses collected!");
		EclipseLogger.getInstance().logDebug(this.courses.toString());
		return null;
	}
	
	public String login(String email, String password){
		String hashed = OsbideCryptoHelper.hashPassword(password, email);
		OsbideOperation op = new LoginOperation();
		op.setRequestParameter("email", email);
		op.setRequestParameter("hashedPassword", hashed);
		
		EclipseLogger.getInstance().logDebug("Starting Login Handshake...");
		
		Document result = this.doRequest(op);
		
		Node loginResponse = result.getFirstChild();
		Node loginResult = loginResponse.getFirstChild();
		
		this.AuthToken = loginResult.getTextContent();
		
		EclipseLogger.getInstance().logDebug("Handshake done, AuthToken is " + this.AuthToken);
		
		return loginResult.getTextContent();	
	}
	
	public Date getMostRecentSocialActivityOperation(){
		
		//TODO: Implement for social features, not needed for this work
		return null;
	}
	
	public Date getMostRecentWhatsNewItem(){
		OsbideOperation op = new GetMostRecentWhatsNewItemOperation();
		
		Document result = this.doRequest(op);
		
		Node GetMostRecentWhatsNewItemResponse = result.getFirstChild();
		Node GetMostRecentWhatsNewItemResult = GetMostRecentWhatsNewItemResponse.getFirstChild();
		
		String value = GetMostRecentWhatsNewItemResult.getTextContent();
		java.util.Calendar cal = DatatypeConverter.parseDateTime(value);
		Date resultDate = new Date(cal.getTimeInMillis());
		
		return resultDate;		
	}	
	
	public boolean hasValidKey(){
		if(this.AuthToken == null  || this.AuthToken.isEmpty())
			return false;
		
		OsbideOperation op = new IsValidKeyOperation();
		op.setRequestParameter("authToken", this.AuthToken);
		
		Document result = this.doRequest(op);
		
		Node IsValidKeyResponse = result.getFirstChild();
		Node IsValidKeyResult = IsValidKeyResponse.getFirstChild();
		String bool = IsValidKeyResult.getTextContent();
		
		if(bool.equals("true"))
			return true;
		else
			return false;		
	}
	
	
	
	public boolean autoLogin(){
		
		IPreferenceStore prefs = Activator.getDefault().getPreferenceStore();
		String username = prefs.getString(PreferenceConstants.P_USERNAME);
		String password = prefs.getString(PreferenceConstants.P_PASSWORD);
		
		if(password.isEmpty() || username.isEmpty())
		{
			EclipseLogger.getInstance().logInfo("No credentials entered. Osbide standing by...");
			return false;
		}
		
		String result = this.login(username, password);
		if(result.isEmpty())
		{
			EclipseLogger.getInstance().logInfo("Wrong login credentials supplied. Osbide standing by...");
			return false;
		}
		
		this.AuthToken = result;
		return true;		
	}
	
	public boolean submitAssignment(Assignment payload){
		
		//TODO: IMplement
		return false;
	}
	
	public boolean submitLog(EventLog payload){
		
		//TODO: implement
		return false;
	}
	
	public String getValidAuthToken(){
		if(!this.hasValidKey())
		{
			this.autoLogin();
			return this.AuthToken;
		}
		
		return this.AuthToken;
	}

	/**
	 * @return the courses
	 */
	public List<Course> getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
