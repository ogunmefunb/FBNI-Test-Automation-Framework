package QuoteMembersPage;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import QuotationTransactionPage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import FBNIGroup.Base.AbstractPageMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



/**
 * Created by Ben
 */

public class QuoteMembersPage extends AbstractPageMethods {
	
	WebDriver driver = getDriver();
//	QuotationTransactionSpecification productUnderTest = getProductUnderTest();
	Wait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofSeconds(2));


		//Page Objects.
    private By quoteMembersImportTemplateButton = By.id("lmsgroup:cb62");
    private By quoteMembersChooseFileFileLocation = By.id("lmsgroup:if1::content");
    private By quoteMemberDownloadTemplateLink = By.id("lmsgroup:cl1");
    private By quoteMemberAddMemberToQuoteButton = By.id("lmsgroup:commandButton32");
    private By quoteMemberAddMemberSuccessfulOkButton = By.id("d29::msgDlg::cancel");
    private By quoteMemberBackToMemberButton = By.id("lmsgroup:commandButton61");
    private By quoteMembersAddMembersManually = By.id("lmsgroup:cb61");
    private By quoteMembersPage = By.xpath("//*[@id=\"lmsgroup:ol63\"]/label");
    private By membersPayrollOrMemberNoTextBox = By.id("lmsgroup:it51::content");
    private By membersSurnameTextBox = By.id("lmsgroup:it52::content");
    private By membersOtherNamesTextBox = By.id("lmsgroup:it53::content");
    private By membersDateOfBirth = By.id("lmsgroup:id3::content");
    private By membersCategoryPopUpButton = By.id("lmsgroup:cb73");
    private By membersCategoryTable = By.xpath("//*[@id=\"lmsgroup:t15::db\"]/table/tbody/tr/td/span");
    private By membersCategoryOkayButton = By.id("lmsgroup:cb74");
    private By membersOccupationPopUpButton = By.id("lmsgroup:cb76");
    private By membersOccupationTable = By.xpath("//*[@id=\"lmsgroup:t24::db\"]/table/tbody/tr/td");
    private By membersOccupationOkayButton = By.id("lmsgroup:cb77");
    private By membersSexDropDownButton = By.id("lmsgroup:soc13::content");
    private By membersMonthlyEarningsTextBox = By.id("lmsgroup:ins4::content");
    private By membersMonthlyEarnPeriodsTextBox = By.id("lmsgroup:it66::content");
    private By membersJoiningDateTextBox = By.id("lmsgroup:id5::content");
    private By membersSaveMemberButton = By.id("lmsgroup:cb79");
    private By membersSavedMemberOkBotton = By.id("d29::msgDlg::cancel");
    private By membersBackToMemberPageButton = By.id("lmsgroup:cb81");




    @Then("User Clicks Import Template")
    public void user_Clicks_Import_Template() {
    	w.until(ExpectedConditions.elementToBeClickable(quoteMembersImportTemplateButton));
     driver.findElement(quoteMembersImportTemplateButton).click();
    }

    @Then("User Clicks Download Template")
    public void user_Clicks_Download_Template() {
    	w.until(ExpectedConditions.elementToBeClickable(quoteMemberDownloadTemplateLink));
        driver.findElement(quoteMemberDownloadTemplateLink).click();

    }

    @Then("User clicks choose file to upload")
    public void user_clicks_choose_file_to_upload() {
    	w.until(ExpectedConditions.visibilityOfElementLocated(quoteMembersChooseFileFileLocation));
       driver.findElement(quoteMembersChooseFileFileLocation).sendKeys("C:\\Users\\TezzaSolutions\\Desktop\\FBNI\\FBNI-Test-Auto\\Resources\\Template.csv");
    }

    @Then("User clicks Add Members to Quote")
    public void user_clicks_Add_Members_to_Quote() {
    	w.until(ExpectedConditions.elementToBeClickable(quoteMemberAddMemberToQuoteButton));
       driver.findElement(quoteMemberAddMemberToQuoteButton).click();
    }

    @Then("Members successfully imported")
    public void members_successfully_imported() {
    	w.until(ExpectedConditions.elementToBeClickable(quoteMemberAddMemberSuccessfulOkButton));
       driver.findElement(quoteMemberAddMemberSuccessfulOkButton).click();
    }

    @When("user clicks Back to Members")
    public void user_clicks_Back_to_Members() {
    	w.until(ExpectedConditions.elementToBeClickable(quoteMemberBackToMemberButton));
       driver.findElement(quoteMemberBackToMemberButton).click();
    }

	
	@When("System Displays Quotation Members Page")
	public void system_Displays_Quotation_Members_Page() {
    	w.until(ExpectedConditions.visibilityOfElementLocated(quoteMembersPage));
    	Assert.assertTrue(driver.findElement(quoteMembersPage).isDisplayed());
	}
	
	@Then("User clicks add button to manually add quotation members")
	public void user_clicks_add_button_to_manually_add_quotation_members() {
		w.until(ExpectedConditions.elementToBeClickable(quoteMembersAddMembersManually));
		   driver.findElement(quoteMembersAddMembersManually).click();
	}
	
	@Then("User inputs member details as specified below:")
	public void user_inputs_member_details_as_specified_below(DataTable arg15) throws InterruptedException {
		Map<String, String> pickup15 = arg15.asMap(String.class, String.class);

//    	Payroll or Mem No.
		w.until(ExpectedConditions.visibilityOfElementLocated(membersPayrollOrMemberNoTextBox));
		driver.findElement(membersPayrollOrMemberNoTextBox).sendKeys(pickup15.get("Payroll or Mem No"));

//    	Surname
		w.until(ExpectedConditions.visibilityOfElementLocated(membersSurnameTextBox));
		driver.findElement(membersSurnameTextBox).sendKeys(pickup15.get("Surname"));

//    	Other Names
		w.until(ExpectedConditions.visibilityOfElementLocated(membersOtherNamesTextBox));
		driver.findElement(membersOtherNamesTextBox).sendKeys(pickup15.get("Other Names"));

//    	Category pop up box
		w.until(ExpectedConditions.elementToBeClickable(membersCategoryPopUpButton));
		driver.findElement(membersCategoryPopUpButton).click();
		List<WebElement> CategoryTableElement = driver.findElements(membersCategoryTable);
		for (int ctgry = 0; ctgry < CategoryTableElement.size(); ctgry++) {
			String everyctgry = CategoryTableElement.get(ctgry).getText();
			if (everyctgry.contains(pickup15.get("Category"))) {
				System.out.println(ctgry);
				CategoryTableElement.get(ctgry).click();
				w.until(ExpectedConditions.elementToBeClickable(membersCategoryOkayButton));
				driver.findElement(membersCategoryOkayButton).click();
				break;
			}
		}

//    	Occupation pop up box	
		w.until(ExpectedConditions.elementToBeClickable(membersOccupationPopUpButton));
		driver.findElement(membersOccupationPopUpButton).click();
		List<WebElement> occupationTableElement = driver.findElements(membersOccupationTable);
		for (int occp = 0; occp < occupationTableElement.size(); occp++) {
			String everyoccp = occupationTableElement.get(occp).getText();
			if (everyoccp.contains(pickup15.get("Occupation"))) {
				System.out.println(occp);
				occupationTableElement.get(occp).click();
				w.until(ExpectedConditions.elementToBeClickable(membersOccupationOkayButton));
				driver.findElement(membersOccupationOkayButton).click();
				break;
			}
		}

//    	Sex
		w.until(ExpectedConditions.elementToBeClickable(membersSexDropDownButton));
		new Select(driver.findElement(membersSexDropDownButton)).selectByVisibleText(pickup15.get("Sex"));

//    	Monthly Earnings
		w.until(ExpectedConditions.visibilityOfElementLocated(membersMonthlyEarningsTextBox));
		driver.findElement(membersMonthlyEarningsTextBox).sendKeys(pickup15.get("Monthly Earnings"));

//    	Monthly Earn Periods
		w.until(ExpectedConditions.visibilityOfElementLocated(membersMonthlyEarnPeriodsTextBox));
		driver.findElement(membersMonthlyEarnPeriodsTextBox).sendKeys(pickup15.get("Monthly Earn Periods"));

//    	Joining Date
		w.until(ExpectedConditions.visibilityOfElementLocated(membersJoiningDateTextBox));
		driver.findElement(membersJoiningDateTextBox).sendKeys(pickup15.get("Joining Date"));
		Thread.sleep(5000);

//		try{
//			w.until(ExpectedConditions.visibilityOfElementLocated(By.id("lmsgroup:id4::content")));
//			driver.findElement(By.id("lmsgroup:id4::content")).sendKeys(pickup15.get("Loan Date"));
//			w.until(ExpectedConditions.visibilityOfElementLocated(By.id("lmsgroup:it65::content")));
//			driver.findElement(By.id("lmsgroup:it65::content")).sendKeys(pickup15.get("Loan Int"));
//			w.until(ExpectedConditions.visibilityOfElementLocated(By.id("lmsgroup:it64::content")));
//			driver.findElement(By.id("lmsgroup:it64::content")).sendKeys(pickup15.get("Original Repayment Period"));
//		}	catch(org.openqa.selenium.remote.UnreachableBrowserException e)
//			{
//				w.until(ExpectedConditions.visibilityOfElementLocated(membersDateOfBirth));
//				driver.findElement(membersDateOfBirth).sendKeys(pickup15.get("Date of Birth"));
//			}
//		if (driver.findElement(By.id("lmsgroup:id4::content")).isDisplayed()) {
//			driver.findElement(By.id("lmsgroup:id4::content")).sendKeys(pickup15.get("Loan Date"));
//		} else{}
//		if (driver.findElement(By.id("lmsgroup:it65::content")).isDisplayed()){
//			driver.findElement(By.id("lmsgroup:it65::content")).sendKeys(pickup15.get("Loan Int"));
//		}
//		if (driver.findElement(By.id("lmsgroup:it64::content")).isDisplayed()){
//			driver.findElement(By.id("lmsgroup:it64::content")).sendKeys(pickup15.get("Original Repayment Period"));
//		}

		if (productUnderTest.equals("CREDIT LIFE ASSURANCE")){
			driver.findElement(By.id("lmsgroup:id4::content")).sendKeys(pickup15.get("Loan Date"));
			driver.findElement(By.id("lmsgroup:it64::content")).sendKeys(pickup15.get("Original Repayment Period"));
			driver.findElement(By.id("lmsgroup:it65::content")).sendKeys(pickup15.get("Loan Int"));

		}



		//    	Date of Birth
		w.until(ExpectedConditions.visibilityOfElementLocated(membersDateOfBirth));
		driver.findElement(membersDateOfBirth).sendKeys(pickup15.get("Date of Birth"));

	}
	@Then("user clicks Save Member button")
	public void user_clicks_Save_Member_button() {
    	w.until(ExpectedConditions.elementToBeClickable(membersSaveMemberButton));
	   driver.findElement(membersSaveMemberButton).click();
	}


	@Then("System throws error: The date is not in the correct format.")
	public void system_throws_error_The_date_is_not_in_the_correct_format() throws InterruptedException {
		Thread.sleep(2000);
    	Assert.assertTrue(driver.findElement(By.cssSelector(".AFNoteWindowHintText > div")).isDisplayed());
	}

	@Then("User inputs date of birth in the right format as stated below:")
	public void user_inputs_date_of_birth_in_the_right_format_as_stated_below(DataTable arg16) {
		Map<String, String> pickup16 = arg16.asMap(String.class, String.class);

//		Date of Birth
		w.until(ExpectedConditions.visibilityOfElementLocated(membersDateOfBirth));
		driver.findElement(membersDateOfBirth).clear();
		driver.findElement(membersDateOfBirth).sendKeys(pickup16.get("Date of Birth"));
	}

	@When("System displays success notification")
	public void system_displays_success_notification() {
    	w.until(ExpectedConditions.elementToBeClickable(membersSavedMemberOkBotton));
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\'x15j\']")).getText().contains("Member Added"));
	}

	@Then("User clicks Ok to confirm member addition")
	public void user_clicks_Ok_to_confirm_member_addition() {
    	w.until(ExpectedConditions.elementToBeClickable(membersSavedMemberOkBotton));
		driver.findElement(membersSavedMemberOkBotton).click();
	}

	@Then("user clicks back to Member button")
	public void user_clicks_back_to_Member_button() {
    	w.until(ExpectedConditions.elementToBeClickable(membersBackToMemberPageButton));
	   driver.findElement(membersBackToMemberPageButton).click();
	}
	


    
    
    
    
    
    
    
    
    
    
    
    

}
