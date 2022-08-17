package com.WikiData;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pageClass {

	WebDriver driver;
	
	public pageClass(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements( rdriver,this);
	
	}
	
	
	@ FindBy(name="search")
	
	 WebElement textforInput;
	@FindBy(id="searchButton")
	
	WebElement clickButton;
	
	
	
	public void intputText(String name)
	{
		textforInput.sendKeys(name);
		
	}
	
	public void clickbutton()
	{
		clickButton.click();
	}
	
}	
	
	

