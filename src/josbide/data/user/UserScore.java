package josbide.data.user;

import java.util.Date;

public class UserScore {
	
	private int userId;
	private OsbideUser user;
	private int score;
	private Date lastCalculated;
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
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
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * @return the lastCalculated
	 */
	public Date getLastCalculated() {
		return lastCalculated;
	}
	/**
	 * @param lastCalculated the lastCalculated to set
	 */
	public void setLastCalculated(Date lastCalculated) {
		this.lastCalculated = lastCalculated;
	}
}
