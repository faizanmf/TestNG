import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dataProvider2  {
	WebDriver driver;
	@Test(dataProvider = "testCase", dataProviderClass = dataProvider.DataProvider2.class)
	public void testCase(String username, String pass)
	{
		String path = 	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.id("submit")).click();
		driver.quit();
		
	}
}
