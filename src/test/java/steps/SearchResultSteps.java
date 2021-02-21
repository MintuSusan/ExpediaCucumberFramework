package steps;

import cucumber.api.java.en.Then;

public class SearchResultSteps {

        @Then("^I should be able to view list of Hotel Search result")
        public void navigateToExpedia(){
            System.out.println("Navigate to Expedia");
        }

}
