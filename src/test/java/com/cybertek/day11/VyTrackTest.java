package com.cybertek.day11;

import com.cybertek.utilities.SeleniumUtilities;
import com.cybertek.utilities.VytrackUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VyTrackTest {


//    String logLOcator = "[class=span2][name='_username']";
//    String passwardLocator = "[class=span2][name='_password']";
//    String buttonLog = "[class='btn btn-uppercase btn-primary pull-right']";
//    String activityLocator = "//span[@class='title title-level-1'][contains(text(),'Activities')]";
   WebDriver driver;
String createButtonLocator = "a[title='Log call']";
String celendarEventBtn = "a[title='Create Calendar event']";
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://qa2.vytrack.com/user/login");

    }

    @Test
    public void test1(){
        VytrackUtils.logIn(driver, "storemanager69", "UserUser123");
        VytrackUtils.NavigateToModule(driver, "Activities", "Calls" );

        Assert.assertTrue(driver.findElement(By.cssSelector(createButtonLocator)).isDisplayed());

    }

    @Test
    public void calendarEvents(){

        VytrackUtils.logIn(driver, "storemanager69", "UserUser123");
        VytrackUtils.navigateToClendar(driver, "Activities", "Calendar Events");
        Assert.assertTrue(driver.findElement(By.cssSelector(celendarEventBtn)).isDisplayed());
        System.out.println("Calendar event is displayed");
    }

    @Test
    public void dashbaordTest(){

        VytrackUtils.logIn(driver, "storemanager69", "UserUser123");
        VytrackUtils.dashboardNavigator(driver, "Dashboard", "Manage Dashboard");
        Assert.assertTrue(driver.findElement(By.cssSelector("h1[class='oro-subtitle']")).isDisplayed());

    }

    @AfterMethod
    public void tearDown(){
        SeleniumUtilities.waitPlease(5);
        driver.quit();
    }
}
