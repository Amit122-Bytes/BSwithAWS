package TestCases;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import DesktopCapabilties.DesktopCapabilities;
import DeviceWorkshop.DeviceManager;
import MobileCapabilites.MobileCapabilities;

public class BaseTest {
    protected WebDriver driver;
    private static final String BROWSERSTACK_URL = "https://amitmeta_Z9guLG:33jeMYahdLmVp1fk8msn@hub-cloud.browserstack.com/wd/hub";

    @SuppressWarnings("deprecation")
	@BeforeMethod
    @Parameters({"runType"})
    public void setUp(String runType) throws Exception {
        if ("desktop".equalsIgnoreCase(runType)) {
            List<String[]> desktopDevices = DeviceManager.getDesktopDevices();
            for (String[] device : desktopDevices) {
                driver = new RemoteWebDriver(
                    new URL(BROWSERSTACK_URL),
                    DesktopCapabilities.getDesktopCapabilities(device[0], device[1], device[2], device[3])
                );
            }
        } else if ("mobile".equalsIgnoreCase(runType)) {
            List<String[]> mobileDevices = DeviceManager.getMobileDevices();
            for (String[] device : mobileDevices) {
                driver = new RemoteWebDriver(
                    new URL(BROWSERSTACK_URL),
                    MobileCapabilities.getMobileCapabilities(device[0], device[1], device[2])
                );
            }
        } else {
            throw new IllegalArgumentException("Invalid runType: " + runType);
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
