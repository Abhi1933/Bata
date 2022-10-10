package Bata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bata.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		BuyShoes1 buyShoes = new BuyShoes1(driver);
		buyShoes.gotomens();
}
}
