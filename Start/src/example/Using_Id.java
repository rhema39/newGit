package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Using_Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.navigate().to("https://www.thetestingworld.com/index.php?option=com_users&view=login&Itemid=587");
		//1 Using Id
		/*WebElement username= driver.findElement(By.id("username"));
		username.click();
		username.sendKeys("hemar");*/
		
		// 3 Using relative xpath
		/*WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
		username.click();
		username.sendKeys("hemar");*/
		// 2 absolute xpath
		driver.navigate().to("https://www.facebook.com/");
		/*WebElement username =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input"));
		username.click();
		username.sendKeys("rhema39@yahoo.com");*/
		// text & following
		/*WebElement username =driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following::input"));
		username.click();
		username.sendKeys("rhema39@yahoo.com");*/
		//normalize-space
		/*WebElement username =driver.findElement(By.xpath("//*[normalize-space(@name)='email']"));
		username.click();
		username.sendKeys("rhema39@yahoo.com");*/
		//contains
		/*WebElement username =driver.findElement(By.xpath("//*[contains(@data-testid,'royal_email')]"));
		username.click();
		username.sendKeys("rhema39@yahoo.com");*/
		//descendant
		/*WebElement username =driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/descendant::input[@name='firstname']"));
		username.click();
		username.sendKeys("rhema39@yahoo.com");*/
		// following-sibling
		Select username =new Select(driver.findElement(By.xpath("//select[@aria-label='Month']/following-sibling::select")));
		
		username.selectByValue("1997");
		// preceding-sibling
        /*Select username =new Select(driver.findElement(By.xpath("//select[@aria-label='Month']/preceding-sibling::select")));
		
		username.selectByValue("25");*/
		
		
	}

}
