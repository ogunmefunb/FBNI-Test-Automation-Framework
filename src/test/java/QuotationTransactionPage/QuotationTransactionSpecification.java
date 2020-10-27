package QuotationTransactionPage;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import FBNIGroup.Base.AbstractPageMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Created by Ben
 */



public class QuotationTransactionSpecification extends AbstractPageMethods {

	WebDriver driver = getDriver();
//	QuotationTransactionSpecification productUnderTest = getProductUnderTest();
	Wait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	Actions actions = new Actions(driver);


	By productsLOV = By.id("lmsgroup:cb1");
	By productLovOkayButton = By.id("lmsgroup:cb2");
	By productTable = By.xpath("//*[@id=\"lmsgroup:t3::db\"]/table/tbody/tr/td[1]/span");
	By productTableFirstRow = By.xpath("//*[@id=\"lmsgroup:t3::db\"]/table/tbody/tr");
	By operationTypeDroDown = By.id("lmsgroup:OperationType::content");
	By effectiveDateDatePicker = By.id("lmsgroup:id1::content");
	By clientLOV = By.id("lmsgroup:cb9");
	By clientLovTable = By.xpath("//*[@id=\"lmsgroup:t4::db\"]/table/tbody/tr/td[1]/span");
	By clientLovOkayButton = By.id("lmsgroup:cb10");
	By accessGroupLOV = By.id("lmsgroup:cb12");
	By accessGroupLovTable = By.xpath("//*[@id=\"lmsgroup:t8::db\"]/table/tbody/tr/td[2]/span");
	By accessGroupLovOkayButton = By.id("lmsgroup:cb12ttttt");
	By umbrellaCoverCheckBox = By.id("lmsgroup:sbc1::content");
	By quotationNumberPopUpButton = By.id("lmsgroup:cb4");
	By quotationRevisionNoPopUpButton = By.id("lmsgroup:j_id__ctru119");
	By quotationNumberTable = By.xpath("//*[@id=\"lmsgroup:t1::db\"]/table/tbody/tr/td[1]");
	By quotationNumberOkButton = By.id("lmsgroup:cb5");
	By nextButton = By.id("lmsgroup:cb7");
	//	By nextButton = By.id("lmsgroup:cb7");
	//	By nextButton = By.id("lmsgroup:cb7");





	@When("^System displays Select A Quotation Transaction Screen$")
	public void system_displays_Select_A_Quotation_Transaction_Screen()  {
		//wait for the element to be available
		w.until(ExpectedConditions.visibilityOfElementLocated(productsLOV));
		Assert.assertTrue(driver.findElement(productsLOV).isDisplayed());
	}

