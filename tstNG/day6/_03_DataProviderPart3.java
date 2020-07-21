package tstNG.day6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProviderPart3 {

    @Test(dataProvider = "usernameAndPassword")
    public void login(String username, String password){
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider(name="usernameAndPassword")
    public Object[][] data1(){

        return new Object[][]{
                {"Cedric","p1ForCedric"},
                {"Amal","p2ForAmal"}
        };
    }
}