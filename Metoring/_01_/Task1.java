package Metoring._01_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();// This will open the chrome browser.
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");// This wil open the website
        driver.findElement(By.name("firstname")).sendKeys("zeynep");
        driver.findElement(By.name("lastname")).sendKeys("ucar");
        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("exp-1")).click();
        driver.findElement(By.id("datepicker")).sendKeys("10/04/2019");
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        driver.findElement(By.cssSelector("option:nth-of-type(7)")).click();
        driver.findElement(By.cssSelector("#selenium_commands > option:nth-child(5)")).click();
        driver.findElement(By.className("btn btn-info")).click();







    }

}
