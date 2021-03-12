package uni.pl.fmi.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import uni.pu.fmi.Reservation;
import uni.pu.fmi.User;

public class BookingService{
	

	@SuppressWarnings("deprecation")
	public static String reservation(String usrName, String cardID, String expiryDate, String movieName, String movieDate, String theatreName, String seatNum) {

		if (usrName.isEmpty()) {
			return "Резервацията е неуспешна" ;
		}
		if (cardID.isEmpty()) {
			return "Резервацията е неуспешна" ;
		}
		if (expiryDate.isEmpty()) {
			return "Резервацията е неуспешна" ;
		}
		if (movieName.isEmpty()) {
			return "Резервацията е неуспешна" ;
		}
		if (movieDate.isEmpty()) {
			return "Резервацията е неуспешна" ;
		}
		if (theatreName.isEmpty()) {
			return "Резервацията е неуспешна" ;
		}
		if (seatNum.isEmpty() || Integer.parseInt(cardID) < 1) {
			return "Резервацията е неуспешна" ;
		}
		
		
			String timeLimit = "01:00";
			String currentTime = "09:30";
			SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
			Date d1;
			d1 = new Date("hh:mm a");
			try {
				d1 = formatter.parse(timeLimit);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date d2;
			d2 = new Date("hh:mm a");
			try {
				d2 = formatter.parse(currentTime);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			long timeDiff = d1.getTime() - d2.getTime();
			String timeLeft=((timeDiff / 3600000) + " hour/s " + (timeDiff % 3600000) / 60000 + " minutes");
			if (Integer.parseInt(timeLeft) <= 1) {
				return "Съжеляваме, не се допъскат резервации при по-малко от час преди прожекцията!";
		}
		
		final List<Reservation> reservations = getReservations();
		final boolean isSeatMatch = reservations.stream().anyMatch(reservation -> 
											reservation.getSeatNum().equals(seatNum));
		return isSeatMatch? "Резервацията е неуспешна" : "Резервацията е успешна";
		
	}

	private static List<Reservation> getReservations() {
		final Reservation reservation = new Reservation();
		reservation.setSeatNum("2");
		final List<Reservation> result = new ArrayList<>();
		result.add(reservation);
		return result;
	}


	}
