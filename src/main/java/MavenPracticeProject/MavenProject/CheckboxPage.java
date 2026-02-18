package MavenPracticeProject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage {
	@FindBy(xpath ="(//input[@type='checkbox'])[1]" )
	WebElement firstcheckboxElement;
	
	@FindBy(xpath ="(//input[@type='checkbox'])[2]" )
	WebElement secondchecboxLink;
	
	
	public void clickonFirstCHeckboxElement() {
		if(firstcheckboxElement.isDisplayed() && firstcheckboxElement.isEnabled()) {
			firstcheckboxElement.click();
		}
	}
	
	public void clickonSecondCheckboxElement() {
		if(secondchecboxLink.isSelected()) {
			secondchecboxLink.click();	
		}
		
	}
	
	
public CheckboxPage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
}

}
