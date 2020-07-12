package replit.recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Recap1 extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://pwa-woo.wpmobilepack.com/#/category/88");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int number1 = (int) (Math.random()*12);
        int number2 = (int) (Math.random()*12);

        List <WebElement> itmeNames = driver.findElements(By.cssSelector(".extra>a"));
        System.out.println(itmeNames.size());
        itmeNames.get(number1).click();
        driver.findElement(By.cssSelector("div.ui>button.ui ")).click();

        driver.navigate().back();
        itmeNames.get(number2).click();
//        ArrayList<String> items = new ArrayList<>();
//        for (WebElement itmeName:itmeNames) {
//            items.add(itmeName.getText());
//        }
//        String itemName1 = items.get(number1);
//        System.out.println(itemName1);
//        String itemName2 = items.get(number2);
//        System.out.println(itemName2);




    }
}
/*
Navigate to  https://pwa-woo.wpmobilepack.com/#/category/88

Add two random items to the cart
    Get the name of the item

Navigate to cart.
    Verify name of the item is displayed in the cart.

Total of two items should be equal to number next to Total text

Note:
  Some items have drop down you need to handle those drop down(s). Choose first option    from the dropdown.
   Do not use Thread.sleep
   Each item should be added one time.
   To make sure your code is working run it at least 5 times.

 */