package josbide.data.events;

public class EventLogData {
	private byte[] BinaryData;
	private EventLog Log;
	private int LogId = 0;
	
	/**
	 * @param binaryData
	 * @param log
	 */
	public EventLogData(byte[] binaryData, EventLog log) {
		this.BinaryData = binaryData;
		this.Log = log;
	}
	
	/**
	 * @return the binaryData
	 */
	public byte[] getBinaryData() {
		return BinaryData;
	}
	/**
	 * @param binaryData the binaryData to set
	 */
	public void setBinaryData(byte[] binaryData) {
		this.BinaryData = binaryData;
	}
	/**
	 * @return the log
	 */
	public EventLog getLog() {
		return Log;
	}
	/**
	 * @param log the log to set
	 */
	public void setLog(EventLog log) {
		this.Log = log;
	}

	/**
	 * @return the logId
	 */
	public int getLogId() {
		return LogId;
	}

	/**
	 * @param logId the logId to set
	 */
	public void setLogId(int logId) {
		LogId = logId;
	}
}
