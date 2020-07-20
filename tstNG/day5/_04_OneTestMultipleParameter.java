package tstNG.day5;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _04_OneTestMultipleParameter {
    @Test
    @Parameters({"param1" , "param2"})
    public void test1(String st2 , String st1){

//        param1 = st2
//        param2 = st1
//              Parameters are connecting by order not names.

        System.out.println(st2);
        System.out.println(st1);

    }
}

