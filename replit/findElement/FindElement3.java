package replit.findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.List;

public class FindElement3 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.manage().window().maximize();

        driver.navigate().to("https://www.snapdeal.com/ ");

        driver.findElement(By.id("inputValEnter")).sendKeys("phone accessories");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='header_wrapper']//button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='filter-inner ']//div")).click();
        String number = driver.findElement(By.xpath("//div[@class='filter-inner ']//div//label//span")).getText();
        Integer textNum = Integer.parseInt(number);


        Thread.sleep(2000);
        List<WebElement> items = driver.findElements(By.cssSelector(" #products>section>div"));
        int numberOfItem = items.size();

        if(textNum == numberOfItem) {
            System.out.println("Text match with the amount of item");
        }

    }
}
/*
Navigate to  https://www.snapdeal.com/

Search for  phone accessories

Click search button

Click on Fuson button on the left side

Get the text next to Fuson

Verify the item in the page count is equal to text next to Fuson

 */