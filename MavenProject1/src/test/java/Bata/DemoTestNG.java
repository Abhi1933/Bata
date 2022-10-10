package Bata;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNG {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Abhijeet");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Rajendra");
	}
	
	@Test
	public void test()
	{
		System.out.println("Shinde");
	}
	@Test
	public void test1()
	{
		System.out.println("Choudhari");
	}
}
