package saturdayProject.Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://demoqa.com/text-box");

        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("Automation");


        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@gmail.com");

        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("Testing Current Address part 1");

        WebElement address1 = driver.findElement(By.id("permanentAddress"));
        address1.sendKeys("Testing Current Address part 2");

        Thread.sleep(3000);
        WebElement button = driver.findElement(By.id("submit"));
        button.click();

        WebElement name = driver.findElement(By.id("name"));
        System.out.println(name.getText());

        WebElement emailAddress = driver.findElement(By.id("email"));
        System.out.println(emailAddress.getText());


    }

    /*
        1) Navigate to  http://demoqa.com/text-box

        2) Enter full name as "Automation"

        3) Enter Email as "Testing@gmail.com"

        4) Enter Current Address 1 as "Testing Current Address part 1"

        5) Enter Current Address 2 "Testing Current Address part 2"

        6) Click on submit button

        7) Print the name

        8) Print Email is containing the "Testing"

     */
}
