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
import pages.AddShowPage;
import pages.LoginPage;

/**
 * 
 * @author 裴莹莹
 * 创建演示参与者
 *
 */
public class AddShow_Test extends BaseTest {

	AddShowPage addShowPage;
	LoginPage login;
	String url = "http://localhost/index.php/admin/authentication/sa/login";
	@BeforeClass
	public void initPage() throws InterruptedException {
		login =new LoginPage(driver);
		addShowPage = new AddShowPage(driver);
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
	
	//������ʾ������
		
		@Test(dataProvider = "para5", dataProviderClass = NSDataProvider.class, priority =2)
		public void userManage(String amount,String am,String tokenlen,String tok,String firstname,String first,String lastname,String last,String email,String ema,String usesleft,String ule) throws InterruptedException {
			String url1="http://localhost/index.php/admin/tokens/sa/browse/surveyid/722568";
			driver.get(url1);
			Thread.sleep(3000);
			List<Map<String, String>> list = new ArrayList<Map<String, String>>();
			Map<String, String> map = new HashMap<String, String>();
			map.put(String.valueOf(amount), String.valueOf(am));
			map.put(String.valueOf(tokenlen), String.valueOf(tok));
			map.put(String.valueOf(firstname), String.valueOf(first));
			map.put(String.valueOf(lastname), String.valueOf(last));
			map.put(String.valueOf(email), String.valueOf(ema));
			map.put(String.valueOf(usesleft), String.valueOf(ule));
			list.add(map);
			for (Map<String, String> map2 : list) {
				addShowPage.add_show_participant(map2.get("amount"),map2.get("tokenlen"),map2.get("firstname"), map2.get("lastname"),map2.get("email"),map2.get("usesleft"));
			boolean flag = driver.findElement(By.xpath("//div[text()='添加了新示例参与者']")).isDisplayed();
			Assert.assertTrue(flag);
			}
		}
}
