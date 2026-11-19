package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class GroupPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By groupName =
            By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[1]/input");

    private By groupDescription =
            By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[2]/textarea");

    private By year =
            By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[3]/div[1]/input");

    private By maxCapacity =
            By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[3]/div[2]/input");

    private By createGroupButton =
            By.xpath("//button[contains(normalize-space(.),'Create Group')]");

    private By successMessage =
            By.xpath("//*[contains(normalize-space(.),'Group created successfully')]");

    public GroupPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void enterGroupName(String name) {
        WebElement field = wait.until(
                ExpectedConditions.visibilityOfElementLocated(groupName));
        field.clear();
        field.sendKeys(name);
    }

    public void enterGroupDescription(String description) {
        WebElement field = wait.until(
                ExpectedConditions.visibilityOfElementLocated(groupDescription));
        field.clear();
        field.sendKeys(description);
    }

    public void enterYear(String yearValue) {
        WebElement field = wait.until(
                ExpectedConditions.visibilityOfElementLocated(year));
        field.clear();
        field.sendKeys(yearValue);
    }

    public void enterMaxCapacity(String capacity) {
        WebElement field = wait.until(
                ExpectedConditions.visibilityOfElementLocated(maxCapacity));

        field.clear();
        field.sendKeys(capacity);

        String actualCapacity = field.getAttribute("value");

        Assert.assertEquals(actualCapacity, capacity,
                "Max Capacity should be " + capacity);
    }

    public void clickCreateGroupButton() {
        wait.until(ExpectedConditions.elementToBeClickable(createGroupButton))
                .click();
    }

    public boolean isGroupCreated() {
        return wait.until(
                        ExpectedConditions.visibilityOfElementLocated(successMessage))
                .isDisplayed();
    }
}
