package tstNG.day7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_AssertExamples {

    /*
        Check all assert types.
        POM ( page object model )
     */

    @Test
    public void equalExample(){

        String actualResult = "Account updated succes";

        Assert.assertEquals("Account updated successfully",actualResult);

    }

    @Test
    public void NotequalExample(){

        String actualResult = "Account updated successfully";

        Assert.assertNotEquals("Account updated ",actualResult); // actual vs expected result should
//                                                                                  not be equal

    }

    Integer integerELement;
    @Test
    public void NotNullExample(){

        Assert.assertNotNull(integerELement); // integerELement should not be null and if it is null
//                                                  then it will fail the @Test

    }

    Integer integerELement2;
    @Test
    public void NullExample(){
//        integerELement2=15; If I add this line then it will fail because integerELement2 is not null any more
        Assert.assertNull(integerELement2); // integerELement should be null and if it is not null
//                                                  then it will fail the @Test

    }


    @Test
    public void equalvsDotEquals(){

        /*
            AssertSame is working as == in Java
            AssertEquals is working as .equals in Java.
         */

        String s1 = new String("name");
        String s2 = new String("name");

        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2));  // true

        /*
            == vs .equals()
            == -> is looking for is the reference is also same for both of the variablese
            .equals -> checking the value
         */
    }

    @Test
    public void assertSameExample(){
//        assertSame is working as ==

        String s1 = new String("name");
        String s2 = new String("name");

        Assert.assertSame(s1,s2);

    }

    @Test
    public void assertEquals(){
//        assertEquals is working as .equals in Java

        String s1 = new String("name");
        String s2 = new String("name");

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        Assert.assertEquals(s1,s2);
        Assert.assertEquals(i1,i2);
    }

    @Test
    public void assertNotSameExample(){

        String s1 = new String("Ekrem");
        String s2 = new String("Ekrem");
//                      with a new String reference is changing this is why
//                              assertNotSame is passing

//        == vs .equals in java

        Assert.assertNotSame(s1,s2); // expected is s1 and s2 is not equal

    }

    @Test
    public void trueOrFalse(){

        String message = "Address is successfully created ";

//        Assert.assertTrue( message.contains("success123"),
//                "message should contain the success123 text but it is not containing " );
//        // Condition in the parenthesis should be true

        Assert.assertFalse(message.contains("success") ,"message should not contain the success text but it is not containing " );//Condition in the parenthesis should be false
    }

    @Test
    public void failExample(){

        String URL = "www.facebook.com/homepage";

        if(URL.contains("homepage")){
            Assert.fail("Web site should not login but it is login successfully ");
        }

    }




}