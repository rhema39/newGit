package flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	@FindBy( xpath ="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement email_no;
	@FindBy( xpath ="//input[@type='password']")
	WebElement password;
	@FindBy( xpath ="//div[text()='My Profile']")
	WebElement myProfile;
	@FindBy( xpath ="(//button[@type='submit'])[2]")
	WebElement login;


	public void login(){
		email_no.click();
		email_no.sendKeys("9953718297");
		password.click();
		password.sendKeys("bangari@34");
		login.click();
	}
	public void navigatetoMyAccount(WebDriver driver) throws InterruptedException{
		
	
		WebDriverWait wait  = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Hema']")));
		Actions ac =new Actions(driver);
	
		WebElement hema =driver.findElement(By.xpath("//div[text()='Hema']"));
		ac.moveToElement(hema).perform();
		Thread.sleep(2000);
		myProfile.click();
		
	}
}
