package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(" https://www.seleniumeasy.com/test/basic-checkbox-demo.html  ");
        driver.manage().window().maximize();
        driver.findElement(By.id("isAgeSelected")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("check1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("check1")).click();


//        driver.findElement(By.cssSelector(".cb1-element:nth-of-type(1)")).click();
//        driver.findElement(By.cssSelector("..panel-body>.checkbox:nth-child(4)>label>:nth-of-type(1)")).click();
//        driver.findElement(By.cssSelector("..panel-body>.checkbox:nth-child(5)>label>:nth-of-type(1)")).click();
//        driver.findElement(By.cssSelector("..panel-body>.checkbox:nth-child(6)>label>:nth-of-type(1)")).click();


    }
}

/*
Navigate to  https://www.seleniumeasy.com/test/basic-checkbox-demo.html

Click on check all button

Print the " Uncheck All" text from the Uncheck All button

 */
