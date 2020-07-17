package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import compack.AddToCart;


public class AddToCartTesting {

		WebDriver driver;
		AddToCart page;
		  @BeforeTest
		  @Parameters("browser")
		public void setup()
		{
			 System.setProperty("webdriver.chrome.driver", "D://Chromdriver//chromedriver.exe");
		        driver = new ChromeDriver();
			    driver.get("http://www.automationpractice.com/index.php");
		        driver.manage().window().maximize();
		        page=new AddToCart(driver);
		}
		    
		       @Test
		       public void ValidateAddToCart()
		       {
		    	Assert.assertTrue(page.ValidateAddToCart(driver));   
		       }
	}



