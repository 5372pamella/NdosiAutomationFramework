
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By dashboardHeader =
            By.xpath("//span[contains(text(),'Welcome')]");

    private By menuButton =
            By.xpath("//span[contains(text(),'Menu')]");

    private By adminPanelButton =
            By.xpath("//*[@id='app-root']/nav/div[1]/div[3]/div/div/button[4]");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void verifyLoginWasSuccessful() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardHeader));
    }

    public void clickMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(menuButton)).click();
    }

    public void clickAdminPanel() {
        wait.until(ExpectedConditions.elementToBeClickable(adminPanelButton)).click();
    }
}
