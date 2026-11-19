
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By groupsButton =
            By.xpath("//*[@id='app-root']/div/div[2]/nav/button[4]");

    private By createNewGroupButton =
            By.xpath("//*[@id='app-root']/div/div[3]/div/div[2]/button");

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void clickGroupsButton() {
        wait.until(ExpectedConditions.elementToBeClickable(groupsButton)).click();
    }

    public void clickCreateANewGroupButton() {
        wait.until(ExpectedConditions.elementToBeClickable(createNewGroupButton)).click();
    }
}
