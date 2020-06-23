package selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByClassName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");
        WebElement element = driver.findElement(By.className("editor_collections"));
        //class name is not unique that's why we should check it by using command F
        System.out.println(element.getText());
        driver.quit();
    }
}
