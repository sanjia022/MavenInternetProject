package MavenPracticeProject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage {
	@FindBy(id ="hot-spot" )
	WebElement ContextMenu;
	
	public void clickonContextMenu(WebDriver driver) {
		Actions a1 = new Actions(driver);
		a1.contextClick(ContextMenu).perform();
		
		
		driver.switchTo().alert().accept();
	
	}
	
	
	
public ContextMenuPage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
}

}
