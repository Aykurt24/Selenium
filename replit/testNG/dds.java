package replit.testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.List;


public class dds extends BaseDriver   {


    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.hotels.com/search.do?resolved-location=CITY%3A1482664%3AUNKNOWN%3AUNKNOWN&destination-id=1482664&q-destination=Manhattan%20Beach,%20California,%20United%20States%20of%20America&q-check-in=2020-09-15&q-check-out=2020-09-17&q-rooms=1&q-room-0-adults=2&q-room-0-children=0");

        WebElement fiveStar = driver.findElement(By.id("f-star-rating-5"));
        fiveStar.click();
        WebElement fourStar = driver.findElement(By.id("f-star-rating-4"));
        fourStar.click();

        Thread.sleep(5000);
        List<WebElement> hotelList = driver.findElements(By.className("property-name-link"));

        while (hotelList.size() <= 28) {

        JavascriptExecutor js = (JavascriptExecutor) driver;


        js.executeScript("arguments[0].scrollIntoView();", hotelList.get(hotelList.size() - 1));

        hotelList = driver.findElements(By.className("property-name-link"));

        }

        Assert.assertEquals(27, hotelList.size() - 1);


//        List<WebElement> stars = driver.findElements(By.cssSelector(" div.additional-details.resp-module > span"));
//        List<String> starsHotel = new ArrayList<>();
//        for (WebElement webElement : stars) {
//        String star = webElement.getText();
//        star = star.replaceAll("[^\\d.]", "");
//        double starD = Double.parseDouble(star);
//        if (starD > 4.0 & starD < 5.0) {
//        starsHotel.add(webElement.getText());
//        }
//
//        }
//
//        System.out.println(starsHotel.);
    }
}







