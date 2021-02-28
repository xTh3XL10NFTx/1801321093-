package uni.pl.fmi.services;

import java.util.ArrayList;
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
		if (Integer.parseInt(cardID) < 1) {
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
		if (seatNum == null) {
			return "Изберете си място по време на прожекцията!";
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
