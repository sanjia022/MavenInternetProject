package MavenPracticeProject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
	
	@FindBy(id ="dropdown" )
	WebElement dropdownmenu;
	
	
	public void dropDown(WebDriver driver) {
		Select s1 = new Select(dropdownmenu);
	s1.selectByValue("1");
	
	}
	
	
	
public DropdownPage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
}

}
