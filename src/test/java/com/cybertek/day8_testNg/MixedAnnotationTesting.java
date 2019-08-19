package com.cybertek.day8_testNg;

import org.testng.annotations.*;

public class MixedAnnotationTesting {

    //@Before class  ---> method with Annotation will be running only one in the class, , regardless of an amount of tests.
    // what we can put in this class
    //prepare test date // create connections  //initialize the driver //set webdriver properties
   // BeforeClass --> BeforeMethod

    @BeforeClass
            public void beforeClass(){
        System.out.println("before class");
    }


    @BeforeMethod
   public void setUp(){
       System.out.println("Before method");
   }

   @Test
    public void test1(){
        System.out.println("im test 1");
    }

    @Test
    public void test2(){
        System.out.println("im test 2");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After test");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }
}
