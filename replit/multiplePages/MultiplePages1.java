package replit.multiplePages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.BaseDriver;

import java.util.Set;

public class MultiplePages1 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("https://business.twitter.com/en/solutions-new.html");
        String title1 = driver.getTitle();

        String mainWindow = driver.getWindowHandle();
        driver.findElement(By.cssSelector(" ul > li:nth-child(2) > button")).click();
        driver.findElement(By.cssSelector("div:nth-child(3) > ul > li:nth-child(4) > a")).click();
        Set<String> handles = driver.getWindowHandles();

        for (String handle:handles) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                String title2 = driver.getTitle();
                Assert.assertNotEquals(title1, title2);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        String title3 = driver.getTitle();
        System.out.println(title3);
        Assert.assertEquals(title1,title3);
    }
}
/*
Navigate to  https://business.twitter.com/en/solutions-new.html

Get the title of the page (title1)

Click on  Developer blog

Get the title of the page (title 2)

Title 1 and title 2 should NOT  be equal

Close the current page

Get the title of the page

Print the title of the page (title 3)

Title 1 and Title 3 should be equal
 */