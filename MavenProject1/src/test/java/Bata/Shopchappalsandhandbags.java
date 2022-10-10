package Bata;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BrowserSetup.Base;
import Utils.Utility;

public class Shopchappalsandhandbags extends Base{
	private WebDriver driver ;
	private ChappalsandHandBags chappalsandHandBags ;
	private Chappals chappals;
	private HandBags handBags;
	private CartInfo cartInfo;
	@Parameters("Browser")
	@BeforeTest
	public void launchBrowser(String BrowserName)
	{
		if(BrowserName.equals("Chrome"))
		{
			driver= openChromeBrowser();
		}
		if(BrowserName.equals("Edge"))
		{
			driver = openEdgeBrowser();
		}
		driver.get("https://www.bata.in/");
		driver.manage().window().maximize();
		
	}
	@BeforeClass
	public void beforeClass() throws InterruptedException, IllegalStateException, IOException
	{ 
		LoginPage loginPage = new LoginPage(driver);
		loginPage.ClicktoLogin();
		String user= Utility.fetchExcelData(driver, 1, 0);
	    loginPage.sendusername(user);
	    String pass= Utility.fetchExcelData(driver, 1, 1);
	    loginPage.sendpassword(pass);
	    loginPage.clicktoSignIn();
	    chappalsandHandBags = new ChappalsandHandBags(driver);
	    chappals = new Chappals(driver);
	    handBags = new HandBags(driver);
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		chappalsandHandBags.clicktologo();
		chappalsandHandBags.movetowomen();
	}
	
	@Test (enabled=false)
	public void buyChappals() throws InterruptedException
	{
		chappals.clicktoChappals();
		System.out.println("---ChappalBought---");
	}
	
	@Test
	public void buyHandBags() throws InterruptedException
	{
		handBags.clicktoHandBags();
		Thread.sleep(3000);
		System.out.println("---HandBagsBought---");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Shopping Done");
	}
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		cartInfo = new CartInfo(driver);
		cartInfo.viewCart();
		Thread.sleep(2000);
	    chappalsandHandBags = null;
	    chappals = null;
	    handBags = null;
	}
	@AfterTest
	public void afterTest()
	{
		driver.close();
		driver= null;
		System.gc();
	}
	
}
