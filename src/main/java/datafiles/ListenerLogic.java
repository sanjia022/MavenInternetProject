package datafiles;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerLogic implements ITestListener {

	protected static WebDriver driver; 

	@Override
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		Reporter.log("the test is passed");
		
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\r88st\\Desktop\\MavenInternetProject\\passed\\passedTestCase" + Math.random() + ".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		ITestListener.super.onTestFailure(result);
		
		Reporter.log("The test is failed");
	
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\r88st\\Desktop\\MavenInternetProject\\Failed\\failedtestcase" + Math.random() + ".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	
	
	

}
