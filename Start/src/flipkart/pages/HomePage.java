package flipkart.pages;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_utility.Common;

public class HomePage {
	
@FindBy(xpath="/html/body/div[2]/div/div/button")
WebElement close_btn;

String maincategory= "//span[text()='$1$']";


String Sub_Category = "(//li/a[text()='$1$'])[1]";


public void close_popup(WebDriver driver){
	Common.customClick(close_btn, driver);
	System.out.println("popu up closed");
}
public void select_category(WebDriver driver, HashMap<Object,Object> testData) throws InterruptedException{
	Thread.sleep(3000);
	Actions ac =new Actions(driver);
	maincategory= maincategory.replace("$1$", (CharSequence) testData.get("Category"));
	 WebElement web=driver.findElement(By.xpath(maincategory));
	/*WebDriverWait wait  = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(web));*/
	//electronics.isDisplayed();
	 Common.customClick(web, driver);

	ac.moveToElement(web).build().perform();
	Sub_Category= Sub_Category.replace("$1$",(CharSequence) testData.get("Sub_Category"));
	System.out.print(Sub_Category);
	WebElement we=driver.findElement(By.xpath(Sub_Category));
	Common.customClick(we, driver);
}
}
