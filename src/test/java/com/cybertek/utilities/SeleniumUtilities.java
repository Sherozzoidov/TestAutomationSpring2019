package com.cybertek.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SeleniumUtilities {
    public static void verifyEquals(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
            System.out.println("expectedResult " + expected);
            System.out.println("actualResult " + actual);

        }
    }
    public static void waitPlease(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void openPage(String page, WebDriver driver) {
        List<WebElement> listOfExamples = driver.findElements(By.tagName("a"));
        for (WebElement example : listOfExamples) {
            if (example.getText().contains(page)) {
                example.click();
                break;
            }
        }



    }
    public static void verifyIsDisplayed(WebElement element){

        if (element.isDisplayed()){
            System.out.println("PASSED");
            System.out.println(element.getText()+ " is visible");
        }else{
            System.out.println("Passed");
            System.out.println(element.getText()+ " is not visible");
        }

    }
//    public static String getScreenshot(String name)  {
//        // name the screenshot with the current date time to avoid duplicate name
//        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_hh:mm:ss a"));
//        // TakesScreenshot ---> interface from selenium which takes screenshots
//        TakesScreenshot ts = (TakesScreenshot) WebDriver();
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        // full path to the screenshot location
//        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
//        File finalDestination = new File(target);
//        // save the screenshot to the path given
//        try {
//            FileUtils.copyFile(source, finalDestination);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return target;
//    }



}
