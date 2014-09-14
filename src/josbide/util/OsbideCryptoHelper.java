package josbide.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Base64;

import josbide.data.user.OsbideUser;

public class OsbideCryptoHelper {
	
	public static String hashPassword(String password, OsbideUser user)
	{
		//We hash via user email
		byte[] hashBytes = OsbideCryptoHelper.hashPassword(password, user.getEmail());
		return Base64.getEncoder().encodeToString(hashBytes);
	}
	
	private static byte[] hashPassword(String password, String hash){
		try{
			//Create bytestream to concatenate both:
			ByteArrayOutputStream bytes = new ByteArrayOutputStream();
			//First password, then email
			bytes.write(password.getBytes(Charset.forName("UTF-8")));
			bytes.write(hash.getBytes(Charset.forName("UTF-8")));
			//Initialize our message digest function		
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(bytes.toByteArray());
			byte[] digest = md.digest();
			return digest;
			
		}
		catch(Exception e){
			System.err.println("CryptoHelper: " +e.getMessage());
			return new byte[0];
		}		
	}
}
