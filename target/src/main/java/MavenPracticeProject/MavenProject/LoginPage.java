package MavenPracticeProject.MavenProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import datafiles.DDTfile;

public class LoginPage {
    DDTfile f1= new DDTfile();

	
	@FindBy(name = "username")
	WebElement usernameField;
	
	@FindBy(name = "password")
	WebElement passwordField;
	
	@FindBy(className = "radius")
	WebElement loginButton;
	
	public void getUserName() throws EncryptedDocumentException, IOException {
		String username =f1.getvaluefromexcel("login", 0, 0);
		usernameField.sendKeys(username);
	}
	
	public void getPassword() throws EncryptedDocumentException, IOException {
		String password =f1.getvaluefromexcel("login", 0, 1);
		passwordField.sendKeys(password);
	}
	
	public void getUserName2() throws EncryptedDocumentException, IOException {
		String username =f1.getvaluefromexcel("login", 1, 0);
		usernameField.sendKeys(username);
	}
	
	public void getPassword2() throws EncryptedDocumentException, IOException {
		String password =f1.getNumericValuefromexcel("login", 1, 1);
		passwordField.sendKeys(password);
	}
	
	public void clickonLoginButton() {
		loginButton.click();
	}
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
