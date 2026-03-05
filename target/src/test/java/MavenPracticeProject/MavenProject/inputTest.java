package MavenPracticeProject.MavenProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class inputTest extends LaunchAndQuit{

	@Test
	public void testInput() {
		Homepage h1 = new Homepage(driver);
		h1.clickOninputLink();;
		
		InputPage c1 = new InputPage(driver);
		c1.inputField();
		
	
		
		Assert.assertTrue(c1.inputField.isDisplayed());
}
}
