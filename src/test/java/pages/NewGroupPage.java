
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class NewGroupPage {

    WebDriver driver;
    WebDriverWait wait;

    By groupName_xpath = By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[1]/input");
    By groupDescription_xpath = By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[2]/textarea");
    By year_xpath = By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[3]/div[1]/input");
    By maxCapacity_xpath = By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[3]/div[2]/input");
    By createGroupButton_xpath =
            By.xpath("//button[contains(normalize-space(.),'Create Group')]");
    By successMessage = By.xpath("//*[contains(text(),'Group created successfully')]");

    public NewGroupPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterGroupName(String groupName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(groupName_xpath))
                .sendKeys(groupName);
    }

    public void enterGroupDescription(String description) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(groupDescription_xpath))
                .sendKeys(description);
    }

    public void enterYear(String year) {
        wait.until(ExpectedConditions.elementToBeClickable(year_xpath))
                .sendKeys(year);
    }

    public void enterMaxCapacity(String capacity) {
        WebElement maxCapacity = wait.until(
                ExpectedConditions.visibilityOfElementLocated(maxCapacity_xpath)
        );

        maxCapacity.clear();
        maxCapacity.sendKeys(capacity);

        String actualCapacity = maxCapacity.getAttribute("value");

        Assert.assertEquals(actualCapacity, capacity,
                "Max Capacity should be " + capacity);
    }

    public void clickCreateGroupButton() {
        wait.until(ExpectedConditions.elementToBeClickable(createGroupButton_xpath))
                .click();
    }
    public boolean isGroupCreated() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(successMessage)
        ).isDisplayed();
    }
}
