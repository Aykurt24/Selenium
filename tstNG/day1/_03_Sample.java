package tstNG.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.BaseDriver;

public class _03_Sample extends BaseDriver {

    /*
        Selenium is run alphabetically if you want custom order we need to use priority.
        We have two @Test
            1) NavigateToItems
            2) AddToCart
        Interview Question
            How to priorities the @Test in testNG?
                I am using priority key word after @Test and I can handle it with this keyword
     */

    @Test(priority = 1001)
    public void test2(){

        String u1 = driver.getCurrentUrl();

        System.out.println(u1);
    }

    @Test(priority = 1002)
    public void test1(){

        String u1 = driver.getCurrentUrl();

        System.out.println(u1);
    }

    //   Enable keyword is ignoring this test
    @Test(enabled = false)
    public void test3(){

        String u1 = driver.getCurrentUrl();

        System.out.println(u1);
    }

}