package MavenPracticeProject.MavenProject;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends LaunchAndQuit{

	@Test
	public void testDropdown() {
		Homepage h1 = new Homepage(driver);
		h1.clickondropdownLink();;
		
		DropdownPage c1 = new DropdownPage(driver);
		c1.dropDown(driver);
		
	
		
		Assert.assertTrue(driver.findElement(By.id("dropdown")).isDisplayed());
}
}