package selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByTagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");
        WebElement element = driver.findElement(By.tagName("h1"));
        WebElement element1 = driver.findElement(By.tagName("p"));
        System.out.println(element.getText() + "\n"+ element1.getText());

        driver.quit();
    }
}
