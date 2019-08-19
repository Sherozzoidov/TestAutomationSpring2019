package Batch10_Class_practice.Tests;

import Batch10_Class_practice.Utilities.TestBase;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {

    @Test
    public void test(){
        driver.get("http://the-internet.herokuapp.com/upload");
    }

}
