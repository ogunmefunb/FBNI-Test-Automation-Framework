package FBNIGroup.Base;


import java.time.Duration;

import gherkin.ast.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import QuotationTransactionPage.QuotationTransactionSpecification;



public class AbstractPageMethods {

	
	protected static WebDriver driver;
	protected  WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TezzaSolutions\\Desktop\\Prime\\Selenium\\Extracted\\chromedriver_win32\\chromedriver.exe");
		if (driver == null) {
			driver =  new ChromeDriver();
		}
		return driver;
	}

	//Dependency Injection for Products type
//	protected static QuotationTransactionSpecification productUnderTest;
//	protected QuotationTransactionSpecification getProductUnderTest() {
//
//		if (productUnderTest == null) {
//			productUnderTest = new QuotationTransactionSpecification();
//		}
//		return productUnderTest;
//
//	}

}
