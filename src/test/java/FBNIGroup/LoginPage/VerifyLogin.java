package FBNIGroup.LoginPage;

import FBNIGroup.Base.AppLib;
import FBNIGroup.Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dennis on 19/08/2020.
 */

public class VerifyLogin extends BaseTest {
protected AppLib appLib = new AppLib();
WebDriver webDriver;
protected LoginPage loginPage;

    @Test
    public void validLogin()
    {
        webDriver.navigate().to(baseUrl);
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();

    }
}
