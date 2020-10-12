package TEST;


import java.time.Duration;
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



public class tESTlOGIC extends AbstractPageMethods {

	WebDriver driver = getDriver();
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





	

	@Then("^User provides TEST:$")
	public void user_provides_quotation_details_as_specified_below(DataTable arg5) throws Throwable {
		Map<String, String> pickup5 = arg5.asMap(String.class, String.class);
		//	Product Name
		driver.findElement(productsLOV).click();
		Thread.sleep(3000);
		//For Products that are far down the list
//		if (pickup5.get("Product Name").contentEquals("GROUP KEYMAN ASSURANCE"))
//		{
//			driver.findElement(By.id("_afrFilterlmsgroup_afr_t3_afr_c9::content")).sendKeys(pickup5.get("Product Name"));
//			
//			
//		}
//		else {
			List<WebElement> productTableElement =  driver.findElements(productTable);
			// Iterate Through the list
//			driver.findElement(productTableFirstRow).click();
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			for (int pdct = 0; pdct <= productTableElement.size(); pdct++)	
			{		String Prdct = productTableElement.get(pdct).getText();
			if (Prdct.contains(pickup5.get("Product Name"))) 
			{productTableElement.get(pdct).click();
			driver.findElement(productLovOkayButton).click();
			break;}

			}

		//	Operation Type
		//wait for the element to be available
		w.until(ExpectedConditions.visibilityOfElementLocated(operationTypeDroDown));
		Thread.sleep(3000);
		new Select (driver.findElement(operationTypeDroDown)).selectByVisibleText(pickup5.get("Operation Type"));


	
	}












































}
