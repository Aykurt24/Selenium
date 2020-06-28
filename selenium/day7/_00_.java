package selenium.day7;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.BaseDriver;

public class _00_ extends BaseDriver {

        public static void main(String[] args) {

            driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
            driver.quit();
        }

    }


