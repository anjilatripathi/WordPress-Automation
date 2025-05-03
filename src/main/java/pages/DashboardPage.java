package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class DashboardPage {
    WebDriver driver;
    WebDriverWait wait;

    By pluginMenu = By.xpath("//div[contains(text(),'Plugins ')]");
    By addPluginButton = By.xpath("//a[@class='page-title-action' and contains(text(),'Add Plugin')]");
    By searchField = By.id("search-plugins");
    By installEverestForms = By.xpath("//a[@data-name='Everest Forms – Contact Form, Quiz, Survey, Newsletter & Payment Form Builder for WordPress 3.1.2']");
    By activateBtn = By.xpath("//div[@class='plugin-card plugin-card-everest-forms']/div/div[2]/ul/li/a[contains(text(),'Activate')]");

    public DashboardPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void installAndActivateEverestForms() {
        wait.until(visibilityOfElementLocated(pluginMenu)).click();
        wait.until(visibilityOfElementLocated(addPluginButton)).click();

        wait.until(visibilityOfElementLocated(searchField)).sendKeys("everest forms");

        wait.until(visibilityOfElementLocated(installEverestForms)).click();
        wait.until(visibilityOfElementLocated(activateBtn)).click();


        Assert.assertTrue(driver.getCurrentUrl().contains("plugins"), "Plugin activation failed or did not redirect.");
    }
}
