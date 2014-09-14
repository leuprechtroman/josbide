package josbide.data.user;

import java.awt.image.BufferedImage;

public class ProfileImage {
	private BufferedImage image;
	private OsbideUser user;
	
	/**
	 * @param image
	 * @param user
	 */
	public ProfileImage(BufferedImage image, OsbideUser user) {
		this.image = image;
		this.user = user;
	}
	
	/**
	 * @return the image
	 */
	public BufferedImage getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(BufferedImage image) {
		this.image = image;
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

}
