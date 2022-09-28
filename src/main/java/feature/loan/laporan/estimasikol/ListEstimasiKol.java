package feature.loan.laporan.estimasikol;

import config.DriverConfig;
import feature.loan.LoanXpath;
import feature.login.LoginConfig;
import feature.setupUserId.UserIdHelper;
import org.openqa.selenium.By;

public class ListEstimasiKol extends LoanXpath {
    public static void main(String[] args) {
        LoginConfig.login = "legalLoan";
        LoginConfig.main (args);
        DriverConfig.driver.findElement (By.xpath (laporan)).click ();
        DriverConfig.driver.findElement (By.xpath (estimasiKol)).click ();

    }
}
