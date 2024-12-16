package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClass1 {
	WebDriver driver;
	@Test
	public void TestCase1()
	{
		String path = 	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	}
}
