package tstNG.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.BaseDriver1;

public class _02_Sample1 extends BaseDriver1 {

    @Test
    @Parameters("enquiry")
    public void contactUs(String enquiry) throws InterruptedException {

        WebElement contactButton = driver.findElement(By.linkText("Contact Us"));
        contactButton.click();

        WebElement enquiryInput = driver.findElement(By.id("input-enquiry"));
        enquiryInput.sendKeys(enquiry);

        Thread.sleep(5000);

//        WebElement submitButton = driver.findElement(By.className("btn btn-primary")); if there is a space between class value
//              then selenium is not able to locate the element with className locator type

        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
        submitButton.click();

        WebElement successMessage = driver.findElement(By.cssSelector("div[id='content']>p"));

        Assert.assertTrue(successMessage.getText().contains("successfully"));

    }


}