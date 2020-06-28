package replit.dropdown;

import org.openqa.selenium.By;
import utils.BaseDriver;

public class DropDown1 extends BaseDriver {

    public static void main(String[] args) {

        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html ");

        driver.findElement(By.id("database")).click();

    }

}

/*
Navigate to  https://www.testandquiz.com/selenium/testing.html

Click on the  Database Testing in the dropdown

 Database Testing should be displayed
 */