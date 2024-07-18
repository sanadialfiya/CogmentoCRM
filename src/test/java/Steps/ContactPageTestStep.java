package Steps;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageTestStep extends BaseClass
	
{
	protected static ContactPage contactPage;
	
	@When("user click on contact link and click on create button")
	public void user_click_on_contact_link_and_click_on_create_button() {
	     contactPage = new ContactPage();
	     contactPage.clickOnContactAndCreate();
	}

	@Then("user enter firstname and lastname")
	public void user_enter_firstname_and_lastname() {
		contactPage.enterFirstnameAndLastname("Supriya", "Pandit");
	}

	@Then("click on save button")
	public void click_on_save_button() {
		contactPage.clickOnSave();
	   	}


}
