package Metoring._08_;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _08_Task extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/inventory.html");

        driver.findElement(By.cssSelector("#inventory_filter_container>select>option")).click();

        List<WebElement> lists = driver.findElements(By.cssSelector(".inventory_item_name"));
        ArrayList<String> lists2 = new ArrayList<>();

        for (WebElement list : lists) {
            lists2.add(list.getText());
        }
        Collections.sort(lists2);

        for (int i = lists.size(); i < 0; i--) {

            if (!lists2.get(i).equalsIgnoreCase(lists.get(i).getText())) {

                Assert.fail("Lists are not match each other");

            }
        }
    }
}


