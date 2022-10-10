package Bata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BagInfo 
	{
	@FindBy (xpath= "(//a[@data-analytics-name='Bags'])[5]")
	private WebElement bags;
	
	@FindBy (xpath= "(//img[@title='BATA Black Laptop Bag For Men'])[2]")
	private WebElement bagpic;
	
	@FindBy (xpath= "//li[@data-attr-value='950']")
	private WebElement bagsize;
	
	@FindBy (xpath= "(//button[@data-toggle='modal'])[1]")
	private WebElement addtocart;
	

	public BagInfo(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicktobags() throws InterruptedException {
		bags.click();
		Thread.sleep(1500);
		bagpic.click();
		bagsize.click();
		Thread.sleep(1500);
		addtocart.click();
	}
	}
	
	

