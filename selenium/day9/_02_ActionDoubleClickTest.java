package selenium.day9;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseDriver;

public class _02_ActionDoubleClickTest extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");

        WebElement clickButton1 = driver.findElement(By.xpath("//button[text()='Double Click Me']"));

        Actions builder1 = new Actions(driver);
        Action build1 = builder1.moveToElement(clickButton1).click().click().build();
        build1.perform();

        String dynamicClickMessage1 = driver.findElement(By.id("doubleClickMessage")).getText();
        Assert.assertEquals("You have done a double click", dynamicClickMessage1);
    }
}
