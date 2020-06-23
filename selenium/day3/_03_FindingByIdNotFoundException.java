package selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();// This will open the chrome browser.
        driver.get("http://www.practiceselenium.com");// This wil open the website
        Thread.sleep(3000);//After opening the website it will be open in 3 second.
        WebElement element = driver.findElement(By.id("Not Found Exception"));
        System.out.println(element.getText());// Getting text from website and print it on the console.
        driver.quit();// This will close the website


    }

}
