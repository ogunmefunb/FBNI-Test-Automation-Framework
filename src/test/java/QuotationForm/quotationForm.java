package QuotationForm;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

//import com.google.gwt.i18n.client.Messages.Select;

import FBNIGroup.Base.AbstractPageMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class quotationForm extends AbstractPageMethods {
	
	WebDriver driver = getDriver();
	Wait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(45)).pollingEvery(Duration.ofSeconds(1));

	
	
	
	
	By quotationNumber = By.xpath("//*[@id=\"lmsgroup:pg1\"]/tbody/tr/td[2]");
	By agentsLOV = By.id("lmsgroup:cb12");
	By agentsTable = By.xpath("//*[@id=\"lmsgroup:table7::db\"]/table/tbody/tr/td[2]/span");
	By agentsLovOkayButton = By.id("lmsgroup:commandButton38");
	By marketerLOV = By.id("lmsgroup:cb36");
	By marketerTable = By.xpath("//*[@id=\"lmsgroup:t34::db\"]/table/tbody/tr/td");
	By marketerLovOkayButton = By.id("lmsgroup:cb122");
	By jointMarketerCheckBox = By.id("lmsgroup:jntMrktCheckBox::content");
	By jointMarketerLOV = By.id("lmsgroup:cb36xx");
	By jointMarketerTable = By.xpath("//*[@id=\"lmsgroup:t34jnt::db\"]/table/tbody/tr/td");
	By coinsuranceCheckBox = By.id("lmsgroup:coinsCheckBox::content");
	By jointMarketerOkayButton = By.id("lmsgroup:cb122jnt");
	By currencyLOV = By.id("lmsgroup:cb128");
	By currencyTable = By.xpath("//*[@id=\"lmsgroup:t40::db\"]/table/tbody/tr/td");
	By currencyLovOkayButton = By.id("lmsgroup:cb129");
	By currencyFixedRateDropDown = By.id("lmsgroup:soc32::content");
	By exchangeRateTextBox = By.id("lmsgroup:it112::content");
	By quotationCalcTypeDropDown = By.id("lmsgroup:soc1::content");
	By quotationCoversDropDown = By.id("lmsgroup:soc2::content");
	By durationTypeDropDown = By.id("lmsgroup:soc3::content");
	By facultativeTypeDropDown = By.id("lmsgroup:socNQ3::content");
	By umbrellaDurationTypeDropDown = By.id("lmsgroup:selectOneChoice8::content");
	By frequencyOfPaymentDropDown = By.id("lmsgroup:soc4::content");
	By unitRateOptionDropDown = By.id("lmsgroup:selectOneChoice2::content");
	By totalClaimsPaidTextBox = By.id("lmsgroup:it108::content");
	By totalPremiumPaidTextBox = By.id("lmsgroup:it109::content");
	By investmentRiderAllowedDropDown = By.id("lmsgroup:selectOneChoice9::content");
	By savingsRiderDropDown = By.id("lmsgroup:soc6::content");
	By osLoanCalcDropDown = By.id("lmsgroup:selectOneChoice6::content");
	By nextButton = By.id("lmsgroup:cb97");
	By investmentTermTextBox = By.id("lmsgroup:ins21::content");

	
	
	
	@When("^system opens quotation basic details form$")
    public void system_opens_quotation_basic_details_form()  {
		Assert.assertNotNull(quotationNumber);
       
    }

    @Then("^user supplies details as specified below$")
    public void user_supplies_details_as_specified_below(DataTable arg6) throws Throwable {
    	Map<String, String> pickup6 = arg6.asMap(String.class, String.class);
    	
//    	Agent
    	driver.findElement(agentsLOV).click();
    	Thread.sleep(3000);
    	List<WebElement> agentTableElement = driver.findElements(agentsTable);
    	for (int agent = 0; agent < agentTableElement.size(); agent++)	
    	{	String everyAgent = agentTableElement.get(agent).getText();
    	if (everyAgent.contains(pickup6.get("Agent/Broker"))) 
    	{	System.out.println(agent);
    	agentTableElement.get(agent).click();
    	driver.findElement(agentsLovOkayButton).click();
    	break;}}
    	

//    	Currency
        w.until(ExpectedConditions.visibilityOfElementLocated(currencyLOV));
    	driver.findElement(currencyLOV).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(currencyTable));
    	List<WebElement> CurrencyTableElement = driver.findElements(currencyTable);
    	for (int currency = 0; currency < CurrencyTableElement.size(); currency++)	
    	{	String everyCurrency = CurrencyTableElement.get(currency).getText();
    	if (everyCurrency.contains(pickup6.get("Currency"))) 
    	{	System.out.println(currency);
    	CurrencyTableElement.get(currency).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(currencyLovOkayButton));
    	driver.findElement(currencyLovOkayButton).click();
    	break;}}
    	
