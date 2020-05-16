package newStart;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		WebElement e1 = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
				
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(e1));
		
		Thread.sleep(3000);
		Actions ac =new Actions(driver);
		ac.moveToElement(e1).build().perform();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("(//li/a[text()='Samsung'])[1]")).click();
			Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[3]/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div[1]/a")).click();
        String win1 = driver.getWindowHandle();
        Set<String> win2=driver.getWindowHandles();

        for (String h : driver.getWindowHandles()) {

           driver.switchTo().window(h);}
       
		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("9953718297");
		driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/button/span")).click();
		driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input")).sendKeys("bangari@34");
		driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button/span")).click();

		//*[@id="container"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button/span		System.out.println("Hello");
	}

}
