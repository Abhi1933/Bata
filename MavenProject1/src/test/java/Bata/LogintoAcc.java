package Bata;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.Utility;

public class LogintoAcc {
    private WebDriver driver;
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() throws IllegalStateException, IOException
	{
		driver.get("https://www.bata.in/");
		
	}
	
	@Test
	public void viewMensSection() throws IllegalStateException, IOException
	{	
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.logintoaccount();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.ClicktoLogin();
		String user= Utility.fetchExcelData(driver, 1, 0);
		loginPage.sendusername(user);
		System.out.println(user);
			    
		String pass= Utility.fetchExcelData(driver, 1, 1);
	    loginPage.sendpassword(pass);
	    System.out.println(pass);
		
	    loginPage.clicktoSignIn();
//		BuyShoes1 buyShoes = new BuyShoes1(driver);
//		buyShoes.gotomens();
	   
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("LogOut");
	}
}
