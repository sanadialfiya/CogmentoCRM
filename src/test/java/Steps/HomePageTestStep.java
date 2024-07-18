package Steps;

import PageLayer.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageTestStep {
	private static HomePage page;

	@Given("when user is on home page and verify home page title")
	public void when_user_is_on_home_page_and_verify_home_page_title() {
		page = new HomePage();
		page.checkHomePageTitle("Cogmento CRM");

	}

	@Then("user validate the Home page logo")
	public void user_validate_the_Home_page_logo() {
		page.validateHomePageLogo();
	}

	@Then("user validate home page url")
	public void user_validate_home_page_url() {
		page.ValidateHomePageUrl();

	}

}
