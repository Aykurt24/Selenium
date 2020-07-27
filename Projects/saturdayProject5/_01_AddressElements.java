package Projects.saturdayProject5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _01_AddressElements {

    public _01_AddressElements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "ul.myaccount-link-list>:nth-child(3)>a")
    public WebElement myAddressButton;

    @FindBy (css = "div.clearfix.main-page-indent > a")
    public WebElement addNewAddress;

    @FindBy (id = "firstname")
    public WebElement fName;

    @FindBy (id = "lastname")
    public WebElement lName;

    @FindBy (id = "company")
    public WebElement cName;

    @FindBy (id = "address1")
    public WebElement address1;

    @FindBy (id = "address2")
    public WebElement address2;

    @FindBy (id = "city")
    public WebElement newCity;

    @FindAll({
            @FindBy(css = "#id_state>option")
    })
    public List<WebElement>  allStates;

    @FindBy (id ="postcode")
    public WebElement postcode;

    @FindBy (id ="id_country")
    public WebElement newCountry;

    @FindBy (id ="phone")
    public WebElement newPhone;

    @FindBy (id ="phone_mobile")
    public WebElement newMobilePhone;

    @FindBy (id ="other")
    public WebElement textArea;

    @FindBy (id ="alias")
    public WebElement addressTitle;

    @FindBy (id ="submitAddress")
    public WebElement saveButton;

    @FindBy (css ="ul.last_item > li:nth-child(1) > h3")
    public WebElement getAddressTitle;

    @FindBy (css="ul.last_item>:last-child>:first-child")
    public WebElement updateButton;

    @FindBy (css="ul.last_item>:last-child>:last-child")
    public WebElement deleteButton;


























}
