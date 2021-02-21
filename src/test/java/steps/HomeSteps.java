package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomeSteps {

    @Given("^I am navigated to Expedia$")
    public void navigateToExpedia(){
        System.out.println("Navigate to Expedia");
    }
    @When("I choose Hotel Booking Tab")
    public void iChooseHotelBookingTab(){
        System.out.println("I choose Hotel Booking Tab");
    }

    @And("I provide Hotel Booking Information")
    public void iProvideHotelBookingInformation() {
        System.out.println("I provide Hotel Booking Information");
    }
}
