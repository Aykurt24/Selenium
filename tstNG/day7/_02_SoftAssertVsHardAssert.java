package tstNG.day7;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _02_SoftAssertVsHardAssert {

    /*
    Soft assert vs hard assert?
        What kind of asserts do you know in testNG?
         If the Hard assert fail execution is stop
         If the soft assert fail then execution is continue
     */

    @Test
    public void hardAssert(){

//       Assert.assertEquals() --  Assert.assertTrue()
//        If the Hard assert fail execution is stop

        String s1 ="Hello";

        Assert.assertEquals("Hello123" , s1);

        System.out.println("Code is finished");

    }

    @Test
    public void softAssert(){

//        Soft assert
//          If the soft assert fail then execution is continue

        String strForHomepage= "www.facebook.com/homepage";

        String strForCartPage= "www.facebook.com/cartPage";
        String strForEditAccount= "www.facebook.com/EditAccountPage";

        SoftAssert s1 = new SoftAssert();

        s1.assertEquals("www.facebook.com/homepage" ,strForHomepage);

        System.out.println("After the first soft assert");
        s1.assertEquals("www.facebook.com/profile" ,strForCartPage); // this will fail

        System.out.println("After the second soft assert");

        s1.assertEquals("www.facebook.com/settings" ,strForEditAccount);// this will fail
        System.out.println("After the third soft assert");

        s1.assertAll(); // this is the method genereting the fail in the console

        System.out.println("Code is done ");

    }
}
