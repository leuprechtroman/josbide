package josbide.wcf;

import java.util.Date;

import javax.xml.bind.DatatypeConverter;

import josbide.util.OsbideCryptoHelper;
import josbide.wcf.soap.EasyClient;
import josbide.wcf.soap.SoapParameter;
import josbide.wcf.soap.operations.EchoOperation;
import josbide.wcf.soap.operations.GetMostRecentWhatsNewItemOperation;
import josbide.wcf.soap.operations.IsValidKeyOperation;
import josbide.wcf.soap.operations.LoginOperation;
import josbide.wcf.soap.operations.OsbideOperation;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class OsbideWebServiceClient extends EasyClient {
	
	public String login(String email, String password){
		String hashed = OsbideCryptoHelper.hashPassword(password, email);
		OsbideOperation op = new LoginOperation();
		op.setRequestParameter("email", email);
		op.setRequestParameter("hashedPassword", hashed);

		Document result = this.doRequest(op);
		
		Node loginResponse = result.getFirstChild();
		Node loginResult = loginResponse.getFirstChild();
		
		return loginResult.getTextContent();	
	}
	
	public String echo(String toEcho){
		OsbideOperation op = new EchoOperation();
		op.setRequestParameter("toEcho", toEcho);
		
		Document result = this.doRequest(op);
		
		Node echoResponse = result.getFirstChild();
		Node echoResult = echoResponse.getFirstChild();
		
		return echoResult.getTextContent();
	}
	
	public boolean isValidKey(String authToken){
		OsbideOperation op = new IsValidKeyOperation();
		op.setRequestParameter("authToken", authToken);
		
		Document result = this.doRequest(op);
		
		Node IsValidKeyResponse = result.getFirstChild();
		Node IsValidKeyResult = IsValidKeyResponse.getFirstChild();
		String bool = IsValidKeyResult.getTextContent();
		
		if(bool == "true")
			return true;
		else
			return false;		
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
}
