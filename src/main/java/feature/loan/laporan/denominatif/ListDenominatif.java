package feature.loan.laporan.denominatif;

import config.DriverConfig;
import feature.loan.LoanXpath;
import feature.login.LoginConfig;
import feature.setupUserId.UserIdHelper;
import org.openqa.selenium.By;

public class ListDenominatif extends LoanXpath {
    public static void main(String[] args) {
        LoginConfig.login = "legalLoan";
        LoginConfig.main (args);
        DriverConfig.driver.manage ().window ().maximize ();
        DriverConfig.driver.findElement(By.xpath(laporan)).click();
        DriverConfig.driver.findElement(By.xpath(denominatifPembiayaan)).click();


    }
}
