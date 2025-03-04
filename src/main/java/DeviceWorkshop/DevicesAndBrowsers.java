package DeviceWorkshop;

import java.util.ArrayList;
import java.util.List;

public class DevicesAndBrowsers {

    // Method to get desktop drivers
    public List<String[]> DesktopDrivers() {
        List<String[]> drivers = new ArrayList<>();
        // Uncomment or add desired configurations
        //drivers.add(new String[]{"Windows", "10", "Chrome", "120.0"});
        drivers.add(new String[]{"Windows", "10", "Chrome", "120.0"});
        return drivers;
    }

    // Method to get mobile drivers
    public List<String[]> MobileDrivers() {
        List<String[]> drivers = new ArrayList<>();
        // Uncomment or add desired configurations
        //drivers.add(new String[]{"Samsung Galaxy S22", "12", "Chrome"});
        //drivers.add(new String[]{"Samsung Galaxy S22", "12", "Chrome"});
        return drivers;
    }
}

