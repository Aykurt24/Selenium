package replit.dropdown;

import org.openqa.selenium.By;
import utils.BaseDriver;

import java.util.Random;


public class DropDown2 extends BaseDriver {

    public static void main(String[] args) {

        driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver ");


        int number = (int) (Math.random()*4)+1;

        int number1 = (int) (Math.random()*4)+1;

        driver.findElement(By.cssSelector(".card>:nth-child(2)>p>.col-lg-3>:nth-child("+number+")")).click();

        driver.findElement(By.cssSelector(".card>:nth-child(2)>p>:nth-child(9)>:nth-child("+number1+")")).click();

    }

}

/*

Navigate to  https://chercher.tech/practice/practice-dropdowns-selenium-webdriver

Choose random item from the dropdown 1

Choose random item from the dropdown 2

Run the code multiple types and verify it is choosing the different items

 */