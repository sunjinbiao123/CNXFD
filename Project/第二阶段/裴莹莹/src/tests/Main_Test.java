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

public class Main_Test extends BaseTest {
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

	//参与者中央数据库模块/属性管理页面
	String url2="http://localhost:6032/index.php/admin/participants/sa/attributeControl";
	@Test(dataProvider = "para3", dataProviderClass = NSDataProvider.class, priority =2)
	public void userManage1(String defaultname,String de,String zhHans,String zh) throws InterruptedException {
		driver.get(url2);
		Thread.sleep(3000);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(String.valueOf(defaultname), String.valueOf(de));
		map.put(String.valueOf(zhHans), String.valueOf(zh));
		list.add(map);
		mainPage.get_addAttributeName().click();
		Thread.sleep(3000);
		for (Map<String, String> map2 : list) {
		mainPage.add_new_property(map2.get("defaultname"), map2.get("zhHans"));
		boolean flag = driver.findElement(By.xpath("//div[text()='属性更新成功']")).isDisplayed();
		Assert.assertTrue(flag);
		}
	}
	
}
