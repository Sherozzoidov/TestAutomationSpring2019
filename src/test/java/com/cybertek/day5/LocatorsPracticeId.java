package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class LocatorsPracticeId {


   static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        test1();
    }


public static void test1() {
    driver.manage().window().fullscreen();


    //in the seleniumt IMPLICIT WAIT work
    // no matter what programm runs for 10 secont even if there is not such an
    //element it will throw an exception and closes the page
    //and it will wait up to 10 seconds it is a time range
    // as soon as it finds an element programm will qiut/close
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://practice.cybertekschool.com/login");

    driver.findElement(By.name("username")).sendKeys("tomsmith");
    driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
    driver.findElement(By.id("wooden_spoon" )).click();
SeleniumUtilities.waitPlease(3);
String expectedMessage = "Welcome to the Secure Area. When you are done click logout below.";
String actualResult = driver.findElement(By.className("subheader")).getText();
SeleniumUtilities.verifyEquals(expectedMessage , actualResult);

driver.findElement(By.linkText("Logout")).click();




driver.quit();
}


}
