package edu.neu.csye6200;

public class Hall {
	private int HallId;
	private int TheaterId;
	private int capacity;
	public Hall() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hall(int hallId, int theaterId, int capacity) {
		super();
		HallId = hallId;
		TheaterId = theaterId;
		this.capacity = capacity;
	}
	public Hall(String csvdata) {
		super();
		String[] fields = csvdata.split("/");
		int hallId = new Integer(fields[0]);
		int theaterId = new Integer(fields[1]);
		int capacity = new Integer(fields[2]);
		HallId = hallId;
		TheaterId = theaterId;
		this.capacity = capacity;
	}
	public int getHallId() {
		return HallId;
	}
	public void setHallId(int hallId) {
		HallId = hallId;
	}
	public int getTheaterId() {
		return TheaterId;
	}
	public void setTheaterId(int theaterId) {
		TheaterId = theaterId;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "\tHall [HallId=" + HallId + ", TheaterId=" + TheaterId + ", capacity=" + capacity + "]";
	}
	
}
