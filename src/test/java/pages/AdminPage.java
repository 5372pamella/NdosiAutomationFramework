
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {

    WebDriver driver;

    By groups_xpath =
            By.xpath("//*[@id='app-root']/div/div[2]/nav/button[4]");

    By createANewGroup_xpath =
            By.xpath("//*[@id='app-root']/div/div[3]/div/div[2]/button");

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickGroupsButton() {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(groups_xpath))
                .click();
    }

    public void clickCreateANewGroupButton() {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(createANewGroup_xpath))
                .click();
    }
}
