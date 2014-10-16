package josbide.data.user;

import java.util.List;

import josbide.data.Assignment;

public class Course {
	
	private int id;
	private School school;
	private int schoolId;
	private String name;
	private String prefix;
	private int number;
	private String description;
	private int Year;
	private String Season;
	private boolean requiresApprovalBeforeAdmission;
	private boolean isDeleted;
	private List<CourseMembership> members;
	private List<Assignment> assignments;
	
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}
	/**
	 * @param prefix the prefix to set
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return Year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		Year = year;
	}
	/**
	 * @return the season
	 */
	public String getSeason() {
		return Season;
	}
	/**
	 * @param season the season to set
	 */
	public void setSeason(String season) {
		Season = season;
	}
	/**
	 * @return the requiresApprovalBeforeAdmission
	 */
	public boolean isRequiresApprovalBeforeAdmission() {
		return requiresApprovalBeforeAdmission;
	}
	/**
	 * @param requiresApprovalBeforeAdmission the requiresApprovalBeforeAdmission to set
	 */
	public void setRequiresApprovalBeforeAdmission(boolean requiresApprovalBeforeAdmission) {
		this.requiresApprovalBeforeAdmission = requiresApprovalBeforeAdmission;
	}
	/**
	 * @return the isDeleted
	 */
	public boolean isDeleted() {
		return isDeleted;
	}
	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	/**
	 * @return the members
	 */
	public List<CourseMembership> getMembers() {
		return members;
	}
	/**
	 * @param members the members to set
	 */
	public void setMembers(List<CourseMembership> members) {
		this.members = members;
	}
	/**
	 * @return the assignments
	 */
	public List<Assignment> getAssignments() {
		return assignments;
	}
	/**
	 * @param assignments the assignments to set
	 */
	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}
	/**
	 * @return the schoolId
	 */
	public int getSchoolId() {
		return schoolId;
	}
	/**
	 * @param schoolId the schoolId to set
	 */
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [id=" + id + ", schoolId=" + schoolId + ", name=" + name + ", prefix="
				+ prefix + ", number=" + number + ", description=" + description + ", Year=" + Year
				+ ", Season=" + Season + ", requiresApprovalBeforeAdmission="
				+ requiresApprovalBeforeAdmission + ", isDeleted=" + isDeleted + "]";
	}
	
	
}