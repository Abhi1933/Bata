package Bata;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
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
public class shopbagandshoesandbelts extends Base
{	 
	private WebDriver driver ;
	private int testID ;
	private Bagandshoesandbelt bagandshoesandbelt ;
	private BagInfo bagInfo;
	private BeltsInfo beltsInfo;
	private ShoesInfo shoesInfo;
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
	public void beforeClass() throws IllegalStateException, IOException
	{
//		ChromeOptions options = new ChromeOptions();	
//		options.addArguments("–disable-notifications");
		LoginPage loginPage = new LoginPage(driver);
	    loginPage.ClicktoLogin();
	    String data= Utility.fetchExcelData("sheet1", 1, 0);
	    loginPage.sendusername(data);
	    System.out.println(data);
	    String data1= Utility.fetchExcelData("sheet1", 1, 0);
	    loginPage.sendpassword(data1);
	    System.out.println(data1);
	    loginPage.clicktoSignIn();
//	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    bagandshoesandbelt = new Bagandshoesandbelt(driver);
	    bagInfo = new BagInfo(driver);
	    beltsInfo = new BeltsInfo(driver);
	    shoesInfo = new ShoesInfo(driver);
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		bagandshoesandbelt.clicktologo();
		bagandshoesandbelt.movetomen();
	}
	
	@Test 
	public void buyBag() throws InterruptedException, IOException
	{
		 testID = 3333;
		bagInfo.clicktobags();
		Assert.fail();
		Thread.sleep(2000);
		System.out.println("---BagBought---");
	}
	
	@Test 
	public void buyBelts() throws InterruptedException, IOException
	{	
		testID = 1111;
		beltsInfo.clicktobelts();
		Thread.sleep(3000);
		System.out.println("---BeltBought---");
	}

	@Test 
	public void buyShoes() throws InterruptedException 
	{
		testID = 2222;
		shoesInfo.clicktoshoes();
		System.out.println("---ShoesBought---");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus());
		{
			Utility.captureScreenshot(driver, testID);
		}
		System.out.println("Shopping Done");
	}
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		cartInfo = new CartInfo(driver);
		cartInfo.viewCart();
		Thread.sleep(2000);
		bagandshoesandbelt = null;
	    bagInfo = null;
	    beltsInfo = null;
	    shoesInfo = null;
	}
	@AfterTest
	public void afterTest()
	{
		driver.close();
		driver= null;
		System.gc();
	}
	
	
}
