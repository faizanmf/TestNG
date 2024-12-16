package Attributes;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExpectedException {
	WebDriver driver;
	
	@Test(expectedExceptions = {NoSuchElementException.class}) 
	public void TestCase1()
	{		
		String path = 	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb123")).sendKeys("cricket");
	}
	
	@Test(expectedExceptions = {NoSuchElementException.class}, expectedExceptionsMessageRegExp = "APjFqb" ) 
	public void TestCase2()
	{		
		String path = 	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb123")).sendKeys("cricket");
	}
}
