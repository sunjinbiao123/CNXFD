package Test_1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class login_test extends BaseTest{
	String url="http://localhost/index.php/admin/authentication/sa/login";
	@Test
	public void loginSuccess() throws InterruptedException{
		
		this.driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.name("user")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("sjb123456");
		Thread.sleep(3000);
		driver.findElement(By.name("login_submit")).click();
		
		
	}
/*	@Test
	public void loginFail1() throws InterruptedException{
		
		this.driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.name("user")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.name("login_submit")).click();
		assertTrue(driver.findElement(By.name("yt0")).isEnabled());
		
	}
	*/
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
