package selenium.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseDriver;

public class _06_ActionTypingCapital extends BaseDriver {
    public static void main(String[] args) {
        driver.get( "https://demoqa.com/auto-complete" );
        WebElement textInput = driver.findElement( By.id( "autoCompleteSingleContainer" ) );
        Actions actions = new Actions( driver );
        actions
                .moveToElement( textInput )
                .click()
                .keyDown( Keys.SHIFT )
                .sendKeys( "d" )
                .keyUp( Keys.SHIFT )
                .sendKeys( "ogan" )
                .perform();
    }

}
