package edu.neu.csye6200;

public class Arrangement {

	private int arrangementid;
	private int hallid;
	private int movieid;
	private myDate starttime;
	private myDate endtime;

	public Arrangement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Arrangement(int arrangementid, int hallid, int movieid, myDate starttime, myDate endtime) {
		super();
		this.arrangementid = arrangementid;
		this.hallid = hallid;
		this.movieid = movieid;
		this.starttime = starttime;
		this.endtime = endtime;
	}

	public Arrangement(String datacsv) {
		super();
		String[] fields = datacsv.split("/");
		int arrangementid = new Integer(fields[0]);
		int hallid = new Integer(fields[1]);
		int movieid = new Integer(fields[2]);
		String startdate = fields[3];
		String enddate = fields[4];
		this.arrangementid = arrangementid;
		this.hallid = hallid;
		this.movieid = movieid;
		this.starttime = new myDate(startdate);
		this.endtime = new myDate(enddate);

	}

	public int getArrangementid() {
		return arrangementid;
	}

	public void setArrangementid(int arrangementid) {
		this.arrangementid = arrangementid;
	}

	public int getHallid() {
		return hallid;
	}

	public void setHallid(int hallid) {
		this.hallid = hallid;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public myDate getStarttime() {
		return starttime;
	}

	public void setStarttime(myDate starttime) {
		this.starttime = starttime;
	}

	public myDate getEndtime() {
		return endtime;
	}

	public void setEndtime(myDate endtime) {
		this.endtime = endtime;
	}

	@Override
	public String toString() {
		return "Arrangement [arrangementid=" + arrangementid + ", hallid=" + hallid + ", movieid=" + movieid
				+ ", starttime=" + starttime + ", endtime=" + endtime + "]";
	}

}
