package FBNIGroup.Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

/**
 * Created by Dennis on 19/08/2020.
 */

public class BaseTest {

    public static WebDriver webDriver;
    public ExtentReports extent;
    public static ExtentTest scenarioDef;
    public static ExtentTest features;
    public  static String reportLocation="C:\\Users\\denni\\report";
    protected AppLib appLib=new AppLib();
    protected  String baseUrl;
    protected String environment;

   @BeforeClass
    public void SetUpApplication()
    {
        baseUrl = appLib.getHomePageLink(environment);
        Reporter.log("---Browser Session started----", true);
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("");
        Reporter.log("-----Application Started----", true);
    }

    @AfterClass
    public  void CloseApplication()
    {
        webDriver.quit();
        Reporter.log("-----Browser session has ended----");
    }


}
