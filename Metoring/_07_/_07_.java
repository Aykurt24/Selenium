package Metoring._07_;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _07_ extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        //~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
        driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=common/home");

        // ~ click on Phones & PDAs
        driver.findElement(By.cssSelector(".collapse>ul>:nth-child(6)>a")).click();

        //~ get the brandName of phones
        Thread.sleep(2000);
        List<WebElement> brandeNames = driver.findElements(By.cssSelector(".caption>h4>a"));
        ArrayList<String> brande = new ArrayList<>();
        for (WebElement brandeName:brandeNames) {
            brande.add(brandeName.getText());
        }
        Collections.sort(brande);

        //~ click on add to button for all elements
        Thread.sleep(2000);
        List<WebElement> phoneList = driver.findElements(By.cssSelector(".button-group>:first-child>:first-child"));
        for (WebElement phone:phoneList) {
            phone.click();
        }

        //~ click on black total added cart button
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#cart>button")).click();

        //~ get the names of list from the cart
        List<WebElement> phoneList1 = driver.findElements(By.cssSelector("tr>.text-left>a"));
        ArrayList<String> phone = new ArrayList<>();
        for (WebElement phone1:phoneList1) {
            phone.add(phone1.getText());
        }
        Collections.sort(phone);

        //~ compare the names from displaying list and cart list
        Thread.sleep(2000);
        for (int i = 0; i <brandeNames.size() ; i++) {

            if (!brande.get(i).equalsIgnoreCase(phone.get(i))){

                Assert.fail("Lists are not match each other");

            }
        }



    }
}

