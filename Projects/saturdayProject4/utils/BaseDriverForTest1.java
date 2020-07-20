package Projects.saturdayProject4.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseDriverForTest1 {

    protected static WebDriver driver;

    @BeforeMethod
    public void BeforeMethod(){
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.navigate().to("https://app.hubspot.com/login");

    }


}
