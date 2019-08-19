package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorPracticeClassName {

    static WebDriver driver = BrowserFactory.getDriver("chrome");


    public static void main(String[] args) {
        getClassName();
    }




public static void getClassName (){

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.manage().window().fullscreen();

    driver.get("http://practice.cybertekschool.com/");

    List<WebElement> buttons = driver.findElements(By.className("list-group-item"));

    for (WebElement allButtons : buttons) {

        System.out.println(allButtons.getText());

}


driver.quit();
    }



}
