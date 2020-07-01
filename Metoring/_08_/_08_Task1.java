package Metoring._08_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.List;

public class _08_Task1 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/inventory.html");

        Thread.sleep(3000);
        List<WebElement> itemsList = driver.findElements(By.cssSelector("a>div"));
        for (WebElement item:itemsList) {
            if (item.getText().equalsIgnoreCase("Sauce Labs Bike Light")){
                driver.findElement(By.cssSelector(".inventory_list>:nth-child(2)>:nth-child(3)>button")).click();
            }

        }
        Thread.sleep(3000);
        for (int i = 3; i <5 ; i++) {
            driver.findElement(By.cssSelector(".inventory_list>:nth-child("+i+")>:nth-child(3)>button")).click();
        }
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#shopping_cart_container>a")).click();
        driver.findElement(By.cssSelector(".cart_list>:nth-child(3)>:nth-child(2)>:nth-child(3)>button")).click();
    }


}
/*
https://www.saucedemo.com/inventory.html"
 TASK2
        Find the list of the item names
        if the item name is "Sauce Labs Bike Light" , add to cart
        After this step add 2 more items to the cart
        And remove the "Sauce Labs Bike Light" from the cart
 */
