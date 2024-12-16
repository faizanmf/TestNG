package Attributes;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups = "smoke")
	public void testcase1()
	{
		System.out.println("smoke");
	}
	
	@Test(groups = "reg")
	public void testcase2()
	{
		System.out.println("reg");
	}
	
	@Test(groups = "sanity")
	public void testcase3()
	{
		System.out.println("sanity");
	}
	
	@Test(groups = {"reg", "smoke"})
	public void testcase4()
	{
		System.out.println("reg and smoke");
	}
	
	@Test(groups = {"reg", "smoke", "sanity"})
	public void testcase5()
	{
		System.out.println("reg, smoke and sanity");
	}
}
