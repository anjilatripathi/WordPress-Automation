package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class EverestFormsPage {
    WebDriver driver;
    WebDriverWait wait;

    By settingsLink = By.linkText("Settings");
    By everestFormsMenu = By.xpath("//div[contains(text(),'Everest Forms')]");

    public EverestFormsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void verifyEverestFormsActivated() {
        wait.until(visibilityOfElementLocated(settingsLink)).click();
        wait.until(visibilityOfElementLocated(everestFormsMenu)).click();

        Assert.assertTrue(driver.getPageSource().contains("Welcome to Everest Forms") || driver.getTitle().toLowerCase().contains("everest"), "Everest Forms not loaded properly.");
    }
}
