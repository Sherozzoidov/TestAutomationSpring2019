package com.cybertek.day3;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class ReadPageSourceCode {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.manage().window().fullscreen();

        driver.get("http://google.com");

       String getSource =  driver.getPageSource();

        System.out.println(getSource);

      // String getTitle= driver.getTitle();

//        SeleniumUtilities.waitPlease(3);
//        System.out.println(getTitle);
        driver.close();

    }


}
