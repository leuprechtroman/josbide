package josbide.wcf.soap.operations;

import java.util.ArrayList;
import java.util.List;

import josbide.wcf.soap.SoapParameter;

public abstract class OsbideOperation {

	//Prefix for all actions(DO NOT CHANGE OR OVERWRITE)
	public final String OSBIDE_ACTION_URN_PREFIX = "urn:OsbideWebService/";

	protected String requestName = null;
	protected String[] requestParameterNames = null;
	protected List<SoapParameter> requestParameters = null;
	protected String responseName = null;
	protected String[] responseParameterNames = null;

	/**
	 * Contructor to generate subclasses easy
	 * 
	 */
	public OsbideOperation() throws IllegalStateException {
		//Init all values;
		initializeOperation();
		//Init the array
		this.requestParameters = new ArrayList<SoapParameter>();
		//Now test if the parameters are all set, if not abort!
		if (requestName == null || requestParameterNames == null || requestParameters == null
				|| responseName == null || responseParameterNames == null)
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
	public void setRequestParameter(SoapParameter newParam) {
		for (String paramName : requestParameterNames) {
			if (newParam.getName().equals(paramName)) {
				if (!requestParameters.contains(newParam))
					requestParameters.add(newParam);
			}
		}
	}

	/**
	 * Checks if there are as many parameters set as parameter names exist.
	 * 
	 * @throws IllegalStateException
	 */

	public void checkRequestParameters() throws IllegalStateException {
		if (this.requestParameterNames.length != this.requestParameters.size())
			throw new IllegalStateException(
					"Operation has too few request parameter objects. Required: "
							+ this.requestParameterNames.length + ", present: "
							+ this.requestParameters.size());
	}

	/**
	 * Recieve all the request parameters set
	 * 
	 * @return All request parameters
	 */
	public List<SoapParameter> getRequestParameters() {
		return this.requestParameters;
	}

	/**
	 * Check if this request does return something.
	 * 
	 * @return If this request returns something
	 */

	public abstract boolean doesReturnSomething();

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

	/**
	 * @return the resName
	 */
	public String getResponseName() {
		return responseName;
	}

	/**
	 * @return the resParameters
	 */
	public String[] getResponseParameterNames() {
		return responseParameterNames;
	}

	@Override
	public String toString() {
		return "OsbideOperation [requestName=" + requestName + ", requestParameterNames="
				+ requestParameterNames + ", responseName=" + responseName
				+ ", responseParameterNames=" + responseParameterNames + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof OsbideOperation)) {
			return false;
		}
		OsbideOperation other = (OsbideOperation) obj;
		if (requestName == null) {
			if (other.requestName != null) {
				return false;
			}
		} else if (!requestName.equals(other.requestName)) {
			return false;
		}
		if (requestParameterNames == null) {
			if (other.requestParameterNames != null) {
				return false;
			}
		} else if (!requestParameterNames.equals(other.requestParameterNames)) {
			return false;
		}
		if (requestParameters == null) {
			if (other.requestParameters != null) {
				return false;
			}
		} else if (!requestParameters.equals(other.requestParameters)) {
			return false;
		}
		if (responseName == null) {
			if (other.responseName != null) {
				return false;
			}
		} else if (!responseName.equals(other.responseName)) {
			return false;
		}
		if (responseParameterNames == null) {
			if (other.responseParameterNames != null) {
				return false;
			}
		} else if (!responseParameterNames.equals(other.responseParameterNames)) {
			return false;
		}
		return true;
	}

}
