package MavenPracticeProject.MavenProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeoLocationPage {

	
	@FindBy(xpath="//button[. ='Where am I?']")
	WebElement whereButton;
	
	@FindBy(linkText = "See it on Google")
	WebElement googleLink;
	
	public void getGeolocation() throws AWTException {
		whereButton.click();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
	}
	public GeoLocationPage(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
}
