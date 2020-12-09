package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseTest;
import dataProvider.NSDataProvider;
import pages.LoginPage;
import pages.MainPage;

public class Main_Test1 extends BaseTest {
	MainPage mainPage;
	LoginPage login;
	String url = "http://localhost:6032/index.php/admin/authentication/sa/login";
	@BeforeClass
	public void initPage() throws InterruptedException {
		login =new LoginPage(driver);
		mainPage = new MainPage(driver);
	}
	@Test(dataProvider="paraa",dataProviderClass=NSDataProvider.class,priority=1)
	public void login(String username, String key, String password, String value) throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(String.valueOf(username), String.valueOf(key));
		map.put(String.valueOf(password), String.valueOf(value));
		list.add(map);
		login.login(map.get("username"), map.get("password"));
		Thread.sleep(2000);
	}
	
	//参与者中央数据库模块/参与者集中管理
	String url2="http://localhost:6032/index.php/admin/participants/sa/displayParticipants";
	@Test(dataProvider = "para2", dataProviderClass = NSDataProvider.class, priority =2)
	public void userManage(String firstname,String first,String lastname,String last,String email,String ema) throws InterruptedException {
		Thread.sleep(3000);
		driver.get(url2);
		Thread.sleep(3000);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(String.valueOf(firstname), String.valueOf(first));
		map.put(String.valueOf(lastname), String.valueOf(last));
		map.put(String.valueOf(email), String.valueOf(ema));
		list.add(map);
		mainPage.get_addcpp().click();
		Thread.sleep(3000);
		for (Map<String, String> map2 : list) {
		mainPage.add_new_participant(map2.get("firstname"), map2.get("lastname"), map2.get("email"));
		boolean flag = driver.findElement(By.xpath("//div[text()='成功添加参与者']")).isDisplayed();
		Assert.assertTrue(flag);
		}
	}

}
