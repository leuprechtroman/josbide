package josbide.util;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.osgi.service.prefs.Preferences;

/** 
 * We use the key/value store of eclipse to store user data.
 * 
 * //TODO: Encryption?
 * 
 * @author roman
 *
 */

public class LocalDataStore {
	
	private Preferences prefs;
	
	public LocalDataStore(){
		this.prefs = ConfigurationScope.INSTANCE.getNode("josbide");
	}
	
	public void setData(String key, String value){
		this.prefs.put(key, value);
	}
	
	public String getData(String key)
	{
		return this.prefs.get(key, "");
	}
	
	public void setInt(String key, int value){
		this.prefs.putInt(key, value);
	}
	
	public int getInt(String key){
		return this.prefs.getInt(key, 0);
	}
	
	public void setBytes(String key, byte[] value){
		this.prefs.putByteArray(key, value);
	}
	
	public void getBytes(String key){
		this.prefs.getByteArray(key, new byte[0]);
	}
}
