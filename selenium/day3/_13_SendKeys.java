package selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _13_SendKeys {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.practiceselenium.com");

        WebElement list = driver.findElement(By.linkText("Check Out"));
        list.click();

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("doganaykurt@gmail.com");
        emailInput.clear();

        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Dogan");
        name.clear();

        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("414 Clifton ");
        address.clear();


        WebElement button = driver.findElement(By.className("btn-primary"));//no space in the class name!!!
        button.click();

        driver.navigate().back();




        // link text only work on anchor tag
    }
}
