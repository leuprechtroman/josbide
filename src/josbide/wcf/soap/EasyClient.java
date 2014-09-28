package josbide.wcf.soap;

import java.io.StringWriter;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import josbide.util.EclipseLogger;
import josbide.wcf.soap.operations.OsbideOperation;

import org.w3c.dom.Document;

public class EasyClient {

	//Our WSDL file URL(DO NOT CHANGE THIS!):
	public final String OSBIDE_WEBSERVICE_ENDPOINT_ADRESS = "http://osbide.com/Services/OsbideWebService.svc?singleWsdl";

	private SOAPConnectionFactory connectionFactory;
	private MessageFactory messageFactory;
	
	public EasyClient() {
		try {
			this.connectionFactory = SOAPConnectionFactory.newInstance();
			this.messageFactory = MessageFactory.newInstance();
		} catch (UnsupportedOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Document doRequest(OsbideOperation op){
		try {

			SOAPConnection con = this.connectionFactory.createConnection();

			SOAPMessage payload = this.generatePayload(op);
			
			SOAPMessage response = con.call(payload, this.OSBIDE_WEBSERVICE_ENDPOINT_ADRESS);
			
			return response.getSOAPPart().getEnvelope().getBody().extractContentAsDocument();
			
		} catch (SOAPException e) {
			EclipseLogger.getInstance().log(this, "the SOAP Request went wrong: " + e.getMessage() );
			e.printStackTrace();
			return null;
		}
	}
	
	private SOAPMessage generatePayload(OsbideOperation op){
		try {
			SOAPMessage payload = this.messageFactory.createMessage();
			SOAPEnvelope envelope = payload.getSOAPPart().getEnvelope();
			//Set Server URL for envelope:
			// TODO: Do we need that?
			
			SOAPBody body = envelope.getBody();
			Map<String, Object> params = op.getRequestParameters();
			SOAPElement operationTag = body.addChildElement(op.getRequestName());
			if(!params.isEmpty()){
				//Now: Serializing the objects: There are two possibilities: String or EventLog
				for(Map.Entry<String, Object> entry: params.entrySet()){
					String name = entry.getKey();
					SOAPElement nameTag = operationTag.addChildElement(name);
					//Test if we have a null value
					if(entry.getValue() == null)
						continue;
					//If not, serialize the values in there:
					if(entry.getValue() instanceof String){
						//Just put the String in there:
						
						nameTag.setValue((String) entry.getValue());
						
					}else if(entry.getValue() instanceof josbide.data.events.EventLog){
						
					}
				}
				
			}
			
			MimeHeaders headers = payload.getMimeHeaders();
			headers.addHeader("SOAPAction", op.getActionName());
			payload.saveChanges();
	        
	        return payload;		
			
		} catch (SOAPException e) {
			EclipseLogger.getInstance().log(this, "Generation of the payload went wrong: " + e.getMessage());
			return null;
		}
	}
	
	//method to convert Document to String
	public String getStringFromDocument(Document doc)
	{
	    try
	    {
	       DOMSource domSource = new DOMSource(doc);
	       StringWriter writer = new StringWriter();
	       StreamResult result = new StreamResult(writer);
	       TransformerFactory tf = TransformerFactory.newInstance();
	       Transformer transformer = tf.newTransformer();
	       transformer.transform(domSource, result);
	       return writer.toString();
	    }
	    catch(TransformerException ex)
	    {
	       ex.printStackTrace();
	       return null;
	    }
	} 

}
