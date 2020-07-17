package compack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchFunction {
	Actions action;
	public SearchFunction(WebDriver driver) {
		action=new Actions(driver);
	}
	public void pressEnter() {
		action.sendKeys(Keys.ENTER).build().perform();
	}
	public void scrollDown(WebDriver driver) {

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,2000)","");
	}
	public void performMouseHower(WebElement element)
	{
	
	action.moveToElement(element).build().perform();
	}
	
	public void clickUsingJavaScriptExecutor(WebDriver driver,WebElement element)
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
		}
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D://ChromeDriver//chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       SearchFunction search=new SearchFunction(driver);
		    driver.get("http://www.automationpractice.com/index.php");
	       driver.manage().window().maximize();
	
	       WebElement inputSearch=driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
	       inputSearch.sendKeys("Printed");
	       search.pressEnter();
	       search.scrollDown(driver);
	       
	       String image="2";
	       WebElement SearchImage=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li["+image+"]/div/div[1]/div/a[1]/img"));
	      search.performMouseHower(SearchImage);
	       
	      
	      
	      WebElement btnAddToCart =driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span"));
	       search.clickUsingJavaScriptExecutor(driver,btnAddToCart);
	       
	       
	       
	       
	       
	}
	
	
	
}
