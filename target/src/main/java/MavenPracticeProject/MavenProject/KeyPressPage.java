package MavenPracticeProject.MavenProject;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KeyPressPage {
	
	@FindBy(id ="target" )
	WebElement keyPressField;
	
	@FindBy(xpath ="//p[@id = 'result']" )
	WebElement textMessage;
	
	public void clickonKeyPressField(WebDriver driver)  {
		
		keyPressField.click();
		keyPressField.sendKeys(Keys.ENTER);
		
	}
	
	
public void enterA (WebDriver driver)  {
		
		keyPressField.click();
		keyPressField.sendKeys("a");
		
	}

      public KeyPressPage(WebDriver driver ) {
	       PageFactory.initElements(driver, this);
}
}


