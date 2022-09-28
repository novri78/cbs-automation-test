package feature.loan.penyaluran.sp3;

import config.DriverConfig;
import feature.loan.LoanXpath;
import globalHelper.BulanOption;
import globalHelper.PengembalianOption;
import globalHelper.TahunOption;
import globalHelper.TanggalOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SP3Edit extends LoanXpath {
    public static void main(String[] args) throws InterruptedException {
        SP3List.main (args);
        Thread.sleep (1500);
        //DriverConfig.driver.findElement (By.xpath (noSP3)).sendKeys ("121121002");
        //Thread.sleep (4000);

        //PilihSP3 yg akan diedit
        DriverConfig.driver.findElement (By.xpath (klikAksi)).click ();
        Thread.sleep (2000);
        DriverConfig.driver.findElement(By.xpath(pilihEdit)).click();

        //Set Tgl Nasabah Setuju/Ditolak SP3
        DriverConfig.driver.findElement (By.xpath (klikKalenderSetujuSP3)).click ();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikTahun)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(TahunOption.th2021)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikOk)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikBulan)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(BulanOption.november)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikOk)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(TanggalOption.day16)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikOk)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikOk)).click();
        Thread.sleep (1000);

        WebElement dDownPengembalian = DriverConfig.driver.findElement(By.xpath(pengembalianOption));
        Select selectCaraPengembalian = new Select(dDownPengembalian);
        selectCaraPengembalian.selectByValue(PengembalianOption.whatsapp);
        Thread.sleep (1500);

        //Set Tgl Nasabah Pengembalian SP3
        DriverConfig.driver.findElement (By.xpath (klikKalenderPengembalianSP3)).click ();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikTahun)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(TahunOption.th2022)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikOk)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikBulan)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(BulanOption.januari)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikOk)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(TanggalOption.day10)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikOk)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikOk)).click();
        Thread.sleep (2000);

        DriverConfig.driver.findElement (By.xpath (buttonSimpan)).click ();
        Thread.sleep(3000);
        DriverConfig.driver.findElement(By.xpath(popUpOk)).click();

        DriverConfig.driver.findElement (By.xpath (pilihKembali)).click ();


    }
}
