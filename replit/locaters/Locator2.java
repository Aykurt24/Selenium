package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(" https://testpages.herokuapp.com/styled/index.html ");

        WebElement alert = driver.findElement(By.id("alerts"));
        alert.click();
        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.navigate().back();
        String URL1 = driver.getCurrentUrl();
        System.out.println(URL1);

        WebElement ajax = driver.findElement(By.id("basicajax"));
        ajax.click();
        String URL2 = driver.getCurrentUrl();
        System.out.println(URL2);

    }
}
/*
Navigate to website  https://testpages.herokuapp.com/styled/index.html

Under the  ORIGINAL CONTENTS

click on Alerts
          print the URL

navigate back
         print the URL

Click on Basic Ajax
         print the URL
 */