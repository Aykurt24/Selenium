package replit.frame;

import org.openqa.selenium.By;
import utils.BaseDriver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Frame1 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("http://demo.guru99.com/test/guru99home/");
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.cssSelector("body>a")).click();
        String secondWindow = driver.getWindowHandle();
        Set<String> handels = driver.getWindowHandles();
        for (String handel:handels) {
            driver.switchTo().window(handel);
        }
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div>a[href='/python-tutorials.html']")).click();
        System.out.println(driver.getCurrentUrl());
    }
}
/*
Navigate to  http://demo.guru99.com/test/guru99home/

Click on Image under the  iFrame will not show if you have adBlock extension enabled text

In the second window click on Python in the bottom of the page

Get the URL ( URL1)

URL1 should be equal to  https://www.guru99.com/python-tutorials.html

 */