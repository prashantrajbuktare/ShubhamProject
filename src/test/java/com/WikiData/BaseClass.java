package com.WikiData;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public String baseURL = "https://en.wikipedia.org/";
	public String baseURL2 = "";

	public String moviename = "Pushpa: The Rise";

	public static WebDriver driver;

	@BeforeClass
	public void setup() {
		
 WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@Test(priority=1)
	public void ScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");

	}

	@Test(priority=2)
	public void Takescreenshot() throws IOException {
		TakesScreenshot scr = (TakesScreenshot) driver;
		File ScreenShot = scr.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\91880\\Desktop\\prashant\\DemoProject\\ScreenShot//prashant.jpg");

		FileUtils.copyFile(ScreenShot, dest);

	}

//	@AfterClass
//	public void tearDown() {
//
//		driver.quit();
//	}

}
