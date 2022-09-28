package feature.loan.laporan.denominatif;

import config.DriverConfig;
import feature.loan.LoanXpath;
import globalHelper.OfficeOption;
import globalHelper.TypeAkadOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Denominatif extends LoanXpath {
    public static void main(String[] args) throws InterruptedException {
        ListDenominatif.main (args);
        WebElement dDownOffice = DriverConfig.driver.findElement(By.xpath(officeOption));
        Select selectOffice = new Select(dDownOffice);
        selectOffice.selectByValue(OfficeOption.tasikmalaya);
        Thread.sleep (1500);

        DriverConfig.driver.findElement (By.xpath (klikKalenderAwalDenominatif)).sendKeys ("01/01/2020");
        Thread.sleep (1500);
        DriverConfig.driver.findElement (By.xpath (klikKalenderAkhirDenominatif)).sendKeys ("11/16/2021");

        WebElement dDownPilihAkad = DriverConfig.driver.findElement (By.xpath (typeAkadOption));
        Select selectPilihAkad = new Select (dDownPilihAkad);
        selectPilihAkad.selectByValue (TypeAkadOption.pilih);

        Thread.sleep (1500);

        DriverConfig.driver.findElement (By.xpath (tenor)).sendKeys ("");
        Thread.sleep (1500);

        DriverConfig.driver.findElement (By.xpath (proses)).click ();
        Thread.sleep (1500);

        DriverConfig.driver.findElement (By.xpath (buttonOk)).click ();

    }
}
