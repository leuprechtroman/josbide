package josbide.soap;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

import josbide.soap.operations.OsbideOperation;

import org.reficio.ws.builder.SoapBuilder;
import org.reficio.ws.client.core.SoapClient;

public class SoapCall implements Callable<List<SoapParameter>> {

	//Our Endpoint Adress(DO NOT CHANGE):
	public final String OSBIDE_CLIENT_ENDPOINT = "http://osbide.com/Services/OsbideWebService.svc";

	private OsbideOperation op;
	private SoapBuilder builder;

	public SoapCall(SoapBuilder builder, OsbideOperation op) {
		this.builder = builder;
		this.op = op;
	}

	@Override
	public List<SoapParameter> call() throws Exception, IllegalStateException,
			IllegalArgumentException, NoSuchElementException {

		//Basic checking:
		if (op == null)
			throw new IllegalArgumentException(
					"EasyClient.doOperation needs an operation to work, not NULL");

		//Everything okay for now, create payload
		SoapPayload payload = new SoapPayload(this.builder, op.getRequestName());

		//Check if operation does supply all arguments
		op.checkRequestParameters();

		//Add all arguments to payload, if there are some
		if (op.getRequestParameters().size() != 0) {
			for (SoapParameter param : op.getRequestParameters()) {
				payload.addParameter(param);
			}
		}
		//Create the soap client:

		SoapClient client = SoapClient.builder().endpointUri(this.OSBIDE_CLIENT_ENDPOINT).build();

		String rawResponse = "";

		rawResponse = client.post(op.getActionName(), payload.toString());

		//If one of these is null, we do not return anything
		if (!op.doesReturnSomething())
			return null;

		//Create Payload to read the response:
		SoapPayload response = new SoapPayload(rawResponse, op.getResponseName());

		//Retrieve all the Parameters that are returned:
		List<SoapParameter> responseParameters = new ArrayList<SoapParameter>();

		for (String paramName : op.getResponseParameterNames()) {
			responseParameters.add(new SoapParameter(paramName, response.readParameter(paramName)));
		}
		//Write the result back into the operation
		return responseParameters;
	}

}
