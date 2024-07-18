package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTestStep extends BaseClass {
	private static LoginPage login;

	@Given("when user is on login page")
	public void when_user_is_on_login_page() {
		BaseClass.initialization();

	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		String uname = prop.getProperty("USERNAME");
		String pass = prop.getProperty("PASSWORD");
		login = new LoginPage();
		login.enterValidUsernameAndPassword(uname, pass);

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		login.clickOnLoginButton();
	}

}
