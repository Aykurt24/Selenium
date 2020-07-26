package Projects.saturdayProject5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Random;

public class ResuableMethodForProject5 {

    public int RandomNumber(int max){

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(max-1)+1;

        return randomNumber;
    }

    public void updateName(WebDriver driver,String firstName, String lastName){

        WebElement firstN = driver.findElement(By.cssSelector("ul.last_item>:nth-child(2)>:first-child"));
        WebElement lastN = driver.findElement(By.cssSelector("ul.last_item>:nth-child(2)>:last-child"));

        Assert.assertTrue(firstN.getText().equalsIgnoreCase(firstName));
        Assert.assertTrue(lastN.getText().equalsIgnoreCase(lastName));

    }

}
