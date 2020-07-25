package tstNG.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.BaseMultipleDriver;
import utils.ReusableMethods;

public class _01_ContactUs extends BaseMultipleDriver{
    /*
        Click on contact us button in the page(bottom of the page)
        Enter the value for Enquiry
        Click on Submit button
        verify success message is dispalayed
   */

    @Test
    @Parameters ("enquiry")
    public void contactUs (String enquiry){

        WebElement contactButton = driver.findElement(By.linkText("Contact Us"));
        contactButton.click();


        WebElement name = driver.findElement(By.id("input-name"));
        name.clear();
        name.sendKeys("Dogan");

        WebElement email = driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("do@gmail.com");

        WebElement enquiryText = driver.findElement(By.id("input-enquiry"));
        enquiryText.sendKeys(enquiry);

        WebElement submitButton = driver.findElement(By.cssSelector("input[value=Submit]"));
        submitButton.click();

        WebElement message = driver.findElement(By.cssSelector("#content>p"));
        Assert.assertTrue(message.getText().contains("success"));
        
    }

}
