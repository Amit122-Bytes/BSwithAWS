package MobileCapabilites;

import java.util.HashMap;

import org.openqa.selenium.MutableCapabilities;

import Common.CommonCapabilities;

public class MobileCapabilities {
    public static MutableCapabilities getMobileCapabilities(String device, String osVersion, String browserName) {
        MutableCapabilities capabilities = CommonCapabilities.getCommonCapabilities();
        capabilities.setCapability("browserName", browserName);

        // BrowserStack mobile-specific options
        @SuppressWarnings("unchecked")
		HashMap<String, Object> bstackOptions = (HashMap<String, Object>) capabilities.getCapability("bstack:options");
        bstackOptions.put("deviceName", device);
        bstackOptions.put("osVersion", osVersion);
        bstackOptions.put("realMobile", "true");

        capabilities.setCapability("bstack:options", bstackOptions);
        return capabilities;
    }
}

