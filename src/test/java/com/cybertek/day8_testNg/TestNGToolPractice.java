package com.cybertek.day8_testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGToolPractice {

    /*
    *    Annotations
    *
    * test NG assertion its a methoad or mechanist to run the the test and verify if its equals or not with assertEquals method
    * if assertEquals method doest find the match it will show an error and shows whats wrong
    * what was the Expected  and what is the Actual
    * */




@Test()
public static void test1(){
    String a = "A";
    String b = "A";

    Assert.assertEquals(a , b);
}
@Test()
public static void test2(){

    String str1 = "apple";
    String str2 = "orange";

    Assert.assertEquals(str1, str2);

}
@Test
public static void test3(){
    String str1 = "AJSHD";

    String str2 = "SDJ";

    Assert.assertTrue(str1.contains(str2));
}

@Test
    public static void test4() {

    Assert.assertFalse(false);
}

}
