package tstNG.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.BaseDriver1;

import java.util.List;

public class _03_SearchFunctionality extends BaseDriver1 {

    @Test
    @Parameters ("search")
    public void searchElement (String Element){
        WebElement searchElement = driver.findElement(By.cssSelector("#search>input"));
        searchElement.sendKeys(Element);

        WebElement searchButton = driver.findElement(By.cssSelector("#search>span>button"));
        searchButton.click();

        List<WebElement> productNames = driver.findElements(By.cssSelector("h4 > a"));
        for (WebElement productName:productNames) {
            Assert.assertTrue(productName.getText().toLowerCase().contains(Element));
        }

    }

}
