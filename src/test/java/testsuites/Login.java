package testsuites;


import org.testng.annotations.Test;
import pageobjects.Locators;
import utility.WebDriverUtils;

public class Login extends SetupTearDown 
{
@Test
public void test1()
{
	WebDriverUtils.type(Locators.uname,"test124");
	WebDriverUtils.type(Locators.pwd,"test1");
}
}
