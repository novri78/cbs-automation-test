package feature.loan.penyaluran.kontrak;

import config.DriverConfig;
import feature.loan.LoanXpath;
import feature.login.LoginConfig;
import feature.setupUserId.UserIdHelper;
import org.openqa.selenium.By;

public class ListKontrakPembiayaan extends LoanXpath {
    public static void main(String[] args) throws InterruptedException {
        LoginConfig.login = "cs";
        LoginConfig.main(args);
        Thread.sleep (1000);
        DriverConfig.driver.findElement(By.xpath(pelayanan)).click();
        Thread.sleep (1000);
        DriverConfig.driver.findElement(By.xpath(pembiayaan)).click();
        Thread.sleep (1000);
        DriverConfig.driver.findElement(By.xpath(penyaluran)).click();
        Thread.sleep (1000);
        DriverConfig.driver.findElement(By.xpath(kontrakPembiayaan)).click();
        Thread.sleep (1000);
        DriverConfig.driver.findElement(By.xpath(dropDown)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(signOut)).click();
    }

}
