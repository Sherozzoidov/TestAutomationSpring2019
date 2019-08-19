package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsPracticeTagName {
   static WebDriver driver = BrowserFactory.getDriver("chrome");


    public static void main(String[] args)throws Exception  {
test1();

    }
    public static void test1() throws Exception {

        driver.manage().window().fullscreen();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("Size : " + buttons.size());
        for (WebElement button : buttons){
            button.click();
            System.out.println(button.getText());
          SeleniumUtilities.waitPlease(1);

        }


driver.quit();



}
}
