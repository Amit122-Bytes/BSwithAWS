package DeviceWorkshop;

import java.util.ArrayList;
import java.util.List;

public class DeviceManager {

    private static final DevicesAndBrowsers devicesAndBrowsers = new DevicesAndBrowsers();

    // Active devices (modifiable at runtime)
    private static List<String[]> activeDesktopDevices = new ArrayList<>();
    private static List<String[]> activeMobileDevices = new ArrayList<>();

    // Set active desktop devices
    public static void setActiveDesktopDevice(String os, String osVersion, String browserName, String browserVersion) {
        activeDesktopDevices.clear();
        activeDesktopDevices.add(new String[]{os, osVersion, browserName, browserVersion});
    }

    // Set active mobile devices
    public static void setActiveMobileDevice(String os, String deviceName, String osVersion) {
        activeMobileDevices.clear();
        activeMobileDevices.add(new String[]{os, deviceName, osVersion});
    }

    // Get active desktop devices
    public static List<String[]> getDesktopDevices() {
        return activeDesktopDevices.isEmpty() ? devicesAndBrowsers.DesktopDrivers() : activeDesktopDevices;
    }

    // Get active mobile devices
    public static List<String[]> getMobileDevices() {
        return activeMobileDevices.isEmpty() ? devicesAndBrowsers.MobileDrivers() : activeMobileDevices;
    }
}
