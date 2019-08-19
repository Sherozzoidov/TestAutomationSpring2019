package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.net.PortUnreachableException;
import java.util.Calendar;

public class VytrackUtils {

    private static String usernameLocator = "prependedInput";
    private static String passswordLocator = "prependedInput2";


    public static void logIn(WebDriver driver , String userName , String password){
        driver.findElement(By.id(usernameLocator)).sendKeys(userName);
        driver.findElement(By.id(passswordLocator)).sendKeys(password, Keys.ENTER);

        SeleniumUtilities.waitPlease(3);

    }
    public static void NavigateToModule(WebDriver driver , String tab , String module ){
      String tabLocator = "//span[contains(text(),'"+tab+"') and contains(@class,'title title-level-1')]";

        String moduleLocator = "//span[contains(text(),'"+module+"') and contains(@class,'title title-level-2')]";


        driver.findElement(By.xpath(tabLocator)).click();
        SeleniumUtilities.waitPlease(1);
        driver.findElement(By.xpath(moduleLocator)).click();
        SeleniumUtilities.waitPlease(2);


    }
    public static void navigateToClendar(WebDriver driver, String tab, String moduleCalendar){
        String tabLocator = "//span[contains(text(),'"+tab+"') and contains(@class,'title title-level-1')]";
        String moduleLocator2 ="//span[contains(text(),'"+ moduleCalendar +"') and contains(@class,'title title-level-2')]";

        driver.findElement(By.xpath(tabLocator)).click();
        SeleniumUtilities.waitPlease(1);
        driver.findElement(By.xpath(moduleLocator2)).click();
        SeleniumUtilities.waitPlease(2);
    }

    public static void dashboardNavigator(WebDriver driver , String tab , String moduleDashboard){
            // in this tab locator we just passing the varieble instead of eve
        String tabLocator = "//span[contains(text(),'"+tab+"') and contains(@class,'title title-level-1')]";

        String dashLocator ="//span[contains(text(),'"+moduleDashboard+"') and contains(@class,'title title-level-2')]";

        driver.findElement(By.xpath(tabLocator)).click();
        SeleniumUtilities.waitPlease(1);
        driver.findElement(By.xpath(dashLocator)).click();
        SeleniumUtilities.waitPlease(2);
    }

    public static void saveAndCancelBtn(WebDriver driver , String saveAndClose , String saveAndNew, String save ){

        String saveAndCloseLocater = "//button[contains(text(), '"+saveAndClose+"')]";
        String saveAndNewLocator = "//button[contains(text(), '"+saveAndNew+"')]";
        String saveBtn = "//button[contains(text(), '"+save+"')]";


    }




}
