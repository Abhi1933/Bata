package Bata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoesInfo {
	@FindBy (xpath= "(//a[@data-analytics-name='Formal Shoes'])")
	private WebElement formalshoes;
	
	@FindBy (xpath= "(//img[@title='Hush Puppies Black Formal Shoes For Men'])[4]")
	private WebElement shoespic;
	
	@FindBy (xpath= "//li[@data-attr-value='070']")
	private WebElement shoessize;
	
	@FindBy (xpath= "(//button[@data-toggle='modal'])[1]")
	private WebElement bagtocart;
	

	public ShoesInfo(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicktoshoes() throws InterruptedException {
		formalshoes.click();
		Thread.sleep(1500);
		shoespic.click();
		shoessize.click();
		Thread.sleep(1500);
		bagtocart.click();
	}
}
