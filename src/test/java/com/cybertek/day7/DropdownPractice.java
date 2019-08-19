package com.cybertek.day7;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropdownPractice {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        openWeb();

    dropDown();



        System.out.println("passed");
        SeleniumUtilities.waitPlease(2);
        driver.quit();
    }


    public static void openWeb (){
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Dropdown List')]"));
        SeleniumUtilities.verifyIsDisplayed(element);
    }

    public static void dropDown(){

        driver.findElement(By.id("dropdown")).click();
        driver.findElement(By.xpath("//*[contains (text(),'Option 1')]")).click();
SeleniumUtilities.waitPlease(2);
//        driver.findElement(By.xpath( "dropdown")).click();
//        driver.findElement(By.xpath("//*[contains (text(),'Option 2')]")).click();


        driver.findElement(By.id("year")).findElement(By.xpath("//*[contains (text(),'1989')]")).click();
        SeleniumUtilities.waitPlease(2);
                driver.findElement(By.id("month")).findElement(By.xpath("//option[text()='September']")).click();
        SeleniumUtilities.waitPlease(2);
        driver.findElement(By.id("day")).findElement(By.xpath("//option[text()='10']")).click();
        driver.findElement(By.id("state")).findElement(By.xpath("//option[text()='Pennsylvania']")).click();

driver.findElement(By.xpath("//option[text()='Java']")).click();
driver.findElement(By.id("dropdownMenuLink")).click();
        driver.findElement(By.xpath("//a[text()='Google']")).click();
        driver.navigate().back();
        driver.findElement(By.id("dropdownMenuLink")).click();
                driver.findElement(By.xpath("//a[text()='Amazon']")).click();
        driver.navigate().back();
        driver.findElement(By.id("dropdownMenuLink")).click();

        driver.findElement(By.xpath("//a[text()='Yahoo']")).click();
        driver.navigate().back();
        driver.findElement(By.id("dropdownMenuLink")).click();
                driver.findElement(By.xpath("//a[text()='Facebook']")).click();
        driver.navigate().back();


    }




}
