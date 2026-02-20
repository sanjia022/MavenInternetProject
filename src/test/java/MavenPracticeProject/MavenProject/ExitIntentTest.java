package MavenPracticeProject.MavenProject;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(datafiles.ListenerLogic.class)
public class ExitIntentTest extends LaunchAndQuit{
	
	
		
		@Test
		public void testExitIntent() throws IOException, AWTException {
			
		
			Homepage h1 = new Homepage(driver);
			h1.clickOnExitIndent();
			
			ExitIntentPage a1= new ExitIntentPage(driver);
			a1.movetheMouse();
			WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(50));
			w1.until(ExpectedConditions.visibilityOf(a1.modelPAgeElement));
			
			a1.getText();
			

			Assert.assertEquals(driver.findElement(By.xpath("//div[@class='modal-body']")).getText(), "It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something).");

}
}