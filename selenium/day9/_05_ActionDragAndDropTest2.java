package selenium.day9;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseDriver;

import java.util.List;

public class _05_ActionDragAndDropTest2 extends BaseDriver {

    public static void main(String[] args) {
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement saleButton = driver.findElement(By.id("credit1"));
        WebElement dropZone = driver.findElement(By.id("loan"));
        (new Actions(driver)).dragAndDrop(saleButton, dropZone).perform();


        List<WebElement> elements = driver.findElements(By.cssSelector("#loan > li"));
        boolean found = false;
        for(WebElement element : elements) {
            String elementText = element.getText();
            if(elementText.equals(saleButton.getText())) {
                found = true;
                break;
            }
        }

        Assert.assertTrue( "Could not find loan in dropzone",found);
    }

}


