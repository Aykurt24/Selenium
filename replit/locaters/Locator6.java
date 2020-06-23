package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator6 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("  https://testpages.herokuapp.com/styled/index.html  ");

        WebElement fakealerttest = driver.findElement(By.id("fakealerttest"));
        fakealerttest.click();

        WebElement fakealert = driver.findElement(By.id("fakealert"));
        fakealert.click();

        WebElement ok = driver.findElement(By.id("dialog-ok"));
        ok.click();

        driver.close();

    }
}
/*
Navigate to https://testpages.herokuapp.com/styled/index.html

Click on Fake Alerts

 Click on Show Alert Box

Click on Ok

Alert should be closed
 */