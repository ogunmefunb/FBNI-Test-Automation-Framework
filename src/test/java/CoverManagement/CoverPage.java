package CoverManagement;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import FBNIGroup.Base.AbstractPageMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoverPage extends AbstractPageMethods {
	
	WebDriver driver = getDriver();
	Wait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2));

	
	By addNewCoverButton = By.id("lmsgroup:cb17");
	By editCoverButton = By.id("lmsgroup:commandButton8");
	By coverTypeDrpDown = By.id("lmsgroup:soc10::content");
	By overRidePremiumTextBox = By.id("lmsgroup:it26::content");
	By averageEarningsPerMemberTextBox = By.id("lmsgroup:inputText9::content");
	By noOfMembersTextBox = By.id("lmsgroup:inputText10::content");
	By originalLoanAmtPerMember = By.id("lmsgroup:inputText35::content");
	By loanInterest = By.id("lmsgroup:inputText37::content");
	By savingsAmountTextBox = By.id("lmsgroup:inputText38::content");
	By loadRate = By.id("lmsgroup:it27::content");
	By averageANB = By.id("lmsgroup:inputText1::content");
	By discountRate = By.id("lmsgroup:inputText41::content");
	By selectRateDropDown = By.id("lmsgroup:soc29::content");
	By percentOfMainPerYearSA = By.id("lmsgroup:it100::content");
	By sumAssured = By.id("lmsgroup:it25::content");
	By dependantTypePopUpButton = By.id("lmsgroup:cb103");
	By dependantTable = By.xpath("//*[@id=\"lmsgroup:t29::db\"]/table/tbody/tr/td/span");
	By dependantOkayButton = By.id("lmsgroup:cb104");
	By totalOriginalLoanAmount = By.id("lmsgroup:inputText47::content");
	By loanRepaymentPeriod = By.id("lmsgroup:inputText36::content");
	By loanTypeDropDown = By.id("lmsgroup:soc35::content");
	By loadDropDown = By.id("lmsgroup:soc101::content");
	By loadDivFactorTextBox = By.id("lmsgroup:inputText13::content");
	By discountDropDown = By.id("lmsgroup:selectOneChoice7::content");
	By discountDivFactorTextBox = By.id("lmsgroup:inputText42::content");
	By allowBenefitsDrpDown = By.id("lmsgroup:sl9c29::content");
	By mainCoverOrRider = By.id("lmsgroup:soc25::content");
	By saveButton = By.id("lmsgroup:cb19");
	By coverTable = By.id("//*[@id=\"lmsgroup:pc1:t6::db\"]/table/tbody/tr");
	By totalMemberEarningsTextBox = By.id("lmsgroup:inputText45::content");
	By premiumMaskPopUpButton = By.id("lmsgroup:cb101");
	By premiumMaskTable = By.xpath("//*[@id=\"lmsgroup:table5::db\"]/table/tbody/tr/td");
	By premiumMaskOkButton = By.id("lmsgroup:cb124");
	By rateTextBox = By.id("lmsgroup:ins7::content");
	By rateDivFactorTextBox = By.id("lmsgroup:inputNumberSpinbox2::content");
	By coverDetailsFormSaveButton = By.id("lmsgroup:cb19");
	By coverDetailsFormCancelButton = By.id("lmsgroup:cb20");
	By finishBotton = By.id("lmsgroup:cb99");







    @When("^Quotation Cover Details Screen appears with the Main cover populated$")
    public void quotation_Cover_Details_Screen_appears_with_the_Main_cover_populated()  {
//    	List<WebElement>  CoverNums = (List<WebElement>) driver.findElements(coverTable);
//    	int totalNumberOfCovers = CoverNums.size();
//    	System.out.println(totalNumberOfCovers);
//    	Assert.assertTrue(totalNumberOfCovers == 1);
    }

    @Then("^user Click on New button$")
    public void user_Click_on_New_button()  {
    	 w.until(ExpectedConditions.visibilityOfElementLocated(addNewCoverButton));
    	 driver.findElement(addNewCoverButton).click();

    }

	@Then("^user click on edit button$")
	public void user_click_on_edit_button()  {
		w.until(ExpectedConditions.visibilityOfElementLocated(editCoverButton));
		driver.findElement(editCoverButton).click();

	}


    @When("^System displays Cover Details form$")
	
    public void system_displays_Cover_Details_form()  {
   	 w.until(ExpectedConditions.visibilityOfElementLocated(coverTypeDrpDown));
    	Assert.assertTrue(driver.findElement(coverTypeDrpDown).isDisplayed());
       
    }

    @Then("^User provides details as specified below$")
    public void user_provides_details_as_specified_below(DataTable arg7) throws Throwable {
    	Map<String, String> pickup7 = arg7.asMap(String.class, String.class);
		String cover = driver.findElement(coverTypeDrpDown).getAttribute("title");
    	if (cover.contains("MORTGAGE PROTECTION COVER"))
    	{
    		// No. of Members
			w.until(ExpectedConditions.visibilityOfElementLocated(noOfMembersTextBox));
			driver.findElement(noOfMembersTextBox).sendKeys(pickup7.get("No. of Members"));

		  //Total Original Loan Amount
       	 	w.until(ExpectedConditions.visibilityOfElementLocated(totalOriginalLoanAmount));
       	  	driver.findElement(totalOriginalLoanAmount).sendKeys(pickup7.get("Total Original Loan Amount"));

       	  //Loan Repayment Period
			 w.until(ExpectedConditions.visibilityOfElementLocated(loanRepaymentPeriod));
			 driver.findElement(loanRepaymentPeriod).sendKeys(pickup7.get("Loan Repayment Period"));

			//Loan Interest
			w.until(ExpectedConditions.visibilityOfElementLocated(loanInterest));
			driver.findElement(loanInterest).sendKeys(pickup7.get("Loan interest"));

       	  //Loan Type
			 w.until(ExpectedConditions.visibilityOfElementLocated(loanTypeDropDown));
			new Select (driver.findElement(loanTypeDropDown)).selectByVisibleText(pickup7.get("Loan type"));

		  //Average ANB
			w.until(ExpectedConditions.visibilityOfElementLocated(averageANB));
			driver.findElement(averageANB).sendKeys(pickup7.get("Average ANB"));

		  //Allow Benefits to Beneficiaries/Customer
        	w.until(ExpectedConditions.visibilityOfElementLocated(allowBenefitsDrpDown));
        	new Select (driver.findElement(allowBenefitsDrpDown)).selectByVisibleText(pickup7.get("Allow Benefits to Beneficiaries or Customer"));



		}
    	else
    		{
    	
				//Cover Types

				 w.until(ExpectedConditions.visibilityOfElementLocated(coverTypeDrpDown));
				new Select (driver.findElement(coverTypeDrpDown)).selectByVisibleText(pickup7.get("Cover Type"));
				Thread.sleep(3000);


				//   Override Premium
		//      	 w.until(ExpectedConditions.visibilityOfElementLocated(overRidePremiumTextBox));
		//       	  driver.findElement(overRidePremiumTextBox).sendKeys(pickup7.get("Override Premium"));

				// No. of Members
				 w.until(ExpectedConditions.visibilityOfElementLocated(noOfMembersTextBox));
				  driver.findElement(noOfMembersTextBox).sendKeys(pickup7.get("No. of Members"));

				//Av. Earnings Per Member
				 w.until(ExpectedConditions.visibilityOfElementLocated(averageEarningsPerMemberTextBox));
				  driver.findElement(averageEarningsPerMemberTextBox).sendKeys(pickup7.get("Av. Earnings Per Member"));

				//Total Original Loan Amount
		//       	 w.until(ExpectedConditions.visibilityOfElementLocated(totalOriginalLoanAmount));
		//       	  driver.findElement(totalOriginalLoanAmount).sendKeys(pickup7.get("Total Original Loan Amount"));

				//Loan Repayment Period
		//       	 w.until(ExpectedConditions.visibilityOfElementLocated(loanRepaymentPeriod));
		//       	  driver.findElement(loanRepaymentPeriod).sendKeys(pickup7.get("Loan Repayment Period"));

				//Loan Type
		//       	 w.until(ExpectedConditions.visibilityOfElementLocated(loanTypeDropDown));
		//       	new Select (driver.findElement(loanTypeDropDown)).selectByVisibleText(pickup7.get("Loan Type"));

				//Load Div Factor
				 w.until(ExpectedConditions.visibilityOfElementLocated(loadDivFactorTextBox));
				  driver.findElement(loadDivFactorTextBox).sendKeys(pickup7.get("Load Div Factor"));

				//Discount?
				 w.until(ExpectedConditions.visibilityOfElementLocated(discountDropDown));
				  new Select (driver.findElement(discountDropDown)).selectByVisibleText(pickup7.get("Discount?"));

				//Discount Div Factor
				 w.until(ExpectedConditions.visibilityOfElementLocated(discountDivFactorTextBox));
				  driver.findElement(discountDivFactorTextBox).sendKeys(pickup7.get("Discount Div Factor"));

				  //Allow Benefits to Beneficiaries/Customer
		//         w.until(ExpectedConditions.visibilityOfElementLocated(allowBenefitsDrpDown));
		//        	new Select (driver.findElement(allowBenefitsDrpDown)).selectByVisibleText(pickup7.get("Allow Benefits"));


				//Sum Assured
				 w.until(ExpectedConditions.visibilityOfElementLocated(sumAssured));
				  driver.findElement(sumAssured).sendKeys(pickup7.get("Sum Assured"));

				//Dependant Type
					 w.until(ExpectedConditions.visibilityOfElementLocated(dependantTypePopUpButton));
					 driver.findElement(dependantTypePopUpButton).click();
					 List<WebElement> dependantTableElement = driver.findElements(dependantTable);
						for (int dep = 0; dep < dependantTableElement.size(); dep++)
						{	String everydep = dependantTableElement.get(dep).getText();
						if (everydep.contains(pickup7.get("Dependent Type")))
						{	System.out.println(dep);
						dependantTableElement.get(dep).click();
						 w.until(ExpectedConditions.visibilityOfElementLocated(dependantOkayButton));
						driver.findElement(dependantOkayButton).click();
						break;}}


				//Total Member Earnings
		//       	 w.until(ExpectedConditions.visibilityOfElementLocated(totalMemberEarningsTextBox));
		//       	  driver.findElement(totalMemberEarningsTextBox).sendKeys(pickup7.get("Total Member Earnings"));

				//Original Loan Amount Per Member
		//       	 w.until(ExpectedConditions.visibilityOfElementLocated(originalLoanAmtPerMember));
		//       	  driver.findElement(originalLoanAmtPerMember).sendKeys(pickup7.get("Original Loan Amount Per Member"));

				//Loan Interest
		//       	 w.until(ExpectedConditions.visibilityOfElementLocated(loanInterest));
		//       	  driver.findElement(loanInterest).sendKeys(pickup7.get("Loan Interest"));

				//Savings Amount
		//       	 w.until(ExpectedConditions.visibilityOfElementLocated(savingsAmountTextBox));
		//       	  driver.findElement(savingsAmountTextBox).sendKeys(pickup7.get("Savings Amount"));

				//Load Rate
				 w.until(ExpectedConditions.visibilityOfElementLocated(loadRate));
				  driver.findElement(loadRate).sendKeys(pickup7.get("Load Rate"));

				//Average ANB
				 w.until(ExpectedConditions.visibilityOfElementLocated(averageANB));

				  driver.findElement(averageANB).sendKeys(pickup7.get("Average ANB"));

				//Discount Rate
		//       	 w.until(ExpectedConditions.visibilityOfElementLocated(discountRate));
		//       	  driver.findElement(discountRate).sendKeys(pickup7.get("Discount Rate"));

    		}

		//Select Rate
		if (pickup7.get("Select Rate").contains("Use Quote Mask"))
		{ w.until(ExpectedConditions.visibilityOfElementLocated(selectRateDropDown));
			new Select (driver.findElement(selectRateDropDown)).selectByVisibleText(pickup7.get("Select Rate")); }
		else if (pickup7.get("Select Rate").contains("Select Specific Mask")) {

			w.until(ExpectedConditions.visibilityOfElementLocated(selectRateDropDown));
			new Select (driver.findElement(selectRateDropDown)).selectByVisibleText(pickup7.get("Select Rate"));
			w.until(ExpectedConditions.elementToBeClickable(premiumMaskPopUpButton));
			driver.findElement(premiumMaskPopUpButton).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(premiumMaskTable));
			List<WebElement> premiumMaskTableElement = driver.findElements(premiumMaskTable);
			for (int mask = 0; mask < premiumMaskTableElement.size(); mask++)
			{	String everyMask = premiumMaskTableElement.get(mask).getText();
				if (everyMask.contains(pickup7.get("Premium Mask")))
				{	System.out.println(mask);
					premiumMaskTableElement.get(mask).click();
					w.until(ExpectedConditions.visibilityOfElementLocated(premiumMaskOkButton));
					driver.findElement(premiumMaskOkButton).click();
					break;}}

		}
		else if (pickup7.get("Select Rate").contains("Input Rate")) {
			w.until(ExpectedConditions.visibilityOfElementLocated(selectRateDropDown));
			new Select (driver.findElement(selectRateDropDown)).selectByVisibleText(pickup7.get("Select Rate"));
			w.until(ExpectedConditions.visibilityOfElementLocated(rateTextBox));
			driver.findElement(rateTextBox).sendKeys(pickup7.get("Rate"));
			w.until(ExpectedConditions.visibilityOfElementLocated(rateDivFactorTextBox));
			driver.findElement(rateDivFactorTextBox).sendKeys((pickup7.get("Rate Div Factor")));
		}
			}

    @Then("^User clicks save button$")
    public void user_clicks_save_button() {
        driver.findElement(coverDetailsFormSaveButton).click();
    }

    @When("^System saved record successfully\\.$")
    public void system_saved_record_successfully() throws Throwable {
    	Thread.sleep(3000);
    	//Error Exists
    	    	if (
    			driver.findElement(By.id("lmsgroup:dialog2000::ok")).isDisplayed())
			    	{
			    	driver.findElement(By.id("lmsgroup:dialog2000::ok")).click();
			    	System.out.println("Test Step Failed!!!!!!!!!!!!!!!!!!!!");
			    	driver.findElement(coverDetailsFormCancelButton).click();
		
			    	}
    	    	
    	
     //No Save Notification
    }

    @Then("^user clicks finish button$")
    public void user_clicks_finish_button() {
    	w.until(ExpectedConditions.visibilityOfElementLocated(finishBotton));
    	driver.findElement(finishBotton).click();
        
    }

  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
