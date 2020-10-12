package LoginPage;
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

public class LoginPage extends AbstractPageMethods {
	
	WebDriver driver = getDriver();
	Wait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(50)).pollingEvery(Duration.ofSeconds(5));

		
		
		
		//Page Objects.
    private By usernameField = By.id("pt1:username::content");
    private By passwordField = By.id("pt1:password::content");
    private By loginButton = By.id("pt1:loginButton");

    @Given("^User (?:is on|navigates to|launches) (http.*)$")
	public void user_is_on_http_LMSGroup(String url) throws Throwable {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.id("pt1:username::content")).isDisplayed());
	}


    @When("^User inputs valid username (.*) and password (.*)")
    public void inputUsername(String username, String password) throws InterruptedException
    {
    	

        //wait for the element to be available
        w.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
    	driver.findElement(usernameField).sendKeys(username);
    
 
        //Wait for the element to be available
        w.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
    	driver.findElement(passwordField).sendKeys(password);
  
   
        //Wait for the element to be available
    	Thread.sleep(15000);
        w.until(ExpectedConditions.elementToBeClickable(loginButton));
    	driver.findElement(loginButton).click();
    }

    
    
    
    
   

   

    

   


    


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
