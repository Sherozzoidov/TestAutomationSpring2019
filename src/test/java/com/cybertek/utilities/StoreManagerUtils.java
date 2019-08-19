package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class StoreManagerUtils {

    private static String loginLocator ="prependedInput";
    private static String passwordLocator = "prependedInput2";


    public static void setLoginLocator (WebDriver driver, String logIn, String password){
        driver.findElement(By.id(loginLocator)).sendKeys(logIn);
        driver.findElement(By.id(passwordLocator)).sendKeys(password, Keys.ENTER);
        SeleniumUtilities.waitPlease(3);
    }

    public static void activitiesModule(WebDriver driver, String activitiesTab, String calendarModule ){

        String tabLocator = "//span[contains(text(),'"+activitiesTab+"') and contains(@class,'title title-level-1')]";
        String calendarLocator = "//span[contains(text(),'"+calendarModule+"') and contains(@class,'title title-level-2')]";

        driver.findElement(By.xpath(tabLocator)).click();
        SeleniumUtilities.waitPlease(1);
        driver.findElement(By.xpath(calendarLocator)).click();
    SeleniumUtilities.waitPlease(2);

    }

    public static void createEvent(WebDriver driver, String owner){
        String createEv = "a[class='btn main-group btn-primary pull-right ']";

        String selectingOwner = "[class='select2-chosen']";
        driver.findElement(By.cssSelector(createEv)).click();
//        SeleniumUtilities.waitPlease(1);
//
//         driver.findElement(By.cssSelector(selectingOwner));
//       driver.findElement(By.xpath("//span[contains(text(),'"+owner+"')]")).click();

        //driver.findElement(By.xpath("//span[contains(text(),'"+owner+"')]")).click();


    }

    public static void tabFleets(WebDriver driver , String tabFleets, String moduleFleets ){

        String tabLocator = "//span[contains(text(),'"+tabFleets+"') and contains(@class,'title title-level-1')]";
        String moduleLocator = "//span[contains(text(),'"+moduleFleets+"') and contains(@class,'title title-level-2')]";

        driver.findElement(By.xpath(tabLocator)).click();
        SeleniumUtilities.waitPlease(2);

        driver.findElement(By.xpath(moduleLocator)).click();
        SeleniumUtilities.waitPlease(2);





    }

}
