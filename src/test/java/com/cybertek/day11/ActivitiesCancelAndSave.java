package com.cybertek.day11;

import com.cybertek.utilities.SeleniumUtilities;
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

import java.security.Key;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ActivitiesCancelAndSave {

    WebDriver driver;

    String createCalecdarEventBtnLocator = "//a[@title='Create Calendar event']";
    String cancelBtnLocator = "//a[@title='Cancel']";
    String svaeAndClose = "//div/button[contains(text(),'Save and Close')]";
    String svaeAndCloseBtn = "//a[@class= 'btn-success btn dropdown-toggle']";

        String saveAndCloseLocater = "//button[contains(text(), 'Save And Close')]";
        String saveAndNewLocator = "//button[contains(text(), 'Save And New')]";
        String saveBtnLocator = "//button[contains(text(), 'Save')]";



    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://qa2.vytrack.com/user/login");
        VytrackUtils.logIn(driver, "storemanager69", "UserUser123");

        VytrackUtils.NavigateToModule(driver, "Activities", "Calendar Events");

    }
    @Test
    public void activitiesCreateCalecdarEventBtn (){

      //  String expectedMessage ="Create Calendar Event";
        Assert.assertTrue(driver.findElement(By.xpath(createCalecdarEventBtnLocator)).isDisplayed());
        System.out.println("create Calecdar Event Btn Locator");
        driver.findElement(By.xpath(createCalecdarEventBtnLocator)).click();

        Assert.assertTrue(driver.findElement(By.xpath(cancelBtnLocator)).isDisplayed());

        System.out.println("cancel btn displayed");
        Assert.assertTrue(driver.findElement(By.xpath(svaeAndClose)).isDisplayed());

    }
    @Test
    public void cancelBtn(){
        driver.findElement(By.xpath(createCalecdarEventBtnLocator)).click();
//          driver.findElement(By.xpath(createCalecdarEventBtnLocator)).click();
//
//      //  Assert.assertTrue(driver.findElement(By.xpath(cancelBtnLocator)).isDisplayed());
//
////        System.out.println("cancel btn displayed");
////        Assert.assertTrue(driver.findElement(By.xpath(svaeAndClose)).isDisplayed());
SeleniumUtilities.waitPlease(2);
      driver.findElement(By.xpath(svaeAndCloseBtn)).click();
      SeleniumUtilities.waitPlease(2);
      Assert.assertTrue(driver.findElement(By.xpath(saveAndCloseLocater)).isDisplayed());

      Assert.assertTrue(driver.findElement(By.xpath(saveAndNewLocator)).isDisplayed());
      Assert.assertTrue(driver.findElement(By.xpath(saveBtnLocator)).isDisplayed());


    }
@AfterMethod

    public void tearDown (){
    SeleniumUtilities.waitPlease(2);
}
}