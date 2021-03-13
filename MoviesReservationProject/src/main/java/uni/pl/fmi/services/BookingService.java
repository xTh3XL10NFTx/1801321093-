package uni.pl.fmi.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import uni.pu.fmi.Reservation;

public class BookingService{
	

	public static String reservation(String usrName, String cardID, String expiryDate, String movieName, String movieDate, String theatreName, String seatNum) throws Exception {

		if (usrName.isEmpty()) {
			return "Моля, въведете потребителско име!" ;
		}
		if (cardID.isEmpty()) {
			return "Моля, въведете номер на картата!" ;
		}
		if (expiryDate.isEmpty()) {
			return "Моля, въведете краен срок на картата!" ;
		}
		if (movieName.isEmpty()) {
			return "Няма филм с такова име!" ;
		}
		if (movieDate.isEmpty()) {
			return "Няма филм по това време! Моля, въведете времето на филма, който искате да гледате" ;
		}
		if (theatreName.isEmpty()) {
			return "Моля, въведете място на прожекцията!" ;
		}
		if (seatNum.isEmpty() || Integer.parseInt(cardID) < 1) {
			return "Резервацията е неуспешна" ;
		}		
		
			String bookingtime = "09:00";
			Date d1=new SimpleDateFormat("hh:mm").parse(bookingtime);

		    Date d2=new SimpleDateFormat("hh:mm").parse(movieDate);
			
			long timeDiff = d2.getTime() - d1.getTime();
			long timeLeft=(timeDiff / 3600000);
			if (timeLeft <= 1) {
				return "Филмът започва след по-малко от час! Не може да направите резервация при по-малко от час преди започването на филма!";
			}
		
		final List<Reservation> reservations = getReservations();
		final boolean isSeatMatch = reservations.stream().anyMatch(reservation -> 
											reservation.getSeatNum().equals(seatNum));
		return isSeatMatch? "Мястото е запазено! Моля, изберете друго!" : "Резервацията е успешна";
		
	}

	private static List<Reservation> getReservations() {
		final Reservation reservation = new Reservation();
		reservation.setSeatNum("2");
		final List<Reservation> result = new ArrayList<>();
		result.add(reservation);
		return result;
	}


	}
