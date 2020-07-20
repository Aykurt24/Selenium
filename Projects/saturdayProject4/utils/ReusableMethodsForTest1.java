package Projects.saturdayProject4.utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ReusableMethodsForTest1 extends BaseDriverForTest1 {



    public static void createContact (String email, String fname, String lname) throws InterruptedException {

        WebElement emailNew = driver.findElement(By.cssSelector("#UIFormControl-31"));
        emailNew.sendKeys(email);

        WebElement firstName = driver.findElement(By.cssSelector("#UIFormControl-33"));
        firstName.sendKeys(fname);

        WebElement lastName = driver.findElement(By.cssSelector("#UIFormControl-37"));
        lastName.sendKeys(lname);

        WebElement createContactButton = driver.findElement(By.cssSelector("li:nth-child(1) > button"));
        createContactButton.click();

        Thread.sleep(5000);
        WebElement fNameVerify = driver.findElement(By.id("floating-input-17"));
        Assert.assertTrue(fNameVerify.getAttribute("Value").equalsIgnoreCase(fname));

        WebElement emailVerify = driver.findElement(By.xpath("(//span[@class='private-truncated-string__inner'])[10] "));
        Assert.assertTrue(emailVerify.getText().equalsIgnoreCase(email));

    }

    /*

    Click on actions dropdown
    Click on delete button
    Click on Delete contact button

     */


    public static void delete (){

        driver.findElement(By.id("uiabstractdropdown-button-9")).click();
        driver.findElement(By.cssSelector("#dropdown-menu-8 > ul > li:nth-child(9) > button")).click();
        driver.findElement(By.cssSelector(".m-left-0.private-button--non-link")).click();

    }

    public static void createCompany (String domain, String name) throws InterruptedException {
        WebElement contactButton = driver.findElement(By.id("nav-primary-contacts-branch"));
        contactButton.click();

        WebElement companies = driver.findElement(By.cssSelector("#nav-secondary-companies"));
        companies.click();

        WebElement createCompaies = driver.findElement(By.cssSelector("div:nth-child(3) > div > button"));
        createCompaies.click();

        WebElement companyDomain = driver.findElement(By.cssSelector("#UIFormControl-31"));
        companyDomain.sendKeys(domain);

        //Thread.sleep(3000);
        WebElement nameCompany = driver.findElement(By.cssSelector("#UIFormControl-33"));
        nameCompany.clear();
        nameCompany.sendKeys(name);

        WebElement createCompanyButton = driver.findElement(By.cssSelector("li:nth-child(1) > button"));
        createCompanyButton.click();

        WebElement domainCompany = driver.findElement(By.cssSelector(" div.p-x-0.col-xs-12 > div > span > span"));
        Assert.assertTrue(domainCompany.getText().equalsIgnoreCase(domain));
    }
}
