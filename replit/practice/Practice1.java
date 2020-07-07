package replit.practice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice1 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("http://practice.automationtesting.in/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".post-163>a.woocommerce-LoopProduct-link")).click();
        String productName = driver.findElement(By.cssSelector(".product_title")).getText();
        String quantity = "4";
        WebElement numberOfItem = driver.findElement(By.cssSelector(".input-text"));
        numberOfItem.clear();
        numberOfItem.sendKeys(quantity);
        driver.findElement(By.cssSelector(".single_add_to_cart_button")).click();

        driver.findElement(By.cssSelector("div.woocommerce-message>.button")).click();
        String productName1 = driver.findElement(By.cssSelector(".product-name>a")).getText();
        Assert.assertEquals(productName,productName1);
        List<String> prices = new ArrayList<>();
        prices.add(driver.findElement(By.cssSelector("td.product-price>span")).getText().replaceAll("[^\\d.]", ""));
        prices.add(quantity);
        prices.add(driver.findElement(By.cssSelector(".tax-rate>td>span")).getText().replaceAll("[^\\d.]", ""));
        prices.add(driver.findElement(By.cssSelector("td.product-subtotal>span")).getText().replaceAll("[^\\d.]", ""));
        prices.add(driver.findElement(By.cssSelector(".order-total>td>strong>span")).getText().replaceAll("[^\\d.]", ""));

        StringtoDoubletoHashMap(prices);

        driver.findElement(By.cssSelector(".wc-proceed-to-checkout>a")).click();
        driver.findElement(By.id("billing_first_name")).sendKeys("Naz");
        driver.findElement(By.id("billing_last_name")).sendKeys("Ay");
        driver.findElement(By.id("billing_email")).sendKeys("Ay@gmail.com");
        driver.findElement(By.id("billing_phone")).sendKeys("2019394232");
        driver.findElement(By.cssSelector("#s2id_billing_country>a")).click();
        driver.findElement(By.cssSelector("#select2-drop>div>input")).sendKeys("Albania");
        Actions actions = new Actions(driver);
        WebElement country = driver.findElement(By.cssSelector(".select2-results>:nth-child(1)"));
        Action action1 = actions.moveToElement(country).click().build();
        action1.perform();
        driver.findElement(By.cssSelector("p>#billing_address_1")).sendKeys("411 Clicfton");
        driver.findElement(By.cssSelector("p>#billing_city")).sendKeys("XXXXX");
        driver.findElement(By.cssSelector("p>#billing_state")).sendKeys("None");
        driver.findElement(By.cssSelector("p>#billing_state")).sendKeys("None");
        driver.findElement(By.cssSelector("p>#billing_postcode")).sendKeys("1234");
        driver.findElement(By.cssSelector("#payment_method_cod")).click();
        driver.findElement(By.id("place_order")).click();
        String totalCart = driver.findElement(By.cssSelector(".order-total>td>strong>span")).getText();
        String totalConfirmation = driver.findElement(By.cssSelector("confirmation")).getText();
        Assert.assertEquals(totalCart,totalConfirmation);




    }

    private static void StringtoDoubletoHashMap(List<String> prices) {
        List<Double> priceDouble = new ArrayList<>();

        for (String price : prices) {
            Double priceD = Double.parseDouble(price);
            priceDouble.add(priceD);
        }
        HashMap<String, Double> map = new HashMap<>();
        map.put("Product price",priceDouble.get(0));
        map.put("Quantaty",priceDouble.get(1));
        map.put("Romain tax",priceDouble.get(2));
        map.put("SubTotal",priceDouble.get(3));
        map.put("Total",priceDouble.get(4));

        Double productPrice = map.get("Product price");
        Double quantaty = map.get("Quantaty");
        Double subTotal= productPrice*quantaty;
        Assert.assertEquals(subTotal,map.get("SubTotal"));
        Double romainTax = map.get("Romain tax");
        Double total = romainTax + subTotal;
        Assert.assertEquals(total,map.get("Total"));

    }
}
/*
Navigate to  http://practice.automationtesting.in/

Click on Random Items under the new arrivals

Enter the random quantity in the product page

Click on Add to basket button in the product page

Click on cart button in the product page

Verify Product name in the cart page and in the product page is equal

Verify price * quantity equal to total

Verify subtotal + roaming tax equal to total

Click on the proceed to checkout

Enter  First Name , last name , Email address , Phone

Choose Albania from the country dropdown

Enter the address ,town/city  State and PostalCode /zip

Click on the place order button

Verify Text total in the cart page and text total in the confirmation page is equal

 */
