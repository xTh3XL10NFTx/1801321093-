package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.model.BookingScreenModel;

public class BookingSteps {
	static BookingScreenModel BookingScreenModel= new BookingScreenModel(); 
	
	@Given("Потребитеял отваря екрана за резервация$")
	public void openLoginScreen() throws Throwable {
		BookingScreenModel.navigateToMe();
	}
	
	@When("^Потребителя въведе потребителско име \"([^\"]*)\"$")
	public void addUsеrName(String usrname) throws Throwable {
		BookingScreenModel.setUsеrname(usrname);
	}

	@When("^Въведе номер на картата \"([^\"]*)\"$")
	public void addCardNumber(String cardID) throws Throwable {
		BookingScreenModel.setCardNumber(cardID);
	}

	@When("^Въведе дата на изтичане на картата \"([^\"]*)\"$")
	public void addExpire(String expiryDate) throws Throwable {
		BookingScreenModel.setExpire(expiryDate);
	}
	
	@When("^Въведе име на прожекцията \"([^\"]*)\"$")
	public void addTitle(String movieName) throws Throwable {
		BookingScreenModel.setTitle(movieName);
	}
	
	@When("^Въведе време на прожекцията \"([^\"]*)\"$")
	public void addDate(String movieDate) throws Throwable {
		BookingScreenModel.setDate(movieDate);
	}
	
	@When("^Въведе място на прожекцията \"([^\"]*)\"$")
	public void addPlace(String theatreName) throws Throwable {
		BookingScreenModel.setPlace(theatreName);
	}
	
	@When("^Въведе номер на място в залата на прожекцията \"([^\"]*)\"$")
	public void addSeat(String seatNum) throws Throwable {
		BookingScreenModel.setSeat(seatNum);
	}

	@When("^Натисне върху бутона за резервиране$")
	public static void clickBookButton() throws Throwable {
		BookingScreenModel.clickBookButton();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void checkLoginMessage(String expectedMessage) throws Throwable {
		final String resultMessage = BookingScreenModel.getLoginMessage();
		assertEquals(expectedMessage, resultMessage);
	}

}
