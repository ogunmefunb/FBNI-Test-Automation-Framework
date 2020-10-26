package DependentLimit;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import FBNIGroup.Base.AbstractPageMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DependentLimitPage extends AbstractPageMethods {
	
	WebDriver driver = getDriver();
	Wait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5));

	
	
	By dependentLimitAddButton = By.id("lmsgroup:cb38");
	By dependentLimitCoverTypeDropDown = By.id("lmsgroup:soc26::content");
	By dependentLimitDependentTypeDropDown = By.id("lmsgroup:soc27::content");
	By dependentLimitMainCoverOrRiderDropDown = By.id("lmsgroup:soc37::content");
	By dependentLimitPercentageOfMainPerYrSATextBox = By.id("lmsgroup:it123::content");
	By dependentLimitSaveButton = By.id("lmsgroup:cb45");


	
	
	
	
	@When("User Click on add button for dependent type")
	public void user_Click_on_add_button_for_dependent_type() {
    	 w.until(ExpectedConditions.elementToBeClickable(dependentLimitAddButton));
	  driver.findElement(dependentLimitAddButton).click();
	}

	@When("User provides Dependant limit information as stated below:")
	public void user_provides_Dependant_limit_information_as_stated_below(DataTable arg11) {
		Map<String, String> pickup11 = arg11.asMap(String.class, String.class);

		
//		    Cover Type
    	 w.until(ExpectedConditions.elementToBeClickable(dependentLimitCoverTypeDropDown));
   		new Select (driver.findElement(dependentLimitCoverTypeDropDown)).selectByVisibleText(pickup11.get("Cover Type")); 
   		
//   		Dependent Type
    	 w.until(ExpectedConditions.elementToBeClickable(dependentLimitDependentTypeDropDown));
   		new Select (driver.findElement(dependentLimitDependentTypeDropDown)).selectByVisibleText(pickup11.get("Dependent Type")); 

//   		Main Cover/Rider
    	 w.until(ExpectedConditions.elementToBeClickable(dependentLimitMainCoverOrRiderDropDown));
   		new Select (driver.findElement(dependentLimitMainCoverOrRiderDropDown)).selectByVisibleText(pickup11.get("Main Cover/Rider")); 
   					if (pickup11.get("Main Cover/Rider").equals("Rider (% of Main Cover)") || pickup11.get("Main Cover/Rider").equals("Rider (% of Yr Earnings)")) {
   			 			w.until(ExpectedConditions.visibilityOfElementLocated(dependentLimitPercentageOfMainPerYrSATextBox));
   			 			driver.findElement(dependentLimitPercentageOfMainPerYrSATextBox).sendKeys(pickup11.get("% of Main/Yr SA"));
   					}
	}

	@When("User Clicks Save")
	public void user_Clicks_Save() {
    	 w.until(ExpectedConditions.elementToBeClickable(dependentLimitSaveButton));
	  driver.findElement(dependentLimitSaveButton).click();
	}


	
}
