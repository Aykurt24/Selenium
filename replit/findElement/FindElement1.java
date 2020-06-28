package replit.findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.List;

public class FindElement1 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.manage().window().maximize();

        driver.navigate().to("https://www.snapdeal.com/ ");

        driver.findElement(By.cssSelector(".nav>:nth-child(16)")).click();
        Thread.sleep(2000);
        List<WebElement> categories = driver.findElements(By.cssSelector("div>.SmBox1>ul>li>a"));

        for(int i = 0 ; i<categories.size() ; i++){

            String category = categories.get(i).getText();

            System.out.println(category);
        }

        System.out.println(categories.size());




    }
}

/*
Navigate to  https://www.snapdeal.com/

Click on  See All Categories on the left navigator

Get all the categories

Print the count of the categories --> result should be 11

Print each text of the categories
 */
