package Batch10_Class_practice.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MixedUpDependencies {

    @Test()
    public void openBrowser() {
        System.out.println("opening Browser");

    }

    @Test(dependsOnMethods = "openBrowser")
    public void logIn() {
        System.out.println("log in");
        //Assert.assertTrue(false);
    }

    @AfterMethod()
    public void cleanUp() {
        System.out.println("Closing Browser");

    }
}
