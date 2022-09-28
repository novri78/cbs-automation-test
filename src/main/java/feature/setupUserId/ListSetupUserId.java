package feature.setupUserId;

import config.DriverConfig;
import feature.login.LoginConfig;
import org.openqa.selenium.By;

public class ListSetupUserId extends UserIdHelper {

    public static void main(String[] args) throws InterruptedException {
        LoginConfig.login = "admin";
        LoginConfig.main(args);
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(userManagement)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(userAccessSetup)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(setupUserId)).click();
    }
}
