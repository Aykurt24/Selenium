package Metoring._10_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDirver {
    public static WebDriver driver;
        static {
            System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

}
