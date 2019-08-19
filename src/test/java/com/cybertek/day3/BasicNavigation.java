package com.cybertek.day3;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.manage().window().fullscreen();

        driver.get("http://google.com");
        Thread.sleep(1000);

        driver.navigate().to("http://amazon.com");
        Thread.sleep(1000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone X");

        driver.findElement(By.className("nav-input")).click();
        driver.findElement(By.xpath("//span[@class='a-price-whole'][contains(text(),'899')]")).click();

        driver.navigate().back();

        driver.findElement(By.xpath("//span[@class='a-price-whole'][contains(text(),'999')]")).click();
driver.navigate().back();

driver.findElement(By.xpath("//span[@class='a-price-whole'][contains(text(),'667')]")).click();
driver.navigate().back();


    Thread.sleep(3000);
        driver.quit();


    }
}
