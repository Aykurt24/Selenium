package replit.alert;

import org.openqa.selenium.By;
import utils.BaseDriver;

public class Alert1 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        driver.findElement(By.cssSelector("p>button")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

    }

}

/*
Navigate to "https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/"

Click on "Simple Alert" button

Accept the alert
 */