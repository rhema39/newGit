package flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_utility.Common;

public class ProductListingPage {
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[3]/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div[1]/a")
	WebElement select_item;
	public void select_item(WebDriver driver){
		
		//select_item.isDisplayed();
		 Common.customClick(select_item, driver);
	}
}
