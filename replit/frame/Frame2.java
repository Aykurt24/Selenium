package replit.frame;

import org.openqa.selenium.By;
import utils.BaseDriver;

public class Frame2 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to(" https://www.dezlearn.com/testingpage/ ");
        driver.switchTo().frame("contact-iframe");
        driver.findElement(By.cssSelector(" div:nth-child(1) >div>input")).sendKeys("Destan@abc.com");
        driver.findElement(By.cssSelector(".ml-form-fieldRow:nth-of-type(2)>div>input")).sendKeys("Destan");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ml-form-embedSubmit>button")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(".ml-form-successBody>div>h4")).getText());
    }
}
/*
Navigate to  https://www.dezlearn.com/testingpage/

In the right frame under the Sign up  write any email

In the right frame write any name

click on Subscribe

Get the thank you

Print the text

 */