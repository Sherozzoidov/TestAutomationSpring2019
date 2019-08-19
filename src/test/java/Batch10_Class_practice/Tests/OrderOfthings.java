package Batch10_Class_practice.Tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class OrderOfthings {

    @Test
    public void test1(){
        System.out.println("Executing 1");
    }
   // @Ignore// if we put the @Ignore it will ignore that test
    @Test
    public void test2(){
        System.out.println("Executing 1");
    }
    @Test
    public void test3(){
        System.out.println("Executing 1");
    }

}
