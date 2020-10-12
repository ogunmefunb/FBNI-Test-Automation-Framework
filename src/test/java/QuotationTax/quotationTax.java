package QuotationTax;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import FBNIGroup.Base.AbstractPageMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


/**
 * Created by Ben
 */


public class quotationTax extends AbstractPageMethods {
	
	WebDriver driver = getDriver();
	Wait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2));

	
	By quotationTaxLabel = By.xpath("//*[@id=\"lmsgroup:ol44\"]/label[contains(text(),'Quotation Taxes')]");
	By addQuotationTaxbutton = By.id("lmsgroup:cb25");
	By selectTaxTypeTable = By.xpath("//*[@id=\"lmsgroup:t8::db\"]/table/tbody/tr/td/span");
	By selectTaxTableNextButton = By.id("lmsgroup:cb27");
	By addTaxPopUp = By.id("lmsgroup:d9::_ttxt");
	By addTaxRateTextBox = By.id("lmsgroup:it28::content");
	By addTaxAmountTextBox = By.id("lmsgroup:it29::content");
	By addTaxSavebutton = By.id("lmsgroup:cb28");
	By quotationTaxNextButton = By.id("lmsgroup:cb97");
	By assTaxSaveButton = By.id("lmsgroup:cb28");
	
	
	
	
	
	
@When("Quotation Tax Page opens up")
public void quotation_Tax_Page_opens_up() {
	 w.until(ExpectedConditions.visibilityOfElementLocated(quotationTaxLabel));
	Assert.assertTrue(driver.findElement(quotationTaxLabel).isDisplayed());
  
}
	

@Then("User Clicks on New button")
public void user_Clicks_on_New_button() {
	 w.until(ExpectedConditions.elementToBeClickable(addQuotationTaxbutton));
	driver.findElement(addQuotationTaxbutton).click();
 
}

@Then("Select tax screen pops up.")
public void select_tax_screen_pops_up() {
	 w.until(ExpectedConditions.visibilityOfElementLocated(selectTaxTypeTable));
	Assert.assertTrue(driver.findElement(selectTaxTypeTable).isDisplayed());

   
}

@When("^User Select (.*) as Tax Type and clicks next")
public void user_Select_Tax_Type_and_clicks_Ok(String TaxType) {
	 w.until(ExpectedConditions.visibilityOfElementLocated(selectTaxTypeTable));
	 List<WebElement> selectTaxTypetTableElement =  driver.findElements(selectTaxTypeTable);
   	for (int taxType = 0; taxType < selectTaxTypetTableElement.size(); taxType++)	
   	{	String everyTaxType = selectTaxTypetTableElement.get(taxType).getText();
   	if (everyTaxType.contains(TaxType))
   	{	System.out.println(taxType);
   	selectTaxTypetTableElement.get(taxType).click();
   	driver.findElement(selectTaxTableNextButton).click();
   	break;}}
}

@When("System displays add Tax screen")
public void system_displays_tax_screen() {
	 w.until(ExpectedConditions.visibilityOfElementLocated(addTaxPopUp));
	Assert.assertTrue(driver.findElement(addTaxPopUp).isDisplayed());
}
  
@Then("User clicks save after specifying info as stated below:")
public void user_specifies_info_as_stated_below(DataTable arg8) {
	Map<String, String> pickup8 = arg8.asMap(String.class, String.class);
	 w.until(ExpectedConditions.visibilityOfElementLocated(addTaxRateTextBox));
	driver.findElement(addTaxRateTextBox).sendKeys(pickup8.get("Rate"));
	 w.until(ExpectedConditions.visibilityOfElementLocated(addTaxAmountTextBox));
	driver.findElement(addTaxAmountTextBox).sendKeys(pickup8.get("Tax Amount"));
	 w.until(ExpectedConditions.visibilityOfElementLocated(addTaxAmountTextBox));
	driver.findElement(assTaxSaveButton).click();

	
}

@Then("User clicks next button")
public void user_clicks_next_button() {
	 w.until(ExpectedConditions.elementToBeClickable(quotationTaxNextButton));
	driver.findElement(quotationTaxNextButton).click();
}

}
