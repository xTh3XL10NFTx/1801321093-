package uni.pl.fmi.model;

import uni.pl.fmi.services.BookingService;

public class BookingScreenModel {

	public String usrname;
	private String cardID;
	private String expiryDate;
	private String movieName;
	private String movieDate;
	private String theatreName;
	private String seatNum;
    private String message;

	public static void navigateToMe() {
		System.out.println("Отворена е страницата за вход в системата!");	
	}
	
	private void setUsеrname(String usrname) {
		this.usrname=usrname;
	}
	
	private void setCardNumber(String cardID) {
		this.cardID=cardID;
	}
	
	private void setExpire(String expiryDate) {
		this.expiryDate=expiryDate;
	}

	private void setTitle(String movieName) {
		this.movieName=movieName;
	}
	
	private void setDate(String movieDate) {
		this.movieDate=movieDate;
	}
	
	private void theatreName(String theatreName) {
		this.theatreName=theatreName;
	}
	
	private void setSeat(String seatNum) {
		this.seatNum=seatNum;
	}
	
	private void clickBookButton() {
		message = BookingService.reservation(usrname, cardID, expiryDate, movieName, movieDate, theatreName, seatNum);
	}
	
	private String getLoginMessage() {
		return message;
	}
}



