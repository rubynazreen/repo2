package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FbReg 

{
    WebDriver driver;

    public FbReg(WebDriver driver)
    {
        this.driver = driver;
    }
    public void create()
    {
    	String Expected ="Create a new account";
    	WebElement create=driver.findElement(By.xpath("//a[text()='Create new account']"));
    	create.click();
    	String act_result=driver.findElement(By.xpath("//div[text()='Create a new account']")).getText();
    	Assert.assertEquals(Expected, act_result);
    	System.out.println("register a  new account here");
    	
    }
    public void newreg()
    {
    	
    	WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
    	firstname.sendKeys("Ruby");
    	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
    	lastname.sendKeys("nazreen");
    }
    	
    		public void dropdownm() {
    		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    		    WebElement selectm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='birthday_month']")));
    		    Select select = new Select(selectm);
    		    select.selectByVisibleText("Feb");
    		}

    		
    	
    	public void dropdownd()
    	{
    	WebElement selectd=driver.findElement(By.xpath("//select[@name='birthday_day']"));
    	Select select = new Select(selectd);
    	selectd.click();
    	select.selectByVisibleText("28");
    	}
    	public void dropdowny()
    	{
    	WebElement selecty=driver.findElement(By.xpath("//select[@name='birthday_year']"));
    	Select select = new Select(selecty);
    	selecty.click();
    	select.selectByVisibleText("1991");
    	}
    
    	public void gender()
    	
    	{
    		WebElement radioBtn = driver.findElement(By.xpath("//label[contains(., 'Female')]"));
    		radioBtn.click();
    	}

    	public void mobnum()
    	{
    		WebElement regemail= driver.findElement(By.xpath("//input[@name='reg_email__']"));
    		regemail.sendKeys("ruby.nazreen1@gmail.com");
    		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
    		pass.sendKeys("Qwerty23/");
    		WebElement signup=driver.findElement(By.xpath("//button[@name='websubmit']"));
    		signup.click();
    		}
public void email()
    	
    	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    		WebElement mail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='email']")));
    		mail.sendKeys("ruby.nazreen1@gmail.com");
    	}

public void password()

{
	WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
	pass.sendKeys("Qwerty23/");
}
public void login()
{
	WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
	log.click();
}

}
