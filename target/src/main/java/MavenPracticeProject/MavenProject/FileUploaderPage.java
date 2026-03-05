package MavenPracticeProject.MavenProject;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploaderPage {
	@FindBy(id ="file-upload" )
	WebElement fileUploaderLink;
	
	@FindBy(id ="file-submit" )
	WebElement filesubmitButton;
	
	@FindBy(id ="uploaded-files" )
	WebElement uploadedFilesText;
	
	public void uploadingTheFile() {
		// Gets the path to the current user's home (e.g., C:\Users\Username)
		String userHome = System.getProperty("user.home");

		// Construct the path to the Downloads folder
		String downloadPath = userHome + File.separator + "Downloads";

		// Specify your file name
		String fileName = "image0.jpeg";
		String fullPath = downloadPath + File.separator + fileName;

		System.out.println("The file location is: " + fullPath);
		fileUploaderLink.sendKeys(fullPath);
		//fileUploaderLink.sendKeys("C:\\Users\\r88st\\Downloads\\image0");

	}
	
	public void clickUploadButton(){
		filesubmitButton.click();
	}
   
	public String fileupdatedtext(){
		return uploadedFilesText.getText();
	}
	
public FileUploaderPage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
}

}
