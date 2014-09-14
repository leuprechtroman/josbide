package josbide.data.user;

import java.util.Date;
import java.util.List;

import josbide.data.events.EventLogSuscription;

public class OsbideUser {
	
	private List<CourseMembership> courses;
	private Course defaultCourse;
	private String email;
	private String firstName;
	private String lastName;
	private Gender gender;
	private int id;
	private int InstitutionId;
	private Date LastActivity;
	private List<EventLogSuscription> suscriptions;
	private ProfileImage profileImage;
	private boolean recieveEmailOnNewAskForHelp;
	private boolean recieveEmailOnNewFeedPost;
	private boolean revcieveNotificationEmails;
	private SystemRole role;
	private School school;
	private UserScore score;
	
	/**
	 * @return the courses
	 */
	public List<CourseMembership> getCourses() {
		return courses;
	}
	/**
	 * @param courses the courses to set
	 */
	public void setCourses(List<CourseMembership> courses) {
		this.courses = courses;
	}
	/**
	 * @return the defaultCourse
	 */
	public Course getDefaultCourse() {
		return defaultCourse;
	}
	/**
	 * @param defaultCourse the defaultCourse to set
	 */
	public void setDefaultCourse(Course defaultCourse) {
		this.defaultCourse = defaultCourse;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the institutionId
	 */
	public int getInstitutionId() {
		return InstitutionId;
	}
	/**
	 * @param institutionId the institutionId to set
	 */
	public void setInstitutionId(int institutionId) {
		InstitutionId = institutionId;
	}
	/**
	 * @return the lastActivity
	 */
	public Date getLastActivity() {
		return LastActivity;
	}
	/**
	 * @param lastActivity the lastActivity to set
	 */
	public void setLastActivity(Date lastActivity) {
		LastActivity = lastActivity;
	}
	/**
	 * @return the suscriptions
	 */
	public List<EventLogSuscription> getSuscriptions() {
		return suscriptions;
	}
	/**
	 * @param suscriptions the suscriptions to set
	 */
	public void setSuscriptions(List<EventLogSuscription> suscriptions) {
		this.suscriptions = suscriptions;
	}
	/**
	 * @return the profileImage
	 */
	public ProfileImage getProfileImage() {
		return profileImage;
	}
	/**
	 * @param profileImage the profileImage to set
	 */
	public void setProfileImage(ProfileImage profileImage) {
		this.profileImage = profileImage;
	}
	/**
	 * @return the recieveEmailOnNewAskForHelp
	 */
	public boolean isRecieveEmailOnNewAskForHelp() {
		return recieveEmailOnNewAskForHelp;
	}
	/**
	 * @param recieveEmailOnNewAskForHelp the recieveEmailOnNewAskForHelp to set
	 */
	public void setRecieveEmailOnNewAskForHelp(boolean recieveEmailOnNewAskForHelp) {
		this.recieveEmailOnNewAskForHelp = recieveEmailOnNewAskForHelp;
	}
	/**
	 * @return the recieveEmailOnNewFeedPost
	 */
	public boolean isRecieveEmailOnNewFeedPost() {
		return recieveEmailOnNewFeedPost;
	}
	/**
	 * @param recieveEmailOnNewFeedPost the recieveEmailOnNewFeedPost to set
	 */
	public void setRecieveEmailOnNewFeedPost(boolean recieveEmailOnNewFeedPost) {
		this.recieveEmailOnNewFeedPost = recieveEmailOnNewFeedPost;
	}
	/**
	 * @return the revcieveNotificationEmails
	 */
	public boolean isRevcieveNotificationEmails() {
		return revcieveNotificationEmails;
	}
	/**
	 * @param revcieveNotificationEmails the revcieveNotificationEmails to set
	 */
	public void setRevcieveNotificationEmails(boolean revcieveNotificationEmails) {
		this.revcieveNotificationEmails = revcieveNotificationEmails;
	}
	/**
	 * @return the role
	 */
	public SystemRole getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(SystemRole role) {
		this.role = role;
	}
	/**
	 * @return the school
	 */
	public School getSchool() {
		return school;
	}
	/**
	 * @param school the school to set
	 */
	public void setSchool(School school) {
		this.school = school;
	}
	/**
	 * @return the score
	 */
	public UserScore getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(UserScore score) {
		this.score = score;
	}
}