package com.cybertek.day4;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class test1 {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement email =driver.findElement(By.name("email"));
       // WebElement element = driver.findElement(By.id("id=\"content\""));


        WebElement submitButton = driver.findElement(By.id("form_submit"));

        Faker faker = new Faker();
 String name = faker.pokemon().name().replace(" ","").toLowerCase();
        email.sendKeys(faker.name().firstName());

        Thread.sleep(2000);
        submitButton.click();




        Thread.sleep(3000);

        WebElement confirmation_message = driver.findElement(By.name("confirmation_message"));
        String expectedMessage = "Your e-mail's been sent!";

        String actualMessage = confirmation_message.getText();

        if(actualMessage.equals(expectedMessage)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test Falied");
            System.out.println("expected Message: " + expectedMessage);
            System.out.println("actual Message : "+ actualMessage) ;
        }




        driver.close();

    }
}
