package replit.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.List;

public class _04_tstNG extends BaseDriver {

    @Test
    public void Test1 () throws InterruptedException {

        driver.get("https://www.hotels.com/search.do?resolved-location=CITY%3A1482664%3AUNKNOWN%3AUNKNOWN&destination-id=1482664&q-destination=Manhattan%20Beach,%20California,%20United%20States%20of%20America&q-check-in=2020-09-15&q-check-out=2020-09-17&q-rooms=1&q-room-0-adults=2&q-room-0-children=0");

        WebElement priceMenu = driver.findElement(By.cssSelector("#enhanced-sort>:last-child"));
        Actions actions = new Actions(driver);
        actions.moveToElement(priceMenu).perform();

        WebElement highToLow = driver.findElement(By.cssSelector("#sort-submenu-price>:first-child>a"));
        actions.moveToElement(highToLow).click().perform();

        Thread.sleep(3000);
        List<WebElement> hotelList = driver.findElements(By.className("price-link"));

        while (hotelList.size() <= 230) {

            JavascriptExecutor js = (JavascriptExecutor) driver;


            js.executeScript("arguments[0].scrollIntoView();", hotelList.get(hotelList.size() - 1));

            hotelList = driver.findElements(By.className("price-link"));

        }

        Thread.sleep(3000);
        List<WebElement> priceLists = driver.findElements(By.xpath("//a[@class='price-link' and //ins or @class='price' and //a//strong]"));
        List<String> priceString = new ArrayList<>();
        for (WebElement price:priceLists) {
            if(price.getText().contains("$"))
                priceString.add(price.getText());
        }

        for (int i = 0; i <priceLists.size() ; i++) {
            Assert.assertTrue(priceString.get(i).equalsIgnoreCase(hotelList.get(i).getText()));
        }

    }
}
