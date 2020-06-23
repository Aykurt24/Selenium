package selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class _09_FindingElements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");
        List<WebElement> liElements = driver.findElements(By.tagName("li"));
        for (WebElement element:liElements) {
            System.out.println(element.getText());
        }
        driver.quit();

    }
}
