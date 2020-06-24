package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

public class Locator15 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html ");

        Thread.sleep(2000);
        driver.findElement(By.id("at-cv-lightbox-close")).click();
        driver.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id='treemenu']/li/ul/li/ul/li[3]/a")).click();
        WebElement check = driver.findElement(By.id("buttoncheck"));
        check.click();
        WebElement text = driver.findElement(By.cssSelector(".col-md-6:nth-of-type(2)>div>.panel-heading"));
        System.out.println(text.getText());

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".col-md-6:nth-of-type(2)>.panel>.panel-body>label:nth-child(2)>input")).click();
        check.click();
        WebElement text1 = driver.findElement(By.cssSelector(".col-md-6:nth-of-type(2)>div>.panel-body>:last-child"));
        System.out.println(text1.getText());

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".col-md-6:nth-of-type(2)>.panel>.panel-body>label:nth-child(3)>input")).click();
        check.click();
        System.out.println(text1.getText());

    }



}
/*
 Navigate to https://www.seleniumeasy.com/test/basic-first-form-demo.html

Click on Input Forms

Click on Radio buttons

In the  Radio Button Demo table

Click on Get checked value

Print text is displated " Radio button is Not checked "


Click on Male Radio button

Click on Get Checked Value

Print text is displayed " Radio button 'Male' is checked "


Click on Female Radio button

Click on Get Checked Value

Print text is displayed " Radio button 'Female' is checked "

 */