package josbide.wcf.soap.operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class OsbideOperation {

	//Prefix for all actions(DO NOT CHANGE OR OVERWRITE)
	public final String OSBIDE_ACTION_URN_PREFIX = "urn:OsbideWebService/";

	protected String requestName = null;
	protected String[] requestParameterNames = null;
	protected Map<String, Object> params = new HashMap<String, Object>();

	/**
	 * Contructor to generate subclasses easy
	 * 
	 */
	public OsbideOperation() throws IllegalStateException {
		//Init all values;
		initializeOperation();
		//Init the array
		this.params = new HashMap<String, Object>();
		//Now test if the parameters are all set, if not abort!
		if (requestName == null || requestParameterNames == null || params == null)
			throw new IllegalStateException(this.getClass().getName()
					+ ": Not all fields were initialized!");
	}

	/**
	 * Set all the values in the subclasses
	 */

	protected abstract void initializeOperation();

	/**
	 * Set request parameters. You can only set parameters with names listed in
	 * reqParameterNames
	 * 
	 * @param newParam
	 *            The parameter to set
	 */
	public void setRequestParameter(String key, Object value) {
		this.params.put(key, value);		
	}

	/**
	 * Checks if there are as many parameters set as parameter names exist.
	 * 
	 * @throws IllegalStateException
	 */

	public void checkRequestParameters() throws IllegalStateException {
		if (this.requestParameterNames.length != this.params.size())
			throw new IllegalStateException(
					"Operation has too few request parameter objects. Required: "
							+ this.requestParameterNames.length + ", present: "
							+ this.params.size());
		
	}

	/**
	 * Recieve all the request parameters set
	 * 
	 * @return All request parameters
	 */
	public Map<String, Object> getRequestParameters() {
		return this.params;
	}

	/**
	 * @return the reqName
	 */
	public String getRequestName() {
		return requestName;
	}

	/**
	 * @return the actionName
	 */
	public String getActionName() {
		return this.OSBIDE_ACTION_URN_PREFIX + this.requestName;
	}

	/**
	 * @return the reqParameters
	 */
	public String[] getRequestParameterNames() {
		return requestParameterNames;
	}

	@Override
	public String toString() {
		return "OsbideOperation [requestName=" + requestName + ", requestParameterNames="
				+ requestParameterNames + "]";
	}
	
	
}
