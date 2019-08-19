package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckBox {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {


test1();
test2();

    }

public static void openCheckBox(){
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://practice.cybertekschool.com/checkboxes");
WebElement checkBoxLogo = driver.findElement(By.name("h3"));
if(checkBoxLogo.isDisplayed()){
    System.out.println("Checkboxes logo is visible");

}else {
    System.out.println("Checkboxes logo not found!");
}

}
    public static void test1(){
        openCheckBox();
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if (!checkBox1.isSelected()){
            System.out.println("Passes");
        }else {
            System.out.println("Failed");
        }
        if (checkBox2.isSelected()){
            System.out.println("Passes");
        }else {
            System.out.println("Failed");
        }

    driver.close();
    }

    public static void test2(){
        openCheckBox();
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        SeleniumUtilities.waitPlease(2);
        checkBox1.click();  // to select it checkbox
        SeleniumUtilities.waitPlease(2);
        checkBox2.click();
        SeleniumUtilities.waitPlease(2);
        if (checkBox1.isSelected()&&(!checkBox1.isSelected())){
            System.out.println("Passes");
        }else {
            System.out.println("Failed");
        }

driver.close();
    }


}
