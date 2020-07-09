package selenium.day12;

import org.openqa.selenium.JavascriptExecutor;
import utils.BaseDriver;

public class _02_ScrollToBottomOfThePage extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://triplebyte.com/?ref=yt_20190826_t1_blade_skippable_2_animation&gclid=Cj0KCQiAvc_xBRCYARIsAC5QT9lHGgKp8Pta1S7Q8JRv42jozGtchlQfMpmfMQSqP5zXLWMngA-xK_caAhtlEALw_wcB");

        JavascriptExecutor js = (JavascriptExecutor)driver;

        // If you want to go bottom of the page we use @ document.body.scrollHeight @

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");


    }


}