package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator8 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("   https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html  ");

        WebElement normal = driver.findElement(By.id("normal-btn-success"));
        normal.click();

        Thread.sleep(2000);
        WebElement close = driver.findElement(By.className("close"));
        close.click();

    }
}
/*
Navigate to  https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html

Click on  Normal success message

Click on x button in the message
 */