package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Order {
	public static List<Arrangement> ifhasthismovieinthistheater(Movie movie, Theater theater) {
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) + 1;
		int d = cal.get(Calendar.DATE);
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		myDate currenttime = new myDate(y, m, d, h, mi, s);
		System.out.println(y + "-" + m + "-" + d + " " + h + ":" + mi + ":" + s);
		List<Arrangement> result = new ArrayList<>();
		for (Hall hall : theater.getHalls()) {
			for (Arrangement arrangement : Operation.operation.getArrangements()) {
				if (hall.getHallId() == arrangement.getHallid() && movie.getMovieId() == arrangement.getMovieid()) {
					if (currenttime.compareTo(arrangement.getStarttime()) < 0) {
						result.add(arrangement);
					}
				}
			}
		}
		return result;
	}

	public static boolean InsertOrderRecord(int userid, int arrangementid, int ticketnum) {
		if (DatabaseFactory.databasefactory.getobject().InsertOrderRecord(userid, arrangementid, ticketnum))
			return true;
		else
			return false;
	}

	public static boolean RefundTicket(int recordid) {
		if (DatabaseFactory.databasefactory.getobject().UpdateRecordState(recordid)) {
			for (TicketRecord ticketrecord : Operation.operation.getTicketrecords()) {
				if (ticketrecord.getRecordId() == recordid) {
					ticketrecord.setRecordState(1);
					break;
				}
			}
			return true;
		} else
			return false;
	}

	public static void UpdateUserRecord() {
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) + 1;
		int d = cal.get(Calendar.DATE);
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		myDate currenttime = new myDate(y, m, d, h, mi, s);
		for (TicketRecord ticketrecord : Operation.operation.getTicketrecords()) {
			for (Arrangement arrangement : Operation.operation.getArrangements()) {
				if (arrangement.getArrangementid() == ticketrecord.getArrangementId()) {
					if (arrangement.getStarttime().compareTo(currenttime) < 0 && ticketrecord.getRecordState() == 0) {
						if (DatabaseFactory.databasefactory.getobject().UpdateUserRecord(ticketrecord.getRecordId())) {
							ticketrecord.setRecordState(2);
						}
					}
				}
			}
		}
	}

	public static boolean ifArrangementisFull(Arrangement arrangement) {
		Boolean result = false;
		int hallcapacity = DatabaseFactory.databasefactory.getobject().GetHallCapacity(arrangement.getHallid());
		int arrangementnumofpeople = DatabaseFactory.databasefactory.getobject()
				.GetArrangementNumofPeople(arrangement.getArrangementid());
		if (arrangementnumofpeople >= hallcapacity)
			result = true;
		return result;
	}

	public static boolean ifArrangementisEnough(int arrangementid, int ticketnum) {
		Arrangement arrangement = null;
		for (Arrangement thisarrangement : Operation.operation.getArrangements()) {
			if (thisarrangement.getArrangementid() == arrangementid)
				arrangement = thisarrangement;
		}
		Boolean result = true;
		int hallcapacity = DatabaseFactory.databasefactory.getobject().GetHallCapacity(arrangement.getHallid());
		int arrangementnumofpeople = DatabaseFactory.databasefactory.getobject()
				.GetArrangementNumofPeople(arrangement.getArrangementid());
		if (arrangementnumofpeople + ticketnum > hallcapacity)
			result = false;
		return result;
	}
}
