package tstNG.day1;

import org.testng.annotations.*;

public class _01_Intro {


    /*
        @BeforeClass  --> It is running before the Before method and @Test
            @BeforeMethod   --> It is running before each @Test
                @Test
                @Test
            @AfterMethod    --> It is running after each @Test
       @AfterClass  --> It is running after the Before method and @Test
     */

    @Test
    public void Test1(){

        System.out.println("This is Test1");

    }

    @Test
    public void Test2(){
        System.out.println("This is Test2");
    }

    @Test
    public void Test3(){
        System.out.println("This is Test3");
    }
//    @BeforeMethod
//    public void beforeMethodA(){
//        System.out.println("This is Before Method A <----");
//    }

    //    This will run before each @Test -- We can have multiple before methods
    @BeforeMethod
    public void beforeMethodZ(){
        System.out.println("This is Before Method");
    }

    //    Running it after each @Test
    @AfterMethod
    public void afterMethod(){
        System.out.println("This is After Method");

    }

    //    Before the class it will run one time
    @BeforeClass
    public void BeforeClass(){
        System.out.println("This is Before Class");
    }

    //    After the class it will run one time
    @AfterClass
    public void AfterClass(){
        System.out.println("This is After Class");
    }

}