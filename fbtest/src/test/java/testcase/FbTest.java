package testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FbReg;
import base.FbBase;

public class FbTest extends FbBase {
    public FbReg obj;
    String message;

    @BeforeClass
    public void objinit() throws IOException
    {
    	String expected="https://www.facebook.com/";
    	String actual;
    	
        setConfig(); 
        obj = new FbReg(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        actual=driver.getCurrentUrl();  
        Assert.assertEquals(expected, actual);
        System.out.println("reached facebook home ");
        
        
    }

    @Test
    public void Postest() {
        obj.create();
        obj.newreg();
        obj.dropdownm();
        obj.dropdownd();
        obj.dropdowny();
        obj.gender();
        obj.mobnum();
        obj.email();
        obj.password();
    }
        


        	

    

    @AfterMethod
    public void tearDown() {
        driver.quit(); // or driver.navigate().refresh();
    }
}
