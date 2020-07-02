package selenium.day10;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class Task2 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.cssSelector("#checkbox>input")).click();
        driver.findElement(By.cssSelector("#checkbox-example>button")).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);

        wait.until(ExpectedConditions.textToBe(By.cssSelector("#checkbox-example>p"), "It's gone!"));

        driver.findElement(By.cssSelector("#checkbox-example>button")).click();
        wait.until(ExpectedConditions.textToBe(By.cssSelector("#checkbox-example>p"), "It's back!"));




    }
}
// assert that checkbox exists
// click on the remove button
// assert that check box removed
// click on the add button
// assert that check box re-appeared