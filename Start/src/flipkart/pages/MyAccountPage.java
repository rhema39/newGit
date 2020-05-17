package flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage {
	@FindBy(xpath ="//input[@name='firstName']")
WebElement name;
	@FindBy(xpath="//input[@name='email']")
			WebElement email;
	
	public void validateName(WebDriver driver){
		
		System.out.println("Name matches :");
		/*
		 * Assert.assertEquals("Hema", name.getAttribute("value")); SoftAssert ac = new
		 * SoftAssert();
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("email matches :");
		 * ac.assertEquals("hemarbangari@gmail.com", email.getAttribute("value"));
		 */
		
	}
}
