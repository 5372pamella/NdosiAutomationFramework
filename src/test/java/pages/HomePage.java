
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    By verifyHomePageContent_xpath =
            By.xpath("//div[@class='nav-items']/button/span[contains(text(),'Home')]");

    By mainLoginButton_xpath =
            By.xpath("//div[@class='nav-user-section']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkIfNdosiWebsiteIsLoaded() {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(
                        verifyHomePageContent_xpath));
    }

    public void clickHomeLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(
                        mainLoginButton_xpath))
                .click();
    }
}
