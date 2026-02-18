package MavenPracticeProject.MavenProject;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(datafiles.ListenerLogic.class)
public class FirstcheckboxTest extends LaunchAndQuit{
	
	@Test()
	public  void testFirstCheckbox() {
		
		Homepage h1 = new Homepage(driver);
		h1.clickonCheckboxElement();
		
		CheckboxPage c1= new CheckboxPage(driver);
		c1.clickonFirstCHeckboxElement();
		
		Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed());
		
		
	}
	

	

}
