package Bata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChappalsandHandBags {
	private WebDriver driver; 
    private Actions act;
	@FindBy (xpath= "//a[@title='Bata Home']")
	private WebElement batalogo;
	
	@FindBy (xpath= "//a[text()='Women']")
	private WebElement women;
	

	public ChappalsandHandBags(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	public void clicktologo() throws InterruptedException 
	{
		Thread.sleep(3000);
		batalogo.click();
	}
	
	public void movetowomen() 
	{
		act = new Actions(driver);
		act.moveToElement(women).build().perform();
	}
}
