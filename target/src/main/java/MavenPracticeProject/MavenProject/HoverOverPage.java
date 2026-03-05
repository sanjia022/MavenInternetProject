package MavenPracticeProject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverOverPage {
	
	@FindBy(xpath="(//div[@class='figure'])[1]")
	WebElement firstImage;
	
	@FindBy(linkText="View profile")
	WebElement viewProfileLink;
	
	public void hoveroverfirstImage(WebDriver driver) {
		Actions a1 = new Actions(driver);
		a1.moveToElement(firstImage).perform();
	}
	
	
	public HoverOverPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
