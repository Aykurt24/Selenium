package selenium.day11;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.BaseDriver;

import java.util.Set;

public class _04_NewWindowsTask extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        // click on the new window button, and verify that in new windows you have text: "This is a sample page"
        String mainWindow = driver.getWindowHandle();
        driver.findElement(By.id("windowButton")).click();
        Set<String> windowHandels = driver.getWindowHandles();
        for (String handle : windowHandels) {
            if (!handle.equals(mainWindow)){
                driver.switchTo().window(handle);
            }
        }
        String headline = driver.findElement(By.id("sampleHeading")).getText();
        Assert.assertEquals("This is a sample page", headline);
    }
}