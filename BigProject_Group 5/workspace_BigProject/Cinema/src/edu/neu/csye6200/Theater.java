package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Theater {
	private int TheaterId;
	private String TheaterName;
	private String TheaterLocation;
	private String TheaterDescription;
	private List<Hall> Halls;
	public Theater() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Theater(int theaterId, String theaterName, String theaterLocation, String theaterDescription) {
		super();
		TheaterId = theaterId;
		TheaterName = theaterName;
		TheaterLocation = theaterLocation;
		TheaterDescription = theaterDescription;
		Halls = new ArrayList<>();
	}
	public Theater(String csvdata) {
		super();
		String[] fields = csvdata.split("/");
		int theaterId = new Integer(fields[0]);
		String theaterName = fields[1];
		String theaterLocation = fields[2];
		String theaterDescription = fields[3];
		TheaterId = theaterId;
		TheaterName = theaterName;
		TheaterLocation = theaterLocation;
		TheaterDescription = theaterDescription;
		Halls = new ArrayList<>();
	}
	public int getTheaterId() {
		return TheaterId;
	}
	public void setTheaterId(int theaterId) {
		TheaterId = theaterId;
	}
	public String getTheaterName() {
		return TheaterName;
	}
	public void setTheaterName(String theaterName) {
		TheaterName = theaterName;
	}
	public String getTheaterLocation() {
		return TheaterLocation;
	}
	public void setTheaterLocation(String theaterLocation) {
		TheaterLocation = theaterLocation;
	}
	public String getTheaterDescription() {
		return TheaterDescription;
	}
	public void setTheaterDescription(String theaterDescription) {
		TheaterDescription = theaterDescription;
	}
	public List<Hall> getHalls() {
		return Halls;
	}
	public void addHall(Hall hall) {
		this.Halls.add(hall);
	}
	public void showHalls() {
		for(Hall hall : this.Halls) {
			System.out.println(hall);
		}
	}
	@Override
	public String toString() {
		return "Theater [#" + TheaterId + "  " + TheaterName + "  " + TheaterLocation + "  " + TheaterDescription + "]";
	}
}
