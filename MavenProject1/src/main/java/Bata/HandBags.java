package Bata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandBags{
	@FindBy (xpath= "//a[@data-analytics-name='Handbags']")
	private WebElement handBags;
	
	@FindBy (xpath= "(//img[@alt='BATA Tan Handbag For Women'])[2]")
	private WebElement bagspic;
	
	@FindBy (xpath= "//img[@title='BATA Tan Handbag For Women']")
	private WebElement bagscolour;
	
	@FindBy (xpath= "//li[@data-display-value='UN']")
	private WebElement bagsize;
	
	@FindBy (xpath= "(//button[@data-toggle='modal'])[1]")
	private WebElement bagtocart;
	

	public HandBags(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicktoHandBags() throws InterruptedException {
		handBags.click();	
		bagspic.click();
		Thread.sleep(1500);
		bagscolour.click();
		bagsize.click();
		Thread.sleep(1500);
		bagtocart.click();
	}
}
