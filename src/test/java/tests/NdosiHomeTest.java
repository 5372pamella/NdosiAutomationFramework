package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.BaseTest;



public class NdosiHomeTest extends BaseTest {
    WebDriver driver;

    @Test
    public void loginTest() {
        homepage.checkIfNdosiWebsiteIsLoaded();
        homepage.clickHomeLoginButton();
        loginpage.enterUsername("admin@gmail.com");
        loginpage.enterPassword("@12345678");
        loginpage.clickLoginButton();
        dashboardpage.verifyLoginWasSuccessful();
        dashboardpage.clickMenu();
        dashboardpage.clickAdminPanel();
        admindashboardpage.clickGroupsButton();
        admindashboardpage.clickCreateANewGroupButton();
    }
}
