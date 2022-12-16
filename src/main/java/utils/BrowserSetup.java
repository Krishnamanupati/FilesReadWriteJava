package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {
	
	public static WebDriver driver;

	public static WebDriver browserSetup(String browserName) {
		
		if(browserName.contains("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			System.out.println("Chrome browser initiated");
			
		}
		else if (browserName.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println("Firefox browser initiated");
			
		}
		else {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			System.out.println("Chrome browser initiated");
		}
		return driver;
	}

}
