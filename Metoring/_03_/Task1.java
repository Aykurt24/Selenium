package Metoring._03_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

public class Task1 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.bestbuy.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement text = driver.findElement(By.id("email-submission-title-1b1abf1b-2bef-41a2-ad44-0917161f32f2"));
        System.out.println(text.getText());

        driver.findElement(By.cssSelector(".c-close-icon")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("gh-search-input")).sendKeys("Ipad");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".header-search-button")).click();
        driver.findElement(By.cssSelector(".nav-menu-links>li:nth-of-type(3)>a")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".dropdown-active>:last-child>div>ul>li:nth-of-type(2)>a")).click();


    }

}
