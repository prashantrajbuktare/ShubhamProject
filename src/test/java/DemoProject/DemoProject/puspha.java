package DemoProject.DemoProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class puspha {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://en.wikipedia.org/");
		WebElement keys=driver.findElement(By.cssSelector(".vector-search-box-input"));
		keys.sendKeys("Pushpa: The Rise");
		driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();

		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		
	}


}
