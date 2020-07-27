package selenium.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();// This will open the chrome browser.
        driver.get("http://www.practiceselenium.com");// This wil open the website
       // driver.navigate()
        Thread.sleep(3000);//After opening the website it will be open in 3 second.
        // Why we need to use Thread.sleep ?
        driver.quit();// This will close the website



    }
}