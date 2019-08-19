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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultipleButtonsPracticeWithXpath {

        String buttons = "//button[@class='btn btn-primary']";

    String button1 = "button[onclick='button1()']";

    String disoButton = "//button[@id='disappearing_button']";
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
    }

    @Test
    public void test1(){
    driver.findElement(By.cssSelector(button1)).click();

    String expectedMessage = "Clicked on button one!";
    String actualMessage = driver.findElement(By.cssSelector("#result")).getText();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void button6 (){

        driver.findElement(By.xpath("//button[@id='disappearing_button']")).click();

        String expectedMessage = "Now it's gone!";

        String actualMessage = driver.findElement(By.xpath("//p[@style='color:green']")).getText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Test
    public void allButtons(){

        List<WebElement> allButtons = driver.findElements(By.xpath(buttons));
        //allButtons = "//button[@onclick='button1()']";
    for ( WebElement multButtons : allButtons){

        multButtons.click();
        SeleniumUtilities.waitPlease(1);

    }
    String expectedMessage = "Now it's gone!";
    String actualMessage = driver.findElement(By.xpath("//p[@id='result']")).getText();

    Assert.assertEquals(actualMessage, expectedMessage);
    }

    @AfterMethod
    public void tearDown(){
        SeleniumUtilities.waitPlease(2);
        driver.quit();
    }

}
