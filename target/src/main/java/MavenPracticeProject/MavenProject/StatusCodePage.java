package MavenPracticeProject.MavenProject;

import java.io.IOException;
import java.net.URL;

import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class StatusCodePage {
	
	@FindBy(linkText = "200")
	WebElement statusCode200;
	
	@FindBy(linkText = "300")
	WebElement statusCode300;
	
	@FindBy(linkText = "400")
	WebElement statusCode400;
	
	@FindBy(linkText = "500")
	WebElement statusCode500;
	
	@FindBy(tagName= "a")
	List<WebElement> listOfLinks;
	
	public void varifyLinks(String value) throws IOException {
		
		URL u1 = new URL (value);
		HttpsURLConnection h1 = (HttpsURLConnection) u1.openConnection();
		if(h1.getResponseCode()==200) {
		System.out.println(h1.getResponseMessage());
		}
		
		
	}
	
	public void getLinksNumbers() {
		int count = listOfLinks.size();
		System.out.println(count);
		
		for(int i =0 ; i<count; i++) {
			WebElement w1 = listOfLinks.get(i);
			String url = w1.getAttribute("href");
			System.out.println(url);
			
		}
		
		}
		
	
	
	public StatusCodePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
