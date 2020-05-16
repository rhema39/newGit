package testNextGen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String s ="Hema is good at java";
String[]a=s.split("\\s");
String rev = "";
for(String d: a){
	StringBuilder b = new StringBuilder(d);
	b.reverse();
	rev+=b.toString();
	
}
System.out.println(rev);*/
		/*WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		driver= new ChromeDriver();
				// driver= UiDriver.getUiDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		Select sl = new Select(driver.findElement(By.xpath("//select[@id='first']")));
		List<String> st = new ArrayList<String>();
		for(WebElement w :sl.getOptions()){
			st.add(w.getText());
		}
		List<String> tempList= st;
		Collections.sort(tempList);
		System.out.println(tempList);*/
		
		/*String s= "sonu";
		s= 5 +s;
		System.out.println(s);
		s=s+5 ;
		System.out.println(s);*/
		
		String s= "my name is hema";
		//String[] a= s.split("//s");
		String b= "";
		StringBuilder d= new StringBuilder(s);
			d.reverse();
			System.out.println(d);
		}

}
