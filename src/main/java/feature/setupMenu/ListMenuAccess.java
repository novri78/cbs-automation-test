package feature.setupMenu;

import config.DriverConfig;
import feature.login.LoginConfig;
import org.openqa.selenium.By;

public class ListMenuAccess extends MenuAccessXpath{

    public static void main(String[] args) {
        LoginConfig.login = "admin";
        LoginConfig.main(args);
        DriverConfig.driver.findElement(By.xpath(userManagement)).click();
        DriverConfig.driver.findElement(By.xpath(userAccessSetup)).click();
        DriverConfig.driver.findElement(By.xpath(setupMenuAccess)).click();
    }
}
