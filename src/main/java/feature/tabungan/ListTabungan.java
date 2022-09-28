package feature.tabungan;

import config.DriverConfig;
import feature.login.LoginConfig;
import org.openqa.selenium.By;

public class ListTabungan {
    public static void main(String[] args) {
        LoginConfig.login = "cs";
        LoginConfig.main(args);
        DriverConfig.driver.findElement(By.xpath("//body/div[1]/div/div[1]/div[3]/div/div[3]/button/div")).click();
        DriverConfig.driver.findElement(By.xpath("//body/div/div/div[1]/div[3]/div/div[3]/div/div[5]/button/div")).click();
        DriverConfig.driver.findElement(By.xpath("//body/div/div/div[1]/div[3]/div/div[3]/div/div[5]/div/div/button/div")).click();
        DriverConfig.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[3]/div/div[5]/div/div/div/div[3]/button/div")).click();

    }
}
