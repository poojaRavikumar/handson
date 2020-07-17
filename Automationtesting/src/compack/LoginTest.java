package compack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginTest {

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[contains(@id,'passwd')]")
	WebElement pass; 
	
	@FindBy(xpath = "//span[contains(.,'Sign in')]")
	WebElement btnSubmit;
	
public LoginTest(WebDriver driver) {
PageFactory.initElements(driver,this);

}
public void ValidateLogin() {
	email.sendKeys("ravikumarpooja1998@gmail.com");
	pass.sendKeys("12345");
	btnSubmit.click();
	
}
}
