package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import Utility.Wait;

public class CompanyPage extends BaseClass{

//    When user click on companies link and click on create button
//    And user enter company name and click on save
//    Then user click on delete button and click on confirm delete
	
	@FindBy(xpath="//a[@href='/companies']")
	private WebElement companyLink;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement companyCreateButton;
	
	@FindBy(xpath="//label[text()='Name']/parent::div/descendant::input")
	private WebElement companyName;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath="//i[@class='trash icon']")
	private WebElement deleteButton;
	
	@FindBy(xpath="//button[@class='ui red button']")
	private WebElement confirmButton;
	
	public CompanyPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCompaniesAndCreate()
	{
		Wait.click(companyLink);
		Wait.click(companyCreateButton);
	}
	
	public void enterCompanynameAndSave(String company)
	{
		Wait.sendKeys(companyName, company);
		Wait.click(saveButton);
	}
	
	public void clickOnDeleteAndConfirmDelete()
	{
		Wait.click(deleteButton);
		Wait.click(confirmButton);
	}
}
