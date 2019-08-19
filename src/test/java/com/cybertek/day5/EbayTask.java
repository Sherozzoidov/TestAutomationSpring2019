package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class EbayTask {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        ebayTest();
    }


        public static void ebayTest(){
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.manage().window().fullscreen();

            driver.get("http://ebay.com");

            driver.findElement(By.id("gh-ac")).sendKeys("java");

            driver.findElement(By.id("gh-btn")).click();
String gettingResult = driver.findElement(By.className("srp-controls__count-heading")).getText();

            System.out.println(gettingResult);


driver.quit();
    }
}
