package Attributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountAndInvocationTimeout {
	WebDriver driver;
	@Test(invocationCount = 3) //invocationTimeOut = 200000)
	public void TestCase()
	{		
		String path = 	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	
	@Test(invocationCount = 3, invocationTimeOut = 20000)
	public void TestCase1()
	{		
		String path = 	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	
	@Test(invocationTimeOut = 1000)
	public void TestCase2()
	{		
		String path = 	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
}
