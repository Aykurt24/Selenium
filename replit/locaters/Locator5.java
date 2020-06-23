package replit.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator5 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("  https://testpages.herokuapp.com/styled/index.html  ");

        WebElement playgraound = driver.findElement(By.id("calculate"));
        playgraound.click();

        WebElement number1 = driver.findElement(By.id("number1"));
        number1.sendKeys("123");

        WebElement number2 = driver.findElement(By.id("number2"));
        number2.sendKeys("123");

        WebElement click = driver.findElement(By.id("calculate"));
        click.click();

        WebElement answer = driver.findElement(By.id("answer"));
        System.out.println(answer.getText());



    }
}
/*
Navigate to  https://testpages.herokuapp.com/styled/index.html

Click on  Calculate

   Type any number in the first input
   Type any number in the second input

Click on Calculate

Get the result

Print the result
 */
