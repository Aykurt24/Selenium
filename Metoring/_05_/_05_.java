package Metoring._05_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseDriver;

public class _05_ extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to("http://newtours.demoaut.com");

        WebElement singOn = driver.findElement(By.cssSelector("td[class]>a"));
        singOn.click();

        Thread.sleep(2000);
        WebElement name = driver.findElement(By.name("userName"));
        name.sendKeys("ttorun");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("12345678");

        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.cssSelector("input[name='login']"));
        submit.click();

        WebElement typeOfTrip = driver.findElement(By.cssSelector("input[name='tripType']:last-child"));
        typeOfTrip.click();

        Thread.sleep(2000);
        Select passangers = new Select(driver.findElement(By.cssSelector("select[name=\"passCount\"]")));
        passangers.selectByIndex(2);

        Select deparature = new Select(driver.findElement(By.cssSelector("select[name=\"fromPort\"]")));
        deparature.selectByValue("Portland");

        Select dMonth = new Select(driver.findElement(By.cssSelector("select[name=\"fromMonth\"]")));
        dMonth.selectByIndex(8);

        Select dDay = new Select(driver.findElement(By.cssSelector("select[name=\"fromDay\"]")));
        dDay.selectByIndex(5);

        Thread.sleep(2000);
        Select arriving = new Select(driver.findElement(By.cssSelector("select[name=\"toPort\"]")));
        arriving.selectByIndex(5);

        Thread.sleep(2000);
        Select returningM = new Select(driver.findElement(By.cssSelector("select[name=\"toMonth\"]")));
        returningM.selectByIndex(7);

        Select returningD = new Select(driver.findElement(By.cssSelector("select[name=\"toDay\"]")));
        returningD.selectByValue("11");

        Thread.sleep(2000);
        WebElement serviceClass = driver.findElement(By.cssSelector("input[ value=\"First\"]"));
        serviceClass.click();

        Select airline = new Select(driver.findElement(By.cssSelector("select[name=\"airline\"]")));
        airline.selectByIndex(1);

        Thread.sleep(2000);
        WebElement continueButton = driver.findElement(By.cssSelector("input[name='findFlights']"));
        continueButton.click();









    }
}
