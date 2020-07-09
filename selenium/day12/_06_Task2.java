package selenium.day12;

import org.openqa.selenium.JavascriptExecutor;
import utils.BaseDriver;

public class _06_Task2 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.navigate().to("https://www.etsy.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll bottom
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(2000);

        // Scroll top
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

    }
}
/*
        navigate to https://www.etsy.com/
        Navigate to bottom of the page
        */
