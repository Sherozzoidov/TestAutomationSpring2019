package com.cybertek.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import static com.cybertek.utilities.BrowserFactory.getDriver;
import static java.sql.Driver.*;

public class TestBase {

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import java.io.File;
//import java.io.IOException;
//import java.time.LocalDateTime;
//import java.util.concurrent.TimeUnit;

    //should be public/protected !!!!
    public WebDriver driver;
    public Actions action;
    //we need this object for building reports, but it doesn't build itself
    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest extentLogger;

    @BeforeTest
    public void testSetup() {
        //we are creating actual reporter
        report = new ExtentReports();

        String pathToReport = System.getProperty("user.dir");
    }

//    @BeforeMethod
//    public void setup() {
//        driver = getDriver();
//        action = new Actions(driver);
//        driver.manage().timeouts().implicitlyWait(Long.valueOf(ConfigurationReader.getProperty("implicitwait")), TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get(ConfigurationReader.getProperty("url"));
//    }
//
//    @AfterMethod
//    public void teardown(ITestResult result) {
//        if (ITestResult.FAILURE == result.getStatus()) {
//            //We are creating object to take a screenshot
//            TakesScreenshot screenshot = (TakesScreenshot) driver;
//            //call method to take a screenshot
//            File src = screenshot.getScreenshotAs(OutputType.FILE);
//            try {
//                //getName() - will return name of the test method
//                //and save screenshot under project > screenshots with date/time/test name tag
//                FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "/screenshots/" + LocalDateTime.now() + "_" + result.getName() + ".png"));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        closeDriver();
//    }
//}

}


