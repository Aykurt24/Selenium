package tstNG.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseDriver1;

import java.util.List;

public class _02_Specials extends BaseDriver1 {

    @Test
    public void specials (){
        WebElement specialsButton = driver.findElement(By.linkText("Specials"));
        specialsButton.click();

         /*
            How could you test the items are specials items.
                1) Get the list of old price and new price and make sure new price < old price
                2) Can we check for the css code if the font style is crossed out? <<--- not sure
                3)
         */

        List<WebElement> oldPriceList = driver.findElements(By.cssSelector("span[class='price-old']"));

        List<WebElement> imageList = driver.findElements(By.xpath("//div[@class='image']"));

        Assert.assertTrue(oldPriceList.size()==imageList.size());

        /*
            Create a XML file for contact us class and specials class
         */
    }

}