	@Then("^User provides quotation details as specified below:$")
	public void user_provides_quotation_details_as_specified_below(DataTable arg5) throws Throwable {
		Map<String, String> pickup5 = arg5.asMap(String.class, String.class);
		//	Product Name
		String productUnderTest = pickup5.get("Product Name");
		driver.findElement(productsLOV).click();
		Thread.sleep(3000);
		List<WebElement> productTableElement = driver.findElements(productTable);
		
		//For Situations where the product to be tested is not visible to receive click
		//Cast Elements to ArrayList
		ArrayList<String> elementsOutOfVisibility = new ArrayList<> ();
		elementsOutOfVisibility.add("GROUP KEYMAN ASSURANCE");
		elementsOutOfVisibility.add("DOLLAR CREDIT CARD");
		elementsOutOfVisibility.add("FIRST FAMILY SHIELD");
		elementsOutOfVisibility.add("FIRST LIFE BENEFIT PLAN");
		elementsOutOfVisibility.add("FIRST LIFE PLUS BENEFIT PLAN");
		elementsOutOfVisibility.add("GROUP MORTGAGE PROTECTION");
		elementsOutOfVisibility.add("STAFF EASY SAVE");
		
		//Scroll Down to make element visible
			if (elementsOutOfVisibility.contains(pickup5.get("Product Name")))
				{actions.sendKeys(Keys.PAGE_DOWN).build().perform();}
			
			// Iterate Through the list
		for (int pdct = 0; pdct <= productTableElement.size(); pdct++)
			{		String Prdct = productTableElement.get(pdct).getText();
			if (Prdct.contains(productUnderTest))
			{productTableElement.get(pdct).click();
			driver.findElement(productLovOkayButton).click();
			break;}

			}




		//	Operation Type
		//wait for the element to be available
		w.until(ExpectedConditions.visibilityOfElementLocated(operationTypeDroDown));
		Thread.sleep(3000);
		new Select (driver.findElement(operationTypeDroDown)).selectByVisibleText(pickup5.get("Operation Type"));


		if (pickup5.get("Operation Type").contains("New Quotation"))

		{				
			//	Effective Date
			//wait for the element to be available
			Thread.sleep(3000);
			w.until(ExpectedConditions.visibilityOfElementLocated(effectiveDateDatePicker));
			driver.findElement(effectiveDateDatePicker).sendKeys(pickup5.get("Effective Date"));




			//	Client
			//wait for the element to be available
			w.until(ExpectedConditions.visibilityOfElementLocated((clientLOV)));
			driver.findElement(clientLOV).click();
			Thread.sleep(3000);
			List<WebElement> clientTableElement = driver.findElements(clientLovTable);
			Thread.sleep(1000);
			for (WebElement webElement : clientTableElement) {
				String allClient = webElement.getText();
				if (allClient.contains(pickup5.get("Client"))) {
					System.out.println(allClient);
					webElement.click();
					driver.findElement(clientLovOkayButton).click();
					break;
				}
			}


			//	UmbrellaCover Flag
			Thread.sleep(1000);
			//wait for the element to be available
			w.until(ExpectedConditions.visibilityOfElementLocated((umbrellaCoverCheckBox)));
			if(pickup5.get("UmbrellaCover Flag").contentEquals("Y")) {driver.findElement(umbrellaCoverCheckBox).click();}
			else if(pickup5.get("UmbrellaCover Flag").contentEquals("y")) {driver.findElement(umbrellaCoverCheckBox).click();}
			else if(pickup5.get("UmbrellaCover Flag").contentEquals("Yes")) {driver.findElement(umbrellaCoverCheckBox).click();}
			else if(pickup5.get("UmbrellaCover Flag").contentEquals("YES")) {driver.findElement(umbrellaCoverCheckBox).click();}


		}
		else 
		{
			//		Quotation Number
			//wait for the element to be available
			w.until(ExpectedConditions.visibilityOfElementLocated((quotationNumberPopUpButton)));
			driver.findElement(quotationNumberPopUpButton).click();
			Thread.sleep(3000);
			List<WebElement> QuotationNumberTableElement = driver.findElements(quotationNumberTable);
			Thread.sleep(1000);
			for (WebElement webElement : QuotationNumberTableElement) {
				String allQuote = webElement.getText();
				if (allQuote.contains(pickup5.get("Quotation Number"))) {
					System.out.println(allQuote);
					webElement.click();
					driver.findElement(quotationNumberOkButton).click();
					break;
				}
			}

		}

		//	Access Group
		//wait for the element to be available
		w.until(ExpectedConditions.visibilityOfElementLocated(accessGroupLOV));
		driver.findElement(accessGroupLOV).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(accessGroupLovTable));
		List<WebElement> accessGrpTableElement = driver.findElements(accessGroupLovTable);
		Thread.sleep(1000);
		for (int accessGrp = 0; accessGrp <= accessGrpTableElement.size(); accessGrp++)	
		{	String allaccessGrp = accessGrpTableElement.get(accessGrp).getText();
		if (allaccessGrp.contains(pickup5.get("Access Group"))) 
		{	System.out.println(allaccessGrp);
		accessGrpTableElement.get(accessGrp).click();
		driver.findElement(accessGroupLovOkayButton).click();
		break;}}
	}




	@Then("^User Clicks on the Next button$")
	public void user_Clicks_on_the_Next_button()  {
		w.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
		driver.findElement(nextButton).click();

	}










































}
