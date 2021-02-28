package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.model.BookingScreenModel;

public class BookingSteps {
	BookingScreenModel bookScreen= new BookingScreenModel(); 
	
	@Given("Потребитеял отваря екрана за резервация$")
	public void openLoginScreen() throws Throwable {
		BookingScreenModel.navigateToMe();
	}
	
	@When("^Потребителя въведе потребителско име \"([^\"]*)\"$")
	public void addUsеrName(String usrname) throws Throwable {
		BookingSteps.setUsеrname(usrname);
	}

	@When("^Въведе номер на картата \"([^\"]*)\"$")
	public void addCardNumber(String cardID) throws Throwable {
		BookingSteps.setCardNumber(cardID);
	}

	@When("^Въведе дата на изтичане на картата \"([^\"]*)\"$")
	public void addExpire(String expiryDate) throws Throwable {
		BookingSteps.setExpire(expiryDate);
	}
	
	@When("^Въведе име на прожекцията \"([^\"]*)\"$")
	public void addTitle(String movieName) throws Throwable {
		BookingSteps.setTitle(movieName);
	}
	
	@When("^Въведе време на прожекцията \"([^\"]*)\"$")
	public void addDate(String movieDate) throws Throwable {
		BookingSteps.setDate(movieDate);
	}
	
	@When("^Въведе място на прожекцията \"([^\"]*)\"$")
	public void addPlace(String theatreName) throws Throwable {
		BookingSteps.setPlace(theatreName);
	}
	
	@When("^Въведе номер на място в залата на прожекцията \"([^\"]*)\"$")
	public void addSeat(String seatNum) throws Throwable {
		BookingSteps.setSeat(seatNum);
	}

	@When("^Натисне върху бутона за резервиране$")
	public void clickBookButton() throws Throwable {
		BookingSteps.clickBookButton();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void checkLoginMessage() throws Throwable {
		final String resultMessage = BookingScreenModel.getLoginMessage();
		assertEquals("Done", resultMessage);
	}

}
