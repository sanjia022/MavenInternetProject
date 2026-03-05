package MavenPracticeProject.MavenProject;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(datafiles.ListenerLogic.class)

public class GeoLocationTest extends LaunchAndQuit {

	@Test(retryAnalyzer= datafiles.RetryLogic.class, groups={"regression"})
	
	public void testGeolocation() throws AWTException {
		Homepage h1 = new Homepage(driver);
		h1.clickOngeolocationLink();
		
		GeoLocationPage j1 = new GeoLocationPage(driver);
		j1.getGeolocation();
		
		Assert.assertTrue(j1.googleLink.isDisplayed());
	}

}
