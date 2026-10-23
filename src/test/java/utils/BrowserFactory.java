
package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {

    public static WebDriver startBrowser(String url) {

        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }
}
