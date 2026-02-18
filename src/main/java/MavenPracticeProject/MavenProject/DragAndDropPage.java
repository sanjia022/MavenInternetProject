package MavenPracticeProject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {
	@FindBy(id ="column-a" )
	WebElement columnA;
	
	@FindBy(id ="column-b" )
	WebElement columnB;
	
	public void dragingColAtoColB(WebDriver driver) {
		Actions a1 = new Actions(driver);
	a1.dragAndDrop(columnA, columnB).perform();
	
	}
	
	
	
public DragAndDropPage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
}
}
