package edu.neu.csye6200;

public class TicketRecord {
	private int RecordId;
	private int UserId;
	private int ArrangementId;
	private int TicketNum;
	private int RecordState;
	public TicketRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketRecord(int recordId, int userId, int arrangementId, int ticketNum, int recordState) {
		super();
		RecordId = recordId;
		UserId = userId;
		ArrangementId = arrangementId;
		TicketNum = ticketNum;
		RecordState = recordState;
	}
	public TicketRecord(String csvdata) {
		super();
		String[] fields = csvdata.split("/");
		int recordId = new Integer(fields[0]);
		int userId = new Integer(fields[1]);
		int arrangementId = new Integer(fields[2]);
		int ticketNum = new Integer(fields[3]);
		int recordState = new Integer(fields[4]);
		RecordId = recordId;
		UserId = userId;
		ArrangementId = arrangementId;
		TicketNum = ticketNum;
		RecordState = recordState;
	}
	public int getRecordId() {
		return RecordId;
	}
	public void setRecordId(int recordId) {
		RecordId = recordId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public int getArrangementId() {
		return ArrangementId;
	}
	public void setArrangementId(int arrangementId) {
		ArrangementId = arrangementId;
	}
	public int getTicketNum() {
		return TicketNum;
	}
	public void setTicketNum(int ticketNum) {
		TicketNum = ticketNum;
	}
	public int getRecordState() {
		return RecordState;
	}
	public void setRecordState(int recordState) {
		RecordState = recordState;
	}
	@Override
	public String toString() {
		return "TicketRecord [RecordId=" + RecordId + ", UserId=" + UserId + ", ArrangementId=" + ArrangementId
				+ ", TicketNum=" + TicketNum + ", RecordState=" + RecordState + "]";
	}
	
}