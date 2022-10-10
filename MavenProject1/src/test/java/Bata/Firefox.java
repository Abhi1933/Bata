package Bata;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.Utility;

public class Firefox {
		private WebDriver driver ;
		private ChappalsandHandBags chappalsandHandBags;
		private HandBags handBags;
		private CartInfo cartInfo;
		@BeforeClass
		public void beforeClass() throws IllegalStateException, IOException
		{   
			System.setProperty("webdriver.gecko.driver","D:\\Setup\\New folder\\geckodriver.exe");
			driver = new FirefoxDriver();
		
		driver.get("https://www.bata.in/");
		
		driver.manage().window().maximize();
		
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.ClicktoLogin();
//		String user= Utility.fetchExcelData(driver, 0, 0);
//	    loginPage.sendusername(user);
//	    String pass= Utility.fetchExcelData(driver, 0, 0);
//	    loginPage.sendpassword(pass);
//	    loginPage.clicktoSignIn();
		    chappalsandHandBags = new ChappalsandHandBags(driver);
		    handBags = new HandBags(driver);
//		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
		
		@BeforeMethod
		public void beforeMethod() throws InterruptedException
		{
			chappalsandHandBags.clicktologo();
			chappalsandHandBags.movetowomen();
		}
		
		@Test
		public void buyHandBags() throws InterruptedException
		{
			handBags.clicktoHandBags();
			System.out.println("---HandBagsBought---");
		}

		@AfterMethod
		public void afterMethod() throws InterruptedException
		{
			System.out.println("Shopping Done");
			Thread.sleep(5000);
		}
		@AfterClass
		public void afterClass() throws InterruptedException
		{
			cartInfo = new CartInfo(driver);
			cartInfo.viewCart();
			Thread.sleep(2000);
		}
		
}
