package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By usernameField = By.id("user_login");
    By passwordField = By.id("user_pass");
    By loginBtn = By.id("wp-submit");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void login(String username, String password) {
        WebElement usernameEl = wait.until(visibilityOfElementLocated(usernameField));
        usernameEl.sendKeys(username);

        WebElement passwordEl = wait.until(visibilityOfElementLocated(passwordField));
        passwordEl.sendKeys(password);

        WebElement loginBtnEl = wait.until(visibilityOfElementLocated(loginBtn));
        loginBtnEl.click();

        Assert.assertTrue(driver.getTitle().toLowerCase().contains("dashboard"), "Login failed, Dashboard not loaded.");
    }
}
