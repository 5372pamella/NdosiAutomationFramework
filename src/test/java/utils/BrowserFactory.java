package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserFactory {

    public static WebDriver startBrowser(String url) {

        EdgeOptions options = new EdgeOptions();
        if ("true".equalsIgnoreCase(System.getenv("CI"))) {
            options.addArguments("--headless=new");
        }

        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new EdgeDriver(options);

        driver.get(url);

        return driver;
    }
}
