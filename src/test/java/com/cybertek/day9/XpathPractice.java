package com.cybertek.day9;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class XpathPractice {

    //Dynamic element : is an Element that has different position on every load or refresh screen
    // every reload the screen we get new Value
    // to find out if the id is dynamic or not we need to refresh the screen if it id has new value or not


   static WebDriver driver ;

   String nameLocator = "//input[@name='full_name']";
   String emailLocator = "//input[@name='email']";
   String signUpLocator ="//button[@name= 'wooden_spoon']";
    @BeforeMethod
    public void setUp(){
       driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/sign_up");
    }


    @Test
    public void test1(){

        driver.findElement(By.xpath(nameLocator)).sendKeys("sherozzoidov89@gmail.com");
        driver.findElement(By.xpath(emailLocator)).sendKeys("sherozzoidov89@gmail.com");
        driver.findElement(By.xpath(signUpLocator)).click();

        SeleniumUtilities.waitPlease(3);

        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        String actualMessage = driver.findElement(By.xpath( "//h3[@class='subheader']")).getText();

        Assert.assertEquals(actualMessage, expectedMessage);
    }


    @Test
    public void negativeTest(){
        driver.findElement(By.xpath(nameLocator)).sendKeys("sheroz");
        driver.findElement(By.xpath(emailLocator)).sendKeys("email");
        driver.findElement(By.xpath(signUpLocator)).click();
        SeleniumUtilities.waitPlease(2);

        String actuallink = driver.getCurrentUrl();
        String expectedLink = driver.getCurrentUrl();

        Assert.assertEquals(actuallink, expectedLink);
    }

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }

}
