package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import Utility.Wait;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//div[@class='header item']")
	private WebElement logo;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean checkHomePageTitle(String Title) {
		String actualTitle = driver.getTitle();
		if (actualTitle.equalsIgnoreCase(Title)) {
			return true;
		} else {
			return false;
		}
	}

	public String ValidateHomePageUrl() {
		return driver.getCurrentUrl();

	}

	public boolean validateHomePageLogo() {
		return Wait.isDisplay(logo);

	}
}
