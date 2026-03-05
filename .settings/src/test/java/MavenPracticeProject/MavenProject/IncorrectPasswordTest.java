package MavenPracticeProject.MavenProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(datafiles.ListenerLogic.class)

public class IncorrectPasswordTest extends LaunchAndQuit {

	@Test(retryAnalyzer = datafiles.RetryLogic.class)
	public void testAuthentication() throws EncryptedDocumentException, IOException {
		Homepage h1 = new Homepage(driver);
		h1.clickonAuthenticationLink();
		
		LoginPage l1 = new LoginPage(driver);
		l1.getUserName2();
		l1.getPassword2();

		l1.clickonLoginButton();
		
		

		Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
} 

}
