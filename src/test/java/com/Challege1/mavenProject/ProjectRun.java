package com.Challege1.mavenProject;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import pages.BaseLandingPage;

public class ProjectRun extends HelperClass {
	
	BaseLandingPage blpObj;
	
	@Test (priority = 1)
	public void load() {
		
		blpObj = PageFactory.initElements(driver, BaseLandingPage.class);
		blpObj.loadPage("http://192.168.0.1");
	}

}
