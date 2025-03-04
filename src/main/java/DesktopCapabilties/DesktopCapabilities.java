package DesktopCapabilties;
import java.util.HashMap;

import org.openqa.selenium.MutableCapabilities;

import Common.CommonCapabilities;

public class DesktopCapabilities {
    public static MutableCapabilities getDesktopCapabilities(String os, String osVersion, String browserName, String browserVersion) {
        MutableCapabilities capabilities = CommonCapabilities.getCommonCapabilities();
        capabilities.setCapability("browserName", browserName);

        // BrowserStack desktop-specific options
        @SuppressWarnings("unchecked")
		HashMap<String, Object> bstackOptions = (HashMap<String, Object>) capabilities.getCapability("bstack:options");
        bstackOptions.put("os", os);
        bstackOptions.put("osVersion", osVersion);
        bstackOptions.put("browserVersion", browserVersion);

        capabilities.setCapability("bstack:options", bstackOptions);
        return capabilities;
    }
}

