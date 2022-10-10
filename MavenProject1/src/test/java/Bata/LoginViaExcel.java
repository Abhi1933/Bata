package Bata;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.Utility;

public class LoginViaExcel 
{
	    private WebDriver driver;
	    private LoginPage loginPage;
	    private static int i;
	    private static int j;
	    private String data;
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
		
		@Test (invocationCount=5)
		public void viewMensSection() throws IllegalStateException, IOException
		{	i=0;
			j=0;
//			LoginPage loginPage = new LoginPage(driver);
//			loginPage.logintoaccount();
			loginPage = new LoginPage(driver);
			loginPage.ClicktoLogin();
			
			data= Utility.fetchExcelData(driver,(i),(j));
			loginPage.sendusername(data);
			System.out.println(data);
			
			data= Utility.fetchExcelData(driver,(i), (j));
			loginPage.sendpassword(data);
			System.out.println(data);
			i++;
			j++;		
		} 
		@AfterMethod
		public void afterMethod()
		{ 
			loginPage.clicktoSignIn();
		}
		
		@AfterClass
		public void afterClass()
		{
			System.out.println("LogOut");
		}
		
}

