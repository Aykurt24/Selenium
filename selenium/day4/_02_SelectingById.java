package selenium.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_SelectingById {

        public static void main(String[] args)  {
            System.setProperty("webdriver.chrome.driver", "/Users/doganaykurt/Desktop/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://formsmarts.com/form/yu?mode=h5");  // this will open the website and wait until full load
            driver.findElement(By.cssSelector("#u_Uj7_89585_1")).click();
        }
}
