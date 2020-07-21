package replit.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.List;


public class _01_tstNG extends BaseDriver {


    @Test
    public void scroll() {
        driver.get("https://www.hotels.com/search.do?resolved-location=CITY%3A1482664%3AUNKNOWN%3AUNKNOWN&destination-id=1482664&q-destination=Manhattan%20Beach,%20California,%20United%20States%20of%20America&q-check-in=2020-09-15&q-check-out=2020-09-17&q-rooms=1&q-room-0-adults=2&q-room-0-children=0");

        List<WebElement> hotelList = driver.findElements(By.className("property-name-link"));

        while (hotelList.size() <= 49) {

            JavascriptExecutor js = (JavascriptExecutor) driver;


            js.executeScript("arguments[0].scrollIntoView();", hotelList.get(hotelList.size() - 1));

            hotelList = driver.findElements(By.className("property-name-link"));

        }

        Assert.assertEquals(50, hotelList.size() - 1);


        List<WebElement> milesCity = driver.findElements(By.cssSelector(" div.location-info.resp-module > ul > li:nth-child(1)"));
        List<String> cityHotel = new ArrayList<>();
        for (int i = 0; i <milesCity.size() ; i++) {
            if (milesCity.get(i).getText().contains("City")){
                String mile = milesCity.get(i).getText();
                mile = mile.replaceAll("[^\\d.]", "");
                Double mileD = Double.parseDouble(mile);
                if (mileD < 10.0){
                    cityHotel.add(hotelList.get(i).getText());
                }
            }
        }

        List<WebElement> milesLAX = driver.findElements(By.cssSelector(" div.location-info.resp-module > ul > li:nth-child(2)"));
        List<String> lAXHotel = new ArrayList<>();

        for (int i = 0; i <milesLAX.size() ; i++) {
            if (milesLAX.get(i).getText().contains("City")){
                String mile = milesLAX.get(i).getText();
                mile = mile.replaceAll("[^\\d.]", "");
                Double mileD = Double.parseDouble(mile);
                if (mileD < 10.0){
                    lAXHotel.add(hotelList.get(i).getText());
                }
            }
        }
        for (int i = 0; i <lAXHotel.size(); i++) {
            Assert.assertTrue(lAXHotel.get(i).equalsIgnoreCase(cityHotel.get(i)));
        }

    }
}

