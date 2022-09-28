package feature.loan.laporan.sid;

import config.DriverConfig;
import config.OpenBrowserDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ListSistemInformasiDebitur {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OpenBrowserDriver.main(args);
        DriverConfig.driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);
        DriverConfig.driver.findElement(By.xpath("//body/div/div/div/div[2]/div/div[4]/div[1]/div/input")).sendKeys("09103");
        DriverConfig.driver.findElement(By.xpath("//body/div/div/div/div[2]/div/div[4]/div[2]/div/input")).sendKeys("1111");
        DriverConfig.driver.findElement(By.xpath("//body/div/div/div/div[2]/div/div[5]/button/span")).click();
        DriverConfig.driver.findElement(By.xpath("//body/div/div/div[1]/div[3]/div/div[1]/button/div")).click();
        DriverConfig.driver.findElement(By.xpath("//body/div/div/div[1]/div[3]/div/div[1]/div/div[2]/button/div")).click();
        DriverConfig.driver.findElement(By.xpath("//body/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/input")).sendKeys("tatang rudi heryana");


    }
}
