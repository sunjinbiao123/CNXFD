package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	protected WebDriver driver;
	@BeforeClass
	public void initBrowser() {			
		System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://localhost/index.php/admin/authentication/sa/login");
	}

	@AfterClass
	public void close() throws InterruptedException{
		Thread.sleep(3000);
	//	driver.quit();
	
	}

}
