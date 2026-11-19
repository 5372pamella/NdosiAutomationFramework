package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;
import org.testng.annotations.Listeners;
import listeners.TestListener;
import reports.ExtentReportManager;

@Listeners(TestListener.class)
public class NdosiNegativeTest extends BaseTest {
    @Test
    public void loginWithInvalidPasswordTest(){

        ExtentReportManager.getTest().info("Checking if Ndosi website is loaded");
        homepage.checkIfNdosiWebsiteIsLoaded();

        ExtentReportManager.getTest().info("Clicking the Home Login button");
        homepage.clickHomeLoginButton();

        ExtentReportManager.getTest().info("Entering valid email address");
        loginpage.enterUsername("admin@gmail.com");

        ExtentReportManager.getTest().info("Entering invalid password");
        loginpage.enterPassword("@hjgjhh");

        ExtentReportManager.getTest().info("Clicking the Login button");
        loginpage.clickLoginButton();

        String invalidLoginMessage = loginpage.getInvalidLoginMessage();
        loginpage.acceptAlert();
        Assert.assertEquals(invalidLoginMessage, "Invalid email or password"
                ,"The expected error message was not displayed");
    }

    @Test
    public void loginWithInvalidEmailTest(){

        ExtentReportManager.getTest().info("Checking if Ndosi website is loaded");
        homepage.checkIfNdosiWebsiteIsLoaded();

        ExtentReportManager.getTest().info("Clicking the Home Login button");
        homepage.clickHomeLoginButton();

        ExtentReportManager.getTest().info("Entering invalid email ");
        loginpage.enterUsername("min@gmail.com");

        ExtentReportManager.getTest().info("Entering valid password");
        loginpage.enterPassword("@12345678");

        ExtentReportManager.getTest().info("Clicking the Login button");
        loginpage.clickLoginButton();

        String invalidLoginMessage = loginpage.getInvalidLoginMessage();
        loginpage.acceptAlert();
        Assert.assertEquals(invalidLoginMessage, "Invalid email or password"
                ,"The expected error message was not displayed");
    }

}
