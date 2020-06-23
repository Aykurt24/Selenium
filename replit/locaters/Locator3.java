package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("  https://testpages.herokuapp.com/styled/index.html  ");

        WebElement playgraound = driver.findElement(By.id("findby"));
        playgraound.click();

        WebElement text = driver.findElement(By.id("p5"));
        System.out.println(text.getText());
    }


}
/*
Navigate to Website  https://testpages.herokuapp.com/styled/index.html

Click on  Find By Playground

     Find the 5th text

then print it
 */
