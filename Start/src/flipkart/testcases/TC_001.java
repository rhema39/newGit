package flipkart.testcases;

import java.io.IOException;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.javafx.collections.MappingChange.Map;

import common_utility.Common;
import common_utility.ListenerClass;
import excel_Utility.Read_Test_Data;
import flipkart.pages.CheckoutPage;
import flipkart.pages.HomePage;
import flipkart.pages.ProductListingPage;
import flipkart.pages.ProductPage;
//@Listeners(ListenerClass.class)
public class TC_001 extends BaseTestClass {

	@Test(dataProvider="searchCategory" )
	public void simpleTest(HashMap<Object,Object> datamap) throws InterruptedException, IOException
	{
		//Logger log = Logger.getLogger("devpinoyLogger");
		/*
		 * ExtentReports report = new
		 * ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		 * ExtentTest test = report.startTest("TC_001");
		 */
		 //test = report.startTest("TC_001");
	HomePage homepage = 
	PageFactory.initElements(driver, HomePage.class);

	       HashMap<Object,Object> testData = Read_Test_Data.getTestData("TC_001");
			homepage.close_popup(driver);
			//log.info("Through to the home page");
			
			homepage.select_category(driver,testData);
			//log.info("Through to the home page");
			ProductListingPage productListingPage = PageFactory.initElements(driver, ProductListingPage.class);
			productListingPage.select_item(driver);
			//log.info("Through to the productListingPage page");

			ProductPage productPage  = PageFactory.initElements(driver, ProductPage.class);
			productPage.buyNow(driver);
			//log.info("Through to the productPage page");

			CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
			checkoutPage.enterDetails(driver);
			//log.info("Through to the checkoutPage page");

	}
	@DataProvider(name="searchCategory")
	public static Object[][] searchcategoryDataProvider() throws IOException{
	
		Object[][] Obj;
		Obj= new Object[1][1];
		HashMap<Object,Object> datamap= new HashMap<Object,Object>();
		datamap = Read_Test_Data.getTestData("TC_001");
		
		Obj[0][0]=datamap;
		return Obj;
	
		 };
		
	
	
}
