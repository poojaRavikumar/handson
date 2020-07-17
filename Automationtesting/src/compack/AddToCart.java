package compack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumImplementation.SeleniumImp;

public class AddToCart {
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
	WebElement ItemImage;
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]")
	WebElement btnMore;
	@FindBy(xpath="//*[@id=\"quantity_wanted\"]")
	WebElement txtQuantity;
	@FindBy(xpath="//*[@id=\"group_1\"]")
	WebElement selectSize;
	@FindBy(xpath="//*[@id=\"add_to_cart\"]")
	WebElement btnAddToCart;
	@FindBy(css="div#layer_cart a > span")
	WebElement btnCheckout;
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div")
	WebElement CartText;
	
	SeleniumImp selenium;
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selenium=new SeleniumImp();
	}
	public boolean ValidateAddToCart(WebDriver driver) {
		selenium.performMouseHower(ItemImage, driver);
		selenium.click(btnMore);
		selenium.clear(txtQuantity);
		selenium.setText("3",txtQuantity);
		selenium.selectByvisibleText("L",selectSize);
		selenium.click(btnAddToCart);
		selenium.clickUsingJavaScriptExecutor(driver, btnCheckout);
		selenium.refresh(driver);
		return selenium.validateText(driver, CartText,"3");
		
	}
	
			}
