package MavenPracticeProject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputPage {
	@FindBy(xpath= "//input[@type = 'number']")
	WebElement inputField ;
	

	
	public void inputField() {
		inputField.sendKeys("6");
		
		
	}
	
	
	
	public InputPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
