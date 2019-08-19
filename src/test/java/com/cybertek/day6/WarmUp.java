package com.cybertek.day6;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WarmUp {

    static WebDriver driver = BrowserFactory.getDriver("chrome" );

   public static void test1() throws Exception{


       driver.manage().window().maximize();

       Thread.sleep(3000);

       driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS);
        driver.get("http://amazon.com");
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book");
       driver.findElement(By.className("nav-input")).click();
       String title = driver.getTitle();

       if (title.contains("Book")) {
           System.out.println("Passed");
       } else {
           System.out.println("Failed");
       }
       driver.close();
   }

    public static void main(String[] args) throws Exception {
       // test1();
   test2();


   }

    //    TEST 2
//    go to wikipedia.org
//    enter search term ‘selenium webdriver’
//    click on search button
//    click on search result ‘Selenium (software)’
//    verify url ends with ‘x’
    public static void test2() throws Exception {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver", Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.linkText("Selenium (software)")).click();
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        if (url.endsWith("x")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
        driver.close();

    }

}
