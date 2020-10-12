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
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import FBNIGroup.Base.AbstractPageMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class QuotationDetails extends AbstractPageMethods{
	WebDriver driver = getDriver();
	Wait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(45)).pollingEvery(Duration.ofSeconds(1));

	
	
	By quotationDetailsSummaryPage = By.id("lmsgroup:pgl4");
	By quotationUnderwritingTab = By.id("lmsgroup:sdi20::disAcr");
	By coverTypeSubTab = By.id("lmsgroup:sdi3::disAcr");
	By computePremiumButton = By.id("lmsgroup:cb27");
	By premiumSuccessNotificationOkayButton = By.id("d15::msgDlg::cancel");
	By quotationAuthorizationTab = By.id("lmsgroup:sdi22::disAcr");
	By authorizationSubTab = By.id("lmsgroup:sdi11::disAcr");
	By makeReadyButton = By.id("lmsgroup:cb45");
	By authorizeQuotationButton = By.id("lmsgroup:commandButton34");
	By quotationAgentTab = By.id("lmsgroup:showDetailItem1::disAcr");
	By editQuotationAgentButton = By.id("lmsgroup:commandButton27");
	By assignAgenttoQuotationDropDown = By.id("lmsgroup:selectOneChoice2::content");
	By authoriseQuotationDropDown = By.id("lmsgroup:selectOneChoice3::content");
	By editAgentSaveButton = By.id("lmsgroup:cb22");
	By processQuotation = By.id("lmsgroup:t5:0:commandLink2");
	By ticketProcessingPage = By.xpath("//*[@id=\"pt1:ol1\"]/label");
	By continuePrcessTicketButton = By.id("pt1:commandButton6");
	By commissionRateTextBox = By.id("lmsgroup:it84::content");
	By saveQuotationDetailsButton = By.id("lmsgroup:commandButton21");
	
		@When("^Quotation Details Screen Populates$")
		    public void quotation_Details_Screen_Populates()  {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(quotationDetailsSummaryPage));
	       driver.findElement(quotationDetailsSummaryPage).isDisplayed();
		    }
	 
	   @Then("^User Clicks Quotation Underwriting$")
	    public void user_Clicks_Quotation_Underwriting()  {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(quotationUnderwritingTab));
		   driver.findElement(quotationUnderwritingTab).click();
	        
	    }

	    @Then("^User clicks cover types tab$")
	    public void user_clicks_cover_types_tab() {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(coverTypeSubTab));
	    	driver.findElement(coverTypeSubTab).click();
	       
	    }

	    @Then("^User clicks compute premium$")
	    public void user_clicks_compute_premium()  {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(computePremiumButton));
	    	driver.findElement(computePremiumButton).click();
	       
	    }
	    
	    @Then("^System displays Success notification$")
	    public void system_displays_Success_notification()  {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(premiumSuccessNotificationOkayButton));
	    	driver.findElement(premiumSuccessNotificationOkayButton).click();
	       
	    }

	    @Then("^User clicks Quotation Authorization Tab$")
	    public void user_clicks_Quotation_Authorization_Tab()  {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(quotationAuthorizationTab));
	    	driver.findElement(quotationAuthorizationTab).click();
	        
	    }

	    @Then("^User clicks Authorisation Tab$")
	    public void user_clicks_Authorisation_Tab()  {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(authorizationSubTab));
	    	 driver.findElement(authorizationSubTab).click();
	    }


	    @Then("^user clicks Make Ready$")
	    public void users_clicks_Make_Ready()  {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(makeReadyButton));
	    	driver.findElement(makeReadyButton).click();
	        
	    }

	    @Then("^User clicks Quotation Agents Tab$")
	    public void user_clicks_Quotation_Agents_Tab()  {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(quotationAgentTab));
	    	driver.findElement(quotationAgentTab).click();
	  
	    }
		
	    @Then("^user clicks edit Agent$")
	    public void user_clicks_edit_Agent()  {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(editQuotationAgentButton));
	    	 driver.findElement(editQuotationAgentButton).click();
	       
	    }

	    @Then("^User clicks Assign To drop down and selects (.*)$")
	    public void user_clicks_Assign_To_drop_down(String assign)  {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(assignAgenttoQuotationDropDown));
	    	 new Select (driver.findElement(assignAgenttoQuotationDropDown)).selectByVisibleText(assign);

	    }

	    @Then("^user clicks Authorised drop down and select (.*)$")
	    public void user_clicks_Authorised_drop_down(String authorised)  {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(authoriseQuotationDropDown));
	       	new Select (driver.findElement(authoriseQuotationDropDown)).selectByVisibleText(authorised);

	    }

	    @Then("^user clicks Save$")
	    public void user_clicks_Save()  {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(editAgentSaveButton));
	    	driver.findElement(editAgentSaveButton).click();
	       
	    }
	    @Then("^user clicks Authorise Quotation$")
	    public void user_clicks_Authorise_Quotation()  {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(authorizeQuotationButton));
	    	driver.findElement(authorizeQuotationButton).click();

	    }
	
	    @Then("User clicks on Process")
	    public void user_clicks_on_Process() {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(processQuotation));
	       driver.findElement(processQuotation).click();}
	
	
	    @When("system displays quotation details showing current tickets")
	       public void system_displays_quotation_details_showing_current_tickets() {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(ticketProcessingPage));
	    	Assert.assertTrue(driver.findElement(ticketProcessingPage).isDisplayed());
	    }
	          
	
	    @Then("User clicks Process on the Ticket processing page")
	    public void user_clicks_on_Process_on_the_Ticket_processing_page() {
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(continuePrcessTicketButton));
	     driver.findElement(continuePrcessTicketButton).click();
	    }
	
	
        @Then("User updates Quotation details as specified below")
        public void user_updates_Quotation_details_as_specified_below(DataTable arg12) {
        	Map<String, String> pickup12 = arg12.asMap(String.class, String.class);

        	
//        	Commission Rate
	    	 w.until(ExpectedConditions.visibilityOfElementLocated(commissionRateTextBox));
          driver.findElement(commissionRateTextBox).sendKeys(pickup12.get("Commission Rate"));
        }


@Then("User Clicks Save button on quotation details page")
		public void user_Clicks_Save_button_on_quotation_details_page() {
	 w.until(ExpectedConditions.visibilityOfElementLocated(saveQuotationDetailsButton));
    driver.findElement(saveQuotationDetailsButton).click();
}













	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
