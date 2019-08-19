package Batch10_Class_practice.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver ;
    protected Actions action;
    protected SoftAssert softAssert;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();

    }
    @BeforeMethod
    public void setUpMethod (){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        action =new Actions(driver) ;
        softAssert = new SoftAssert();

    }
    public void tearDown(){
        driver.quit();
        softAssert.assertAll();
    }

}
