package com.cybertek.day8_testNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class TaskForTestNg {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void test1() {

        int  expectedYear = 2019;
        String month = "August";
        int day = 13;

        Select selectYear = new Select(driver.findElement(By.id("year")));
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        Select selectDay = new Select(driver.findElement(By.id("day")));



    int actualYear = Integer.parseInt(selectYear.getFirstSelectedOption().getText());
    String actualMonth = selectMonth.getFirstSelectedOption().getText();
    int actualDay = Integer.parseInt(selectDay.getFirstSelectedOption().getText());

Assert.assertEquals(actualYear, expectedYear);
Assert.assertEquals(actualMonth, month);
Assert.assertEquals(actualDay, day);


        }
        @AfterMethod
        public void tearDown() {
            System.out.println("closing browser");
            driver.quit();
    }

}