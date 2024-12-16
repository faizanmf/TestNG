package AttributesParameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserParameter {
WebDriver driver;
	
	@Parameters({"name", "pass", "browser", "url"})
	@Test
	public void BrowserTest(String name, String pass, String browser,  String browserurl)
	{
		//String path = 	System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver.exe");
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.err.println("browser not found");
			break;
		}
		
		
		System.out.println(name);
		System.out.println(pass);
		driver.get(browserurl);
	}
}
