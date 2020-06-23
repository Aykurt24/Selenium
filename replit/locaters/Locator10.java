package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator10 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("   https://www.seleniumeasy.com/test/basic-first-form-demo.html  ");

        WebElement aBox = driver.findElement(By.id("sum1"));
        aBox.sendKeys("23");

        WebElement bBox = driver.findElement(By.id("sum2"));
        bBox.sendKeys("23");

        Thread.sleep(2000);

        WebElement close = driver.findElement(By.id("at-cv-lightbox-close"));
        close.click();

        Thread.sleep(2000);

        WebElement total = driver.findElement(By.cssSelector("#gettotal>.btn"));
        total.click();

        WebElement value = driver.findElement(By.id("displayvalue"));
        System.out.println(value.getText());



    }
}
/*
Navigate to https://www.seleniumeasy.com/test/basic-first-form-demo.html

Enter the first value in the Enter a box

Enter the second value int the Enter b box

click on get total

Print the total from the website

 */
