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
	
	@FindBy(linkText ="Dropdown" )
	WebElement DropdownLink;
	
	
	@FindBy(linkText ="Entry Ad" )
	WebElement EntryAdLink;
	
	@FindBy(linkText ="Exit Intent" )
	WebElement ExitIntentLink;
	
	@FindBy(linkText ="File Upload" )
	WebElement fileUploadLink;
	
	@FindBy(linkText="Form Authentication")
	WebElement formAuthenticationLink;
	
	@FindBy(linkText = "Geolocation")
	WebElement  geolocationLink;
	
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
	
	public void clickondropdownLink() {
		DropdownLink.click();
	}
	
	public void clickOnEntryAddLink() {
		EntryAdLink.click();
	}
	
	public void clickOnExitIndent() {
		ExitIntentLink.click();
	}
	
	public void clickonfileuploadButton() {
		fileUploadLink.click();
	}
	
	
	public void clickonAuthenticationLink() {
		formAuthenticationLink.click();
	}
	
	public void clickOngeolocationLink() {
		geolocationLink.click();
	}
public Homepage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
}
	

}
