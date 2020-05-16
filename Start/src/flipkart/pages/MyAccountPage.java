package flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class MyAccountPage {
	@FindBy(xpath ="//input[@name='firstName']")
WebElement name;
	@FindBy(xpath="//input[@name='email']")
			WebElement email;
	
	public void validateName(WebDriver driver){
		
		System.out.println("Name matches :");
	 Assert.assertEquals("Hema", name.getAttribute("value"));
	 SoftAssert ac = new SoftAssert();
		
	
	 
	 
		System.out.println("email matches :");
	 ac.assertEquals("hemarbangari@gmail.com", email.getAttribute("value"));
		
	}
}
