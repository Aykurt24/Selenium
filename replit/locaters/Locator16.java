package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

public class Locator16 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.navigate().to(" https://www.seleniumeasy.com/test/basic-first-form-demo.html ");
        Thread.sleep(2000);
        driver.findElement(By.id("at-cv-lightbox-close")).click();
        driver.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id='treemenu']/li/ul/li/ul/li[3]/a")).click();

        Thread.sleep(2000);
        WebElement male = driver.findElement(By.cssSelector(".col-md-6:nth-child(2)>div:last-child>.panel-body>div>:nth-child(2)"));
        male.click();
        WebElement fivEnd =driver.findElement(By.cssSelector(".col-md-6:nth-child(2)>div:last-child>.panel-body>:nth-child(3)>:nth-child(2)"));
        fivEnd.click();
        WebElement getValue = driver.findElement(By.cssSelector(".col-md-6:nth-child(2)>div:last-child>.panel-body>:nth-child(5)"));
        getValue.click();

        Thread.sleep(2000);
        WebElement sex = driver.findElement(By.cssSelector(".col-md-6:nth-child(2)>div:last-child>.panel-body>:nth-child(8)"));
        System.out.println(sex.getText());

        Thread.sleep(2000);
        male.click();
        WebElement fiveStrat = driver.findElement(By.cssSelector(".col-md-6:nth-child(2)>div:last-child>.panel-body>:nth-child(3)>:nth-child(3)"));
        fiveStrat.click();
        getValue.click();
        System.out.println(sex.getText());

        Thread.sleep(2000);
        male.click();
        WebElement fifthyEnd = driver.findElement(By.cssSelector(".col-md-6:nth-child(2)>div:last-child>.panel-body>:nth-child(3)>:nth-child(4)"));
        fifthyEnd.click();
        getValue.click();
        System.out.println(sex.getText());

        Thread.sleep(2000);
        WebElement female = driver.findElement(By.cssSelector(".col-md-6:nth-child(2)>div:last-child>.panel-body>div>:nth-child(3)"));
        female.click();
        fivEnd.click();
        getValue.click();
        System.out.println("=================================");
        System.out.println(sex.getText());

        Thread.sleep(2000);
        female.click();
        fiveStrat.click();
        getValue.click();
        System.out.println(sex.getText());

        Thread.sleep(2000);
        female.click();
        fifthyEnd.click();
        getValue.click();
        System.out.println(sex.getText());


    }

}

