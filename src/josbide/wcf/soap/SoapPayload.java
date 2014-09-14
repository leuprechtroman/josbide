package josbide.wcf.soap;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.NoSuchElementException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.reficio.ws.builder.SoapBuilder;
import org.reficio.ws.builder.SoapOperation;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class SoapPayload {

	public final String XML_HEADER = "<?xml version=\"1.0\"?>\n";

	Document content = null;
	String operationName = null;

	/**
	 * Constructs a Payload from a builder and an operationName. This produces a
	 * payload object, you can add Parameters to. It produces the XML you need
	 * to post to the OSBIDE Service.
	 * 
	 * @param builder
	 *            The SoapBuilder to construct the messages from
	 * @param opName
	 *            The operation you want to execute and recieve data from
	 */

	public SoapPayload(SoapBuilder builder, String opName) {
		this.operationName = opName;
		//Get our Soap operation and then build the message corpus from it and set it as document
		SoapOperation op = builder.operation().name(opName).find();
		String envelope = this.XML_HEADER + builder.buildInputMessage(op);
		this.content = readEnvelope(envelope);
	}

	/**
	 * Constructs a payload from the response of the OSBIDE Webservice
	 * 
	 * @param payload
	 *            Response of the Osbide Webservice as String
	 * @param opName
	 *            Name of the Operation performed to get this response
	 */

	public SoapPayload(String payload, String opName) {
		this.operationName = opName;
		if (!payload.startsWith("<?xml"))
			payload = this.XML_HEADER + payload;
		this.content = readEnvelope(payload);
	}

	/**
	 * Reads the raw XML envelope into a document object
	 * 
	 * @param envelope
	 *            the raw XML envelope
	 * @return Document
	 */

	public Document readEnvelope(String envelope) {
		InputSource envelope_input = new InputSource(new StringReader(envelope));
		Document result = null;
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			result = builder.parse(envelope_input);
		} catch (Exception e) {
			System.err.println("SoapPayload.readEnvelope went wrong:" + e);
		}
		return result;
	}

	/**
	 * Finds a Child to a Node with the specified name. Searches only the first
	 * level, not recursive
	 * 
	 * @param parent
	 *            Parent Node to search for
	 * @param childName
	 *            child Name to search for
	 * @return returns child Node
	 * @throws Exception
	 *             When not found
	 */

	private Node findChildNodeWithName(Node parent, String childName) throws NoSuchElementException {
		Node result = null;
		NodeList children = parent.getChildNodes();
		//Search for body element and add all the values:
		for (int i = 0; i < children.getLength(); i++) {
			if (children.item(i).getNodeName() == childName) {
				result = children.item(i);
			}
		}
		//If not found, throw exception, so the calling Method can do the error handling
		if (result == null)
			throw new NoSuchElementException(this.getClass().getName() + ": No Child of "
					+ parent.getLocalName() + " with Name " + childName + " found");
		//Return result when found
		return result;
	}

	/**
	 * Retrieves the parameter node in the soap structure
	 * 
	 * @param bodyName
	 *            Name of the body tag
	 * @param opName
	 *            Name of the operation tag
	 * @param paramName
	 *            Name of the parameter tag
	 * @return Parameter tag as Node object
	 * @throws Exception
	 *             When specified child nodes are not found
	 */

	private Node getParameterNodeInBody(String bodyName, String opName, String paramName)
			throws IllegalArgumentException, NoSuchElementException {

		Node result = null;

		//Test content:
		if (this.content == null)
			throw new IllegalArgumentException(this.getClass().getName()
					+ ": Payload has no content!");

		//Get the root Node of our payload:
		Node rootNode = content.getDocumentElement();
		//Find Body Node:
		Node soapBody = this.findChildNodeWithName(rootNode, bodyName);
		//Find Operation Node:
		Node operationNode = this.findChildNodeWithName(soapBody, opName);
		//Find Parameter Node and write it into result
		result = this.findChildNodeWithName(operationNode, paramName);

		return result;
	}

	/**
	 * Add a parameter to the payload.
	 * 
	 * @param param
	 *            SoapParameter to add
	 * 
	 * @return True if adding was successful, False if not
	 */

	public void addParameter(SoapParameter param) throws IllegalArgumentException,
			NoSuchElementException, IllegalStateException {

		if (param == null)
			throw new IllegalArgumentException(this.getClass().getName() + ": param was empty!");

		param.test();

		//Get parameter Node:			
		Node parameterNode = this.getParameterNodeInBody("soapenv:Body", this.operationName,
				param.getName());
		//Set param value
		parameterNode.setTextContent(param.getValue());
	}

	/**
	 * Read a parameter from the payload
	 * 
	 * @param param
	 * @return
	 */

	public String readParameter(String paramName) throws IllegalArgumentException,
			NoSuchElementException {
		String result = "";
		//Get parameter Node:			
		Node parameterNode = this.getParameterNodeInBody("s:Body", this.operationName, paramName);
		//get param value
		result = parameterNode.getTextContent();
		return result;
	}

	@Override
	public String toString() {
		String result = "";

		if (this.content == null)
			result = "Payload is null";

		try {
			DOMSource dom = new DOMSource(this.content);
			StringWriter writer = new StringWriter();
			StreamResult streamResult = new StreamResult(writer);
			TransformerFactory tfactory = TransformerFactory.newInstance();
			Transformer transformer = tfactory.newTransformer();
			transformer.transform(dom, streamResult);
			result = writer.toString();
		} catch (Exception e) {
			System.err.println("Document could not be transformed to String representation: " + e);
			result = "An exception occured. Please check your error stream!";
		}

		return result;
	}
}
