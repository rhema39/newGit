package common_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.istack.internal.logging.Logger;

public class Common {
	
	public static void waitForElementToVisible(WebElement element1, WebDriver driver){
	WebDriverWait wait  = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(element1));
	}
	
	public static void customClick(WebElement element2, WebDriver driver){
		
		waitForElementToVisible(element2, driver);
		element2.click();
		
	}
		
}
