package MavenPracticeProject.MavenProject;

import java.io.IOException;


import org.testng.annotations.Test;

public class StatusCode200Test extends LaunchAndQuit{

			@Test(retryAnalyzer = datafiles.RetryLogic.class)
			public void testStatusCode() throws IOException {
				Homepage h1 = new Homepage(driver);
				h1.clickonStatusCodeLink();;
				
				StatusCodePage c1 = new StatusCodePage(driver);
			c1.getLinksNumbers();
			
			
}
}