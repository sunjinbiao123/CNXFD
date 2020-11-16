package Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.BaseTest;
import page.JavaMailTestListener;

public class login_test extends BaseTest{
	String url="http://localhost/index.php/admin/authentication/sa/login";
	@Test
	public void loginSuccess() throws InterruptedException{
		
		this.driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.name("user")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("LZD123..");
		Thread.sleep(3000);
		driver.findElement(By.name("login_submit")).click();
	}
	@Test
	public void Demo1_success(){
		int a=1;
		int b=1;
		
		
		assertEquals(a,b);
		
		
	}
	@Test
	public void Demo2_fail(){
		int a=1;
		int b=2;
	
		assertEquals(a, b);
		
		
	}
	@Test
	public void Demo3_fail(){
		int a=5;
		int b=2;
		int c=a+b;
		assertEquals(c,4);				
	}
	@Test
	public void Demo4_fail(){
		int a=5;
		int b=2;
		int c=a+b;
		assertEquals(c,9);				
	}
	

}
