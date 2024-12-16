package Attributes;

import org.testng.annotations.Test;

public class Priority {

	@Test()
	public void testcase1()
	{
		System.out.println("TestCase 1");
	}
	
	@Test(priority = 1)
	public void testcase2()
	{
		System.out.println("TestCase 2");
	}
	
	@Test(priority = 2)
	public void testcase3()
	{
		System.out.println("TestCase 3");
	}
	
	@Test(priority = 3)
	public void testcase4()
	{
		System.out.println("TestCase 4");
	}
	
	@Test(priority = 4)
	public void testcase5()
	{
		System.out.println("TestCase 5");
	}
	
	
}
