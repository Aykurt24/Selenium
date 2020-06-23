package selenium.day5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _11_XPathPlan {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        // try to login
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@class='btn_action']")).click();

        // check if logged in by find cart element
        try {
            driver.findElement(By.xpath("//a[contains(@class,'shopping_cart')]"));
            System.out.println("Successfully logged in!");
        } catch (NoSuchElementException e) {
            System.out.println("Failed to log in");
        }
        // add first item to cart
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='item_4_title_link']")).click();
        String firstItemName = driver.findElement(By.xpath("//div[@class='inventory_details_name']")).getText();
        System.out.println("First item name is " + firstItemName);
        String firstItemPrice = driver.findElement(By.xpath("//div[@class='inventory_details_price']")).getText();
        System.out.println("First item price is " + firstItemPrice);
        driver.findElement(By.xpath("//button[contains(@class,'btn_primary')]")).click();
        // check if added
        try {
            driver.findElement(By.xpath("//a[contains(@class,'shopping_cart')]//span[text()='1']"));
            System.out.println("Successfully added item!");
        } catch (NoSuchElementException e) {
            System.out.println("Failed to add an item");
        }

        // navigate back
        driver.navigate().back();

        // add second item to cart
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='item_0_title_link']")).click();
        String secondItemName = driver.findElement(By.xpath("//div[@class='inventory_details_name']")).getText();
        System.out.println("Second item name is " + secondItemName);
        String secondItemPrice = driver.findElement(By.xpath("//div[@class='inventory_details_price']")).getText();
        System.out.println("Second item price is " + secondItemName);
        driver.findElement(By.xpath("//button[contains(@class,'btn_primary')]")).click();

        // check if added
        try {
            driver.findElement(By.xpath("//a[contains(@class,'shopping_cart')]//span[text()='2']"));
            System.out.println("=====================================");
            System.out.println("Successfully added item!");
        } catch (NoSuchElementException e) {
            System.out.println("Failed to add an item");
        }
        // go to checkout page
        driver.findElement(By.xpath("//a[contains(@class,'shopping_cart')]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'btn_action')]")).click();
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Dogan");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Aykurt");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1234");
        driver.findElement(By.xpath("//input[contains(@class,'btn_primary')]")).click();


        // check the items names and their individual prices
        String firstItemNameInCart = driver.findElement(By.xpath("//div[@class='cart_item'][1]//div[@class='inventory_item_name']")).getText();
        String firstItemPriceInCart = driver.findElement(By.xpath("//div[@class='cart_item'][1]//div[@class='inventory_item_price']")).getText();
        Assert.assertEquals(firstItemName, firstItemNameInCart);
        Assert.assertEquals(firstItemPrice, firstItemPriceInCart);

        String secondItemNameInCart = driver.findElement(By.xpath("//div[@class='cart_item'][2]//div[@class='inventory_item_name']")).getText();
        String secondItemPriceInCart = driver.findElement(By.xpath("//div[@class='cart_item'][2]//div[@class='inventory_item_price']")).getText();
        Assert.assertEquals(secondItemName, secondItemNameInCart);
        Assert.assertEquals(secondItemPrice, secondItemPriceInCart);


        // check total
        String totalText = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText();
        System.out.println("Total text: " + totalText);
        String total = totalText.replaceAll("[^\\d.]", "");
        System.out.println("Total: " + total);
        String firstPrice = firstItemPriceInCart.replaceAll("[^\\d.]", "");
        System.out.println("firstPrice: " + firstPrice);
        String secondPrice = secondItemPriceInCart.replaceAll("[^\\d.]", "");
        System.out.println("secondPrice: " + secondPrice);
        double totalAsDouble = Double.parseDouble(total);
        double firstPriceAsDouble = Double.parseDouble(firstPrice);
        double secondPriceAsDouble = Double.parseDouble(secondPrice);
        Assert.assertEquals(firstPriceAsDouble + secondPriceAsDouble, totalAsDouble, 0);

        // check tax is 8%
        String summaryTotalText = driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText();
        System.out.println("Summary Total text: " + summaryTotalText);
        String summaryTotal = summaryTotalText.replaceAll("[^\\d.]", "");
        double summaryTotalAsDouble = Double.parseDouble(summaryTotal);
        double totalIncludingTax = totalAsDouble * 1.08;
        Assert.assertEquals(totalIncludingTax, summaryTotalAsDouble, 0.01);
    }
}
