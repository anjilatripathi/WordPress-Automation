package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class PluginInstallTest extends BaseTest {

    @Test
    public void testPluginInstallationFlow() {
        LoginPage login = new LoginPage(driver, wait);
        login.login("admin", "admin123@#$_an62");

        DashboardPage dashboard = new DashboardPage(driver, wait);
        dashboard.installAndActivateEverestForms();

        EverestFormsPage everest = new EverestFormsPage(driver, wait);
        everest.verifyEverestFormsActivated();
    }
}
