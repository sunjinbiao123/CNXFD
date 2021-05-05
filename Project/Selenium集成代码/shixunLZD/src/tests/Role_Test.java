package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseTest;
import dataProvider.NSDataProvider;
import pages.LoginPage;
import pages.RolePage;
//姓名：刘志丹  学号：2018012017
//创建编辑角色(9条测试用例)
public class Role_Test extends BaseTest{
	LoginPage login;
	RolePage rolePage;
	String url = "http://localhost/index.php/admin/authentication/sa/login";
	@BeforeClass
	public void initPage() throws InterruptedException {
		login =new LoginPage(driver);
    	rolePage=new RolePage(driver);
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
//创建用户组添加角色模块(7条测试用例)
	String url4 = "http://localhost/index.php/admin/roles";

	@Test(dataProvider = "para6", dataProviderClass = NSDataProvider.class, priority = 2)
	public void createUserRole(String role, String rol, String description, String desc) throws InterruptedException {
		Thread.sleep(2000);
		driver.get(url4);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(String.valueOf(role), String.valueOf(rol));
		map.put(String.valueOf(description), String.valueOf(desc));
		list.add(map);
		Thread.sleep(2000);
		rolePage.add_role().click();
		Thread.sleep(3000);
		for (Map<String, String> map2 : list) {
			Thread.sleep(1000);
			rolePage.addrole(map2.get("role"), map2.get("description"));
			boolean flag = driver.findElement(By.xpath("//div[text()='角色已成功保存']")).isDisplayed();
			Assert.assertTrue(flag);
		}

	}
//	创建用户组添加角色模块(2条测试用例)
	@Test(dataProvider = "para7",dataProviderClass=NSDataProvider.class,priority=3)
	public void createUserRole2(String role,String rol,String description,String desc) throws InterruptedException {
	   Thread.sleep(2000);
	   driver.get(url4);
	   List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(String.valueOf(role), String.valueOf(rol));
		map.put(String.valueOf(description), String.valueOf(desc));
		list.add(map);
		Thread.sleep(2000);
		rolePage.add_role().click();
		Thread.sleep(5000);
		for(Map<String, String> map2:list) {
		  if(map2.get("role").contains("a")) {
			rolePage.addrolename(map2.get("role"));
		    boolean flag=driver.findElement(By.xpath("//div[text()='角色已成功保存']")).isDisplayed();
		    Assert.assertTrue(flag);
		  }else {
			rolePage.addroledesc(map2.get("description")); 
		    boolean flag=driver.findElement(By.xpath("//div[text()='角色已成功保存']")).isDisplayed();
		    Assert.assertTrue(flag);
		  }
		}
	}
}
