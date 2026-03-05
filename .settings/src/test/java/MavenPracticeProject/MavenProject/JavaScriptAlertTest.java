package MavenPracticeProject.MavenProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlertTest  extends LaunchAndQuit{

	@Test
	public void testJavaScript() {
		Homepage h1 = new Homepage(driver);
		h1.clickonJavaScriptAlertsLink();;
		
		javaScriptExecutorPage c1 = new javaScriptExecutorPage(driver);
		c1.clickonSecondJSpritELement(driver);
		
		Assert.assertTrue(driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).isDisplayed());
		
	} 
	}

