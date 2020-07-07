package replit.multiplePages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class MultiplePage2 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("https://www.naukri.com/");
        WebElement service = driver.findElement(By.cssSelector("ul.midSec> li:nth-child(5) > a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(service).perform();
        String mainWindow = driver.getWindowHandle();
        Thread.sleep(2000);
        WebElement textResume = driver.findElement(By.cssSelector("a[ title ='Text Resume']"));
        Action action1 = actions.moveToElement(textResume).click().build();
        action1.perform();
        Set<String> handles = driver.getWindowHandles();
        List<String> handlesArray = new ArrayList<>(handles);
        driver.switchTo().window(handlesArray.get(1));
        String currentUrl = driver.getCurrentUrl();
        String urlTest = "https://resume.naukri.com/mid-level-experienced-professionals-resume-writing?fftid=101001";
        Assert.assertEquals(urlTest,currentUrl);


    }
}
/*
Navigate to  https://www.naukri.com/

Hover over on Services

Click on Text Resume

Get the URL (url1)

Verify result as https://resume.naukri.com/mid-level-experienced-professionals-resume-writing?fftid=101001
 */
