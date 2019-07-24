package aNUDEEPcUCUMBER.aNUDEEPcUCUMBER;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo12345a {
	@Given("Application url is working")
	public void application_url_is_working() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("This is wok");
	}

	@When("user enter a username")
	public void user_enter_a_username() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("This is username");
	}

	@When("user enters password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("This is password");
	}

	@Then("he clicks on submit button")
	public void he_clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("This is submit");
	}

	@Then("verifies the login process")
	public void verifies_the_login_process() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("This is login");
	}

	@Then("He chose to close the app")
	public void he_chose_to_close_the_app() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("This is close");
	}
}
