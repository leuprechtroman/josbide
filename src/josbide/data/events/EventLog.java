package josbide.data.events;

import java.util.Date;
import java.util.List;

import josbide.data.user.OsbideUser;

public class EventLog {
	
	private String AssemblyVersion;
	private List<LogCommentEvent> comments;
	private EventLogData data;
	private Date DataRecievedTimestamp;
	private int id;
	private String logType;
	private OsbideUser sender;
	private List<EventLogSuscription> suscriptions;
	/**
	 * @return the assemblyVersion
	 */
	public String getAssemblyVersion() {
		return AssemblyVersion;
	}
	/**
	 * @param assemblyVersion the assemblyVersion to set
	 */
	public void setAssemblyVersion(String assemblyVersion) {
		AssemblyVersion = assemblyVersion;
	}
	/**
	 * @return the comments
	 */
	public List<LogCommentEvent> getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<LogCommentEvent> comments) {
		this.comments = comments;
	}
	/**
	 * @return the data
	 */
	public EventLogData getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(EventLogData data) {
		this.data = data;
	}
	/**
	 * @return the dataRecievedTimestamp
	 */
	public Date getDataRecievedTimestamp() {
		return DataRecievedTimestamp;
	}
	/**
	 * @param dataRecievedTimestamp the dataRecievedTimestamp to set
	 */
	public void setDataRecievedTimestamp(Date dataRecievedTimestamp) {
		DataRecievedTimestamp = dataRecievedTimestamp;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the logType
	 */
	public String getLogType() {
		return logType;
	}
	/**
	 * @param logType the logType to set
	 */
	public void setLogType(String logType) {
		this.logType = logType;
	}
	/**
	 * @return the sender
	 */
	public OsbideUser getSender() {
		return sender;
	}
	/**
	 * @param sender the sender to set
	 */
	public void setSender(OsbideUser sender) {
		this.sender = sender;
	}
	/**
	 * @return the suscriptions
	 */
	public List<EventLogSuscription> getSuscriptions() {
		return suscriptions;
	}
	/**
	 * @param suscriptions the suscriptions to set
	 */
	public void setSuscriptions(List<EventLogSuscription> suscriptions) {
		this.suscriptions = suscriptions;
	}
}
