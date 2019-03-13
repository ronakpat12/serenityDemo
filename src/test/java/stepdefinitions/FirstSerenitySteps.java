package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstSerenitySteps {

    @Given("^User is on Home Page$")
    public void user_is_on_home_page() {
        System.out.println("User is on home page");
    }

    @When("^User Navigate to LogIn Page$")
    public void user_navigate_to_login_page() {
        System.out.println("User navigates to login page");
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_login_successfully() {
        System.out.println("Message for login successfully");
    }

    @And("^User enters UserName and Password$")
    public void user_enters_username_and_password() {
        System.out.println("User enters username and password");
    }

}
