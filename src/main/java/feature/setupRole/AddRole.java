package feature.setupRole;

import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddRole extends RoleXpath {
    public static void main(String[] args) throws InterruptedException {
        ListRole.main(args);
        DriverConfig.driver.findElement(By.xpath(tambahRole)).click();
        DriverConfig.driver.findElement(By.xpath(namaRole)).sendKeys("test");

        WebElement dDown = DriverConfig.driver.findElement(By.tagName(userLevel));
        Select select = new Select(dDown);
        select.selectByValue("6");

        Thread.sleep(2000);

        DriverConfig.driver.findElement(By.xpath(printCheckBox)).click();
        DriverConfig.driver.findElement(By.xpath(clickSimpan)).click();
        DriverConfig.driver.findElement(By.xpath(okPopup)).click();


    }
}
