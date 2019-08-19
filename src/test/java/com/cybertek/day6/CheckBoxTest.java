package com.cybertek.day6;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckBoxTest {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {

        checkBoxPage();
//test1();
checkUncheck();
        SeleniumUtilities.waitPlease(3);
        driver.quit();
    }

    public static void checkBoxPage() {

        driver.manage().window().fullscreen();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");

    }
    public static void test1(){

        WebElement checkBox1 = driver.findElement(By.xpath("//body//input[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("//body//input[2]"));
    WebElement subTitle = driver.findElement(By.tagName("h3"));
        if (!checkBox1.isSelected() && checkBox2.isSelected()){

            System.out.println("check box 1 is not selectec");
            System.out.println("check box 2 is not selectec");
            checkBox1.click();
            checkBox2.click();
        }else if(checkBox1.isSelected()){

            System.out.println("check box 1 is not selectec");
        }else{
            System.out.println("failed");
        }

        if(subTitle.isDisplayed()){
            System.out.println("Displayed");
        }else {
            System.out.println("not Displayed");
        }


}

public static void checkUncheck(){

    WebElement checkBox1 = driver.findElement(By.xpath("//body//input[1]"));
    WebElement checkBox2 = driver.findElement(By.xpath("//body//input[2]"));
    SeleniumUtilities.waitPlease(2);
    checkBox1.click();
    SeleniumUtilities.waitPlease(2);
    checkBox2.click();
    SeleniumUtilities.waitPlease(2);

    if (checkBox1.isSelected()&& (!checkBox2.isSelected())){
        System.out.println("pass");
    }else{
        System.out.println("failed");
    }


}
}