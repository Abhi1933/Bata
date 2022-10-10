package Bata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chappals{
	
	@FindBy (xpath= "//a[@id='IN_Women_Shoes_Chappals']")
	private WebElement chappals;
	
	@FindBy (xpath= "(//img[@alt='Bata Maroon Chappal For Women'])[2]")
	private WebElement chappalspic;
	
	@FindBy (xpath= "(//img[@title='Bata Maroon Chappal For Women'])[1]")
	private WebElement chappalcolur;
	
	@FindBy (xpath= "//li[@data-display-value='6']")
	private WebElement chappalsize;
	
	@FindBy (xpath= "(//button[@data-toggle='modal'])[1]")
	private WebElement bagtocart;
	
	

	public Chappals(WebDriver driver)
	{ 
		PageFactory.initElements(driver,this);
	}
	
	public void clicktoChappals() throws InterruptedException {
		chappals.click();
		Thread.sleep(1500);
	
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,200)");
		chappalspic.click();
		chappalcolur.click();
		Thread.sleep(1500);
		chappalsize.click();
		Thread.sleep(1500);
		bagtocart.click();
		
	}
}
