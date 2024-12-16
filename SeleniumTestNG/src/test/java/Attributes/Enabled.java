package Attributes;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Enabled {
	
	
	@Test(enabled = true)
	public void TestCase1()
	{		
		System.out.println("test 1");
	}
	
	@Test(enabled = false) 
	public void TestCase2()
	{		
		System.out.println("test 2");
	}
	
	@Test(enabled = false, alwaysRun = true) //it be gives preference to enable
	public void TestCase3()
	{		
		System.out.println("test 3");
	}
}
