package tstNG.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Assertions {


    //    working as .equals in the java
    @Test
    public void EqualExample(){

        String s1 =new String("name");
        String s2 =new String("name");

        Assert.assertEquals(s1,  s2);
    }

    //    Working as == in java
    @Test
    public void SameExample(){

        String s1 =new String("name");
        String s2 =new String("name");

        Assert.assertSame(s1,  s2);
    }

    String ss1 ="";
    @Test
    public void nullExample(){

        Assert.assertNull(ss1);// ss1 should be = null
        /*
            if ss1 = null print true
            else print false
         */
    }

}

/*
        Interview question
            .equals vs ==
                .equals is checking is the value is equal or not
                == is if both objects point to the same memory location whereas .equals() checking to the comparison of values in the objects.
*/