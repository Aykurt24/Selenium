package selenium.day9;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseDriver;

public class _03_ActionRigthClick extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");

        WebElement clickButton2 = driver.findElement(By.xpath("//button[text()='Right Click Me']"));

        Actions builder2 = new Actions(driver);
        Action build2 = builder2.moveToElement(clickButton2).contextClick(clickButton2).build();
        build2.perform();

        String dynamicClickMessage2 = driver.findElement(By.id("rightClickBtn")).getText();
        Assert.assertEquals("You have done a right Click", dynamicClickMessage2);

    }
}
