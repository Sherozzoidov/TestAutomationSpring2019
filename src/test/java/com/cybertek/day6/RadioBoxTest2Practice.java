package com.cybertek.day6;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioBoxTest2Practice {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        radioButtonPage();
        //   checkRadioBtn();
        //checkedOrNot();

        //verifyClick();
        allButtons();


        driver.quit();
    }

    public static void radioButtonPage() {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
    }

    public static void checkRadioBtn() {
        WebElement radioBtn = driver.findElement(By.id("blue"));
        if (radioBtn.isSelected()) {
            System.out.println("PASSED");

        } else {
            System.out.println("FAILED");
        }
        SeleniumUtilities.waitPlease(2);
    }

    public static void checkedOrNot() {

        WebElement blackBtn = driver.findElement(By.id("black"));
        WebElement greenBtn = driver.findElement(By.id("green"));
        if (blackBtn.isEnabled() && !greenBtn.isEnabled()) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        SeleniumUtilities.waitPlease(2);
    }

    public static void verifyClick() {

        WebElement blueBtn = driver.findElement(By.id("blue"));
        WebElement blackBtn = driver.findElement(By.id("black"));
        blackBtn.click();

        if (blackBtn.isSelected() && !blueBtn.isSelected()) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }


    }

    public static void allButtons() {
        List<WebElement> lstRadioBtn = driver.findElements(By.xpath("//input[@type='radio']"));
        int counter = 0;
        for (WebElement radioBtn : lstRadioBtn) {
            if (radioBtn.isSelected()) {
                counter++;
            }
        }
        System.out.println(counter);


    }
}