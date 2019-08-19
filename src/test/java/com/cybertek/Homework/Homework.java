package com.cybertek.Homework;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework {

        static WebDriver driver = BrowserFactory.getDriver("chrome");

  public static void test(){

      driver.manage().window().maximize();

      driver.get("http://google.com");

      WebElement search = driver.findElement(By.id("q"));



}

    public static void main(String[] args) {
        test();
    }

        }