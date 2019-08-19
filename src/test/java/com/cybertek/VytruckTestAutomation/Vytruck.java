package com.cybertek.VytruckTestAutomation;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Vytruck {
    static WebDriver driver = BrowserFactory.getDriver("chrome");


    public static void main(String[] args) throws Exception{
        test2();
    }



    public static void test2() {
        driver.manage().window().maximize();
        //this is you must to use, otherwise you will be in trouble
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://qa2.vytrack.com/user/login");
        driver.findElement(By.name("_username")).sendKeys("storemanager69");
        driver.findElement(By.name("_password")).sendKeys("UserUser123");

        driver.findElement(By.id("_submit")).click();
        SeleniumUtilities.waitPlease(3);

//        String expectedMessage = "Welcome to the Secure Area. When you are done click logout below.";
//        String actualMessage = driver.findElement(By.className("subheader")).getText();
//       SeleniumUtilities.verifyEquals(expectedMessage, actualMessage);

        driver.findElement(By.className("dropdown-menu")).findElement(By.className("no-hash"+ Keys.ENTER));


        SeleniumUtilities.waitPlease(5);
        driver.quit();
    }


}
