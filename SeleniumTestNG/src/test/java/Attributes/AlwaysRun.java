package Attributes;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlwaysRun {
	WebDriver driver;

	@Test(alwaysRun = true)
	public void TestCase1()
	{
		
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = "TestCase1", alwaysRun = true)
	public void TestCase2()
	{		
		System.out.println("test 2");

	}

	@Test(alwaysRun = false) // This still works, but `alwaysRun` does not affect test execution here
	public void TestCase3()
	{		
		System.out.println("test 3");

	}
}
