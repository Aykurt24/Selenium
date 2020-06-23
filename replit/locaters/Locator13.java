package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locator13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("    https://www.etsy.com/ ");

        WebElement search = driver.findElement(By.id("global-enhancements-search-query"));
        search.sendKeys("teddy bear");

        WebElement click = driver.findElement(By.className("wt-input-btn-group__btn"));
        click.click();

        Thread.sleep(2000);
        WebElement element = driver.findElement(By.cssSelector("a[data-level=child][data-path=toys_and_games]"));
        element.click();

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        WebElement remove = driver.findElement(By.id("global-enhancements-search-query"));
        remove.clear();
        remove.sendKeys("phone");

        Thread.sleep(2000);

//        WebElement search1 = driver.findElement(By.id("global-enhancements-search-query"));
//        search1.sendKeys("phone");

        WebElement click1 = driver.findElement(By.className("wt-input-btn-group__btn"));
        click1.click();

        String URL1 = driver.getCurrentUrl();
        System.out.println(URL1);


    }


}

/*
Navigate to   https://www.etsy.com/

Search for teddy bear

Click on Toys and games on the left navigator under the all categories

Print the URL
Note : URL should be  https://www.etsy.com/search/toys-and-games?q=teddy+bear&explicit=1

Remove the teddy bear from the search input

Search for phone

Print the URL


 */
