package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseDriver1 {

    /*
     WebDriver driver; access modifier is a default --> accessible in the same package
     We need to make driver as public or protected so we are able to access it
     */

    protected WebDriver driver;

    @BeforeMethod
    public void BeforeMethod() {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/index.php?route=common/home");

        WebElement myAccount = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
        myAccount.click();

        WebElement login = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a"));
        login.click();

        WebElement advance = driver.findElement(By.id("details-button"));
        advance.click();

        WebElement proceed = driver.findElement(By.id("proceed-link"));
        proceed.click();

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("asd@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("123qweasd");

        WebElement login1 = driver.findElement(By.cssSelector("input[value='Login']"));
        login1.click();
    }

    @AfterMethod
    public  void AfterMethod () {
       // driver.quit();
    }
}