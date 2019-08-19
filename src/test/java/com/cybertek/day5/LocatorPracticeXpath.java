package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LocatorPracticeXpath {

    //Xpath ==> stands for XML path. it was created to find elements on XML and HTML docs.
    //Xpath uses tags, attributes and text to allocate element. If connot find an element by any locator  - Xopath will do it


    // there is 2 type of Xpath :

    //Relative :
    // means you can start searching elements from anywhere in  the page


static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {

     test1();
    }

public static void test1(){

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    driver.manage().window().fullscreen();

    driver.get("http://practice.cybertekschool.com/sign_up");

        driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys("sheroz zoidov");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sherozzoidov89@gmail.com");
        driver.findElement(By.xpath("//button[@name='wooden_spoon']")).click();

        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        String actualMessage = driver.findElement(By.className("subheader")).getText();

        SeleniumUtilities.verifyEquals(expectedMessage, actualMessage);


    SeleniumUtilities.waitPlease(3);
    driver.close();
}
}
