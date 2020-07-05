package replit.frame;

import org.openqa.selenium.By;
import utils.BaseDriver;

public class Frame4 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("https://chercher.tech/practice/frames");
        driver.switchTo().frame("frame1");
        driver.findElement(By.cssSelector("body>input")).sendKeys("Lara");
        driver.switchTo().frame("frame3");
        driver.findElement(By.id("a")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        driver.findElement(By.cssSelector("#animals>:last-child")).click();


    }
}
/*
Navigate to  https://chercher.tech/practice/frames

Type anything in the topic

Click on Inner frame Check Box

Choose  Avatar from the website

 */