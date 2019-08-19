package com.youtube.practice.day1Practice;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Booking_com {

   static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {

    }


    public static void openPage(){
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.booking.com");
    }

    public static void testBooking(){
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Woodland Hills, CA");
        driver.findElement(By.xpath("//span[@aria-hidden=\"true\"]")).findElement(By.xpath("//td[@class='bui-calendar__date bui-calendar__date--selected'][contains(text(),'5')]")).click();
        driver.findElement(By.xpath(""));


    }


}
