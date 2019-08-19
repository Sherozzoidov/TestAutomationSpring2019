package com.cybertek.day6;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonsTest {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args)throws Exception{
openaRadioButtonPage();

//test1();

//test2();
//test3();
        test4();
driver.close();

    }
    public static void openaRadioButtonPage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/radio_buttons");



    }

    public static void test1()throws Exception{

        // we are checking if the blue button is selected
    //we are using isSelected button
       WebElement blueButton = driver.findElement(By.id("blue"));

               if(blueButton.isSelected()){
                   System.out.println("PASSED");
               }else {
                   System.out.println("FAILED");
               }
        Thread.sleep(2000);

    }
public static void waitPease(int seconds){
        try {
            Thread.sleep(100000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
}
public static void test2()throws Exception{

       WebElement blackBtn = driver.findElement(By.id("black"));
    WebElement greenBtn =driver.findElement(By.id("green"));

    if (blackBtn.isEnabled()&& (!greenBtn.isEnabled())){
        System.out.println("Passed");
    }else {
        System.out.println("Failed");
        Thread.sleep(2000);
    }
}
public static void test3() throws Exception{
        WebElement blueBtn= driver.findElement(By.id("blue"));
        if (blueBtn.isSelected()){
            System.out.println("Passed");
            System.out.println("blue selected");
        }else {
            System.out.println("Failed");
            System.out.println("B lue is not selected");
        }


        WebElement blackBtn = driver.findElement(By.id("black"));

        Thread.sleep(2000);
        blackBtn.click();
    Thread.sleep(2000);
        if (blackBtn.isSelected()){
            System.out.println("Selected");
        }else {
            System.out.println("Failed");
        }
    if (!blueBtn.isSelected()){
        System.out.println("Passed");
        System.out.println("blue is not selected");
    }else {
        System.out.println("Failed");
        System.out.println("Black is selected");
    }
}

    public static void test4()throws Exception{

        List<WebElement> lstOfRadioBtn = driver.findElements(By.xpath("//input[@type='radio']"));

   int counter = 0;

        for (WebElement radioBtn:lstOfRadioBtn ) {
            if (radioBtn.isSelected()){
                System.out.println(radioBtn.getAttribute("id"));
                counter++;
            }

        }
        System.out.println(counter);
Thread.sleep(3000);
    }

}
