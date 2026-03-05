package MavenPracticeProject.MavenProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javaScriptExecutorPage {

	
	@FindBy(xpath ="//button[.='Click for JS Confirm']" )
	WebElement jsListofElements;
	
	public void clickonSecondJSpritELement(WebDriver driver)  {
		/*
		 * List<WebElement> li =
		 * driver.findElements(By.xpath("//div[@class ='example']/ul/li")); int count =
		 * li.size(); System.out.println("The count od links are " + count);
		 * 
		 * WebElement secondJSScript = li.get(count-2); secondJSScript.click();
		 */
		
		jsListofElements.click();
		
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.alertIsPresent());
		String text = driver.switchTo().alert().getText();
		System.out.println("The Alert text is " + text);
	driver.switchTo().alert().accept();
	}
	

public javaScriptExecutorPage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
}
}
