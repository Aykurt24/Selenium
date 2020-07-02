package Metoring._08_;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _08_Task2 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/inventory.html");
        driver.findElement(By.cssSelector("#inventory_filter_container>select>:nth-child(3)")).click();

        Thread.sleep(2000);
        List<WebElement> priceLists = driver.findElements(By.cssSelector(".inventory_item_price"));
        ArrayList<String> listOfPrice = new ArrayList<>();
        for (WebElement price:priceLists) {
            listOfPrice.add(price.getText().replaceAll("[^\\d.]", ""));
        }

        Thread.sleep(2000);
        ArrayList<Double> doublePrice = new ArrayList<>();
        for (int i = 0; i <listOfPrice.size() ; i++) {
            Double priceD = Double.parseDouble(listOfPrice.get(i));
            doublePrice.add(priceD);
        }
        Collections.sort(doublePrice);

        Thread.sleep(2000);
        for (int i = 0; i <doublePrice.size()-1 ; i++) {

            if (doublePrice.get(i)>doublePrice.get(i+1)){

                Assert.fail("The price is not low to high in the list ");
            }

        }

    }
}

/*
Check the price low to high
 */
