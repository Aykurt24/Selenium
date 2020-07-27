package Projects.saturdayProject5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseDriverForProjecet5 {

    protected WebDriver driver;

    @BeforeMethod(groups = {"SmokeTesting","Regression"})
    @Parameters({"browser"})
    public void BeforeMethod(String browser){



        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){

            System.setProperty("webdriver.gecko.driver" ,"/Users/doganaykurt/Desktop/geckodriver");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php ");

        WebElement signIn = driver.findElement(By.linkText("Sign in"));
        signIn.click();

        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("doganaykurt@gmail.com");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("FalcoN");

        WebElement singInButton = driver.findElement(By.id("SubmitLogin"));
        singInButton.click();

    }

    @AfterMethod
    public void afterMethod(){
//        driver.quit();
    }
}
