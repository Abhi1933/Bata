package Bata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartInfo 
{
	@FindBy (xpath= "//div[@title='View Cart']")
	private WebElement cart;
	
	@FindBy (xpath= "(//button[@role='button'])[1]")
	private WebElement proceed;		

	public CartInfo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void viewCart()
	{
		cart.click();
		proceed.click();
	}
//	title="View Cart"
}
