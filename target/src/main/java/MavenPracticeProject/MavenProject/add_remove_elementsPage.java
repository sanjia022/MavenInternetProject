package MavenPracticeProject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class add_remove_elementsPage {
	
	@FindBy(xpath="//div[@id='content']/div/button")
	WebElement addButton;
	
	@FindBy(xpath= "//button[@class =\"added-manually\"]")
	WebElement deleteButton;
	
	public void clickonAddElement() {
		addButton.click();
	}
	
	public void clickDeleteButton() {
		deleteButton.click();	
	}
	public add_remove_elementsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
