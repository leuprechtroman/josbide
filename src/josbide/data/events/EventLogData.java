package josbide.data.events;

public class EventLogData {
	private byte[] binaryData;
	private EventLog log;
	
	/**
	 * @param binaryData
	 * @param log
	 */
	public EventLogData(byte[] binaryData, EventLog log) {
		this.binaryData = binaryData;
		this.log = log;
	}
	
	/**
	 * @return the binaryData
	 */
	public byte[] getBinaryData() {
		return binaryData;
	}
	/**
	 * @param binaryData the binaryData to set
	 */
	public void setBinaryData(byte[] binaryData) {
		this.binaryData = binaryData;
	}
	/**
	 * @return the log
	 */
	public EventLog getLog() {
		return log;
	}
	/**
	 * @param log the log to set
	 */
	public void setLog(EventLog log) {
		this.log = log;
	}
}
