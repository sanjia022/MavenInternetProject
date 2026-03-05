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
	
	@FindBy(linkText = "Horizontal Slider")
	WebElement  horizontalSliderLink;
	
	@FindBy(linkText = "Hovers")
	WebElement  HoversLink;
	
	@FindBy(linkText = "Inputs")
	WebElement  inputLink;
	
	@FindBy(linkText = "JavaScript Alerts")
	WebElement  JavaScriptAlertsLink;

	
	@FindBy(linkText = "Key Presses")
	WebElement  keyPressesLink;
	
	@FindBy(linkText = "Status Codes")
	WebElement  statusCodeLink;
	
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
	public void clickOnhorizontalSliderLink() {
		horizontalSliderLink.click();
	}
	public void clickOnHoverOverLink() {
		HoversLink.click();
	}
	
	
	public void clickOninputLink() {
		inputLink.click();
	}
	
	public void clickonJavaScriptAlertsLink() {
		JavaScriptAlertsLink.click();
	}
	
	public void clickonKeyPressLink() {
		keyPressesLink.click();
	}
	
	public void clickonStatusCodeLink() {
		statusCodeLink.click();
	}
public Homepage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
}
	

}
