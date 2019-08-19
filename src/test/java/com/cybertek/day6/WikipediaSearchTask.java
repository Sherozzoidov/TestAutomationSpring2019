package com.cybertek.day6;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WikipediaSearchTask {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
wikiSearch();
    }


    public static void wikiSearch(){

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();


        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys("Selenium Webdriver", Keys.ENTER);
       driver.findElement(By.linkText("Selenium (software)")).click();

       String endsWithX =driver.getCurrentUrl();
       if (endsWithX.endsWith("x")){
           System.out.println("Passed");
       }else {
           System.out.println("failed");
       }

        SeleniumUtilities.waitPlease(2);
        driver.quit();
    }

}
