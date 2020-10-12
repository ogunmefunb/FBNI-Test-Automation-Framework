package QuotationEnquiry;


import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class QuotationEnquiryPage extends AbstractPageMethods {
	
	WebDriver driver = getDriver();
	Wait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

	
	

	By productsLOV = By.id("lmsgroup:cb1");
	By productLovOkayButton = By.id("lmsgroup:cb2");
	By productTable = By.xpath("//*[@id=\"lmsgroup:t1::db\"]/table/tbody/tr/td[2]/span");
	By clientLOV = By.id("lmsgroup:commandButton2");
	By clientLovTable = By.xpath("//*[@id=\"lmsgroup:t2::db\"]/table/tbody/tr/td[1]");
	By clientLovOkayButton = By.id("lmsgroup:commandButton3");
	By agentLOV = By.id("lmsgroup:commandButton5");
	By agentLovTable = By.xpath("//*[@id=\"lmsgroup:t3::db\"]/table/tbody/tr/td[1]/span");
	By agentLovOkayButton = By.id("lmsgroup:commandButton6");
	By branchLOV = By.id("lmsgroup:commandButton8");
	By branchLovTable = By.xpath("//*[@id=\"lmsgroup:t4::db\"]/table/tbody/tr/td");
	By branchLovOkayButton = By.id("lmsgroup:commandButton9");
	By statusDroDown = By.id("lmsgroup:soc1::content");
	By dateFromTextBox = By.id("lmsgroup:id1::content");
	By dateToTextBox = By.id("lmsgroup:inputDate1::content");
	By quotationEnquiryPage = By.xpath("//*[@id=\"lmsgroup:ol1\"]/label");
	By quotationEnquirySearchButton = By.id("lmsgroup:commandButton11");
	By viewSearchedResult = By.id("lmsgroup:t5:1:commandLink1");

	
	@When("System displays Select A Quotation Enquiry Screen")
	public void system_displays_Select_A_Quotation_Enquiry_Screen() {
	    Assert.assertTrue(driver.findElement(quotationEnquiryPage).isDisplayed());}

    @Then("User provides quotation Enquiry details as specified below:")
    public void user_provides_quotation_Enquiry_details_as_specified_below(DataTable arg13) throws InterruptedException {
    	Map<String, String> pickup13 = arg13.asMap(String.class, String.class);
   			
 //	Product Name
		driver.findElement(productsLOV).click();
		Thread.sleep(3000);
		List<WebElement> productTableElement =  driver.findElements(productTable);
		for (int pdct = 0; pdct <= productTableElement.size(); pdct++)	
		{	String Prdct = productTableElement.get(pdct).getText();
		if (Prdct.contains(pickup13.get("Product Name"))) 
		{	System.out.println(Prdct);
		productTableElement.get(pdct).click();
		driver.findElement(productLovOkayButton).click();
		break;}}
    					
		
//	Client
//	  //wait for the element to be available
//	    w.until(ExpectedConditions.elementToBeClickable((clientLOV)));
//	    driver.findElement(clientLOV).click();
//		Thread.sleep(3000);
//		List<WebElement> clientTableElement = (List<WebElement>) driver.findElements(clientLovTable);
//		Thread.sleep(2000);
//		for (int clnt = 0; clnt < clientTableElement.size(); clnt++)
//		{	String allClient = clientTableElement.get(clnt).getText();
//		if (allClient.contains(pickup13.get("Client"))) 
//		{	System.out.println(allClient);
//		clientTableElement.get(clnt).click();
//		driver.findElement(clientLovOkayButton).click();
//		break;}}
					
//	Agent
		//wait for the element to be available
	    w.until(ExpectedConditions.elementToBeClickable((agentLOV)));
	    driver.findElement(agentLOV).click();
		Thread.sleep(3000);
		List<WebElement> agentTableElement =  driver.findElements(agentLovTable);
		Thread.sleep(1000);
		for (WebElement webElement : agentTableElement) {
			String allAgent = webElement.getText();
			if (allAgent.contains(pickup13.get("Agent"))) {
				System.out.println(allAgent);
				webElement.click();
				driver.findElement(agentLovOkayButton).click();
				break;
			}
		}
		
//	Branch
		//wait for the element to be available
	    w.until(ExpectedConditions.elementToBeClickable((branchLOV)));
	    driver.findElement(branchLOV).click();
		List<WebElement> branchTableElement =  driver.findElements(branchLovTable);
		for (WebElement webElement : branchTableElement) {
			String allBranch = webElement.getText();
			if (allBranch.contains(pickup13.get("Branch"))) {
				System.out.println(allBranch);
				webElement.click();
				driver.findElement(branchLovOkayButton).click();
				break;
			}
		}
		
//	Status
		//wait for the element to be available
	    w.until(ExpectedConditions.visibilityOfElementLocated(statusDroDown));
	    new Select (driver.findElement(statusDroDown)).selectByVisibleText(pickup13.get("Status"));
//    				    
 //	Date From
	  //wait for the element to be available
	    w.until(ExpectedConditions.visibilityOfElementLocated(dateFromTextBox));
	    driver.findElement(dateFromTextBox).sendKeys(pickup13.get("Date From"));
//	Date To
	  //wait for the element to be available
	    w.until(ExpectedConditions.visibilityOfElementLocated(dateToTextBox));
	    driver.findElement(dateToTextBox).sendKeys(pickup13.get("Date To"));
    	
    }
    @Then("User Clicks on the Search button")
    public void user_Clicks_on_the_Search_button() {
	    w.until(ExpectedConditions.elementToBeClickable((quotationEnquirySearchButton)));
        driver.findElement(quotationEnquirySearchButton).click();
        
    }
	
		
	@Then("User select the Quotation at Quotation Tickets and clicks View")
	public void user_select_the_Quotation_at_Quotation_Tickets_and_clicks_View() {
	    w.until(ExpectedConditions.elementToBeClickable((viewSearchedResult)));
	   driver.findElement(viewSearchedResult).click();
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
