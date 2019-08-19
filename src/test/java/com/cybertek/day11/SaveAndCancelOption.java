package com.cybertek.day11;

import com.cybertek.utilities.SeleniumUtilities;
import com.cybertek.utilities.StoreManagerUtils;
import com.cybertek.utilities.VytrackUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SaveAndCancelOption {

    WebDriver driver ;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://qa2.vytrack.com/");
    }
    @Test(priority = 0)
    public void saveAndCancel(){

        StoreManagerUtils.setLoginLocator(driver, "storemanager69", "UserUser123");


        StoreManagerUtils.activitiesModule(driver, "Activities", "Calendar Events");
       // StoreManagerUtils.createEvent(driver, "Store Manager");
        String expectedMessage = "Calendar Events";
        String actualMessage = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(actualMessage, expectedMessage );
        System.out.println("Passed");
    }
//    @Test(priority = 1)
//    public void createEventBtn(){
//        StoreManagerUtils.createEvent(driver);
//    }
        @Test(priority = 1)
            public void fleets(){

                StoreManagerUtils.setLoginLocator(driver, "storemanager69", "UserUser123");
                String expectedMessage = "All Cars";
                String actualMessage = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();

        StoreManagerUtils.tabFleets(driver, "Fleet", "Vehicles");
    SeleniumUtilities.waitPlease(2);

Assert.assertEquals(actualMessage, expectedMessage);


    }

@AfterMethod
    public void tearDown(){
    SeleniumUtilities.waitPlease(2);

    driver.quit();
}
}
