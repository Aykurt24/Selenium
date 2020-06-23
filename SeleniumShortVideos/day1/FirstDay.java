package SeleniumShortVideos.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/doganaykurt/Desktop/chromedriver");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // Navigate to google.com
        driver.get("https://www.google.com/");


        // Navigate back
        driver.navigate().back();

        //Navigate forward
        driver.navigate().forward();

        //Navigate Refresh
        driver.navigate().refresh();

        driver.navigate().to("https://www.etsy.com/");

        /*
        navigate VS get in Selenium

        navigate has back(), forward() and refresh() methods but

        get does not have those methods.
         */

    }
}
