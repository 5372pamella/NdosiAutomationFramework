package utils;
import org.openqa.selenium.WebDriver;
import pages.AdminDashboardPage;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest {
    public static final WebDriver driver = BrowserFactory.startBrowser("chrome","https://ndosisimplifiedautomation.vercel.app");
    public HomePage homepage = new HomePage(driver);
    public LoginPage loginpage = new LoginPage(driver);
    public DashboardPage dashboardpage = new DashboardPage(driver);
    public AdminDashboardPage admindashboardpage = new AdminDashboardPage(driver);


}


