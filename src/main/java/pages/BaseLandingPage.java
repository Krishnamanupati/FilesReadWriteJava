package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BaseLandingPage {

	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search for locality, landmark, project, or builder']") @CacheLookup 
		WebElement searchBar;
	
	public BaseLandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loadPage(String url) {
		driver.get(url);
		
	}
	
	
}
