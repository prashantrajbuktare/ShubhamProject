package com.imdbdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestPage {
	
	
	WebDriver driver;
	
	public TestPage(WebDriver,rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver,this);
	}
	

}
