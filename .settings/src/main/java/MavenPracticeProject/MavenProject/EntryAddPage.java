package MavenPracticeProject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntryAddPage {
	
	@FindBy(xpath ="//div[@class='modal-body']" )
	WebElement modelPAgeElement;
	
	
	public String getText() {
		
		String text = modelPAgeElement.getText();
		return text;
	}

public EntryAddPage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
}

}
