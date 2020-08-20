package FBNIGroup.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;
import xyz.ronella.logging.LoggerPlus;

/**
 * Created by Dennis on 19/08/2020.
 */

public class LoginPage {
    private final static LoggerPlus LOGGER_PLUS = new LoggerPlus(LoggerFactory.getLogger(LoginPage.class));
    private WebDriver webDriver;

    //Page Objects.
    private By usernameField = By.xpath("//input[@id='pt1:username::content']");
    private By passwordField = By.xpath("//input[@id='pt1:password::content']");
    private By loginButton = By.xpath("//button[@id='pt1:loginButton']");

    public LoginPage(WebDriver driver)
    {
        this.webDriver=driver;
    }

    public void inputUsername()
    {
        //Log the Process
        LOGGER_PLUS.info("Login with the following username");
        //wait for the element to be available
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        webDriver.findElement(usernameField).sendKeys();
    }

    public void inputPassword()
    {
        //Log the process
        LOGGER_PLUS.info("Login with the following Password");
        //Wait for the element to be available
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        webDriver.findElement(passwordField).sendKeys();
    }
    public void clickLoginButton()
    {
        //Log the Process
        LOGGER_PLUS.info("Clicking the Login Button");
        //Wait for the element to be available
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        webDriver.findElement(loginButton).click();
    }


}
