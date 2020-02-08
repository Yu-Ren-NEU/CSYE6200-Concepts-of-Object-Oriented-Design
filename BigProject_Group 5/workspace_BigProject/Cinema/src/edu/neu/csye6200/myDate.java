package edu.neu.csye6200;

public class myDate implements Comparable<myDate> {
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int second;

	public myDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public myDate(int year, int month, int day, int hour, int minute, int second) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public myDate(String datacsv) {
		super();
//		System.out.println(datacsv);
		String[] fields = datacsv.split(" ");
		String[] date = fields[0].split("-");
		String[] time = fields[1].split(":");
		int year = new Integer(date[0]);
		int month = new Integer(date[1]);
		int day = new Integer(date[2]);
		int hour = new Integer(time[0]);
		int minute = new Integer(time[1]);
		int second = new Integer(time[2]);
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	@Override
	public int compareTo(myDate o) {
		// TODO Auto-generated method stub
		if (this.year > o.year)
			return 1;
		else if (this.year < o.year)
			return -1;
		else {
			if (this.month > o.month)
				return 1;
			else if (this.month < o.month)
				return -1;
			else {
				if (this.day > o.day)
					return 1;
				else if (this.day < o.day)
					return -1;
				else{
					if (this.hour > o.hour)
						return 1;
					else if (this.hour < o.hour)
						return -1;
					else{
						if (this.minute > o.minute)
							return 1;
						else if (this.minute < o.minute)
							return -1;
						else{
							if (this.second > o.second)
								return 1;
							else if (this.second < o.second)
								return -1;
							else return 0;
						}
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		return year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second;
	}

}
