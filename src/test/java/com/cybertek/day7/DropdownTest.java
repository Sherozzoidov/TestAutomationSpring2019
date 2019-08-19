package com.cybertek.day7;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownTest {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
openDropDown();

test1();

stateDrop();
monthDrop();
clickEach();
driver.quit();
    }


    public static void openDropDown(){

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Dropdown List')]"));
        SeleniumUtilities.verifyIsDisplayed(element);

    }


    public static void test1(){
        WebElement dropDown = driver.findElement(By.id("dropdown"));

        Select dropDownSelect = new Select(dropDown);
        String actual = dropDownSelect.getFirstSelectedOption().getText();
        String expected = "Please select an option";

        SeleniumUtilities.verifyEquals(expected, actual);

        List<WebElement> option = dropDownSelect.getOptions();
        for (WebElement options : option    ) {

            System.out.println(options.getText());
        }




    }

    public static void stateDrop (){
        WebElement dropState = driver.findElement(By.id("state"));

        Select selectState = new Select(dropState);

        List<WebElement> states = selectState.getOptions();
        for (WebElement numState : states) {
            String size = numState.getText();

            System.out.println(size);




    }
//        selectState.selectByVisibleText("Pennsylvania");
//        SeleniumUtilities.waitPlease(2);
//
//        selectState.selectByVisibleText("Alabama");
//        SeleniumUtilities.waitPlease(2);
//        selectState.selectByVisibleText("Alaska");
//        SeleniumUtilities.waitPlease(2);
//        selectState.selectByVisibleText("Arizona");
//        SeleniumUtilities.waitPlease(2);
//        selectState.selectByVisibleText("Arkansas");
//        SeleniumUtilities.waitPlease(2);
//
//        selectState.selectByVisibleText("California");
//        SeleniumUtilities.waitPlease(2);
//        selectState.selectByVisibleText("Colorado");
//        SeleniumUtilities.waitPlease(2);
//        selectState.selectByVisibleText("Connecticut");
//        SeleniumUtilities.waitPlease(2);
//        selectState.selectByVisibleText("Delaware");
//        SeleniumUtilities.waitPlease(2);
//        selectState.selectByVisibleText("District Of Columbia");
//        SeleniumUtilities.waitPlease(2);
//        selectState.selectByVisibleText("Florida");
//        SeleniumUtilities.waitPlease(2);

    }


    public static void monthDrop(){
        WebElement month = driver.findElement(By.id("month"));

        Select selectMonth = new Select(month);
        List<WebElement> countOfMonth = selectMonth.getOptions();
        for (WebElement monthOpt : countOfMonth) {
            System.out.println(monthOpt.getText());
        }






    }
    public static void clickEach(){
        WebElement statChoose = driver.findElement(By.id("state"));

        Select selectState = new Select(statChoose);

        List<WebElement> loopStates = selectState.getOptions();

        for (WebElement states : loopStates  ) {
            SeleniumUtilities.waitPlease(1);
            selectState.selectByVisibleText(states.getText());

            System.out.println(loopStates);

        }
    }


}
