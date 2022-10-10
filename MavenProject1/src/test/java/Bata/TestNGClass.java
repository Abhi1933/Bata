package Bata;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

		public class TestNGClass
	{
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("BeforeClass");
		}

		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("BeforeMethod");
		}
		
		@Test (priority=2,dependsOnMethods="test3")
		public void test1() 
		{
			System.out.println("Test1");
		}
		
		@Test (priority=3,invocationCount=2)
		public void test2()
		{
			System.out.println("Test2");
		}

		@Test  
		public void test3()
		{
			System.out.println("Test3");
			Assert.fail("Skip The Method");
		}
		
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("AfterMethod");
		}
		
		@AfterClass
		public void afterClass()
		{
			System.out.println("AfterClass");
		}
	}
		  

