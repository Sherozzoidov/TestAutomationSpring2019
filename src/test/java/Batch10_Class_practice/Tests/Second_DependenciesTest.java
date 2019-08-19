package Batch10_Class_practice.Tests;

import org.testng.annotations.Test;

public class Second_DependenciesTest {

    @Test()
    public void openBrowser(){
        System.out.println("opening Browser");
    }

    @Test(dependsOnMethods = "openBrowser")
    public void logIn(){
        System.out.println("log In");
    }

    @Test(dependsOnMethods = "logIn")
    public void logOut(){
        System.out.println("log Out");
    }
}
