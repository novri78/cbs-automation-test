package feature.loan.penyaluran.sp3;

import config.DriverConfig;
import feature.loan.LoanXpath;
import globalHelper.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SP3Create extends LoanXpath {

    public static void main(String[] args) throws InterruptedException{
        SP3List.main (args);
        DriverConfig.driver.findElement (By.xpath (buatSP3)).click ();
        //DriverConfig.driver.findElement (By.xpath (inputNoCif)).click ();
        DriverConfig.driver.findElement (By.xpath (inputNama)).sendKeys ("firza bestari");
        WebElement dDownOffice = DriverConfig.driver.findElement(By.xpath(officeOption));
        Select selectOffice = new Select(dDownOffice);
        selectOffice.selectByValue(OfficeOption.tasikmalaya);

        Thread.sleep (2000);
        DriverConfig.driver.findElement (By.xpath (buttonCari)).click ();
        Thread.sleep (2000);
        DriverConfig.driver.findElement (By.xpath (buttonPilih)).click ();

        DriverConfig.driver.findElement (By.xpath (inputNoSp3)).sendKeys ("008/SP3/I/22");

        //Set Tgl Buat
        DriverConfig.driver.findElement (By.xpath (klikKalenderBuatSP3)).click ();
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
        Thread.sleep (1000);

        DriverConfig.driver.findElement (By.xpath (inputPerihal)).sendKeys ("isi dari SP3 dari keputusan kredit nasabah");
        DriverConfig.driver.findElement (By.xpath (sp3Dokumen)).sendKeys ("Terlampir / Tidak Terlampir");

        //Set Tgl Kirim
        DriverConfig.driver.findElement (By.xpath (klikKalenderKirimSP3)).click ();
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
        Thread.sleep (1000);

        WebElement dDownKirim = DriverConfig.driver.findElement(By.xpath(pengirimanOption));
        Select selectCaraKirim = new Select(dDownKirim);
        selectCaraKirim.selectByValue(PengirimanOption.email);
        Thread.sleep (1500);

        //Set Tgl Nasabah Terima SP3
        DriverConfig.driver.findElement (By.xpath (klikKalenderTerimaSP3)).click ();
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

        WebElement dDownTanggapan = DriverConfig.driver.findElement(By.xpath(tanggapanOption));
        Select selectCaraTanggapan = new Select(dDownTanggapan);
        selectCaraTanggapan.selectByValue(TanggapanOption.setuju);
        Thread.sleep (1500);

        //Set Tgl Nasabah Setuju/Ditolak SP3
        DriverConfig.driver.findElement (By.xpath (klikKalenderSetujuSP3)).click ();
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
        Thread.sleep (1000);

        WebElement dDownPengembalian = DriverConfig.driver.findElement(By.xpath(pengembalianOption));
        Select selectCaraPengembalian = new Select(dDownPengembalian);
        selectCaraPengembalian.selectByValue(PengembalianOption.email);
        Thread.sleep (1500);

        DriverConfig.driver.findElement (By.xpath (sp3DokumenNasabah)).sendKeys ("Terlampir / Tidak Terlampir");

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

    }

}