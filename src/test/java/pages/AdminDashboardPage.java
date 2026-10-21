package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AdminDashboardPage {
    WebDriver driver;
    WebDriverWait wait;

    By groups_xpath = By.xpath("//*[@id=\"app-root\"]/div/div[2]/nav/button[4]");
    By createANewGroup_xpath = By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[2]/button");

    public AdminDashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void clickGroupsButton() {
        wait.until(ExpectedConditions.elementToBeClickable(groups_xpath)).click();
    }
    public void clickCreateANewGroupButton() {
        wait.until(ExpectedConditions.elementToBeClickable(createANewGroup_xpath)).click();
    }

}
