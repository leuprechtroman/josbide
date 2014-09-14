package josbide.data.user;

public class CourseMembership {
	private Course course;
	private OsbideUser user;
	private boolean isActive;
	private boolean isApproved;
	private CourseRole role;
	
	/**
	 * @param course
	 * @param user
	 * @param isActive
	 * @param isApproved
	 * @param role
	 */
	public CourseMembership(Course course, OsbideUser user, boolean isActive, boolean isApproved,
			CourseRole role) {
		this.course = course;
		this.user = user;
		this.isActive = isActive;
		this.isApproved = isApproved;
		this.role = role;
	}
	
	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}
	/**
	 * @return the user
	 */
	public OsbideUser getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(OsbideUser user) {
		this.user = user;
	}
	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	/**
	 * @return the isApproved
	 */
	public boolean isApproved() {
		return isApproved;
	}
	/**
	 * @param isApproved the isApproved to set
	 */
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	/**
	 * @return the role
	 */
	public CourseRole getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(CourseRole role) {
		this.role = role;
	}
}
