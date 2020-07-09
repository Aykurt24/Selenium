package selenium.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

public class _05_Task1 extends BaseDriver {

    public static void main(String[] args) {

        driver.navigate().to("https://www.etsy.com/");

        WebElement target = driver.findElement(By.cssSelector(" div.text-center > h2"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",target);

    }
}
/*
        navigate to https://www.etsy.com/
        Scroll to What is Etsy? text
 */