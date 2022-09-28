package feature.setupRole;

import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchSpesificRole extends RoleXpath {

    public static void main(String[] args) throws InterruptedException {
        ListRole.main(args);
        Thread.sleep(2000);
        WebElement enter = DriverConfig.driver.findElement(By.tagName("input"));
        //if value is exist response show data
        enter.sendKeys("test");
        enter.sendKeys(Keys.ENTER);

    }
}
