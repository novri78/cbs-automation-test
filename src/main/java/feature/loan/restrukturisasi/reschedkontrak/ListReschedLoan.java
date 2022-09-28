package feature.loan.restrukturisasi.reschedkontrak;

import config.DriverConfig;
import feature.loan.LoanXpath;
import feature.login.LoginConfig;
import feature.setupUserId.UserIdHelper;
import org.openqa.selenium.By;

public class ListReschedLoan extends LoanXpath {
    public static void main(String[] args) {
        LoginConfig.login = "legalLoan";
        LoginConfig.main (args);
        DriverConfig.driver.findElement (By.xpath (pelayanan)).click ();
        DriverConfig.driver.findElement (By.xpath (pembiayaan)).click ();
        DriverConfig.driver.findElement (By.xpath (restrukturisasi)).click ();
        DriverConfig.driver.findElement (By.xpath (reschedLoan)).click ();
    }
}
