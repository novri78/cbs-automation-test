package feature.loan.penyaluran.sp3;

import config.DriverConfig;
import feature.loan.LoanXpath;
import feature.login.LoginConfig;
import org.openqa.selenium.By;

public class SP3List extends LoanXpath {

    public static void main(String[]args) throws InterruptedException {
        LoginConfig.login = "legalLoan";
        LoginConfig.main (args);
        DriverConfig.driver.findElement (By.xpath (pelayanan)).click ();
        Thread.sleep (1000);
        DriverConfig.driver.findElement (By.xpath (pembiayaan)).click ();
        Thread.sleep (1000);
        DriverConfig.driver.findElement (By.xpath (penyaluran)).click ();
        Thread.sleep (1000);
        DriverConfig.driver.findElement (By.xpath (sp3)).click ();
        Thread.sleep (3000);

        //DriverConfig.driver.quit();

    }

}
