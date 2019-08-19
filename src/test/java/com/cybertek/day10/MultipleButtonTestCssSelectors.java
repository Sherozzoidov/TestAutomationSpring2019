package com.cybertek.day10;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultipleButtonTestCssSelectors {

    /*   using of CSS selector its more faster and more readable

            # ----> this hash tag means id in Css selector
            ^ ----> up arrow means starts with
            .  (dot ) ----->> means class
            $ (dollar sign) ---->> means ends with
            * (star)---->> star sybol means contains 'value'
    * */

    String button1 = "[onclick='button1()']";

    String buttonsLocator = "[class='btn btn-primary']";
WebDriver driver ;
    @BeforeMethod
    public void setUp(){
        driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
    }

    @Test(priority = 1, dependsOnMethods = {"allButtons"})// dependsOnMethods = {"allButtons"} --->> this method will show how allButtons method depends on the test on
    // it meant if the test1 fails allButton method will not run
    public void test1(){
        driver.findElement(By.cssSelector(button1)).click();
        SeleniumUtilities.waitPlease(1);
        String expectedMessage = "Clicked on button one!";

        String actualMessage = driver.findElement(By.cssSelector("#result")).getText();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test (priority = 2, description = "To verify if the all buttons clicked and button 6 is desapiered")
    public void allButtons(){

        List<WebElement> allButtons = driver.findElements(By.cssSelector(buttonsLocator));

        for (WebElement clickButtons : allButtons     ) {

            clickButtons.click();
            SeleniumUtilities.waitPlease(2);

        }
        String expectedMessage = "Now it's gone!";

        String actualMessage = driver.findElement(By.id("result")).getText();

        Assert.assertEquals(expectedMessage, actualMessage);

    }


    @AfterMethod
    public void tearDown(){
        SeleniumUtilities.waitPlease(2);
        driver.quit();
    }
}
