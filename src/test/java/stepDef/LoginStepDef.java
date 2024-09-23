package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class LoginStepDef {

    @Given("the user is on the login page")
    public void userOnLoginPage() {
        // Code to navigate to login page
    }

    @When("the user enters valid credentials")
    public void userEntersValidCredentials() {
        // Code to enter credentials
    }

    @Then("the user should be redirected to the dashboard")
    public void userRedirectedToDashboard() {
        // Code to verify dashboard
    }
}

