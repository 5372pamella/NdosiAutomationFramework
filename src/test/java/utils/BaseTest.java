
package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import pages.*;

public class BaseTest {

    protected WebDriver driver;

    public HomePage homepage;
    public LoginPage loginpage;
    public DashboardPage dashboardpage;
    public AdminPage adminpage;
    public GroupPage grouppage;

    @BeforeMethod
    public void setUp() {
        driver = BrowserFactory.startBrowser(
                "https://ndosisimplifiedautomation.vercel.app/"
        );

        homepage = new HomePage(driver);
        loginpage = new LoginPage(driver);
        dashboardpage = new DashboardPage(driver);
        adminpage = new AdminPage(driver);
        grouppage = new GroupPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
