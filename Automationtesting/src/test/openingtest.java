package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import compack.LoginTest;

public class openingtest {
	WebDriver driver;

	  @BeforeTest
	  @Parameters("browser")
	public void setup()
	{
		 System.setProperty("webdriver.chrome.driver", "D://ChromeDriver//chromedriver.exe");
	        driver = new ChromeDriver();
		    driver.get("http://www.automationpractice.com/index.php?controller=authentication&back=my-account");
	       driver.manage().window().maximize();
	}
	       @Test
	       public void ValidateLogin() {
	       LoginTest page = new LoginTest(driver);
	       page.ValidateLogin();
	}
}
