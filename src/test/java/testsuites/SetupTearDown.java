package testsuites;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import utility.WebDriverUtils;

public class SetupTearDown 
{
	@BeforeClass
	public void launchBrowser()
	{
		WebDriverUtils.initialize();
	}
	 @BeforeMethod
	    public void browserUrlLaunch()
	    {
	    WebDriverUtils.launchUrl("https://www.facebook.com");
	    }
}
