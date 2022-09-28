package feature.setupRole;

import config.DriverConfig;
import org.openqa.selenium.By;


public class DetailRole extends RoleXpath{
    public static void main(String[] args) throws InterruptedException {
        ListRole.main(args);
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(aksiButton)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikDetail)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(backToListRole)).click();

    }
}