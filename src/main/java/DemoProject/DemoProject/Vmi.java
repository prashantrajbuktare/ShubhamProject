package DemoProject.DemoProject;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vmi {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
		
		driver.get("https://www.imdb.com/");
		WebElement move=driver.findElement(By.id("suggestion-search"));
		move.click();
		move.sendKeys("Pushpa");
		
		Thread.sleep(2000);
		move.sendKeys(Keys.ARROW_DOWN);
		move.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
        WebElement Element = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[9]"));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        Thread.sleep(3000);

        TakesScreenshot scr = (TakesScreenshot) driver;
		File ScreenShot = scr.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\91880\\Desktop\\prashant\\DemoProject\\ScreenShot//prashant1.jpg");

		FileUtils.copyFile(ScreenShot, dest);

//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1500)");
		
		
		
		
		
		
	}

}
