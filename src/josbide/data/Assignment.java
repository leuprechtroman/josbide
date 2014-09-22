package josbide.data;

import java.util.Date;

import josbide.data.user.Course;

public class Assignment {
	
	private int Id;
	private Course Course;
	private int CourseId;
	private String Name;
	private boolean IsDeleted;
	private Date ReleaseDate;
	private Date DueDate;
	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}
	/**
	 * @return the course
	 */
	public Course getCourse() {
		return Course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		Course = course;
	}
	/**
	 * @return the courseId
	 */
	public int getCourseId() {
		return CourseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the isDeleted
	 */
	public boolean isIsDeleted() {
		return IsDeleted;
	}
	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setIsDeleted(boolean isDeleted) {
		IsDeleted = isDeleted;
	}
	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return ReleaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		ReleaseDate = releaseDate;
	}
	/**
	 * @return the dueDate
	 */
	public Date getDueDate() {
		return DueDate;
	}
	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}
	
}
