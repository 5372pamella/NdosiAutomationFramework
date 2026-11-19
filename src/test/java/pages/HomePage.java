package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By homePageHeading =
            By.xpath("//div[@class='nav-items']/button/span[contains(text(),'Home')]");

    private By mainLoginButton =
            By.xpath("//div[@class='nav-user-section']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void checkIfNdosiWebsiteIsLoaded() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePageHeading));
    }

    public void clickHomeLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(mainLoginButton)).click();
    }
}
