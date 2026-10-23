
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    WebDriver driver;

    By dashboardHeader_xpath =
            By.xpath("//span[contains(text(),'Welcome')]");

    By menu_xpath =
            By.xpath("//span[contains(text(),'Menu')]");

    By adminPanel_xpath =
            By.xpath("//*[@id='app-root']/nav/div[1]/div[3]/div/div/button[4]");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoginWasSuccessful() {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(
                        dashboardHeader_xpath));
    }

    public void clickMenu() {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(menu_xpath))
                .click();
    }

    public void clickAdminPanel() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(adminPanel_xpath))
                .click();
    }
}
