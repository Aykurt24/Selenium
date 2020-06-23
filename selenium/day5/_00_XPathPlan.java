package selenium.day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _00_XPathPlan {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        // try to login
        // check if logged in by find cart element
        // add first item to cart
        // check if added
        // navigate back
        // add second item to cart
        // check if added
        // go to checkout page
        // check the items names and their individual prices
        // check total
        // check tax is 8%
        // go to finish page and check thank you message

    }
}
