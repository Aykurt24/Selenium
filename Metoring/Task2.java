package Metoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();// This will open the chrome browser.
        driver.get("https://www.techlistic.com");

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#LinkList3>.widget-content>ul>li:nth-child(4)>a")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("#LinkList3>.widget-content>ul>li:nth-of-type(1)")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("#LinkList2>.widget-content>ul>li:nth-of-type(5)")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("#LinkList3>.widget-content>ul>li:nth-of-type(2)")).click();




        /*
        https://www.techlistic.com
            Maximize or set size of browser window
            Click on 'Java' Tutorial link and validate page title.
            Navigate back to Home Page.
            Click on 'Selenium WebDriver'  Tutorial link and validate page title.
            Navigate back to Home Page.
            Click on 'Selenium IDE'  Blogs link and validate page title.
            Navigate back to Home Page.
            Click on 'TestNG' Blogs link and validate page title.

         */
    }
}
