package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator7 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("  https://testpages.herokuapp.com/styled/index.html  ");

        WebElement fakealerttest = driver.findElement(By.id("fakealerttest"));
        fakealerttest.click();

        Thread.sleep(2000);
        WebElement modal = driver.findElement(By.id("modaldialog"));
        modal.click();


        Thread.sleep(2000);

        WebElement ok = driver.findElement(By.id("dialog-ok"));
        ok.click();
        driver.close();

    }

}
/*
Navigate to https://testpages.herokuapp.com/styled/index.html

Click on Fake Alerts

Click on  Show modal dialog

Click on Ok

Alert should be closed
 */