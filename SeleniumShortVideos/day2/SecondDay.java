package SeleniumShortVideos.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondDay {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/doganaykurt/Desktop/chromedriver");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // navigate to google.com
        driver.get("https://www.google.com/");

        // id locator
        driver.findElement(By.id("gb_70")).click();

        driver.findElement(By.id("identifierId")).sendKeys("doganaykurt@gmail.com");


        driver.findElement(By.id("identifierNext")).click();

//        driver.findElement(By.linkText(" Next ")).click();
//        driver.findElement(By.className("mat-select-value ng-tns-c89-3"));

        driver.get("https://support.google.com/accounts/answer/7675428?hl=en");

        Thread.sleep(1000);

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        // name locator

        String header = driver.findElement(By.className("")).getText();
        System.out.println(header);

        // Linked text

        driver.findElement(By.linkText("")).click(); // you need all text
        driver.navigate().back();

        // Partial Linked text

        driver.findElement(By.partialLinkText("")).click(); // you do not need all text. you need part of text

       // driver.quit();


    }
}
