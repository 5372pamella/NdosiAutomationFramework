
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    By usernameField = By.id("login-email");
    By passwordField = By.id("login-password");
    By loginButton = By.id("login-submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(
                        usernameField))
                .sendKeys(username);
    }

    public void enterPassword(String password) {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(
                        passwordField))
                .sendKeys(password);
    }

    public void clickLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(
                        loginButton))
                .click();
    }
}















