package common_utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import flipkart.testcases.BaseTestClass;

public class ListenerClass extends BaseTestClass implements ITestListener {
	private static ExtentReports extent ;
	ExtentTest test;
	@Override
	public void onFinish(ITestContext Result) {
		// TODO Auto-generated method stub
		System.out.println("onFinish :"+ Result.getName());
		extent.flush();
	}

	@Override
	public void onStart(ITestContext Result) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure :"+ Result.getName());
		test.log(LogStatus.FAIL, "Test Passed");
		
		TakesScreenshot sc =((TakesScreenshot)driver);
		File fl =sc.getScreenshotAs(OutputType.FILE);
		File fl2=new File("./Lib/screen.png");
			try {
				FileUtils.copyFile(fl,fl2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void onTestSkipped(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult Result) {
		// TODO Auto-generated method stub

		extent = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		test = extent.startTest(Result.getTestName());
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess :"+ Result.getName());
	test.log(LogStatus.PASS, "Test Passed");
	}

}
