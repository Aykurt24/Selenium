package Projects.saturdatProject3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ReadMe extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.navigate().to("https://app.hubspot.com/login");

        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("doganaykurt@gmail.com");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("FalcoN24.");
        driver.findElement(By.id("loginBtn")).click();


       driver.findElement(By.id("nav-primary-sales-branch")).click();
       driver.findElement(By.id("nav-secondary-deals")).click();
       driver.navigate().refresh();

       driver.findElement(By.cssSelector(" div:nth-child(3) > div > button")).click();


       driver.findElement(By.cssSelector("#UIFormControl-19")).sendKeys("Big Deal Endend");
       driver.findElement(By.cssSelector("#uiabstractdropdown-button-49")).click();


       String mainWindow = driver.getWindowHandle();
       Set<String> handles = driver.getWindowHandles();
        for (String handle:handles) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                String url = driver.getCurrentUrl();
                Assert.assertTrue(url.contains("pricing"));

            }
        }
        driver.close();
        driver.switchTo().window(mainWindow);
        int random = (int) (Math.random()*7);
        int random1 = (int) (Math.random()*2);

        driver.findElement(By.cssSelector("#UIFormControl-23")).click();


        List<WebElement> dealStages = driver.findElements(By.cssSelector("#typeahead-52>li"));
        dealStages.get(random).click();

        driver.findElement(By.cssSelector("#uiabstractdropdown-button-37")).click();
        List<WebElement> dealType = driver.findElements(By.cssSelector("span>button"));
        dealType.get(random1).click();

        driver.findElement(By.cssSelector("#UIFormControl-27")).sendKeys("2000");

        driver.findElement(By.cssSelector(" li:nth-child(1) > button")).click();
        String name1 = driver.getTitle();

        driver.findElement(By.cssSelector(".UIColumn-content > div > span")).click();
        WebElement name2 = driver.findElement(By.id("UIFormControl-36"));
        name2.sendKeys("Group-2");
        String changeName = driver.getTitle();
        driver.findElement(By.cssSelector(".private-button--tertiary.private-button--sm.private-button--non-link")).click();

        Assert.assertFalse(name1.equalsIgnoreCase(changeName));

        driver.findElement(By.cssSelector("#uiabstractdropdown-button-9")).click();
        driver.findElement(By.cssSelector("li:nth-child(7) > button")).click();
        driver.findElement(By.cssSelector(".m-left-0.private-button--non-link")).click();
        driver.findElement(By.cssSelector(".private-form__input-wrapper > div > input")).sendKeys(changeName);

        System.out.println(driver.findElement(By.cssSelector("div>h4")).getText());


    }
    /*
        Manual Create your account from the website

        Navigate to https://app.hubspot.com/login
        Enter the user name and password click on login button

        Click on Sales
        Click on Deals

        Click on Create Deal (Note: After clicking on the Deals in the automation not able to see the table just refresh the browser)
        Enter the Deal name

        Click on sales Pipeline (Verify second page URL is -->https://app.hubspot.com/pricing/7766931/sales?upgradeSource=deals-create-deal-general-create-deal-multiple-pipelines-pql-feature-lock&term=annual&edition=starter )
        Choose random from the Deal Stage dropdown
        Choose random from the Deal Type dropdown
        Click on Create button

        Click on the pen icon next to dollar amount on the left top
        Change the name
        And click on the save
        Verify name is changed

        Click on actions button
        Click on Delete
        Click on Delete deal

        Verify deal is not displayed any more

        NOTE: Do not use Thread.sleep()

        NOTE: You dont have to use TestNG

        Register to this page
        http://opencart.abstracta.us/index.php?route=common/home



     */

}
