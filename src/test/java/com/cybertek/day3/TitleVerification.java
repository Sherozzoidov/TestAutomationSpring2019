package com.cybertek.day3;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        String expectedUrls = "http://practice.cybertekschool.com";
        WebDriver driver = BrowserFactory.getDriver("chrome");

        List<String> titles = new ArrayList<String>();
        for (String url: urls) {
            driver.get(url);
            SeleniumUtilities.waitPlease(2);
            titles.add(driver.getTitle());
        }
String expectedTitle = "Practice";
        for (String title : titles){
            if (title.equals(expectedTitle)){
                System.out.println("Passed");

            }else {
                System.out.println("failed");
            }

        if (driver.getCurrentUrl().startsWith(expectedUrls)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        }

    driver.close();
    }


}



