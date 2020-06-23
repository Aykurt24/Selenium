package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(" https://testpages.herokuapp.com/styled/index.html ");

        WebElement alert = driver.findElement(By.id("alerts"));
        alert.click();
        String URL = driver.getCurrentUrl();
        System.out.println(URL);

    }
}
/*
Navigate to website  https://testpages.herokuapp.com/styled/index.html

click on Alerts
     Print the URL
 */