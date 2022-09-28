package feature.pengisianKasTeller;

import config.DriverConfig;
import feature.login.LoginConfig;
import org.openqa.selenium.By;

public class ListKasTeller extends KasTellerXpath{
    public static void main(String[] args) throws InterruptedException {
        LoginConfig.login = "teller";
        LoginConfig.main(args);
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(pelayanan)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(teller)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(kasTeller)).click();
    }
}
