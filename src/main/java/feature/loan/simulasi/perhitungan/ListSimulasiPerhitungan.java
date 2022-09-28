package feature.loan.simulasi.perhitungan;

import config.DriverConfig;
import feature.loan.LoanXpath;
import feature.login.LoginConfig;
import feature.setupUserId.UserIdHelper;
import org.openqa.selenium.By;

public class ListSimulasiPerhitungan extends LoanXpath {
    public static void main(String[] args) {
        LoginConfig.login ="legalLoan";
        DriverConfig.driver.findElement (By.xpath (pelayanan)).click ();
        DriverConfig.driver.findElement (By.xpath (pembiayaan)).click ();
        DriverConfig.driver.findElement (By.xpath (simulasi)).click ();
        DriverConfig.driver.findElement (By.xpath (simulasiHitung)).click ();
    }
}
