package Projects.saturdayProject2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

public class ReadMe extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("doganaykurt@gmail.com");

        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("FalcoN");

        WebElement click = driver.findElement(By.cssSelector(".col-sm-8>form>div:nth-of-type(3)>input"));
        click.click();

        Thread.sleep(3000);
        WebElement address = driver.findElement(By.cssSelector(".navbar-collapse >.navbar-nav>a:nth-of-type(2)"));
        address.click();

        Thread.sleep(3000);
        WebElement newAddress = driver.findElement(By.cssSelector(".container>.row"));
        newAddress.click();

        Thread.sleep(3000);
        WebElement firstName = driver.findElement(By.id("address_first_name"));
        firstName.sendKeys("Fernando");

        WebElement lastName = driver.findElement(By.id("address_last_name"));
        lastName.sendKeys("Torres");

        WebElement address1 = driver.findElement(By.id("address_street_address"));
        address1.sendKeys("Anfield Rd");

        WebElement address2 = driver.findElement(By.id("address_secondary_address"));
        address2.sendKeys("Anfield");

        WebElement city = driver.findElement(By.id("address_city"));
        city.sendKeys("Liverpool");

        Thread.sleep(3000);
        WebElement dropdown = driver.findElement(By.cssSelector("#address_state>:last-child"));
        dropdown.click();

        Thread.sleep(3000);
        WebElement zipCode = driver.findElement(By.id("address_zip_code"));
        zipCode.sendKeys("L4 0TH");

        driver.findElement(By.id("address_country_us")).click();

        WebElement birthDay = driver.findElement(By.id("address_birthday"));
        birthDay.sendKeys("03/20/1984");

        WebElement age = driver.findElement(By.id("address_age"));
        age.sendKeys("36");

        Thread.sleep(3000);
        WebElement webSite = driver.findElement(By.id("address_website"));
        webSite.sendKeys("https://www.google.com/");

        WebElement phoneNumber = driver.findElement(By.id("address_phone"));
        phoneNumber.sendKeys("8625747878");

        Thread.sleep(3000);
        driver.findElement(By.id("address_interest_climb")).click();
        driver.findElement(By.id("address_interest_dance")).click();

        Thread.sleep(3000);
        WebElement note = driver.findElement(By.id("address_note"));
        note.sendKeys("Never Back Down");

        driver.findElement(By.cssSelector("#new_address>:last-child>input")).click();

        String name = driver.findElement(By.cssSelector(".container>.row>:last-child")).getText();

        try{
            Assert.assertEquals("Fernando",name);
            System.out.println("We verify the first name ");
        }catch (Exception e){
            System.out.println("We could not verify the first name ");
        }

        Thread.sleep(3000);
        String lastName1 = driver.findElement(By.cssSelector(".container>.row:nth-of-type(2)>.col")).getText();
        try{
            Assert.assertEquals("Torres",lastName1);
            System.out.println("We verify the last name ");
        }catch (Exception e){
            System.out.println("We could not verify the last name ");
        }

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#navbar:last-of-type>.navbar-nav>a:nth-of-type(2)")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".container>.table>:nth-child(2)>tr>:nth-child(6)>a")).click();
        Thread.sleep(3000);
        WebElement editName = driver.findElement(By.id("address_first_name"));
        editName.clear();
        editName.sendKeys("Peter");
        WebElement editlastName = driver.findElement(By.id("address_last_name"));
        editlastName.clear();
        editlastName.sendKeys("Crouch");

        Thread.sleep(3000);
        WebElement updateAddress = driver.findElement(By.cssSelector(".container>:nth-child(2)>:last-child"));
        updateAddress.click();

        Thread.sleep(3000);
        String updateName = driver.findElement(By.cssSelector(".container>.row>:last-child")).getText();

        try{
            Assert.assertEquals("Peter",updateName);
            System.out.println("We verify the first name ");
        }catch (Exception e){
            System.out.println("We could not verify the first name ");
        }

        Thread.sleep(3000);
        String updateLastName1 = driver.findElement(By.cssSelector(".container>.row:nth-of-type(2)>.col")).getText();
        try{
            Assert.assertEquals("Crouch",updateLastName1);
            System.out.println("We verify the last name ");
        }catch (Exception e){
            System.out.println("We could not verify the last name ");
        }

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".navbar-collapse>.navbar-nav>a:nth-of-type(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".container>.table>:nth-child(2)>tr>:nth-child(7)>a")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();





    }
}
