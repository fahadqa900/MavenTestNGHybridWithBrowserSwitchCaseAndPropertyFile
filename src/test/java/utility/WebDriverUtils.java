package utility;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtils 
{
	 static WebDriver driver;
	    public static void initialize()
	    {
	        switch(PropertyUtils.getProperty("browser"))
	        {
	            case "ff": case "Firefox":
	                driver = new FirefoxDriver();
	                break;
	            case "Edge":
	                driver = new EdgeDriver();
	                break;
	            default:
	                driver = new ChromeDriver();
	                break;
	        }
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    }
	    public static void launchUrl(String url)
	    {
	      driver.get(url);
	    }
	    public static void type(By locator, String value)
	    {
	        WebElement e = driver.findElement(locator);
	        e.clear();
	        e.sendKeys(value);
	    }
}
