package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

public class Locator14 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        Thread.sleep(2000);
        driver.findElement(By.id("at-cv-lightbox-close")).click();

        driver.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[6]/a")).click();

        driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(6) > ul > li:nth-child(1) > a")).click();

       Thread.sleep(2000);
       WebElement first = driver.findElement(By.cssSelector(".dual-list>.well>.list-group>li:first-of-type"));
       first.click();


        WebElement clickR = driver.findElement(By.cssSelector(".list-arrows>button:nth-child(2)"));
        clickR.click();

        Thread.sleep(2000);
        WebElement second = driver.findElement(By.cssSelector(".well>.list-group>li:first-of-type"));
        second.click();
        clickR.click();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".dual-list:last-child>.well>.list-group>li:nth-of-type(6)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".dual-list:last-child>.well>.list-group>li:nth-of-type(7)")).click();

        driver.findElement(By.cssSelector(".dual-list:last-child>.well>.list-group>li")).click();
        WebElement clickL = driver.findElement(By.cssSelector(".list-arrows>.btn"));
        clickL.click();

        driver.findElement(By.cssSelector(".dual-list:last-child>.well>.list-group>li:nth-of-type(2)")).click();
        clickL.click();




    }
}

/*
Navigate to https://www.seleniumeasy.com/test/basic-first-form-demo.html

Click on List box

Click Box Strap List Box

Click on bootstrap-duallist and click on right arrow

Click on  Dapibus ac facilisis in  and click on right arrow

Click on Cras husto odio and click on left arrow

Click on Morbi leo risus and click on left arrow

Left box list should be

Morbi leo risus
Porta ac consectetur ac
Vestibulum at eros
Cras justo odio
Morbi leo risus

Right box table should be

Dapibus ac facilisis in
Porta ac consectetur ac
Vestibulum at eros
bootstrap-duallist
Dapibus ac facilisis in
 */
