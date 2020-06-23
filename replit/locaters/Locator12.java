package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(" https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        Thread.sleep(2000);
        WebElement adver = driver.findElement(By.id("at-cv-lightbox-close"));
        adver.click();

        Thread.sleep(2000);
        WebElement input = driver.findElement(By.linkText("Input Forms"));
        input.click();

        WebElement ajax = driver.findElement(By.linkText("Ajax Form Submit"));
        ajax.click();

        WebElement name = driver.findElement(By.id("title"));
        name.sendKeys("Dogan");

        WebElement comment = driver.findElement(By.id("description"));
        comment.sendKeys("All is well");

        WebElement click = driver.findElement(By.id("btn-submit"));
        click.click();

        Thread.sleep(2000);
        WebElement text = driver.findElement(By.id("submit-control"));
        System.out.println(text.getText());
    }
}
/*
navigate to  https://www.seleniumeasy.com/test/basic-first-form-demo.html

Click on input forms

Click on  Ajax form Submit

Enter the name

Enter the comment

Click on Submit

Get the text  Form submited Successfully!

print the text
 */