//    	Currency Fixed Rate
        w.until(ExpectedConditions.visibilityOfElementLocated(currencyFixedRateDropDown));
       	new Select (driver.findElement(currencyFixedRateDropDown)).selectByVisibleText(pickup6.get("Currency Fixed Rate"));

       	//(Exchange Rate if currency fixed rate is YES)
       	if (pickup6.get("Currency Fixed Rate").contains("Yes")) {
          w.until(ExpectedConditions.visibilityOfElementLocated(exchangeRateTextBox));
     		driver.findElement(exchangeRateTextBox).sendKeys(pickup6.get("Exchange Rate if currency fixed rate is YES"));
     	}
          	
//    	Quotation Calc Type
        w.until(ExpectedConditions.visibilityOfElementLocated(quotationCalcTypeDropDown));
       	new Select (driver.findElement(quotationCalcTypeDropDown)).selectByVisibleText(pickup6.get("Quotation Calc Type"));
       	
//    	Quotation Covers
        w.until(ExpectedConditions.visibilityOfElementLocated(quotationCoversDropDown));
       	new Select (driver.findElement(quotationCoversDropDown)).selectByVisibleText(pickup6.get("Quotation Covers"));
    	
//    	Duration Type
        w.until(ExpectedConditions.visibilityOfElementLocated(durationTypeDropDown));
       	new Select (driver.findElement(durationTypeDropDown)).selectByVisibleText(pickup6.get("Duration Type"));
    	
//    	Facultative Type
        w.until(ExpectedConditions.visibilityOfElementLocated(facultativeTypeDropDown));
       	new Select (driver.findElement(facultativeTypeDropDown)).selectByVisibleText(pickup6.get("Facultative Type"));	
       	
//    	Frequency Of Payment
        w.until(ExpectedConditions.visibilityOfElementLocated(frequencyOfPaymentDropDown));
       	new Select (driver.findElement(frequencyOfPaymentDropDown)).selectByVisibleText(pickup6.get("Frequency Of Payment"));	 
       	

//    	Unit Rate Option
        w.until(ExpectedConditions.visibilityOfElementLocated(unitRateOptionDropDown));
       	new Select (driver.findElement(unitRateOptionDropDown)).selectByVisibleText(pickup6.get("Unit Rate Option"));	
