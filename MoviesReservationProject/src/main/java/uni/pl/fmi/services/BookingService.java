package uni.pl.fmi.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import uni.pu.fmi.Movie;
import uni.pu.fmi.Reservation;
import uni.pu.fmi.User;

public class BookingService{
	

	public static String reservation(String usrName, String cardID, String expiryDate, String movieName, String movieDate, String theatreName, String seatNum) {

		if (usrName == null) {
			return "Грешно потребителско име!";
		}
		if (cardID == null || Integer.parseInt(cardID) < 1) {
			return "Номерът на картата не съществува!";
		}
		if (expiryDate == null) {
			return "Въведете краем срок на годност на картата!";
		}
		if (movieName == null) {
			return "Филмът не съществува!";
		}
		if (movieDate == null) {
			return "Изберете подходящо за Вас време от изброените!";
		}
		if (theatreName == null) {
			return "Изберете подходящо за Вас място от изброените!";
		}
		if (seatNum == null || Integer.parseInt(cardID) < 1) {
			return "Изберете си място по време на прожекцията!";
		}
		
//			String timeLimit = "01:00";
			String currentTime = "09:00";
			SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
			Date d1 = null;
			try {
				d1 = formatter.parse(movieDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date d2 = null;
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
		
		final List<User> users = getUsers();
		final boolean isUserMatch = users.stream().anyMatch(user -> 
											user.getUsrName().equals(usrName));
		return isUserMatch? "Вече има резервация на името на този потребител!" : "Успешно направихте резервация за прожекцията!";
	}

	public static List<User> getUsers() {
		final User user = new User();
		user.setUsrName("Ivan");
		final List<User> result = new ArrayList<>();
		result.add(user);
		return result;
	}

}
