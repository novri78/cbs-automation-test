package feature.login;

import config.DriverConfig;
import config.OpenBrowserDriver;
import org.openqa.selenium.By;

public class LoginConfig extends LoginXpath {

    public static String login = "adminRahn";

    public static void main (String [] args) {
        switch (login) {
            case "admin":
                OpenBrowserDriver.main(args);
                DriverConfig.driver.findElement(By.xpath(userName)).sendKeys("superadmin");
                DriverConfig.driver.findElement(By.xpath(password)).sendKeys("1111");
                DriverConfig.driver.findElement(By.xpath(buttonLogin)).click();
                break;
            case "cs":
                OpenBrowserDriver.main(args);
                DriverConfig.driver.findElement(By.xpath(userName)).sendKeys("14102");
                DriverConfig.driver.findElement(By.xpath(password)).sendKeys("1111");
                DriverConfig.driver.findElement(By.xpath(buttonLogin)).click();
                break;
            case "legalLoan":
                OpenBrowserDriver.main(args);
                DriverConfig.driver.findElement(By.xpath(userName)).sendKeys("06129");
                DriverConfig.driver.findElement(By.xpath(password)).sendKeys("1111");
                DriverConfig.driver.findElement(By.xpath(buttonLogin)).click();
                break;
            case "kacab":
                OpenBrowserDriver.main(args);
                DriverConfig.driver.findElement(By.xpath(userName)).sendKeys("14501  ");
                DriverConfig.driver.findElement(By.xpath(password)).sendKeys("1111");
                DriverConfig.driver.findElement(By.xpath(buttonLogin)).click();
                break;
            case "adminRahn":
                OpenBrowserDriver.main(args);
                DriverConfig.driver.findElement(By.xpath(userName)).sendKeys("17112  ");
                DriverConfig.driver.findElement(By.xpath(password)).sendKeys("1111");
                DriverConfig.driver.findElement(By.xpath(buttonLogin)).click();
                break;

        }
    }
}
