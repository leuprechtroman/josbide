package josbide.data.events;

import java.util.Date;
import java.util.List;

import josbide.data.user.OsbideUser;

public class EventLog {
	
	private String AssemblyVersion;
	private List<LogCommentEvent> Comments;
	private EventLogData Data;
	private Date DataRecievedTimestamp;
	private int Id;
	private String LogType;
	private OsbideUser Sender;
	private List<EventLogSuscription> Suscriptions;
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
		return Comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<LogCommentEvent> comments) {
		this.Comments = comments;
	}
	/**
	 * @return the data
	 */
	public EventLogData getData() {
		return Data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(EventLogData data) {
		this.Data = data;
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
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.Id = id;
	}
	/**
	 * @return the logType
	 */
	public String getLogType() {
		return LogType;
	}
	/**
	 * @param logType the logType to set
	 */
	public void setLogType(String logType) {
		this.LogType = logType;
	}
	/**
	 * @return the sender
	 */
	public OsbideUser getSender() {
		return Sender;
	}
	/**
	 * @param sender the sender to set
	 */
	public void setSender(OsbideUser sender) {
		this.Sender = sender;
	}
	/**
	 * @return the suscriptions
	 */
	public List<EventLogSuscription> getSuscriptions() {
		return Suscriptions;
	}
	/**
	 * @param suscriptions the suscriptions to set
	 */
	public void setSuscriptions(List<EventLogSuscription> suscriptions) {
		this.Suscriptions = suscriptions;
	}
}
