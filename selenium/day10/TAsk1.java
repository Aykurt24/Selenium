package selenium.day10;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

public class TAsk1 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");

        driver.findElement(By.id("title")).sendKeys("Dogan");
        driver.findElement(By.id("description")).sendKeys("Dogan");
        driver.findElement(By.id("btn-submit")).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submited Successfully!"));

        driver.quit();
    }
}
