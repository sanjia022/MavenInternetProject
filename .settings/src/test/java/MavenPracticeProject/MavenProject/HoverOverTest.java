package MavenPracticeProject.MavenProject;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(datafiles.ListenerLogic.class)


public class HoverOverTest extends LaunchAndQuit{

	@Test(retryAnalyzer = datafiles.RetryLogic.class)
	public void testHoverover()  {
		
		Homepage h1 = new Homepage(driver);
		h1.clickOnHoverOverLink();;
		
		HoverOverPage c1 = new HoverOverPage(driver);
		
		c1.hoveroverfirstImage(driver);
		
	
		
		Assert.assertTrue(c1.viewProfileLink.isDisplayed());
}
}
