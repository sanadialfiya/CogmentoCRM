package Steps;

import BaseLayer.BaseClass;
import PageLayer.CompanyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompanyPageStep extends BaseClass
{
	protected static CompanyPage companyPage;
	
	@When("user click on companies link and click on create button")
	public void user_click_on_companies_link_and_click_on_create_button() {
	    companyPage = new CompanyPage();
	    companyPage.clickOnCompaniesAndCreate();
	}

	@When("user enter company name and click on save")
	public void user_enter_company_name_and_click_on_save() {
	   companyPage.enterCompanynameAndSave("MasterCard");
	}

	@Then("user click on delete button and click on confirm delete")
	public void user_click_on_delete_button_and_click_on_confirm_delete() {
	companyPage.clickOnDeleteAndConfirmDelete();
	}


}
