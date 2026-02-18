package MavenPracticeProject.MavenProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddButtonTest extends LaunchAndQuit{
	
	@Test
	public void testAddbutton() throws IOException {
		Homepage h1 = new Homepage(driver);
		h1.clickonaddAndRemoveElement();
		
		
		add_remove_elementsPage a1= new add_remove_elementsPage(driver);
		a1.clickonAddElement();
		
		Assert.assertTrue(driver.findElement(By.xpath("//button[@class =\"added-manually\"]")).isDisplayed());
	}
	
	@Test(dependsOnMethods = "testAddbutton")
	public void testDeleteButton() {
		Homepage h1 = new Homepage(driver);
		h1.clickonaddAndRemoveElement();
		
		
		add_remove_elementsPage a1= new add_remove_elementsPage(driver);
		a1.clickonAddElement();
		a1.clickDeleteButton();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']/div/button")).isDisplayed());
	}

}
