package QuotationSubDivision;
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
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



/**
 * Created by Ben
 */

public class QuotationSubDivisionPage extends AbstractPageMethods {
	
	WebDriver driver = getDriver();
	Wait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2));

		
		
		
		//Page Objects.
    private By addQuotationSubDivisionButton = By.id("lmsgroup:commandButton82");
    private By quoteSubDivisionShortDescriptionTextBox = By.id("lmsgroup:it107::content");
    private By quoteSubDivisionDescriptionTextBox = By.id("lmsgroup:inputText44::content");
    private By quoteSubDivisionPostalAddressTextBox = By.id("lmsgroup:it133::content");
    private By quoteSubDivisionSaveButton = By.id("lmsgroup:cb125");
    private By quoteSubDivisionSuccessMessageOkButton = By.id("d29::msgDlg::cancel");
//    private By loginButton = By.id("loginButton");
//    

    
    
    @Then("User Inputs Quotation Subdivision")
    public void user_Inputs_Quotation_Subdivision(DataTable arg10) {
    	Map<String, String> pickup10 = arg10.asMap(String.class, String.class);
    	w.until(ExpectedConditions.elementToBeClickable(addQuotationSubDivisionButton));
    	driver.findElement(addQuotationSubDivisionButton).click();
    	w.until(ExpectedConditions.visibilityOfElementLocated(quoteSubDivisionShortDescriptionTextBox));
    	driver.findElement(quoteSubDivisionShortDescriptionTextBox).sendKeys(pickup10.get("Short Desc"));
    	w.until(ExpectedConditions.visibilityOfElementLocated(quoteSubDivisionDescriptionTextBox));
    	driver.findElement(quoteSubDivisionDescriptionTextBox).sendKeys(pickup10.get("Description"));
    	w.until(ExpectedConditions.visibilityOfElementLocated(quoteSubDivisionPostalAddressTextBox));
    	driver.findElement(quoteSubDivisionPostalAddressTextBox).sendKeys(pickup10.get("Postal Address"));
    	w.until(ExpectedConditions.elementToBeClickable(quoteSubDivisionSaveButton));
    	driver.findElement(quoteSubDivisionSaveButton).click();
    	w.until(ExpectedConditions.elementToBeClickable(quoteSubDivisionSuccessMessageOkButton));
    	driver.findElement(quoteSubDivisionSuccessMessageOkButton).click();

    }
    
    
    @Then("User Inputs Cover type provision")
    public void user_Inputs_Cover_type_provision() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    
    
    
    
    
    
    
    
    
    

}
