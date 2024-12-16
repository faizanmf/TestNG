import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider
{
	WebDriver driver;
	@DataProvider(name="testCase")
	public String[][] getData()
	{
		String[][] data = new String[2][2];

		data[0][0] = "student";
		data[0][1] = "Password123";

		data[1][0] = "student";
		data[1][1] = "Password123";

		return data;

	}

	@Test(dataProvider = "testCase")
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
