package CategoryManagement;

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

public class CategoryPage extends AbstractPageMethods {
	
	WebDriver driver = getDriver();
	Wait<WebDriver> w = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2));

	
	By categoryDescriptionCollapseButton = By.id("lmsgroup:pb19::_afrDscl");
	By addNewCategoryButton = By.xpath("//*[@id=\"lmsgroup:cb33\"]");
	By premiumMaskField = By.xpath("//*[@id=\"lmsgroup:inputText43::content\"]");
	By shortDescTextBox = By.xpath("//*[@id=\"lmsgroup:it97::content\"]");
	By descriptionTextBox = By.xpath("//*[@id=\"lmsgroup:inputText26::content\"]");
	By multipleOfYearsTextBox = By.xpath("//*[@id=\"lmsgroup:inputText27::content\"]");
	By categoryDetailsSaveButton = By.id("lmsgroup:cb121");
	By createdCategoryDescription = By.xpath("//*[@id=\"lmsgroup:t32::db\"]/table/tbody/tr/td/div/span[2]");
	By dependentTypeLimitCategory = By.xpath("//*[@id=\"lmsgroup:t11::db\"]/table/tbody/tr/td[3]/span");
	By deleteCreatedCategory = By.id("lmsgroup:cb37");

	
	
@Then("System displays Categories Description screen")
public void system_displays_Categories_Description_screen() {
	 w.until(ExpectedConditions.elementToBeClickable(categoryDescriptionCollapseButton));
    Assert.assertTrue(driver.findElement(categoryDescriptionCollapseButton).isDisplayed());
}

@When("User Clicks New on categories Details screen")
public void user_Clicks_New_on_categories_Details_screen() {
	 w.until(ExpectedConditions.elementToBeClickable(addNewCategoryButton));
    driver.findElement(addNewCategoryButton).click();
}

@Then("System Populates the premium mask field")
public void system_Populates_the_premium_mask_field() {
	 w.until(ExpectedConditions.visibilityOfElementLocated(premiumMaskField));
    Assert.assertNotNull(driver.findElement(premiumMaskField));
}

@When("User inputs category details as specified below:")
public void user_inputs_category_details_as_specified_below(DataTable arg9) {
	Map<String, String> pickup9 = arg9.asMap(String.class, String.class);
	
//	Add Short Description
	w.until(ExpectedConditions.visibilityOfElementLocated(shortDescTextBox));
	driver.findElement(shortDescTextBox).sendKeys(pickup9.get("Short Desc"));
	
//	Description
	w.until(ExpectedConditions.visibilityOfElementLocated(descriptionTextBox));
	driver.findElement(descriptionTextBox).sendKeys(pickup9.get("Description"));
	
//	Multiple Of Earnings
	w.until(ExpectedConditions.visibilityOfElementLocated(multipleOfYearsTextBox));
	driver.findElement(multipleOfYearsTextBox).sendKeys(pickup9.get("Multiple of earnings"));

}

@When("User clicks Save button")
public void user_clicks_Save_button() {
    driver.findElement(categoryDetailsSaveButton).click();
}

@When("User highlights the Categories description")
public void user_highlights_the_Categories_description() {
	 w.until(ExpectedConditions.elementToBeClickable(createdCategoryDescription));
  driver.findElement(createdCategoryDescription).click();
}

@When("dependant type limit populates")
public void dependant_type_limit_populates() {
	w.until(ExpectedConditions.visibilityOfElementLocated(dependentTypeLimitCategory));
Assert.assertTrue(driver.findElement(dependentTypeLimitCategory).isDisplayed());
}

@When("User Clicks Delete button")
public void user_Clicks_Delete_Button() {
	 w.until(ExpectedConditions.elementToBeClickable(deleteCreatedCategory));
  driver.findElement(deleteCreatedCategory).click();
}

@Then("System Deletes Category Successfully")
public void system_Deletes_Category_Successfully(){
	Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"lmsgroup:t32::db\"]/table/tbody/tr/td/div/span[2]")).isDisplayed());

}




	
}
