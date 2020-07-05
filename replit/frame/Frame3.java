package replit.frame;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.BaseDriver;

public class Frame3 extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.dezlearn.com/testingpage/");
        driver.switchTo().frame("do-it-iframe");
        driver.findElement(By.cssSelector("form>label>input")).sendKeys("Dogan");
        driver.findElement(By.cssSelector(".page-content>form>:last-child")).click();
        System.out.println(driver.findElement(By.cssSelector("header>h1")).getText());
        Assert.assertEquals("Nothing Found",driver.findElement(By.cssSelector("header>h1")).getText());
    }
}
/*
 Navigate to  https://www.dezlearn.com/testingpage/

In the left frame

Type any text in the Search input

Click on Search button

Verify Nothing Found text or your searched text is displayed
 */