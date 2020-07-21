package replit.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseDriver;

import java.util.List;
import java.util.Random;

public class _02_tstNG extends BaseDriver {

    @Test

    public void Test1 () throws InterruptedException {

        driver.navigate().to("https://www.hotels.com/search.do?resolved-location=CITY%3A1482664%3AUNKNOWN%3AUNKNOWN&destination-id=1482664&q-destination=Manhattan%20Beach,%20California,%20United%20States%20of%20America&q-check-in=2020-12-01&q-check-out=2020-12-02&q-rooms=1&q-room-0-adults=2&q-room-0-children=0");

        WebElement currencyButton = driver.findElement(By.cssSelector("#header-toggle-currency"));
        currencyButton.click();
        String currency = currencyButton.getText();

        Random random = new Random();
        int number = random.nextInt(72);
        Thread.sleep(2000);
        List<WebElement> currencyies = driver.findElements(By.cssSelector("div.widget-overlay-bd>:last-child>li>a"));
        currencyies.get(number).click();
        Thread.sleep(2000);
        currencyButton = driver.findElement(By.cssSelector("#header-toggle-currency"));
        String currency1 = currencyButton.getText();

        Assert.assertNotEquals(currency1, currency);



    }
}
