package config;

import java.util.concurrent.TimeUnit;

public class OpenBrowserDriver {

    public static void main(String[] args) {
        DriverConfig.browser = "chrome";
        DriverConfig.main(args);
        DriverConfig.driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        DriverConfig.driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
        DriverConfig.driver.get("https://appdev.digiard.id/pages/login");
    }
}
