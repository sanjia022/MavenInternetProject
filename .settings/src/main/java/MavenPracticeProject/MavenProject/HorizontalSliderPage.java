package MavenPracticeProject.MavenProject;

import java.awt.AWTException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HorizontalSliderPage {
	
	@FindBy(xpath ="//input[@type='range']" )
	WebElement slider;
	
	@FindBy(xpath = "//span[@id='range']")
	WebElement rangeValue;
	
	
	public void clickonSliderandMoveItUsingArrow() throws AWTException {
		if(slider.isDisplayed() && slider.isEnabled()) {
			slider.click();
			/*
			 * Robot r1 = new Robot(); r1.keyPress(KeyEvent.VK_RIGHT);
			 * r1.keyRelease(KeyEvent.VK_RIGHT); r1.keyPress(KeyEvent.VK_KP_RIGHT);
			 * r1.keyRelease(KeyEvent.VK_RIGHT);
			 * I was getting java.lang.IllegalArgumentException: Invalid key code, is being triggered by the Java Robot class.

               The Robot class is very picky; if you pass it an integer or a constant that doesn't map exactly to a physical key code (like KeyEvent.VK_RIGHT), it throws this exception.
			 */
			// Below is the safer option to do this
			slider.sendKeys(Keys.RIGHT);
		}
	}
	
	public void clickonSliderAndMoveItUsingMouse(WebDriver driver) {
		slider.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy("+300+",0)");
		
	}
	
	
public HorizontalSliderPage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
}

}
