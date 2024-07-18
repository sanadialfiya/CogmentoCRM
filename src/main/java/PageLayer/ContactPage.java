package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import Utility.Wait;

public class ContactPage extends BaseClass
{
	
	@FindBy(xpath="//a[@href='/contacts']")
	private WebElement contactLink;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement createButton;
	
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(name="last_name")
	private WebElement lastName;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveButton;
	
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnContactAndCreate()
	{
		Wait.click(contactLink);
		Wait.click(createButton);
	}
	
	public void enterFirstnameAndLastname(String fname,String lname)
	{
		Wait.sendKeys(firstName, fname);
		Wait.sendKeys(lastName, lname);
	}
	
	public void clickOnSave()
	{
		Wait.click(saveButton);
	}
}



