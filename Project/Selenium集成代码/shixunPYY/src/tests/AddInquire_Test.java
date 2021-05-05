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
import pages.AddInquirePage;
import pages.LoginPage;
/**
 * 
 * @author 裴莹莹
 * 添加参与者/添加调查参与者
 * 
 *
 */
public class AddInquire_Test extends BaseTest {
	AddInquirePage addInquirePage;
	LoginPage login;
	String url = "http://localhost/index.php/admin/authentication/sa/login";
	@BeforeClass
	public void initPage() {
		login=new LoginPage(driver);
		addInquirePage=new AddInquirePage(driver);
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
	
	
	
	@Test(dataProvider = "para4", dataProviderClass = NSDataProvider.class, priority =2)
	public void userManage(String firstname,String first,String lastname,String last,String email,String ema,String emailstatus,String emas,String usesleft,String ule) throws InterruptedException {
		String url1="http://localhost/index.php/admin/tokens/sa/browse/surveyid/722568";
		driver.get(url1);
		Thread.sleep(3000);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(String.valueOf(firstname), String.valueOf(first));
		map.put(String.valueOf(lastname), String.valueOf(last));
		map.put(String.valueOf(email), String.valueOf(ema));
		map.put(String.valueOf(emailstatus), String.valueOf(emas));
		map.put(String.valueOf(usesleft), String.valueOf(ule));
		list.add(map);
		for (Map<String, String> map2 : list) {
			addInquirePage.add_inquire(map2.get("firstname"), map2.get("lastname"),map2.get("email"),map2.get("emailstatus"),map2.get("usesleft"));
		boolean flag = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div[2]/div/div/div/p[1]")).isDisplayed();
		Assert.assertTrue(flag);
		}
	}
}
