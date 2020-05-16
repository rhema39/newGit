package flipkart.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common_utility.Common;

public class ProductPage {
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")
	WebElement buy_now_btn;
	
	public void buyNow(WebDriver driver){
		String win1 = driver.getWindowHandle();
        Set<String> win2=driver.getWindowHandles();

        for (String h : driver.getWindowHandles()) {

           driver.switchTo().window(h);}
		
        Common.customClick(buy_now_btn, driver);
	}
}
