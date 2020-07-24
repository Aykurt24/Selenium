package tstNG.day7;

public class _03_WhatISPageObjectModel {

  /*
        POM (Page object model)
            I am not creating same elements in every Test
            I have a class for the elements and If I need to same which is I created before then I am calling that element
            Advantage of POM?
                Every time in the @Test creating the element is taking too much time. With POM(Page object model) elements are reusable so I
                       dont need to create an element again and again.
                In the agile website is changing and in the same time developers are changing the WebElements so after they
                    change it selenium will fail so I need to change the element in the automation as well.
                    So with POM I dont need to make a change in multiple classes I just change in the pageClass then code will
                    work fine.
        HomePage <<- java class 15 elements
        AddToCartPage <<- java class 20 elements
        EditAccount <<- java class 15 elements
                total 50 elements
                PageFactory -->
                    WebElement elementname = driver.findElment....
                    @FindBy
     */


}