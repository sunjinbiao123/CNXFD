package com.webtest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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
	//登录
	public void login(String username ,String password )throws InterruptedException  {
	Thread.sleep(3000);
	driver.findElement(By.name("user")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	Thread.sleep(3000);
	driver.findElement(By.name("login_submit")).click();
	Thread.sleep(2000);
	}
	//获取按钮
	public  void buttonclick(String xpath) throws InterruptedException {
		Thread.sleep(3000);
		WebElement sq=driver.findElement(By.xpath("//input[@id="+xpath+"]"));
		Actions actions =new Actions(driver);
		actions.moveToElement(sq).click().perform();
		
	}

	

	@AfterClass
	public void close() throws InterruptedException{
		Thread.sleep(3000);
		driver.quit();
	
	}

}
