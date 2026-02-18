package MavenPracticeProject.MavenProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(linkText ="Add/Remove Elements" )
	WebElement addAndRemoveElement;
	
	@FindBy(linkText ="Checkboxes" )
	WebElement checboxLink;
	
	@FindBy(linkText ="Context Menu" )
	WebElement ContextMenuLink;
	
	@FindBy(linkText ="Drag and Drop" )
	WebElement dragAndDropLink;
	
	public void clickonaddAndRemoveElement() {
		addAndRemoveElement.click();
	}
	
	public void clickonCheckboxElement() {
		checboxLink.click();
	}
	public void clickonContextMenuLink() {
		ContextMenuLink.click();
	}
	
	public void clickonDragAndDropLink() {
		dragAndDropLink.click();
	}
public Homepage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
}
	

}
