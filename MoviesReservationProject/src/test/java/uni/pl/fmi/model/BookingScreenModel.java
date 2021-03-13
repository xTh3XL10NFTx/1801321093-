package uni.pl.fmi.model;

import uni.pl.fmi.services.BookingService;

public class BookingScreenModel {

	public String usrname;
	public String cardID;
	public String expiryDate;
	private String movieName;
	private String movieDate;
	private String theatreName;
	public String seatNum;
    private String message;

	public void navigateToMe() {
		System.out.println("Отворена е страницата за вход в системата!");	
	}
	
	public void setUsеrname(String usrname) {
		this.usrname=usrname;
	}
	
	public void setCardNumber(String cardID) {
		this.cardID=cardID;
	}
	
	public void setExpire(String expiryDate) {
		this.expiryDate=expiryDate;
	}

	public void setTitle(String movieName) {
		this.movieName=movieName;
	}
	
	public void setDate(String movieDate) {
		this.movieDate=movieDate;
	}
	
	public void setPlace(String theatreName) {
		this.theatreName=theatreName;
	}
	
	public void setSeat(String seatNum) {
		this.seatNum=seatNum;
	}
	
	public void clickBookButton() throws Exception {
		message = BookingService.reservation(usrname, cardID, expiryDate, movieName, movieDate, theatreName, seatNum);
	}
	
	public String getLoginMessage() {
		return message;
	}
}



