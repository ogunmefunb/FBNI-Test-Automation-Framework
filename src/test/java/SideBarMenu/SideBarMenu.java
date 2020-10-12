package SideBarMenu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import FBNIGroup.Base.AbstractPageMethods;
//import cucumber.api.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SideBarMenu extends AbstractPageMethods {
	
	WebDriver driver = getDriver();
	Wait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

	
	
	
	
	//Home
	By homeMainMenu = By.id("pt1:cil1::icon");


	//quotation
	By quotationParentMenu = By.id("pt1:cil3::icon");
	By quotationProcessingChildMenu = By.id("pt1:pt_cl1");
	By quotationEnquiryChildMenu = By.id("pt1:pt_cl2");
	By manageQuoteStatusChildMenu = By.id("pt1:pt_cl23");


	@Then("^user Click on The Quotation Module$")
	public void user_Click_on_The_Quotation_Module() {
		//wait for the element to be available
		w.until(ExpectedConditions.visibilityOfElementLocated(quotationParentMenu));
		//Click on Quotation Parent Menu
		driver.findElement(quotationParentMenu).click();
	}

	@Then("^User click on the Quotation Processing Sublink$")
	public void click_on_the_Quotation_Processing_Sublink(){
		//wait for the element to be available
		w.until(ExpectedConditions.visibilityOfElementLocated(quotationParentMenu));
		//Click on Quotation Processing Sublink/Child Menu
		driver.findElement(quotationProcessingChildMenu).click();
	}
	@Then("User click on the Quotation Enquiry Sublink")
	public void user_click_on_the_Quotation_Enquiry_Sublink() {
		//wait for the element to be available
		w.until(ExpectedConditions.visibilityOfElementLocated(quotationEnquiryChildMenu));
	    driver.findElement(quotationEnquiryChildMenu).click();
	}
	//Underwriting
	By underwritingParentMenu = By.id("pt1:commandImageLink1::icon");
	By convertQuotationToPolicyChildMenu = By.id("pt1:pt_cl3");
	By convertUmbrellaQuotationToPolicyChildMenu = By.id("pt1:pt_cl43");
	By policyTransactionChildMenu = By.id("pt1:pt_cl4");
	By paymentAdministrationChildMenu = By.id("pt1:pt_cl5");
	By policyMedicalsChildMenu = By.id("pt1:pt_cl6");
	By medicalPaymentsChildMenu = By.id("pt1:pt_cl14");
	By renewalsProcessingChildMenu = By.id("pt1:pt_cl7");
	By renewalWorkingAreaChildMenu = By.id("pt1:pt_cl22");
	By pensionAdministrationChildMenu =By.id("pt1:pt_cl8");
	By enmassValuationChildMenu =By.id("pt1:pt_cl24");
	By  enmassMessagingChildMenu =By.id("pt1:j_id__ctru65pc2");
	By  enmassWithdrawalsChildMenu =By.id("pt1:j_id__ctru67pc2");
	By  memberBalanceEnquiryChildMenu =By.id("pt1:pt_cl27");
	By  premiumReconciliationChildMenu =By.id("pt1:pt_cl35");
	//Claims
	By  claimsMainmenu =By.id("pt1:commandImageLink19::icon");
	By  claimsBookingChildMenu =By.id("pt1:pt_cl9");
	By  editClaimsChildMenu =By.id("pt1:pt_cl10");
	By  claimsEnquiryChildMenu =By.id("pt1:pt_cl18");
	By  claimsAuthorizationChildMenu =By.id("pt1:pt_cl26");
	By  policySurrenderChildMenu =By.id("pt1:commandLink1xv");
	By  schemeWithdrawalsChildMenu =By.id("pt1:schedrawalx2");
	By  loanAdministrationChildMenu =By.id("pt1:pt_cl37");
	//Accounts
	By  accountsMainmenu =By.id("pt1:commandImageLink22::icon");
	By  transactionsAllocationChildMenu =By.id("pt1:pt_cl11");
	By  emassTransactionsAllocationChildMenu =By.id("pt1:j_id__ctru99pc2");
	By  openingBalancesChildMenu =By.id("pt1:pt_cl15");
	By  commissionPaymentsChildMenu =By.id("pt1:pt_cl16");
	By  loadClientsChildMenu =By.id("pt1:pt_cl29");
	By  loadenmassPoliciesChildMenu =By.id("pt1:pt_cl17");
	By  loadPoliciesChildMenu =By.id("pt1:pt_cl30");
	By  chequeTrackingChildMenu =By.id("pt1:pt_cl34");
	By  profitShareChildMenu =By.id("pt1:pt_cl36");
	By  uprProcessingChildMenu =By.id("pt1:pt_cl38");
	By  reinsurancePortfolioChildMenu =By.id("pt1:pt_cl39");
	By  policyTaxesChildMenu =By.id("pt1:pt_cl40");
	By  annualReinsuranceChildMenu =By.id("pt1:pt_cl42");
	//Ticketing
	By  ticketingMainmenu =By.id("pt1:commandImageLink25::icon");
	By  pendingTicketsChildMenu =By.id("pt1:pt_cl13");
	By  ticketManagementChildMenu =By.id("pt1:pt_cl25");
	//Setups
	By  setupsParentMenu =By.id("pt1:commandImageLink27::icon");
	//Reports
	By  reportsParentMenu =By.id("pt1:commandImageLink60::icon");
	By  coreSetupChildMenu =By.id("pt1:pt_cl19");
	By  underwritingReportsChildMenu =By.id("pt1:pt_cl32");
	By  renewalReportsChildMenu =By.id("pt1:pt_cl32pt");
	By  claimsReportsChildMenu =By.id("pt1:pt_cl21");
	By  accountsReportsChildMenu =By.id("pt1:pt_cl41");
	By  reinsuranceReportsChildMenu =By.id("pt1:pt_cl20");
	By  OtherReportsChildMenu =By.id("pt1:pt_cl33");
	
	



	
	
	






























}
