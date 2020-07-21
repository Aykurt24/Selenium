package tstNG.day6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _01_Intro {

    /*
        Data provider is working as parameter
            Sending the data from outside of the @Test
            It help us to run our code with multiple data.
     */

    @Test(dataProvider = "myname")
    public void test1(String name){

        System.out.println("Name is here " + name);
    }

    //    Data provider must return Object[][]/Object[] or Iterator<Object[]>/Iterator<Object>
    @DataProvider(name = "myname")
    public Iterator<Object> data(){

        List<Object> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Umed");
        myList.add("Vepa");

        return myList.iterator();
    }

    @Test(dataProvider = "usernameAndPassword")
    public void test2(String username , String password){

        System.out.println("Here is the username " + username);
        System.out.println("Here is the password " + password);

    }

    @DataProvider(name="usernameAndPassword")
    public Iterator<Object[]> data2(){
        List<Object[]> myList = new ArrayList<>();
        myList.add(new Object[]{"Cedric","123qweasd"});
        myList.add(new Object[]{"Maruf","password2"});

        return myList.iterator();
    }

}
