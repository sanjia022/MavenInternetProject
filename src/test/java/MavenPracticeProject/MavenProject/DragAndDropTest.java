package MavenPracticeProject.MavenProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(datafiles.ListenerLogic.class)

public class DragAndDropTest extends LaunchAndQuit{

	@Test
	public void testContextMenu() {
		Homepage h1 = new Homepage(driver);
		h1.clickonDragAndDropLink();
		
		DragAndDropPage c1 = new DragAndDropPage(driver);
		c1.dragingColAtoColB(driver);
		
		Assert.assertTrue(driver.findElement(By.id("column-b")).isDisplayed());
		
	}
	}