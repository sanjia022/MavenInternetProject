package MavenPracticeProject.MavenProject;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressTest extends LaunchAndQuit{

	@Test
	public void testKeyPress() {
		Homepage h1 = new Homepage(driver);
		h1.clickonKeyPressLink();;
		
		KeyPressPage c1 = new KeyPressPage(driver);
		c1.enterA(driver);
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOfAllElements(c1.textMessage));

		Assert.assertEquals(c1.textMessage.getText(), "You entered: A");
		c1.clickonKeyPressField(driver);;
		
		
	
		
		//Assert.assertEquals(c1.keyPressField.getText(), "You entered: A");

	}}
