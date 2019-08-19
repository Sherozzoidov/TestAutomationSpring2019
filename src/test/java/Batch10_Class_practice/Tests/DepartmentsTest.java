package Batch10_Class_practice.Tests;

import com.cybertek.utilities.SeleniumUtilities;
import com.cybertek.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DepartmentsTest {
    WebDriver driver;

    Select select ;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");

    }
    @Test(priority = 0)
    public void test()throws NoSuchSessionException {
        //this is finding element with the select tag
       WebElement selectedElement = driver.findElement(By.id("searchDropdownBox"));

       // creating a Select Object with WebElement
       select =new Select(selectedElement);

       // getting the fist selected options
       String selectedOption = select.getFirstSelectedOption().getText();

        SeleniumUtilities.waitPlease(2);
       Assert.assertEquals(selectedOption, "All Departments");
    }
    @Test(priority = 1)
    public void test2(){

            for (int i = 0; i < select.getOptions().size()-1; i++) {
                System.out.println(select.getOptions().get(i).getText() + "  <--With-->  " + select.getOptions().get(i).getText());


            }

        }
        @Test(priority = 2)
        public void test3(){

        driver.findElement(By.cssSelector("[class='hm-icon nav-sprite']")).click();
        SeleniumUtilities.waitPlease(2);
        driver.findElement(By.cssSelector("[href='/gp/site-directory?ref_=nav_em_T1_0_2_2_34__fullstore']")).click();
            SeleniumUtilities.waitPlease(2);
    }







    @AfterClass
    public void tearDown(){

        driver.quit();

    }
}
