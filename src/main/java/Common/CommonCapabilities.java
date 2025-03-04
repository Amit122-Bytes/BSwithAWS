package Common;
import java.util.HashMap;

import org.openqa.selenium.MutableCapabilities;

public class CommonCapabilities {
    public static MutableCapabilities getCommonCapabilities() {
        MutableCapabilities capabilities = new MutableCapabilities();
        HashMap<String, Object> bstackOptions = new HashMap<>();



        // Common options
        bstackOptions.put("projectName", "Finance");
        bstackOptions.put("buildName", "Finance 1.0");
        bstackOptions.put("consoleLogs", "info");
        bstackOptions.put("networkLogs", "true");
        bstackOptions.put("debug", "true");

        capabilities.setCapability("bstack:options", bstackOptions);
        return capabilities;
    }
}
