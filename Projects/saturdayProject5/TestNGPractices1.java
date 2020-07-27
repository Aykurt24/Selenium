package Projects.saturdayProject5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractices1 extends BaseDriverForProjecet5 {


    ResuableMethodForProject5 methods = new ResuableMethodForProject5();

    @Test
    public void Test1 () throws InterruptedException {

        _01_AddressElements addressElements = new _01_AddressElements(driver);

        addressElements.myAddressButton.click();

        addressElements.addNewAddress.click();

        addressElements.fName.clear();
        addressElements.fName.sendKeys("Ali");

        addressElements.lName.clear();
        addressElements.lName.sendKeys("Koklu");

        addressElements.cName.sendKeys("TechnoS");

        addressElements.address1.sendKeys("Nowhere");

        addressElements.address2.sendKeys("Everywhere");

        addressElements.newCity.sendKeys("Allcity");

        addressElements.allStates.get(methods.RandomNumber(addressElements.allStates.size())).click();

        addressElements.postcode.sendKeys("12345");

        addressElements.newCountry.click();

        addressElements.newPhone.sendKeys("123 4345");

        addressElements.newMobilePhone.sendKeys("32112 543543");

        addressElements.textArea.sendKeys("Brave Heart");

        addressElements.addressTitle.clear();
        addressElements.addressTitle.sendKeys("Mars");

        addressElements.saveButton.click();

       Assert.assertTrue(addressElements.getAddressTitle.getText().equalsIgnoreCase("Mars"));

       addressElements.updateButton.click();

       addressElements.fName.clear();
       addressElements.fName.sendKeys("Sena");

       addressElements.lName.clear();
       addressElements.lName.sendKeys("NooneKnows");

       addressElements.saveButton.click();

       methods.updateName(driver,"Sena","NooneKnows");

       addressElements.deleteButton.click();

       driver.switchTo().alert().accept();

       Thread.sleep(2000);
       Assert.assertFalse(addressElements.getAddressTitle.getText().equalsIgnoreCase("Mars"));
    }
}
