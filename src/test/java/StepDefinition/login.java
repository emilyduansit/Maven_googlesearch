package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class login {

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    System.out.println("user_is_on_the_login_page");
	}

	@When("user enter correct credential")
	public void user_enter_correct_credential() {
		 System.out.println("user_is_on_the_login_page");
	}

	@And("click login button")
	public void click_login_button() {
		 System.out.println("user_is_on_the_login_page");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		 System.out.println("user_is_on_the_login_page");
	}

}
