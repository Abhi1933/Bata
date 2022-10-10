package Bata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeltsInfo {
	@FindBy (xpath= "(//a[@data-analytics-name='Belts'])")
	private WebElement belt;
	
	@FindBy (xpath= "(//img[@title='Bata Multi Belt For Men'])[4]")
	private WebElement beltpic;
	
	@FindBy (xpath= "//li[@data-display-value='S']")
	private WebElement beltsize;
	
	@FindBy (xpath= "(//button[@data-toggle='modal'])[1]")
	private WebElement bagtocart;
	

	public BeltsInfo(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicktobelts() throws InterruptedException {
		belt.click();
		Thread.sleep(1500);
		beltpic.click();
		beltsize.click();
		Thread.sleep(1500);
		bagtocart.click();
	}
}
