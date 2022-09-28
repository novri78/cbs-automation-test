package feature.deposito;

import config.DriverConfig;
import feature.login.LoginConfig;
import org.openqa.selenium.By;

public class ListDeposito {
    public static void main (String[] args) {
        LoginConfig.login = "cs";
        LoginConfig.main(args);
        DriverConfig.driver.findElement(By.xpath("//body/div[1]/div/div[1]/div[3]/div/div[3]/button/div")).click();
        DriverConfig.driver.findElement(By.xpath("//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div[4]/button/div")).click();
        DriverConfig.driver.findElement(By.xpath("//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div[4]/div/div/button/div")).click();
        DriverConfig.driver.findElement(By.xpath("//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div[4]/div/div/div/div[3]/button/div")).click();
    }
}
