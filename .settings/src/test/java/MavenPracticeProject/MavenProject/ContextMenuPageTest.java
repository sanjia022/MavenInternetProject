package MavenPracticeProject.MavenProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(datafiles.ListenerLogic.class)

public class ContextMenuPageTest extends LaunchAndQuit{

	@Test
	public void testContextMenu() {
		Homepage h1 = new Homepage(driver);
		h1.clickonContextMenuLink();
		
		ContextMenuPage c1 = new ContextMenuPage(driver);
		c1.clickonContextMenu(driver);
		
		Assert.assertTrue(driver.findElement(By.id("hot-spot")).isDisplayed());
		
	}
}
