package Projects.saturdayProject5;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestNGPractice2 extends BaseDriverForProjecet5 {

    ResuableMethodForProject5 methods = new ResuableMethodForProject5();

    @Test
    public void test2() throws InterruptedException {

        _02_DressElements dressElements = new _02_DressElements(driver);

        dressElements.dressButton.click();

        dressElements.allDress.get(methods.RandomNumber(dressElements.allDress.size())).click();

        dressElements.addTowishButton.click();

        dressElements.closeButton.click();

        Thread.sleep(2000);

        dressElements.userNameButton.click();

        dressElements.myWishlsitButton.click();

        dressElements.wishListButton.click();

        Assert.assertNotNull(dressElements.itemTitle.getText());

        dressElements.deleteItemButton.click();

        dressElements.wishListButton.click();

        Thread.sleep(2000);

        Assert.assertEquals(dressElements.alertMessage.getText(),"No products");

        dressElements.deleteWhishlistButton.click();

        driver.switchTo().alert().accept();

    }
}
