package base;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FbBase
{

	public WebDriver driver;

	protected Properties Prop;
public void loadprop()throws IOException
{
FileInputStream propo=new FileInputStream("src/test/resources/config.properties");
Prop=new Properties();
Prop.load(propo);
}

@BeforeTest
public void setConfig() throws IOException {
loadprop();
String browser = Prop.getProperty("browser", "chrome").toLowerCase();  // Default to Chrome if not specified

switch (browser)
{
    case "chrome":
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        break;
    case "firefox":
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        break;
    default:
        throw new IllegalArgumentException("Unsupported browser: " + browser);
}

// Get URL from config.properties
String url = Prop.getProperty("url");
if (url == null || url.isEmpty()) {
    throw new IllegalArgumentException("URL is missing in config.properties");
}

driver.get(Prop.getProperty("url"));
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}


}
