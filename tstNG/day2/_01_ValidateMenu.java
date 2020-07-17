package tstNG.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseDriver1;
import utils.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class _01_ValidateMenu extends BaseDriver1 {

    /*
        System.out.println --> is just printing the result but it is not testing it
        Assert.assertEquals-assertTrue --> If there is a failure then assert give me an error icon so I can understand
            there is a problem in that website.
        NOTE: One java class can not extend two multiple classes
     */

    @Test(groups = "Regression")
    public void validateMenu(){

        List<String> expectedMenuItems=new ArrayList<>();

        expectedMenuItems.add("Desktops");
        expectedMenuItems.add("Laptops & Notebooks");
        expectedMenuItems.add("Components");
        expectedMenuItems.add("Tablets");
        expectedMenuItems.add("Software");
        expectedMenuItems.add("Phones & PDAs");
        expectedMenuItems.add("Cameras");
        expectedMenuItems.add("MP3 Players");

        List<WebElement> actualResult = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li"));

        List<String> actualStrings = new ArrayList<>();

        actualStrings = ReusableMethods.WebElmentToString(actualResult);

        ReusableMethods.verifyTwoStringList(expectedMenuItems , actualStrings);

    }


}