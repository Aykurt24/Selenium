package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator9 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("   https://www.seleniumeasy.com/test/basic-first-form-demo.html  ");

      WebElement userMsg = driver.findElement(By.id("user-message"));
      userMsg.sendKeys("Dogan");

      WebElement show = driver.findElement(By.className("btn"));
      show.click();

      WebElement msg = driver.findElement(By.id("display"));
        System.out.println(msg.getText());
    }
}
/*
Navigate to   https://www.seleniumeasy.com/test/basic-first-form-demo.html

Enter the message

Click on Show message

Print the value under the Show message button
 */
