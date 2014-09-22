package josbide.util;

import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.SecurePreferencesFactory;
import org.eclipse.equinox.security.storage.StorageException;

/** 
 * Secure storage module. Relies on Eclipse Secure Preferences. When an Eclipse Master Password is set, this will be encrypted!
 * 
 * //TODO: Encryption?
 * 
 * @author roman
 *
 */

public class SecureDataStore {
	
	private ISecurePreferences prefs;
	
	public SecureDataStore(){
		this.prefs = SecurePreferencesFactory.getDefault().node("josbide");
	}
	
	public void setData(String key, String value){
		try {
			this.prefs.put(key, value, true);
		} catch (StorageException e) {
			EclipseLogger.getInstance().log(this, "An error occured while encryption of secure storage: " + e.getMessage());
		}
	}
	
	public String getData(String key)
	{
		try {
			return this.prefs.get(key, "");
		} catch (StorageException e) {
			EclipseLogger.getInstance().log(this, "An error occured while encryption of secure storage: " + e.getMessage());
			return "";
		}
	}
	
	public void setInt(String key, int value){
		try {
			this.prefs.putInt(key, value, true);
		} catch (StorageException e) {
			EclipseLogger.getInstance().log(this, "An error occured while encryption of secure storage: " + e.getMessage());
		}
	}
	
	public int getInt(String key){
		try {
			return this.prefs.getInt(key, 0);
		} catch (StorageException e) {
			EclipseLogger.getInstance().log(this, "An error occured while encryption of secure storage: " + e.getMessage());
			return 0;
		}
	}
	
	public void setBytes(String key, byte[] value){
		try {
			this.prefs.putByteArray(key, value, true);
		} catch (StorageException e) {
			EclipseLogger.getInstance().log(this, "An error occured while encryption of secure storage: " + e.getMessage());
		}
	}
	
	public byte[] getBytes(String key){
		try {
			return this.prefs.getByteArray(key, new byte[0]);
		} catch (StorageException e) {
			EclipseLogger.getInstance().log(this, "An error occured while encryption of secure storage: " + e.getMessage());
			return null;
		}
	}
}
