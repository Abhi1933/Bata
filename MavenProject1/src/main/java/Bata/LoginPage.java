package Bata;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy (xpath= "(//span[@class='cc-headerBar-label'])[4]")
	private WebElement login;
	
	@FindBy (xpath = "(//input[@type='text'])[3]")
	private WebElement username;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "(//button[@type='submit'])[3]")
	private WebElement signin;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ClicktoLogin()
	{
		login.click();
	}
	public void sendusername(String user) throws IllegalStateException, IOException
	{
//		data=Utility.fetchExcelData(driver, 1, 0);
		username.sendKeys(user);
	}
	public void sendpassword(String pass) throws IllegalStateException, IOException
	{
//		data=Utility.fetchExcelData(driver, 1, 1);
		password.sendKeys(pass);
	}
	public void clicktoSignIn()
	{
		signin.click();
	}
	
//		for(int i=1; i<5;i++)
//		{
//			for(int j=0;j<5;j++)
//			{
//				try
//				{
//					data=Utility.fetchExcelData(driver, i, j);
//					System.out.println(data);
//				}
//				catch(IllegalStateException e)
//				{
//					data=Utility.fetchExcelData(driver, i, j);
//					System.out.println(data);
//				}
//			}
		
}


	

