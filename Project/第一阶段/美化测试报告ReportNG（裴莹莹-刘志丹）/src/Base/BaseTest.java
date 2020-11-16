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
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@AfterClass
	public void close() throws InterruptedException{
		Thread.sleep(3000);
	//	driver.quit();
	}

}
