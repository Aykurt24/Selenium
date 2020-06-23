package selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _14_ClickOnCancel {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");

        WebElement list = driver.findElement(By.linkText("Check Out"));
        list.click();

        WebElement button = driver.findElement(By.linkText("Cancel"));
        // this is anchor tag that's why we can use link text
        button.click();


    }
}
