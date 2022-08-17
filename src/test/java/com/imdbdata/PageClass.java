package com.imdbdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass {

	WebDriver driver;
	
	public PageClass(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements( driver,this);
	
	}
	
	
	@FindBy(id="suggestion-search")
	
	WebElement SearchFiled;
	
	
	public void SetSearchtext(String name)
	{
		SearchFiled.sendKeys(name);
	}
	
	

}
