package MavenPracticeProject.MavenProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(datafiles.ListenerLogic.class)

public class FormAuthenticationTest extends LaunchAndQuit {

	@Test(retryAnalyzer = datafiles.RetryLogic.class)
	public void testAuthentication() throws EncryptedDocumentException, IOException {
		Homepage h1 = new Homepage(driver);
		h1.clickonAuthenticationLink();;
		LoginPage l1 = new LoginPage(driver);
		l1.getUserName();
		l1.getPassword();

		l1.clickonLoginButton();;

		Assert.assertTrue(driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).isDisplayed());
}
	}