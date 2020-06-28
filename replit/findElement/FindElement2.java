package replit.findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.List;

public class FindElement2 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.manage().window().maximize();

        driver.navigate().to("https://www.snapdeal.com/ ");
        driver.findElement(By.cssSelector(".nav>:nth-child(16)")).click();

        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.xpath("//div[@id='SMPCTab']//div[2]//div/div//ul//li"));

        System.out.println(options.size());

        for (int i = 0; i <options.size() ; i++) {

            System.out.println(options.get(i).getText());

        }
    }
}
/*
Navigate to  https://www.snapdeal.com/

Click on  See All Categories on the left side

Get all the options under the COMPUTERS, OFFICE & GAMING

print the count of the options --> result should be 20

print the text of all the elements in the result
 */