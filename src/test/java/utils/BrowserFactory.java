package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserFactory {

    public static WebDriver startBrowser(String url) {

        EdgeOptions options = new EdgeOptions();

        WebDriver driver = new EdgeDriver(options);

        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }
}