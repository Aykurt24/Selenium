package Projects.saturdayProject1.Part3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.snapdeal.com/");

        WebElement search = driver.findElement(By.id("inputValEnter"));
        search.sendKeys("teddy bear");

        WebElement click = driver.findElement(By.className("searchTextSpan"));
        click.click();

        Thread.sleep(2000);

        WebElement text = driver.findElement(By.className("nnn"));
        System.out.println(text.getText());

        driver.getCurrentUrl();

        WebElement logo = driver.findElement(By.className("notIeLogoHeader"));
        logo.click();

        driver.getCurrentUrl();
    /*
        1) Navigate to https://www.snapdeal.com/

        2) Search for teddy bear click on search button

        3) Print the following text -->> We've got .... results for 'teddy bear'

        4) Print the URL

        5) Click on logo snepdeal logo

        6) Print the URL

     */
    }

}
