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
//刘志丹
//用户模块
public class Main_Test extends BaseTest {
	MainPage mainPage;
	LoginPage login;
	String url = "http://localhost/index.php/admin/authentication/sa/login";
	@BeforeClass
	public void initPage() throws InterruptedException {
		login =new LoginPage(driver);
		mainPage = new MainPage(driver);
	}
	@Test(dataProvider="para8",dataProviderClass=NSDataProvider.class,priority=1)
	public void login(String username, String key, String password, String value) throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(username.toString(), key.toString());
		map.put(password.toString(), value.toString());
		list.add(map);
		login.login(map.get("username"), map.get("password"));
		Thread.sleep(2000);
	}
	

	String url2 = "http://localhost/index.php/userManagement/index";
	@Test(dataProvider = "para2", dataProviderClass = NSDataProvider.class, priority =2)
	public void userManage(String username, String user, String fullname, String full, String email, String ema)
			throws InterruptedException {
		driver.get(url2);
		Thread.sleep(2000);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(String.valueOf(username), String.valueOf(user));
		map.put(String.valueOf(fullname), String.valueOf(full));
		map.put(String.valueOf(email), String.valueOf(ema));
		list.add(map);
		mainPage.get_add().click();
		Thread.sleep(3000);
		for (Map<String, String> map2 : list) {
			mainPage.add_new_user(map2.get("username"), map2.get("fullname"), map2.get("email"));
	
		}
	}

	@Test(dataProvider = "para3", dataProviderClass = NSDataProvider.class, priority =3)
	public void userManage2(String username, String user, String fullname, String full, String email, String ema,
			String password, String pass) throws InterruptedException {
		driver.get(url2);
		Thread.sleep(2000);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(String.valueOf(username), String.valueOf(user));
		map.put(String.valueOf(fullname), String.valueOf(full));
		map.put(String.valueOf(email), String.valueOf(ema));
		map.put(String.valueOf(password), String.valueOf(pass));
		list.add(map);
		mainPage.get_add().click();
		Thread.sleep(3000);
		for (Map<String, String> map2 : list) {
			mainPage.add_new_user_withPassword(map2.get("username"), map2.get("fullname"), map2.get("email"), map2.get("password"));
		
		}
	}
	@Test(priority=4)
	public void addXnUser() throws InterruptedException {
		driver.get(url2);
		Thread.sleep(2000);
		mainPage.cli_addX().click();
		Thread.sleep(3000);
		mainPage.add_xn_user();
		Thread.sleep(4000);
		boolean flag = driver.findElement(By.id("exportUsers")).isDisplayed();
		Assert.assertTrue(flag);
	}

}
