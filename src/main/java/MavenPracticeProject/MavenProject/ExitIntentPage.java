package MavenPracticeProject.MavenProject;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExitIntentPage {
	
	@FindBy(xpath ="//div[@class='modal-body']" )
	WebElement modelPAgeElement;
	
	public void movetheMouse() throws AWTException {
		Robot r1 = new Robot();
		r1.mouseMove(0, 0);
	}
	public String getText() {
		
		String text = modelPAgeElement.getText();
		return text;
	}

public ExitIntentPage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
}

}
