package Bata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bagandshoesandbelt {
	private WebDriver driver; 
    private Actions act;
    
	@FindBy (xpath= "//a[@title='Bata Home']")
	private WebElement batalogo;
	
	@FindBy (xpath= "//a[text()='Men']")
	private WebElement men;
	
	public Bagandshoesandbelt(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		 this.driver=driver;	
	}
	
	public void clicktologo() 
	{
		batalogo.click();
	}
	
	public void movetomen() 
	{
		act = new Actions(driver);
		act.moveToElement(men).build().perform();
	}
}
