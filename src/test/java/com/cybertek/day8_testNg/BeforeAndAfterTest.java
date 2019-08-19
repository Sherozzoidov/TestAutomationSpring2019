package com.cybertek.day8_testNg;

import com.cybertek.utilities.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BeforeAndAfterTest {
    WebDriver driver ;

    @BeforeMethod
    public void steUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
driver.manage().window().fullscreen();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://google.com");

    }

    @Test(priority = 1)
    public void test2 (){
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
    }
//Priority --> if we dont set the priority Test NG will set it up by the alphabetic order

@Test(priority = 2)
    public void test1(){
        Assert.assertTrue(driver.getTitle().contains("Google"));

    }
//this methos will always run after every test method regardless if the test is passed or failed
//close/quite browser ,  log out , close connections(related to JDBC), generate report

    @AfterMethod
    public void tearDown()  {

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
