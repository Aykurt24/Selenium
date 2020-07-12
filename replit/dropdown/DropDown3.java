package replit.dropdown;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DropDown3 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
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
Navigate to  https://www.saucedemo.com/

Enter the user name  as standard_user

Enter the password as   secret_sauce

Click on login button

Choose price low to high

Verify item prices are sorted from low to high

 */
