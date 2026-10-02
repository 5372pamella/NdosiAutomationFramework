package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTest {
   protected WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();

    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
