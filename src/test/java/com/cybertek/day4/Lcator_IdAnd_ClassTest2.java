package com.cybertek.day4;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lcator_IdAnd_ClassTest2 {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().fullscreen();
        driver.findElement(By.name("email")).sendKeys("sherozzoidov89@gmail.com"+ Keys.ENTER);
        SeleniumUtilities.waitPlease(2);
      //  driver.findElement(By.id("form_submit")).click();

        WebElement confirmation_message = driver.findElement(By.name("confirmation_message"));
        String actualResult = confirmation_message.getText();
        String expectedResult = "Your e-mail's been sent!";


        if (actualResult.equals(expectedResult)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        SeleniumUtilities.waitPlease(2);
        driver.navigate().back();

        SeleniumUtilities.waitPlease(3);
        driver.quit();

    }
}
