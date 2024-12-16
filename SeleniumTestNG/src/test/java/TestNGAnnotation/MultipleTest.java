package TestNGAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTest {
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("before suite");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("before test");
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("before method");
	}
	@Test
	public void Test1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("test2");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("after method");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("after class");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("test");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("after suite");
	}
}
