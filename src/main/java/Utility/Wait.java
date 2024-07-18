package Utility;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass {
	protected static WebDriverWait wait;

	public static void click(WebElement wb) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(wb)).click();
		
	}

	public static void sendKeys(WebElement wb, String value) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb)).sendKeys(value);
	}

}
