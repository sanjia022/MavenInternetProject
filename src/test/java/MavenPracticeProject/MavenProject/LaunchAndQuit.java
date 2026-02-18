package MavenPracticeProject.MavenProject;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;

import com.beust.jcommander.Parameter;

import datafiles.ListenerLogic;
@Listeners(datafiles.ListenerLogic.class)

public class LaunchAndQuit extends ListenerLogic{
	

	@BeforeMethod
	@Parameter(names ="browser")
	public void launch(@Optional("chrome")String browser) {
		
		
		if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
	  if(browser.equalsIgnoreCase("edge")) {
		  driver = new EdgeDriver();
	  } 
	  
	  driver.get("https://the-internet.herokuapp.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public  void quit() {
		driver.quit();
	}

	}


