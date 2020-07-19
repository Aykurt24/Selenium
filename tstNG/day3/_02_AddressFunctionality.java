package tstNG.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseDriver1;
import utils.ReusableMethods;

import java.util.List;

public class _02_AddressFunctionality extends BaseDriver1 {

 ReusableMethods dd = new ReusableMethods();

  /*
        TestNG run the @Test's alphabetical order as default
            1-AddAddress
            2-DeleteAddress
            3-EditAddress
        To change the order we can use as -->  @Test(priority = 1)
     */



 @Test
    public void AddAddress (){

     WebElement addressBook = driver.findElement(By.cssSelector("#column-right > div > a:nth-child(4)"));
     addressBook.click();

     WebElement newAddress = driver.findElement(By.linkText("New Address"));
     newAddress.click();

     WebElement firstName = driver.findElement(By.id("input-firstname"));
     firstName.sendKeys("Dogan");

     WebElement lastName = driver.findElement(By.id("input-lastname"));
     lastName.sendKeys("Ay");

     WebElement company = driver.findElement(By.id("input-company"));
     company.sendKeys("Wolf");

     WebElement address1 = driver.findElement(By.id("input-address-1"));
     address1.sendKeys("Wolf Street 123");

     WebElement address2 = driver.findElement(By.id("input-address-2"));
     address2.sendKeys("Apt 5");

     WebElement city = driver.findElement(By.id("input-city"));
     city.sendKeys("Jersey City");

     WebElement postCode = driver.findElement(By.id("input-postcode"));
     postCode.sendKeys("12934");

     WebElement countryDropDown = driver.findElement(By.id("input-country"));
     countryDropDown.click();


     dd.selectByIndex(countryDropDown);

     WebElement stateDropDown = driver.findElement(By.id("input-zone"));
     stateDropDown.click();

     dd.selectByIndex(stateDropDown);

     WebElement continueButton = driver.findElement(By.cssSelector(".pull-right > input"));
     continueButton.click();

     dd.verifySuccessMessage(driver);
 }

 @Test (dependsOnMethods = "AddAddress")
 public void editAddress() {

  WebElement addressBook = driver.findElement(By.cssSelector("#column-right > div > a:nth-child(4)"));
  addressBook.click();

  List <WebElement> editList = driver.findElements(By.cssSelector(" td.text-right > a.btn.btn-info"));
  editList.get(editList.size()-1).click();

  WebElement firstNameInput = driver.findElement(By.id("input-firstname"));
  firstNameInput.clear();
  firstNameInput.sendKeys("Keanu");

  WebElement lastNameInput = driver.findElement(By.id("input-lastname"));
  lastNameInput.clear();
  lastNameInput.sendKeys("Rives");

  WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
  continueButton.click();

  dd.verifySuccessMessage(driver);

 }

 @Test (dependsOnMethods = "editAddress")
 public void deleteAddress (){

  WebElement addressBook = driver.findElement(By.cssSelector("#column-right > div > a:nth-child(4)"));
  addressBook.click();

  List <WebElement> deleteList = driver.findElements(By.cssSelector(".text-right > a.btn.btn-danger"));
  deleteList.get(deleteList.size()-1).click();

  dd.verifySuccessMessage(driver);

 }


}
