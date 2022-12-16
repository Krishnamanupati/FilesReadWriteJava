package com.Challege1.mavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import utils.BrowserSetup;

public class HelperClass {

	public static WebDriver driver;
	
	BrowserSetup bsObj;
	
	public HelperClass() {
		
	}
	
	@BeforeMethod
	public void loadBrowser() {
		driver = BrowserSetup.browserSetup("chrome");
	}
	
	
}
