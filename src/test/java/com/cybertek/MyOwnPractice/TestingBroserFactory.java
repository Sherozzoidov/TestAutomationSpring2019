package com.cybertek.MyOwnPractice;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestingBroserFactory {


    public static void main(String[] args) throws Exception {
//Webdriver is a static method
        // in this case we dont need to create an obj every time


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com");
        String actualResult = driver.getTitle();

        String expected = "Practice";



        if (actualResult.equals(expected)){
            System.out.println("Your test Passed");
        }else {
            System.out.println("Test Failed");
        }

        driver.findElement(By.linkText("A/B Testing")).click();
        SeleniumUtilities.waitPlease(1);

        String actual1 = driver.getTitle();

        String expected1 = "Elements";
        if (actual1.equalsIgnoreCase(expected1)){
            System.out.println("Second test is passed");

        }else {
            System.out.println("Second test is Failed");
        }


      //  driver.findElement(By.linkText("Home")).click();
      driver.navigate().back();

        SeleniumUtilities.waitPlease(1);
   driver.findElement(By.linkText("Add/Remove Elements")).click();
   SeleniumUtilities.waitPlease(2);
   driver.navigate().back();

   driver.findElement(By.linkText("Autocomplete")).click();
 //  driver.getTitle();

 // SeleniumUtilities.waitPlease(5);



       SeleniumUtilities.waitPlease(1);
     //  driver.navigate().back();




        driver.close();
    }



}
