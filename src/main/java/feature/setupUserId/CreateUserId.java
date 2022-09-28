package feature.setupUserId;

import config.DriverConfig;
import feature.login.LoginConfig;
import globalHelper.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateUserId extends UserIdHelper {
    public static void main(String[] args) throws InterruptedException {
        LoginConfig.login = "superadmin";
        LoginConfig.main(args);

        Thread.sleep(1000);
        ListSetupUserId.main(args);

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(buttonAdd)).click();

        Thread.sleep(1000);
        WebElement dDownOffice = DriverConfig.driver.findElement(By.xpath(officeOption));
        Select selectOffice = new Select(dDownOffice);
        selectOffice.selectByValue(OfficeOption.indramayu);

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(userName)).sendKeys("teller1");

        Thread.sleep(1000);
        WebElement dDownRole = DriverConfig.driver.findElement(By.xpath(roleOption));
        Select selectRole = new Select(dDownRole);
        selectRole.selectByValue(RoleOption.teller);

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(inputNamaKaryawan)).sendKeys("testing user");

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(inputNIK)).sendKeys("192010");

        Thread.sleep(1000);
        WebElement dDownJabatan = DriverConfig.driver.findElement(By.xpath(jabatanOption));
        Select selectJabatan = new Select(dDownJabatan);
        selectJabatan.selectByValue(JabatanOption.staff);

        Thread.sleep(1000);
        WebElement dDownDepartemen = DriverConfig.driver.findElement(By.xpath(departemenOption));
        Select selectDepartemen = new Select(dDownDepartemen);
        selectDepartemen.selectByValue(DepartemenOption.teller);

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(inputUserLimit)).sendKeys(Keys.BACK_SPACE+"5000000");

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(inputTanggal)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikTahun)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(TahunOption.th2021)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikOk)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikBulan)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(BulanOption.oktober)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikOk)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(TanggalOption.day25)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikOk)).click();
        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(klikOk)).click();

        Thread.sleep(1000);
        WebElement dDownMaritalStatus = DriverConfig.driver.findElement(By.xpath(maritalOption));
        Select selectMaritalStatus = new Select(dDownMaritalStatus);
        selectMaritalStatus.selectByValue(MaritalStatusOption.menikah);

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(inputPassword)).sendKeys("1111");

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(inputExpiredPass)).sendKeys(Keys.BACK_SPACE+"3");

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(inputLimitOtorTeller)).sendKeys(Keys.BACK_SPACE + "0");

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(inputLimitOtorPembiayaan)).sendKeys(Keys.BACK_SPACE + "0");

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(inputLimitOtorLainnya)).sendKeys(Keys.BACK_SPACE + "0");

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(chkBoxSimpanAktifitasUser)).click();

        Thread.sleep(1000);
        WebElement dDownUserStatus = DriverConfig.driver.findElement(By.xpath(userStatusOption));
        Select selectUserStatus = new Select(dDownUserStatus);
        selectUserStatus.selectByValue(StatusUserOption.aktif);

        Thread.sleep(1000);
        WebElement dDownEducation = DriverConfig.driver.findElement(By.xpath(educationOption));
        Select selectEducation = new Select(dDownEducation);
        selectEducation.selectByValue(EducationOption.s1);

        Thread.sleep(1000);
        WebElement dDownGender = DriverConfig.driver.findElement(By.xpath(genderOption));
        Select selectGender = new Select(dDownGender);
        selectGender.selectByValue(GenderOption.pria);

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(buttonSimpan)).click();

        Thread.sleep(1000);
        DriverConfig.driver.findElement(By.xpath(popUpOk)).click();


    }
}
