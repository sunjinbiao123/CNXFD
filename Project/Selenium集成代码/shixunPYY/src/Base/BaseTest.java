package Base;

import org.apache.velocity.runtime.VelocimacroFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import page.JavaMailTestListener;

public class BaseTest {
	protected WebDriver driver;
	@BeforeSuite
	public void addListener(ITestContext context) {
		TestRunner runner = (TestRunner) context;
	    runner.addListener(new JavaMailTestListener());
	}
	@BeforeClass
	public void initBrowser() {			
		System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@AfterClass
	public void close() throws InterruptedException{
		Thread.sleep(3000);
//		driver.quit();
	}

}
