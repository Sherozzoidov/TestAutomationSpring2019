package com.cybertek.day6;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AmazonWarmUpTask {

  static  WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
amazonSerch();


    }

    public static void amazonSerch (){

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();

        driver.get("https://www.amazon.com/");

       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book");
        driver.findElement(By.className("nav-input")).click();

        String titleCont = driver.getTitle();

    if(titleCont.toUpperCase().contains("BOOK")){
        System.out.println("passed");
    }else {
        System.out.println("failed");
    }

   // System.out.println(titleCont);

        SeleniumUtilities.waitPlease(3);
    driver.close();
    }


}
