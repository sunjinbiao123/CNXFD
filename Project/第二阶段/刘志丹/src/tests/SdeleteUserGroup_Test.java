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
import pages.SdeleteUserGroupPage;

public class SdeleteUserGroup_Test extends BaseTest {
	LoginPage loginPage;
	SdeleteUserGroupPage sdeleteUserGroupPage;
	String url = "http://localhost:60/index.php/admin/authentication/sa/login";

	@BeforeClass
	public void initPage() throws InterruptedException {
		loginPage = new LoginPage(driver);
		sdeleteUserGroupPage = new SdeleteUserGroupPage(driver);
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
		loginPage.login(map.get("username"), map.get("password"));
		Thread.sleep(2000);
	}

//删除的测试用例
	String url5 = "http://localhost:60/index.php/userGroup/index";
	@Test(priority=2)
	public void testDeleteUserGroup() throws InterruptedException {
		Thread.sleep(2000);
		driver.get(url5);
        sdeleteUserGroupPage.delete();
		boolean flag = driver.findElement(By.xpath("//div[text()='已成功删除用户组。']")).isDisplayed();
		Assert.assertTrue(flag);
	}

}
