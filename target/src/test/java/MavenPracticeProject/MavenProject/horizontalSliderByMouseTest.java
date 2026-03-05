package MavenPracticeProject.MavenProject;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(datafiles.ListenerLogic.class)

public class horizontalSliderByMouseTest extends LaunchAndQuit{

	@Test(retryAnalyzer = datafiles.RetryLogic.class)
	public void testHorizontalSliderTest() throws AWTException {
		Homepage h1 = new Homepage(driver);
		h1.clickOnhorizontalSliderLink();;
		
		HorizontalSliderPage c1 = new HorizontalSliderPage(driver);
		
		c1.clickonSliderAndMoveItUsingMouse(driver);
		
	
		
		Assert.assertTrue(c1.rangeValue.isDisplayed());
}

	@Test(retryAnalyzer = datafiles.RetryLogic.class, groups = {"regression", "sanity"})
	
	public void testHorizontalSliderTestByKeyboard() throws AWTException {
		Homepage h1 = new Homepage(driver);
		h1.clickOnhorizontalSliderLink();;
		
		HorizontalSliderPage c1 = new HorizontalSliderPage(driver);
		c1.clickonSliderandMoveItUsingArrow();
				
	
		
		Assert.assertTrue(c1.rangeValue.isDisplayed());
}
}