package selenium.day6.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

public class _00_SingFunction extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.saucedemo.com/");


        String[] userNames = {"standard_user","locked_out_user","problem_user","performance_glitch_user"};

        String password = "secret_sauce";

        checkNameAndPasswor(userNames, password);


    }

    private static void checkNameAndPasswor(String[] userNames, String password) throws InterruptedException {
        for (String userName:userNames) {


            WebElement inputUserName =driver.findElement(By.id("user-name"));
            inputUserName.clear();
            inputUserName.sendKeys(userName);

            WebElement userPassword = driver.findElement(By.id("password"));
            userPassword.clear();
            userPassword.sendKeys(password);


            driver.findElement(By.cssSelector(".btn_action")).click();
            Thread.sleep(3000);
            try {

                driver.findElement(By.cssSelector("#inventory_filter_container>:first-child"));
                driver.navigate().back();

            }catch (NoSuchElementException e ){

                System.out.println("Not able to log in " + userName);

                String errorMessage = driver.findElement(By.tagName("h3[data-test]")).getText();
                System.out.println(errorMessage);

            }

        }
    }


}
