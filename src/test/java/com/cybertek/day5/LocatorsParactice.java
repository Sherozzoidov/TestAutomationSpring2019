package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsParactice {
   static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://practice.cybertekschool.com/login");

driver.findElement(By.name("username")).sendKeys("tomsmith");
driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
driver.findElement(By.id("wooden_spoon")).click();

SeleniumUtilities.waitPlease(2);



String expectedMessage = "Welcome to the Secure Area. When you are done click logout below.";

String actualMessage = driver.findElement(By.className("subheader")).getText();
SeleniumUtilities.verifyEquals(expectedMessage, actualMessage);
        driver.findElement(By.linkText("Logout")).click();
        SeleniumUtilities.waitPlease(2);

driver.quit();









}


    }