/*       	
    //For Future use, in case Tester Wishes to include more data for test.   	
//	Marketer
	Thread.sleep(2000);
	driver.findElement(marketerLOV).click();
	Thread.sleep(3000);
	List<WebElement> marketerTableElement = (List<WebElement>) driver.findElements(marketerTable);
	for (int marketer = 0; marketer < marketerTableElement.size(); marketer++)	
	{	String everyMarketer = marketerTableElement.get(marketer).getText();
	if (everyMarketer.contains(pickup6.get("Marketer"))) 
	{	System.out.println(marketer);
	Thread.sleep(2000);
	marketerTableElement.get(marketer).click();
	Thread.sleep(2000);
	driver.findElement(marketerLovOkayButton).click();
	break;}}
	
//	Joint Marketer
	//wait for the element to be available
    w.until(ExpectedConditions.visibilityOfElementLocated(jointMarketerCheckBox));
    if(pickup6.get("Joint Marketer flag").contentEquals("Y")) {driver.findElement(jointMarketerCheckBox).click();}
	else if(pickup6.get("Joint Marketer flag").contentEquals("y")) {driver.findElement(jointMarketerCheckBox).click();}
	else if(pickup6.get("Joint Marketer flag").contentEquals("Yes")) {driver.findElement(jointMarketerCheckBox).click();}
	else if(pickup6.get("Joint Marketer flag").contentEquals("YES")) {driver.findElement(jointMarketerCheckBox).click();}
	
    
//	Coinsurance
	//wait for the element to be available
    w.until(ExpectedConditions.visibilityOfElementLocated(coinsuranceCheckBox));
    if(pickup6.get("Coinsurance Flag").contentEquals("Y")) {driver.findElement(coinsuranceCheckBox).click();}
	else if(pickup6.get("Coinsurance Flag").contentEquals("y")) {driver.findElement(coinsuranceCheckBox).click();}
	else if(pickup6.get("Coinsurance Flag").contentEquals("Yes")) {driver.findElement(coinsuranceCheckBox).click();}
	else if(pickup6.get("Coinsurance Flag").contentEquals("YES")) {driver.findElement(coinsuranceCheckBox).click();} 
	
       	
//	Umbrella Duration Type
      w.until(ExpectedConditions.visibilityOfElementLocated(umbrellaDurationTypeDropDown));
     	new Select (driver.findElement(umbrellaDurationTypeDropDown)).selectByVisibleText(pickup6.get("Umbrella Duration Type"));	 
     	


//    	Total Claims paid
        w.until(ExpectedConditions.visibilityOfElementLocated(totalClaimsPaidTextBox));
       	driver.findElement(totalClaimsPaidTextBox).sendKeys(pickup6.get("Total Claims paid"));
       	

//    	Total Premium Paid
        w.until(ExpectedConditions.visibilityOfElementLocated(totalPremiumPaidTextBox));
       	driver.findElement(totalPremiumPaidTextBox).sendKeys(pickup6.get("Total Premium Paid"));
           	
       	
//    	Investment Rider Allowed?
        w.until(ExpectedConditions.visibilityOfElementLocated(investmentRiderAllowedDropDown));
       	new Select (driver.findElement(investmentRiderAllowedDropDown)).selectByVisibleText(pickup6.get("Investment Rider Allowed"));	
       	
       	//If Investment Rider is allowed, specify rate
       	if (pickup6.get("Investment Rider Allowed").contains("Yes")) {
            w.until(ExpectedConditions.visibilityOfElementLocated(investmentTermTextBox));
       		driver.findElement(investmentTermTextBox).sendKeys(pickup6.get("Investment Term"));
       	}
       	

//    	Savings Riders
        w.until(ExpectedConditions.visibilityOfElementLocated(savingsRiderDropDown));
       	new Select (driver.findElement(savingsRiderDropDown)).selectByVisibleText(pickup6.get("Savings Riders"));	 
       	

//    	OS Loan Calc
        w.until(ExpectedConditions.visibilityOfElementLocated(osLoanCalcDropDown));
       	new Select (driver.findElement(osLoanCalcDropDown)).selectByVisibleText(pickup6.get("OS Loan Calc"));

//    	joint Marketer
        w.until(ExpectedConditions.visibilityOfElementLocated(jointMarketerCheckBox));
       	if (driver.findElement(jointMarketerCheckBox).isSelected() || driver.findElement(jointMarketerLOV).isSelected()) {
       		
        w.until(ExpectedConditions.visibilityOfElementLocated(jointMarketerLOV));
    	driver.findElement(jointMarketerLOV).click();
    	Thread.sleep(3000);
    	List<WebElement> jointMarketerTableElement = (List<WebElement>) driver.findElements(jointMarketerTable);
    	for (int JointMarketer = 0; JointMarketer < jointMarketerTableElement.size(); JointMarketer++)	
    	{	String everyJointMarketer = jointMarketerTableElement.get(JointMarketer).getText();
    	if (everyJointMarketer.contains(pickup6.get("Select Joint Marketer"))) 
    	{	System.out.println(JointMarketer);
    	jointMarketerTableElement.get(JointMarketer).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(jointMarketerOkayButton));
    	driver.findElement(jointMarketerOkayButton).click();
    	break;}}}
    	
    	*/
}

    @Then("^User clicks on next button$")
    public void user_clicks_on_next_button()  {
        w.until(ExpectedConditions.elementToBeClickable(nextButton));
    	driver.findElement(nextButton).click();
      
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
