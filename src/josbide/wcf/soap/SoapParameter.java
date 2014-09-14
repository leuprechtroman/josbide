package josbide.wcf.soap;

public class SoapParameter {

	private final String name;
	private final String value;

	/**
	 * A Soap Parameter. Attention: Name is case sensitive!
	 * 
	 * @param name
	 *            Name of the Parameter
	 * @param value
	 *            Value of the Parameter
	 */
	public SoapParameter(String name, String value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * Tests the parameter
	 */

	public void test() throws IllegalStateException {
		if (this.name == null || this.value == null || this.name == "" || this.value == "")
			throw new IllegalStateException(this.getClass().getName()
					+ ": Not all fields were initialized");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "SoapParameter [name=" + name + ", value=" + value + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SoapParameter)) {
			return false;
		}
		SoapParameter other = (SoapParameter) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (value == null) {
			if (other.value != null) {
				return false;
			}
		} else if (!value.equals(other.value)) {
			return false;
		}
		return true;
	}

}
