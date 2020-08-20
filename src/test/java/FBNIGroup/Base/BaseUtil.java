package FBNIGroup.Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dennis on 19/08/2020.
 */

public class BaseUtil {

    public static WebDriver webDriver;
    public ExtentReports extent;
    public static ExtentTest scenarioDef;
    public static ExtentTest features;
    public  static String reportLocation="C:\\Users\\denni\\report";

}
