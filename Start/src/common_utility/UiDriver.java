package common_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiDriver extends ChromeDriver {
	static WebDriver driver;
	private UiDriver(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		driver= new ChromeDriver();
	}
	
	public static UiDriver getUiDriver(){
		UiDriver uiDriver =new UiDriver();
		
		return uiDriver;
		
	}

}
