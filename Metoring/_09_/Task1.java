package Metoring._09_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.sql.SQLOutput;
import java.util.List;

public class Task1 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        //Randomly select check box
        int randomNumber = (int) (Math.random() * 4);
        System.out.println(randomNumber);

        Thread.sleep(3000);
        List<WebElement> daysCheck = driver.findElements(By.cssSelector("span>input"));
        daysCheck.get(randomNumber).click();
        daysCheck.get(randomNumber).click();
        int count = 0;
        do {
            if (count == 3) {
                System.out.println("rerun the program");
                break;
            }
                daysCheck.get(randomNumber).click();
                daysCheck.get(randomNumber).click();
                count++;
        } while (randomNumber == 4);

        Thread.sleep(3000);
        List<WebElement> days = driver.findElements(By.cssSelector("span>label"));
        System.out.println(days.get(randomNumber).getText());



    }
}
