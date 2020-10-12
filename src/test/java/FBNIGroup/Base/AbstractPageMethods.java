package FBNIGroup.Base;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class AbstractPageMethods {
	
	

	
	
	
	protected static WebDriver driver;
	protected  WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TezzaSolutions\\Desktop\\Prime\\Selenium\\Extracted\\chromedriver_win32\\chromedriver.exe");

		if (driver == null) {
			driver =  new ChromeDriver();
		}
		return driver;
	}


	
}
