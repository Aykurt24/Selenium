package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator4 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("  https://testpages.herokuapp.com/styled/index.html  ");

        WebElement playgraound = driver.findElement(By.id("searchtest"));
        playgraound.click();

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        WebElement search = driver.findElement(By.name("btnG"));
        search.click();

        String URL1 = driver.getCurrentUrl();
        System.out.println(URL1);
    }

}


/*
Navigate to website  https://testpages.herokuapp.com/styled/index.html

Click on  Search

      Print the URL

Click on Search button

      print the URL


 */