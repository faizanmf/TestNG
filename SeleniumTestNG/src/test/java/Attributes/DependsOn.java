package Attributes;

import org.testng.annotations.Test;

public class DependsOn {
	@Test()
	public void testcase1()
	{
		System.out.println("TestCase 1");
	}
	
	@Test(dependsOnMethods = "testcase1")
	public void testcase2()
	{
		System.out.println("TestCase 2");
	}
	
	@Test(dependsOnMethods = "testcase2", priority = 1)
	public void testcase3()
	{
		System.out.println("TestCase 3");
	}
	
	@Test(dependsOnMethods = "testcase3")
	public void testcase4()
	{
		System.out.println("TestCase 4");
	}
	
	@Test(dependsOnMethods = "testcase4")
	public void testcase5()
	{
		System.out.println("TestCase 5");
	}
	
}
