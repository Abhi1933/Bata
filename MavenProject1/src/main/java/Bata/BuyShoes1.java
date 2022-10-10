package Bata;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyShoes1 {
   
	@FindBy (xpath= "(//a[contains(text(),'Men')])[3]")
	private WebElement mens;

	public BuyShoes1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}
	
	public void gotomens()
	{
		mens.click();
	}
	
}
