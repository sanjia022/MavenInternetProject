package MavenPracticeProject.MavenProject;

import java.awt.AWTException;
import java.io.IOException;


import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import datafiles.RetryLogic;
@Listeners(datafiles.ListenerLogic.class)
public class FileUploadTest extends LaunchAndQuit{
	
	
	
	@Test(retryAnalyzer= RetryLogic.class)
	public void testFileUpload() throws IOException, AWTException {
		
	
		Homepage h1 = new Homepage(driver);
		h1.clickonfileuploadButton();
		
		FileUploaderPage a1= new FileUploaderPage(driver);
	    a1.uploadingTheFile();
	    a1.clickUploadButton();
	    
	    Assert.assertTrue(driver.findElement(By.id("uploaded-files")).isDisplayed());
		
	}}
