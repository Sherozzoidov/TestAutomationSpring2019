package com.cybertek.day3;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.WebDriver;

public class TestingBrowserFactory {
    public static void main(String[] args) {


        WebDriver driver =BrowserFactory.getDriver("chrome");
    driver.get("http://amazon.com");

    driver.manage().window().maximize(); //  driver.manage().window().maximize(); this method will maximize the window for browser
        SeleniumUtilities.waitPlease(3); /// this method comes from SeleniumUtilities and with wait the time what we set for

    //sleep methos throws check exeption
        //that we have to handle it
        // with unchecked exception occures during runtime
        // we can handle it with try/catch or ()throws Exception in the method


        String actualResolt = driver.getTitle();// actual result is the result in the web page

        String expectedResolt = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"; //expectedResolt is the text from web page
        //actual takes the title from web and compares it with

        if (actualResolt.equalsIgnoreCase(expectedResolt)){
            System.out.println("Passed");

        }else {
            System.out.println("Failed");
        }
    driver.close();   // close method will close the chrome browser after testing is done


    }







}
