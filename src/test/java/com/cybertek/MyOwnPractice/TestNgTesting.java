package com.cybertek.MyOwnPractice;

import org.testng.annotations.Test;

public class TestNgTesting {

    @Test
    void setup(){
        System.out.println("this is set up method");
    }
    @Test
    void login (){
        System.out.println("this is log in test");
    }
    @Test
    void teardown(){
        System.out.println("closing browser");
    }

}
