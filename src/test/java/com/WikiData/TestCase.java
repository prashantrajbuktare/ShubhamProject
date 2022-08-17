package com.WikiData;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestCase extends BaseClass{

	

	
	
	@Test
	public void pageTest()
	{
		driver.get(baseURL);

		pageClass lp = new pageClass(driver);

		lp.intputText(moviename);

		lp.clickbutton();

	}
	}
