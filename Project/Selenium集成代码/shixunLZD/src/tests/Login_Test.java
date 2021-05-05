package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import Base.BaseTest;
import dataProvider.NSDataProvider;
import page.JavaMailTestListener;
import page.MailUtil;
import pages.LoginPage;
//姓名：刘志丹  学号：2018012017
//登录模块(4条测试用例,正确的用户名密码，正确的用户名错误的密码，正确的密码错误的用户名，错误的密码错误的用户名)
public class Login_Test extends BaseTest {
	String url = "http://localhost/index.php/admin/authentication/sa/login";
	LoginPage loginPage;
	@BeforeClass
	public void initPage() {
		loginPage=new LoginPage(driver);
	}
	
	@Test(dataProvider = "para1", dataProviderClass = NSDataProvider.class,priority=1)
	public void login1(String username, String key, String password, String value) throws InterruptedException {
		driver.get(url);
		
		Thread.sleep(3000);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(username.toString(), key.toString());
		map.put(password.toString(), value.toString());
		list.add(map);
	for (Map<String, String> map2 : list) {
		loginPage.login(map2.get("username"), map2.get("password"));
		Thread.sleep(2000);
		boolean flag=driver.findElement(By.className("navbar-header")).isDisplayed();
	    Assert.assertTrue(flag);
	}
 }
}
