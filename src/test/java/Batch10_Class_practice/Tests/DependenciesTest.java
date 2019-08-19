package Batch10_Class_practice.Tests;

import org.bson.io.BsonOutput;
import org.testng.annotations.Test;

public class DependenciesTest {

    @Test
    public void logIn(){
        System.out.println("log in ");

    }
    @Test
    public void zbuySth(){
        System.out.println("buying");
    }

    @Test
    public void homePage(){
        System.out.println("home Page");
    }
}
