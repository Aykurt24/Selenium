package Projects.saturdayProject5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _02_DressElements {

    public _02_DressElements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy (css = "#block_top_menu > ul > li:nth-child(2) > a")
    public WebElement dressButton;

    @FindAll({
            @FindBy(css = "div.right-block > h5 > a")
    })
    public List<WebElement> allDress;

    @FindBy (css = "#wishlist_button")
    public WebElement addTowishButton;

    @FindBy (css = "div.fancybox-skin>a")
    public WebElement closeButton;

    @FindBy (css = "nav>:first-child>a")
    public WebElement userNameButton;

    @FindBy (css = "#center_column > div > div:nth-child(2) > ul > li > a")
    public WebElement myWishlsitButton;

    @FindBy (css ="td:nth-child(1) > a")
    public WebElement wishListButton;

    @FindBy (css = "#s_title")
    public WebElement itemTitle;

    @FindBy (css ="div.product_infos>a")
    public WebElement deleteItemButton;

    @FindBy (css = "p.alert")
    public WebElement alertMessage;

    @FindBy (css = "td.wishlist_delete>a")
    public WebElement deleteWhishlistButton;




}
