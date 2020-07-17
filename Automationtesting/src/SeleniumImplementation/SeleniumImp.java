package SeleniumImplementation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumImp {
Actions action;
public void performMouseHower(WebElement element,WebDriver driver)
{
action=new Actions(driver);
action.moveToElement(element).build().perform();
}
public void click(WebElement element)
{
	element.click();
	}
public void clear(WebElement element)
{
	element.clear();
	}
public void setText(String text,WebElement element)
{
	element.sendKeys(text);
	}
public void selectByvisibleText(String text,WebElement selectSize) {
	Select s=new Select(selectSize);
	s.selectByVisibleText(text);
	
}
public void clickUsingJavaScriptExecutor(WebDriver driver,WebElement element)
{
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()", element);
	}
public void refresh(WebDriver driver)
{
	driver.navigate().refresh();
}
public boolean validateText(WebDriver driver,WebElement element, String ExpectedText)
{
	String ObservedText= element.getText();
	System.out.println(ObservedText);
	
	if(ObservedText.equals(ExpectedText)) {
		
		return false;
	}
	return true;
}
}
