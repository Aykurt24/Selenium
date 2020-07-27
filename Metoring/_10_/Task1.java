package Metoring._10_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1 extends TaskDirver {

    @Parameters ({"search", "quantity"})
    @Test

    public void Test1(String itme ,String locater){

        driver.navigate().to("https://www.snapdeal.com/");

        WebElement searchInput = driver.findElement(By.id("inputValEnter"));
        searchInput.sendKeys(itme);

        WebElement searchButton = driver.findElement(By.cssSelector("div.col-xs-14>button"));
        searchButton.click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement quantity = driver.findElement(By.cssSelector(locater));
        Assert.assertTrue( Integer.parseInt(quantity.getText())>0);



    }
}

/*
   navigate to the https://www.snapdeal.com/

    write some items (sunglassses, umbrella for kids, kid bicycle )  on search area

    and verify quantity of items on the left bar

     */
