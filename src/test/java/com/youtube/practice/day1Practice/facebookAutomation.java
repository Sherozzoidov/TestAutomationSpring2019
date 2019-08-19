package com.youtube.practice.day1Practice;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class facebookAutomation {
static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        facebookWebSettings(); //this method opens facebook web page
        facebookTest();


        SeleniumUtilities.waitPlease(3);
        driver.quit();
    }

    public static void facebookWebSettings(){

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("http://amazon.com");

    }


public static void facebookTest(){

        driver.findElement(By.xpath("//a[@class='nav-a' and @tabindex= '47']")).click();
        driver.findElement(By.xpath("//span[@class=\"a-label a-checkbox-label\"]")).click();
        driver.findElement(By.xpath("//span[@class=\"a-label a-checkbox-label\" and contains(text(),'Baby')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Signstek Diaper Pail Refills for Diaper Genie Pails,2160 Count,8-...')]")).click();
    driver.findElement(By.className("a-button a-button-thumbnail a-button-toggle a-button-selected")).click();
    driver.findElement(By.className("a-button a-button-thumbnail a-button-toggle")).click();



}


}
